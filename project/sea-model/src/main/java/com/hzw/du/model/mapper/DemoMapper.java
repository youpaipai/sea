/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：DemoMapper.java
 * 修改时间：2016年7月13日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */



 	
package com.hzw.du.model.mapper;

/**
 * <一句话功能简述> TODO
 * <功能详细描述>
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface DemoMapper {
    /**
     * 
     * 函数功能描述：根据ID查询单个记录
     * @param demo 示例实体对象
     * @return 示例对象
     */
    Demo queryDemoById(Demo demo) throws Exception;
}
