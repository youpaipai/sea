package com.hzw.du.web.entity.request;

/*
 * 公司名称：江苏华招网信息技术有限公司
 * 版权信息：江苏华招网信息技术有限公司版权所有
 * 描述：用户信息查询类
 * 文件名称：UsersQueryRequest.java
 * 修改时间：2016-8-2
 * 修改人：zl
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
public class UsersQueryRequest
{
    /*主键id*/
    private Integer userId;
    
    /*用户姓名*/
    private String  username;
    
    /*手机号*/
    private String  phone;
    
    /*登录号*/
    private String  staffCode;
    
    /*区分功能： start、stop、del*/
    private String  op;
    
    /*用户id集合  以-分隔  用户启用、停用、删除*/ 
    private String userIds;
    
    /*状态 0：启用 1：停用    2：已锁定 3.无效   4.删除*/
    private Integer status;
    
    public Integer getUserId()
    {
        return userId;
    }

    public void setUserId(Integer userId)
    {
        this.userId = userId;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getStaffCode()
    {
        return staffCode;
    }

    public void setStaffCode(String staffCode)
    {
        this.staffCode = staffCode;
    }

    public String getOp()
    {
        return op;
    }

    public void setOp(String op)
    {
        this.op = op;
    }

    public String getUserIds()
    {
        return userIds;
    }

    public void setUserIds(String userIds)
    {
        this.userIds = userIds;
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
