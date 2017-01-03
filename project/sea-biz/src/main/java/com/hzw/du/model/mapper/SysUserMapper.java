/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_USER  用户表， 序列seq_userid] dao
 * 文件名称：SysUserMapper.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.List;

/**
 * [SYS_USER  用户表， 序列seq_userid] dao
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface SysUserMapper extends BaseMapper {

    /**
     * 
     * 函数功能描述：插入[SYS_USER  用户表， 序列seq_userid]
     * @param sysUser
     * @return
     */
    Integer insertSysUser(SysUser sysUser);
    
    /**
     * 
     * 函数功能描述：修改用户信息
     * @param sysUser
     * @return
     */
    Integer modifySysUser(SysUser sysUser);
    
    /**
     * 根据ID查询[SYS_USER  供应商用户表]
     * 函数功能描述：TODO
     * @param userId
     * @return
     */
    SysUser getSysUserById(Long userId);

    /**
     * 
     * 函数功能描述：根据条件查询[SYS_USER  用户表， 序列seq_userid]
     * @param sysUser 
     * @return
     */
    List<SysUser> querySysUserByPage(SysUser sysUser);
    
    /**
     * 
     * 函数功能描述：根据条件查询[SYS_USER  用户表， 序列seq_userid]  用户信息以及组织机构列表（分页）
     * @param sysUser 
     * @return
     */
    List<SysUser> querySysUserAndOrgInfoByPage(SysUser sysUser);
    
    /**
     * 
     * 函数功能描述：根据登录号、手机号码验证是否唯一
     * @param sysUser
     * @return
     */
    Integer queryUserCount(SysUser sysUser);

    /**
     * 
     * 函数功能描述：修改用户密码
     * @param sysUser
     * @return
     */
    Integer modifyPassword(SysUser sysUser);
    
    /**
     * 
     * 函数功能描述：修改用户状态（启用 停用 删除）
     * @param sysUser
     * @return
     */
    Integer modifyUserStatus(SysUser sysUser);

    /**
     * 
     * 函数功能描述：更新用户信息
     * @param currUser
     * @return
     */
    void upDateSysUser(SysUser currUser);
}
