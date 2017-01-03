package com.hzw.du.web.entity.request;

/*
 * 公司名称：江苏华招网信息技术有限公司
 * 版权信息：江苏华招网信息技术有限公司版权所有
 * 描述：角色信息类
 * 文件名称：RoleRequest.java
 * 修改时间：2016-8-1
 * 修改人：zl
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

public class RoleRequest
{
    /*主键id*/
    private Integer roleId;

    /*角色名称*/
    private String roleName;

    /*创建人*/
    private Integer createId;

    /*角色类型*/
    private Integer type;

    /*区分功能： add、edit、start、stop*/
    private String op;
    
    /*菜单权限集合   例 1,5-1,6-1,name,name,name*/
    private String[] menuIds;
    
    /*该角色所属组织机构id  主用户默认：0*/
    private Integer organizationId;
    
    public Integer getRoleId()
    {
        return roleId;
    }

    public void setRoleId(Integer roleId)
    {
        this.roleId = roleId;
    }

    public String getRoleName()
    {
        return roleName;
    }

    public void setRoleName(String roleName)
    {
        this.roleName = roleName;
    }

    public Integer getCreateId()
    {
        return createId;
    }

    public void setCreateId(Integer createId)
    {
        this.createId = createId;
    }

    public Integer getType()
    {
        return type;
    }

    public void setType(Integer type)
    {
        this.type = type;
    }

    public String getOp()
    {
        return op;
    }

    public void setOp(String op)
    {
        this.op = op;
    }

    public String[] getMenuIds()
    {
        return menuIds;
    }

    public void setMenuIds(String[] menuIds)
    {
        this.menuIds = menuIds;
    }

    public Integer getOrganizationId()
    {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId)
    {
        this.organizationId = organizationId;
    }

}
