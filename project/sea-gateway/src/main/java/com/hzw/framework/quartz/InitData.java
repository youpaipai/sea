/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：InitData.java
 * 修改时间：2016-8-1
 * 修改人：libb
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.framework.quartz;

import java.util.Map;

import com.hzw.du.biz.BaseBiz;
import com.hzw.du.biz.MemcachedBiz;
import com.hzw.du.biz.bean.constant.MemcachedConst;
import com.hzw.du.biz.bean.param.bean.ConstantBean;

/**
 * 
 * <一句话功能简述> 定时器任务
 * <功能详细描述> 缓存加载
 * @author libb
 * @version V1.0[产品/模块版本]
 */
public class InitData
{
	private MemcachedBiz memcachedBiz;
	private BaseBiz baseBiz;
	
	/**
	 * 
	 * 函数功能描述：加载系统数据
	 */
    public void work()
    {
        // 将数据字典数据加载到缓存中
        Map<String, ConstantBean> constantMap = baseBiz.queryConstantList();
        
        memcachedBiz.removeAll();
        
        memcachedBiz.add(MemcachedConst.MEM_SYS_CONSTANT, constantMap);
        
    }

    public MemcachedBiz getMemcachedBiz()
    {
        return memcachedBiz;
    }

    public void setMemcachedBiz(MemcachedBiz memcachedBiz)
    {
        this.memcachedBiz = memcachedBiz;
    }

    public BaseBiz getBaseBiz()
    {
        return baseBiz;
    }

    public void setBaseBiz(BaseBiz baseBiz)
    {
        this.baseBiz = baseBiz;
    }
    
}
