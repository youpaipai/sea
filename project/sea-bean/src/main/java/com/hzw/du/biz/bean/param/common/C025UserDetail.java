/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：C025UserDetail.java
 * 修改时间：2016-8-2
 * 修改人：libb
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */



 	
package com.hzw.du.biz.bean.param.common;

import java.util.Date;

import com.hzw.du.biz.bean.param.BaseCommonDetail;

/**
 * <一句话功能简述> 子用户信息
 * <功能详细描述>
 * @author libb
 * @version V1.0[产品/模块版本]
 */
public class C025UserDetail extends BaseCommonDetail
{

    /* ******************************************************************************************* */
    /*                                       序列化代码区域                                                                                               */
    /* ******************************************************************************************* */
    private static final long serialVersionUID = -8523382586646860926L;

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
     * USERCLASSIFY    NUMBER  Y           0主用户 1子用户 2采购中心管理员
     */
    private Integer userClassify;

    /**
     * PHONE   VARCHAR2(50)    Y           手机号码
     */
    private String phone;
    
    /**
     * REGINDATE   DATE    Y           注册时间
     */
    private Date reginDate;
    
    /**
     * STATUS  NUMBER  Y           用户状态
     */
    private Integer status;

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
    
    public Integer getUserClassify()
    {
        return userClassify;
    }
    
    public void setUserClassify(Integer userClassify)
    {
        this.userClassify = userClassify;
    }
    
    public String getPhone()
    {
        return phone;
    }
    
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    
    public Date getReginDate()
    {
        return reginDate;
    }
    
    public void setReginDate(Date reginDate)
    {
        this.reginDate = reginDate;
    }
    
    public Integer getStatus()
    {
        return status;
    }
    
    public void setStatus(Integer status)
    {
        this.status = status;
    }
    
    public static long getSerialversionuid()
    {
        return serialVersionUID;
    }

    /* ******************************************************************************************* */
    /*                                       私有函数声明区域                                                                                           */
    /* ******************************************************************************************* */
}
