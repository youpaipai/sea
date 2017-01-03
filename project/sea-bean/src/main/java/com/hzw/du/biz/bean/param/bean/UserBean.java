/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：UserBean.java
 * 修改时间：2016-8-3
 * 修改人：libb
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */



 	
package com.hzw.du.biz.bean.param.bean;

/**
 * <一句话功能简述> TODO
 * <功能详细描述>
 * @author libb
 * @version V1.0[产品/模块版本]
 */
public class UserBean
{
    /* ******************************************************************************************* */
    /*                                       序列化代码区域                                                                                               */
    /* ******************************************************************************************* */

    /* ******************************************************************************************* */
    /*                                       全局变量声明区域                                                                                           */
    /* ******************************************************************************************* */

    /**
     * USERID  NUMBER  N           用户编号
     */
    private Long userId;
    
    /***
     * STAFFCODE   VARCHAR2(50)    Y           登陆号
     */
    private String staffCode;
    
    /**
     * USERNAME    VARCHAR2(100)   Y           用户名称
     */
    private String userName;
    
    /**
     * USERTYPE    NUMBER  Y           用户类型
     */
    private Integer userType;
    
    /**
     * DEPARTMENTID    NUMBER  Y           所属部门编号
     */
    private Long departmentId;
    
    /**
     * USERCLASSIFY    NUMBER  Y           0主用户 1子用户 2采购中心管理员
     */
    private Integer userClassify;
    
    /**
     * CARDTYPE    VARCHAR2(2)  Y           证件类型
     */
    private String cardType;
    
    /***
     * CARDNO  VARCHAR2(50)  Y           证件号码
     */
    private String cardNo;
    
    /**
     * ROLEID  NUMBER   Y           角色编号
     */
    private Long roleId;
    
    /**
     * PHONE   VARCHAR2(50)    Y           手机号码
     */
    private String phone;
    
    /**
     * EMAIL   VARCHAR2(200)   Y           邮箱
     */
    private String email;
    
    /**
     * TELNO   VARCHAR2(50)    Y           固定电话
     */
    private String telNo;
    
    /**
     * GENDER  NUMBER  Y           性别 0：男 1：女
     */
    private Integer gender;
    
    /**
     * ORGANIZATIONID  NUMBER  Y           所属组织机构编号
     */
    private Long organizationId;

    /* ******************************************************************************************* */
    /*                                       公共函数声明区域                                                                                           */
    /* ******************************************************************************************* */

    public Long getUserId()
    {
        return userId;
    }
    
    public void setUserId(Long userId)
    {
        this.userId = userId;
    }
    
    public String getStaffCode()
    {
        return staffCode;
    }
    
    public void setStaffCode(String staffCode)
    {
        this.staffCode = staffCode;
    }
    
    public String getUserName()
    {
        return userName;
    }
    
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    
    public Integer getUserType()
    {
        return userType;
    }
    
    public void setUserType(Integer userType)
    {
        this.userType = userType;
    }
    
    public Long getDepartmentId()
    {
        return departmentId;
    }
    
    public void setDepartmentId(Long departmentId)
    {
        this.departmentId = departmentId;
    }
    
    public Integer getUserClassify()
    {
        return userClassify;
    }
    
    public void setUserClassify(Integer userClassify)
    {
        this.userClassify = userClassify;
    }
    
    public String getCardType()
    {
        return cardType;
    }
    
    public void setCardType(String cardType)
    {
        this.cardType = cardType;
    }
    
    public String getCardNo()
    {
        return cardNo;
    }
    
    public void setCardNo(String cardNo)
    {
        this.cardNo = cardNo;
    }
    
    public Long getRoleId()
    {
        return roleId;
    }
    
    public void setRoleId(Long roleId)
    {
        this.roleId = roleId;
    }
    
    public String getPhone()
    {
        return phone;
    }
    
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public String getTelNo()
    {
        return telNo;
    }
    
    public void setTelNo(String telNo)
    {
        this.telNo = telNo;
    }
    
    public Integer getGender()
    {
        return gender;
    }
    
    public void setGender(Integer gender)
    {
        this.gender = gender;
    }
    
    public Long getOrganizationId()
    {
        return organizationId;
    }
    
    public void setOrganizationId(Long organizationId)
    {
        this.organizationId = organizationId;
    }
    
    /* ******************************************************************************************* */
    /*                                       私有函数声明区域                                                                                           */
    /* ******************************************************************************************* */
}
