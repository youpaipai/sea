/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_ROLE  角色表， 序列seq_roleid] dao
 * 文件名称：SysRoleMapper.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.List;

/**
 * [SYS_ROLE  角色表， 序列seq_roleid] dao
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface SysRoleMapper extends BaseMapper {

    /**
     * 
     * 函数功能描述：插入[SYS_ROLE  角色表， 序列seq_roleid]
     * @param sysRole
     * @return
     */
    Integer insertSysRole(SysRole sysRole);

    /**
     * 
     * 函数功能描述：根据条件查询[SYS_ROLE  角色表， 序列seq_roleid]
     * @param sysRole 
     * @return
     */
    List<SysRole> querySysRoleByPage(SysRole sysRole);

}
