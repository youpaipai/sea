/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_PHONE_MODIFY  手机号码变更记录表， 序列seq_phonemodifyid] dao
 * 文件名称：SysPhoneModifyMapper.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.List;

/**
 * [SYS_PHONE_MODIFY  手机号码变更记录表， 序列seq_phonemodifyid] dao
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface SysPhoneModifyMapper extends BaseMapper {

    /**
     * 
     * 函数功能描述：插入[SYS_PHONE_MODIFY  手机号码变更记录表， 序列seq_phonemodifyid]
     * @param sysPhoneModify
     * @return
     */
    Integer insertSysPhoneModify(SysPhoneModify sysPhoneModify);

    /**
     * 
     * 函数功能描述：根据条件查询[SYS_PHONE_MODIFY  手机号码变更记录表， 序列seq_phonemodifyid]
     * @param sysPhoneModify 
     * @return
     */
    List<SysPhoneModify> querySysPhoneModifyByPage(SysPhoneModify sysPhoneModify);

}
