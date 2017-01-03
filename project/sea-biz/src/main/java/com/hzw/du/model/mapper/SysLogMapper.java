/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_LOG  日志信息表， 序列seq_logid] dao
 * 文件名称：SysLogMapper.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.List;

/**
 * [SYS_LOG  日志信息表， 序列seq_logid] dao
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface SysLogMapper extends BaseMapper {

    /**
     * 
     * 函数功能描述：插入[SYS_LOG  日志信息表， 序列seq_logid]
     * @param sysLog
     * @return
     */
    Integer insertSysLog(SysLog sysLog);

    /**
     * 
     * 函数功能描述：根据条件查询[SYS_LOG  日志信息表， 序列seq_logid]
     * @param sysLog 
     * @return
     */
    List<SysLog> querySysLogByPage(SysLog sysLog);
    
    /**
     * 
     * 函数功能描述：根据主键ID获取日志信息
     * @param logId
     * @return
     */
    SysLog getSysLogById(Long logId);

}
