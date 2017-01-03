package com.hzw.du.web.entity.request;

/*
 * 公司名称：江苏华招网信息技术有限公司
 * 版权信息：江苏华招网信息技术有限公司版权所有
 * 描述：角色信息查询类
 * 文件名称：RoleQueryRequest.java
 * 修改时间：2016-8-1
 * 修改人：zl
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
public class RoleQueryRequest
{
    /*主键id*/
    private Integer roleId;
    /*角色id集合  以-分隔 用于启用 停用*/
    private String roleIds;

    /*区分功能： add、edit、start、stop*/
    private String op;
    
    /*状态： 0:可用 1:不可用*/
    private Integer status;

    public Integer getRoleId()
    {
        return roleId;
    }

    public void setRoleId(Integer roleId)
    {
        this.roleId = roleId;
    }

    public String getRoleIds()
    {
        return roleIds;
    }

    public void setRoleIds(String roleIds)
    {
        this.roleIds = roleIds;
    }

    public String getOp()
    {
        return op;
    }

    public void setOp(String op)
    {
        this.op = op;
    }

    public Integer getStatus()
    {
        return status;
    }

    public void setStatus(Integer status)
    {
        this.status = status;
    }

}
