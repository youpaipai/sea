/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：MemcachedBizImpl.java
 * 修改时间：2016-8-1
 * 修改人：libb
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.biz.impl;

import net.spy.memcached.MemcachedClient;

import com.hzw.du.biz.MemcachedBiz;
import com.hzw.du.common.utils.StringUtils;

/**
 * 
 * <一句话功能简述> memcached缓存service接口的实现类
 * <功能详细描述>
 * @author libb
 * @version V1.0[产品/模块版本]
 */
public class MemcachedBizImpl implements MemcachedBiz 
{

    /** 客户端实现注入 */
    private MemcachedClient memcachedClient;

    public MemcachedClient getMemcachedClient() 
    {
        return memcachedClient;
    }

    public void setMemcachedClient(MemcachedClient memcachedClient) 
    {
        this.memcachedClient = memcachedClient;
    }

    private Integer time = 60 * 60 * 24 * 2;

    /**
     * 
     * 函数功能描述：设置缓存中的对象
     * @param key 键(key)
     * @param exp 过期时间(秒)
     * @param o 要设置缓存中的对象(value),如果没有则插入,如果有则修改
     */
    private void set(String key, Integer exp, Object o) 
    {
        if (StringUtils.isEmpty(key)) //键不为空 
        {
            if (exists(key)) //如果存在该值,则设置信息
            {
                memcachedClient.replace(key, time, o);
            } 
            else //如果不存在，则添加
            {
                memcachedClient.add(key, time, o);
            }
        }

    }

    /**
     * 函数功能描述：设置缓存中的对象
     * @param key 键(key)
     * @param o 要设置缓存中的对象(value),如果没有则插入,如果有则修改
     */
    @Override
    public void set(String key, Object o) 
    {
        if (StringUtils.isEmpty(key)) //键不为空 
        {
            if (exists(key)) //如果存在该值,则设置信息
            {
                this.replace(key, time, o);
            } 
            else //如果不存在，则添加
            {
                this.add(key, time, o);
            }
        }

    }

    /**
     * 函数功能描述：根据键获取值(value)
     * @param key 键(key)
     */
    @Override
    public Object get(String key) 
    {
        Object obj = null;
        if (!StringUtils.isEmpty(key)) 
        {
            if (exists(key)) //键不为空 并且存在该键
            {
                obj = memcachedClient.get(key);
            }
        }
        return obj;
    }

    /**
     * 函数功能描述：修改缓存对象
     * @param key 键(key)
     * @param exp 过期时间(秒)
     * @param o 该键的新值(new value),如果有则修改
     */
    private void replace(String key, Integer exp, Object o) 
    {
        if (!StringUtils.isEmpty(key)) //键不为空 
        {
            if (exists(key)) //如果该键存在，则修改该键的新值
            {
                memcachedClient.replace(key, time, o);
            } 
            else //不存在，则添加该键
            {
                memcachedClient.add(key, time, o);
            }
        }
    }

    /**
     * 函数功能描述：修改缓存对象
     * @param key 键(key)
     * @param o 该键的新值(new value),如果有则修改
     */
    @Override
    public void replace(String key, Object o) 
    {
        if (!StringUtils.isEmpty(key)) //键不为空 
        {
            if (exists(key)) //如果该键存在，则修改该键的新值
            {
                this.replace(key, time, o);
            } 
            else //不存在，则添加该键
            {
                this.add(key, time, o);
            }
        }
    }

    /**
     * 函数功能描述：将数据写入缓存
     * @param key 键(key)
     * @param exp 过期时间(秒)
     * @param o 该键的值(value),如果没有则插入
     */
    private void add(String key, Integer exp, Object o)
    {
        if (!StringUtils.isEmpty(key)) //键不为空 
        {
            if (!exists(key))  //如果该键不存在，添加
            {
                memcachedClient.add(key, time, o);
            } 
            else  //存在，修改该键的对象
            {
                memcachedClient.replace(key, time, o);
            }
        }
    }

    /**
     * 函数功能描述：将数据写入缓存
     * @param key 键(key)
     * @param o 该键的值(value),如果没有则插入
     */
    @Override
    public void add(String key, Object o) 
    {
        if (!StringUtils.isEmpty(key)) //键不为空 
        {
            if (!exists(key))  //如果该键不存在，添加
            {
                memcachedClient.add(key, time, o);
            } 
            else //存在，修改该键的对象
            { 
                memcachedClient.replace(key, time, o);
            }
        }
    }

    /**
     * 函数功能描述：根据键删除
     */
    @Override
    public void removeAll() 
    {
        memcachedClient.flush();
    }

    /**
     * 函数功能描述：根据键删除
     * @param key 键
     */
    @Override
    public void remove(String key) 
    {
        if (exists(key)) //如果存在该键值
        {
            memcachedClient.delete(key);
        }
    }

    /**
     * 函数功能描述：判读键值是否存在
     * @param key 键
     * @return FALSE:不存在; true:存在
     */
    @Override
    public boolean exists(String key) 
    {
        boolean isflag = false;
        try
        {
            if (!StringUtils.isEmpty(key)) 
            {
                if (null != memcachedClient.get(key)) 
                {
                    isflag = true;
                }
            }
        }
        catch(Exception e)
        {
        	System.out.println("缓存数据获取异常可能是超时等待："+e.getMessage());
        }
        return isflag;
    }

}
