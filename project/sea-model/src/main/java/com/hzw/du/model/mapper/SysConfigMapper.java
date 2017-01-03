/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_CONFIG  系统配置项表， 序列seq_configid] dao
 * 文件名称：SysConfigMapper.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.List;

/**
 * [SYS_CONFIG  系统配置项表， 序列seq_configid] dao
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface SysConfigMapper extends BaseMapper {

    /**
     * 
     * 函数功能描述：插入[SYS_CONFIG  系统配置项表， 序列seq_configid]
     * @param sysConfig
     * @return
     */
    Integer insertSysConfig(SysConfig sysConfig);

    /**
     * 
     * 函数功能描述：根据条件查询[SYS_CONFIG  系统配置项表， 序列seq_configid]
     * @param sysConfig 
     * @return
     */
    List<SysConfig> querySysConfigByPage(SysConfig sysConfig);

}
