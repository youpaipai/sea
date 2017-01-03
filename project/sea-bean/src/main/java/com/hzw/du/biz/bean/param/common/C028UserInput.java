/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：C028UserInput.java
 * 修改时间：2016-8-2
 * 修改人：libb
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */



 	
package com.hzw.du.biz.bean.param.common;

import com.hzw.du.biz.bean.constant.CommonBizFunCode;
import com.hzw.du.biz.bean.param.BaseCommonInput;
import com.hzw.du.biz.bean.param.bean.PersonUserBean;
import com.hzw.du.biz.bean.param.bean.SupplierUserBean;
import com.hzw.du.biz.bean.param.bean.UserBean;

/**
 * <一句话功能简述> 用户信息输入参数
 * <功能详细描述>
 * @author libb
 * @version V1.0[产品/模块版本]
 */
public class C028UserInput extends BaseCommonInput
{

    /* ******************************************************************************************* */
    /*                                       序列化代码区域                                                                                               */
    /* ******************************************************************************************* */

    /* ******************************************************************************************* */
    /*                                       全局变量声明区域                                                                                           */
    /* ******************************************************************************************* */
    
    private UserBean userBean;
    
    /**
     * 登陆用户ID
     */
    private Long loginUserId;
    
    /**
     * 供应商用户特有信息
     */
    private SupplierUserBean supplierUserBean;
    
    /**
     * 招标人用户特有信息
     */
    private PersonUserBean personUserBean;

    /* ******************************************************************************************* */
    /*                                       公共函数声明区域                                                                                           */
    /* ******************************************************************************************* */
    public C028UserInput()
    {
        functionCode = CommonBizFunCode.USER_C028;
    }

    public UserBean getUserBean()
    {
        return userBean;
    }

    public void setUserBean(UserBean userBean)
    {
        this.userBean = userBean;
    }

    public Long getLoginUserId()
    {
        return loginUserId;
    }

    public void setLoginUserId(Long loginUserId)
    {
        this.loginUserId = loginUserId;
    }

    public SupplierUserBean getSupplierUserBean()
    {
        return supplierUserBean;
    }

    public void setSupplierUserBean(SupplierUserBean supplierUserBean)
    {
        this.supplierUserBean = supplierUserBean;
    }

    public PersonUserBean getPersonUserBean()
    {
        return personUserBean;
    }

    public void setPersonUserBean(PersonUserBean personUserBean)
    {
        this.personUserBean = personUserBean;
    }

    /* ******************************************************************************************* */
    /*                                       私有函数声明区域                                                                                           */
    /* ******************************************************************************************* */
}
