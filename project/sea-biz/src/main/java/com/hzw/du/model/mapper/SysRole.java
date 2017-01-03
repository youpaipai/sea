/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_ROLE  角色表， 序列seq_roleid]
 * 文件名称：SysRole.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

/**
 * [SYS_ROLE  角色表， 序列seq_roleid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class SysRole extends BaseBean {
    
    /**
     * ROLEID  NUMBER  N           角色ID
     */
    private Long roleId;
    
    /**
     * ROLENAME    VARCHAR2(50)    Y           角色名称
     */
    private String roleName;
    
    /**
     * TYPE    NUMBER  Y           角色类型
     */
    private Integer type;
    
//    CREATEUSER  NUMBER  Y           创建角色的用户id
//    CREATETIME  DATE    Y           创建时间
//    UPDATEUSER  NUMBER  Y           修改人
//    UPDATETIME  DATE    Y           修改时间
    /**
     * STATUS  NUMBER  Y   0       角色状态 0：可用 1：不可用
     */
    private Integer status;

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

    /**
     * @return the roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * @param roleName the roleName to set
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * @return the type
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * @param type the type to set
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * @return the status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

}
