/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：C024RegisterSysUserInput.java
 * 修改时间：2016-7-25
 * 修改人：王帅帅
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
package com.hzw.du.biz.bean.param.common;

import java.util.Date;

import com.hzw.du.biz.bean.constant.CommonBizFunCode;
import com.hzw.du.biz.bean.param.BaseCommonInput;

/**
 * 
 * 用户基本信息注册
 * <功能详细描述>
 * @author 王帅帅
 * @version V1.0[产品/模块版本]
 */
public class C024RegisterSysUserInput extends BaseCommonInput{
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
     * PASSWORD    VARCHAR2(100)   Y           密码
     */
    private String password;
    
    /**
     * USERTYPE    NUMBER  Y           用户类型
     */
    private Integer userType;
    
    /**
     * DEPARTMENTID    NUMBER  Y           所属部门编号
     */
    private Long departmentId;
    
    /**
     * LASTLOGINTIME   DATE    Y           最后登录时间
     */
    private Date lastLoginTime;
    
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
     * COUNT   NUMBER  Y           记录输入密码错误的次数
     */
    private Integer count = 0;
    
    /**
     * ERRORDATE   DATE    Y           最后一次输入密码错误的时间
     */
    private Date errorDate;
    
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
     * REGINDATE   DATE    Y           注册时间
     */
    private Date reginDate;
    
    /**
     * ORGANIZATIONID  NUMBER  Y           所属组织机构编号
     */
    private Long organizationId;
//    CREATEUSER  NUMBER  Y           创建人
//    CREATETIME  DATE    Y           创建时间
//    UPDATEUSER  NUMBER  Y           修改人
//    UPDATETIME  DATE    Y           修改时间
    /**
     * STATUS  NUMBER  Y           用户状态
     */
    private Integer status;
    
    
    // 组织编号名称
    private String organizationName;
    
    
   


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





    public String getPassword()
    {
        return password;
    }





    public void setPassword(String password)
    {
        this.password = password;
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





    public Date getLastLoginTime()
    {
        return lastLoginTime;
    }





    public void setLastLoginTime(Date lastLoginTime)
    {
        this.lastLoginTime = lastLoginTime;
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





    public Integer getCount()
    {
        return count;
    }





    public void setCount(Integer count)
    {
        this.count = count;
    }





    public Date getErrorDate()
    {
        return errorDate;
    }





    public void setErrorDate(Date errorDate)
    {
        this.errorDate = errorDate;
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





    public Date getReginDate()
    {
        return reginDate;
    }





    public void setReginDate(Date reginDate)
    {
        this.reginDate = reginDate;
    }





    public Long getOrganizationId()
    {
        return organizationId;
    }





    public void setOrganizationId(Long organizationId)
    {
        this.organizationId = organizationId;
    }





    public Integer getStatus()
    {
        return status;
    }





    public void setStatus(Integer status)
    {
        this.status = status;
    }





    public String getOrganizationName()
    {
        return organizationName;
    }





    public void setOrganizationName(String organizationName)
    {
        this.organizationName = organizationName;
    }





    public C024RegisterSysUserInput(){
        
        functionCode=CommonBizFunCode.REGISTER_SYSUSER_C024;
        
        
    }
}
