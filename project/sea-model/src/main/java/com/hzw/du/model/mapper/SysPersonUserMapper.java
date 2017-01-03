/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_PERSON_USER  招标人用户表， 序列seq_personuserid] dao
 * 文件名称：SysPersonUserMapper.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.List;

/**
 * [SYS_PERSON_USER  招标人用户表， 序列seq_personuserid] dao
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface SysPersonUserMapper extends BaseMapper {

    /**
     * 
     * 函数功能描述：插入[SYS_PERSON_USER  招标人用户表， 序列seq_personuserid]
     * @param sysPersonUser
     * @return
     */
    Integer insertSysPersonUser(SysPersonUser sysPersonUser);
    
    /**
     * 
     * 函数功能描述：修改招标人用户信息
     * @param sysPersonUser
     * @return
     */
    Integer modifySysPersonUser(SysPersonUser sysPersonUser);

    /**
     * 
     * 函数功能描述：根据条件查询[SYS_PERSON_USER  招标人用户表， 序列seq_personuserid]
     * @param sysPersonUser 
     * @return
     */
    List<SysPersonUser> querySysPersonUserByPage(SysPersonUser sysPersonUser);
    
    /**
     * 
     * 函数功能描述：获取招标人用户信息
     * @param sysPersonUser
     * @return
     */
    SysPersonUser getSysPersonUserById(Long userId);

}
