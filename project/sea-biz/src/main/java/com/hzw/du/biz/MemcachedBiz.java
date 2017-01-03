

package com.hzw.du.biz;

/**
 * 
 * <一句话功能简述> 缓存服务
 * <功能详细描述>
 * @author libb
 * @version V1.0[产品/模块版本]
 */
public interface MemcachedBiz 
{

    /**
     * 
     * 函数功能描述：根据键获取值(value)
     * @param key 键(key)
     * @return
     */
    public Object get(String key);

    /**
     * 
     * 函数功能描述：修改缓存对象
     * @param key 键(key)
     * @param o 键的新值(new value),如果有则修改
     */
    public void replace(String key, Object o);

    /**
     * 函数功能描述：将数据写入缓存
     * @param key 键(key)
     * @param o 该键的值(value),如果没有则插入
     */
    public void add(String key, Object o);

    /**
     * 
     * 函数功能描述：根据键删除
     */
    public void removeAll();

    /**
     * 
     * 函数功能描述：根据键删除
     * @param key 键
     */
    public void remove(String key);

    /**
     * 
     * 函数功能描述：判读键值是否存在
     * @param key 键
     * @return FALSE:不存在; true:存在
     */
    public boolean exists(String key);

    /**
     * 设置缓存中的对象
     * @param key 键(key)
     * @param o 要设置缓存中的对象(value),如果没有则插入,如果有则修改
     * 函数功能描述：TODO
     * @param key
     * @param o
     */
    void set(String key, Object o);

}
