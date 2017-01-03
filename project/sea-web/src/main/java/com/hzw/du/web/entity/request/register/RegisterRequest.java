/*
 * 公司名称：江苏华招网信息技术有限公司
 * 版权信息：江苏华招网信息技术有限公司版权所有
 * 描述：所有用户注册使用的Request
 * 文件名称：RegisterRequest.java
 * 修改时间：2016年8月3日
 * 修改人：朱加健
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.web.entity.request.register;

import com.hzw.du.web.entity.BaseRequest;

/**
 * <一句话功能简述> 所有用户注册使用的Request
 * @author 朱加健
 * @version V1.0[产品/模块版本]
 */
public class RegisterRequest extends BaseRequest
{
    /* ******************************************************************************************* */
    /*                                       序列化代码区域                                                                                               */
    /* ******************************************************************************************* */
    
    /* ******************************************************************************************* */
    /*                                       全局变量声明区域                                                                                           */
    /* ******************************************************************************************* */
    /**
     * 登录名
     */
    private String staffCode;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 验证码
     */
    private String phoneCode;
    /**
     * 密码
     */
    private String password;

    /**
     * @return the staffCode
     */
    public String getStaffCode()
    {
        return staffCode;
    }

    /**
     * @param staffCode the staffCode to set
     */
    public void setStaffCode(String staffCode)
    {
        this.staffCode = staffCode;
    }

    /**
     * @return the userName
     */
    public String getUserName()
    {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    /**
     * @return the phone
     */
    public String getPhone()
    {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    /**
     * @return the phoneCode
     */
    public String getPhoneCode()
    {
        return phoneCode;
    }

    /**
     * @param phoneCode the phoneCode to set
     */
    public void setPhoneCode(String phoneCode)
    {
        this.phoneCode = phoneCode;
    }

    /**
     * @return the password
     */
    public String getPassword()
    {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    /* ******************************************************************************************* */
    /*                                       公共函数声明区域                                                                                           */
    /* ******************************************************************************************* */
    
    /* ******************************************************************************************* */
    /*                                       私有函数声明区域                                                                                           */
    /* ******************************************************************************************* */
}
