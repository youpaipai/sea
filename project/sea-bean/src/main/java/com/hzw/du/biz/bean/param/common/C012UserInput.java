/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：C012UserInput.java
 * 修改时间：2016-7-25
 * 修改人：libb
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */



 	
package com.hzw.du.biz.bean.param.common;

import com.hzw.du.biz.bean.constant.CommonBizFunCode;
import com.hzw.du.biz.bean.param.BaseCommonInput;

/**
 * <一句话功能简述> 修改用户密码
 * <功能详细描述>
 * @author libb
 * @version V1.0[产品/模块版本]
 */
public class C012UserInput extends BaseCommonInput
{
    /* ******************************************************************************************* */
    /*                                       序列化代码区域                                                                                               */
    /* ******************************************************************************************* */

    /* ******************************************************************************************* */
    /*                                       全局变量声明区域                                                                                           */
    /* ******************************************************************************************* */

    /**
     * 用户ID
     */
    private Long userId;
    
    /**
     * 旧密码
     */
    private String oldPassword;
    
    /**
     * 新密码
     */
    private String newPassword;
    
    /* ******************************************************************************************* */
    /*                                       公共函数声明区域                                                                                           */
    /* ******************************************************************************************* */

    /* ******************************************************************************************* */
    
    public C012UserInput()
    {
        functionCode = CommonBizFunCode.USER_C012;
    }

    public Long getUserId()
    {
        return userId;
    }
    
    public void setUserId(Long userId)
    {
        this.userId = userId;
    }
    
    public String getOldPassword()
    {
        return oldPassword;
    }
    
    public void setOldPassword(String oldPassword)
    {
        this.oldPassword = oldPassword;
    }
    
    public String getNewPassword()
    {
        return newPassword;
    }
    
    public void setNewPassword(String newPassword)
    {
        this.newPassword = newPassword;
    }
    
    /*                                       私有函数声明区域                                                                                           */
    /* ******************************************************************************************* */
}
