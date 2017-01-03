/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：C010UserInput.java
 * 修改时间：2016-7-25
 * 修改人：libb
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */



 	
package com.hzw.du.biz.bean.param.common;

import com.hzw.du.biz.bean.constant.CommonBizFunCode;
import com.hzw.du.biz.bean.param.BaseQueryCommonInput;

/**
 * <一句话功能简述> 用户信息输入参数
 * <功能详细描述>
 * @author libb
 * @version V1.0[产品/模块版本]
 */
public class C010UserInput extends BaseQueryCommonInput
{
    /* ******************************************************************************************* */
    /*                                       序列化代码区域                                                                                               */
    /* ******************************************************************************************* */

    /* ******************************************************************************************* */
    /*                                       全局变量声明区域                                                                                           */
    /* ******************************************************************************************* */

    /***
     * STAFFCODE   VARCHAR2(50)    Y           登陆号
     */
    private String staffCode;
    
    /**
     * USERNAME    VARCHAR2(100)   Y           用户名称
     */
    private String userName;
    
    /**
     * PHONE   VARCHAR2(50)    Y           手机号码
     */
    private String phone;
    
    /**
     * USERCLASSIFY    NUMBER  Y           0主用户 1子用户 2采购中心管理员
     */
    private String userClassify;
    
    
    /* ******************************************************************************************* */
    /*                                       公共函数声明区域                                                                                           */
    /* ******************************************************************************************* */
    
    public C010UserInput()
    {
        functionCode = CommonBizFunCode.USER_C010;
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

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getUserClassify()
    {
        return userClassify;
    }

    public void setUserClassify(String userClassify)
    {
        this.userClassify = userClassify;
    }

    /* ******************************************************************************************* */
    /*                                       私有函数声明区域                                                                                           */
    /* ******************************************************************************************* */
}
