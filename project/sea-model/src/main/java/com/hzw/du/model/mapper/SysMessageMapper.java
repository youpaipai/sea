/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_MESSAGE  系统消息表， 序列seq_smid] dao
 * 文件名称：SysMessageMapper.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.List;

/**
 * [SYS_MESSAGE  系统消息表， 序列seq_smid] dao
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface SysMessageMapper extends BaseMapper {

    /**
     * 
     * 函数功能描述：插入[SYS_MESSAGE  系统消息表， 序列seq_smid]
     * @param sysMessage
     * @return
     */
    Integer insertSysMessage(SysMessage sysMessage);

    /**
     * 
     * 函数功能描述：根据条件查询[SYS_MESSAGE  系统消息表， 序列seq_smid]
     * @param sysMessage 
     * @return
     */
    List<SysMessage> querySysMessageByPage(SysMessage sysMessage);

}
