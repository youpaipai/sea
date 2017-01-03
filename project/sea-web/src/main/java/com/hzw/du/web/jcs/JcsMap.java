/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：jcs缓存
 * 文件名称：JcsWeb.java
 * 修改时间：2016年8月5日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.web.jcs;

import java.util.Date;

import org.apache.jcs.JCS;
import org.apache.jcs.access.exception.CacheException;
import org.apache.jcs.engine.behavior.IElementAttributes;

/**
 * <一句话功能简述> jcs缓存
 * <功能详细描述>
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class JcsMap {

    //jcs对象
    private JCS jcs;

    public JcsMap(String region) throws CacheException {
        jcs = JCS.getInstance(region);
    }

    public void clear() throws CacheException {
        jcs.clear();
    }

    public void clear(String group) {
        jcs.invalidateGroup(group);
    }

    public Object get(Object key) {
        return jcs.get(key);
    }

    public Object get(String group, Object key) {
        return jcs.getFromGroup(key, group);
    }

    public void put(Object key, Object value) throws CacheException {
        jcs.put(key, value);
    }

    public void put(String group, Object key, Object value) throws CacheException {
        jcs.putInGroup(key, group, value);
    }

    public void put(Object key, Object value, int seconds) throws CacheException {
        IElementAttributes attr = jcs.getDefaultElementAttributes();
        attr.setMaxLifeSeconds(seconds);
        jcs.put(key, value, attr);
    }

    public void put(Object key, Object value, Date expiredTime) throws CacheException{
        int seconds = (int) ((expiredTime.getTime() - new Date().getTime()) / 1000L);
        put(key, value, seconds);
    }

    public Object remove(Object key) throws CacheException {
        Object obj = get(key);
        jcs.remove(key);
        return obj;
    }

    public Object remove(String group, Object key) {
        Object obj = get(group, key);
        jcs.remove(key, group);
        return obj;
    }

    public void put(String group, Object key, Object value, int seconds) throws CacheException {
        IElementAttributes attr = jcs.getDefaultElementAttributes();
        attr.setMaxLifeSeconds(seconds);
        jcs.putInGroup(key, group, value, attr);
    }

    public void put(String group, Object key, Object value, Date expiredTime) throws CacheException {
        int seconds = (int) ((expiredTime.getTime() - new Date().getTime()) / 1000L);
        put(group, key, value, seconds);
    }
}
