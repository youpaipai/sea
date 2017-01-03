/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_USER_ROLE 用户与角色关系表]
 * 文件名称：SysUserRole.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

/**
 * [SYS_USER_ROLE 用户与角色关系表]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class SysUserRole extends BaseBean {
    
    /**
     * USERID  NUMBER  Y           用户ID
     */
    private Long userId;
    
    /**
     * ROLEID  NUMBER  Y           角色ID
     */
    private Long roleId;

    /**
     * @return the userId
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * @return the roleId
     */
    public Long getRoleId() {
        return this.roleId;
    }

    /**
     * @param roleId the roleId to set
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

}
