/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：C025UserOutput.java
 * 修改时间：2016-8-2
 * 修改人：libb
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */



 	
package com.hzw.du.biz.bean.param.common;

import java.util.List;

import com.hzw.du.biz.bean.constant.CommonBizFunCode;
import com.hzw.du.biz.bean.param.BaseQueryCommonOutput;

/**
 * <一句话功能简述> 子用户信息输出参数
 * <功能详细描述>
 * @author libb
 * @version V1.0[产品/模块版本]
 */
public class C025UserOutput extends BaseQueryCommonOutput
{

    /* ******************************************************************************************* */
    /*                                       序列化代码区域                                                                                               */
    /* ******************************************************************************************* */

    /* ******************************************************************************************* */
    /*                                       全局变量声明区域                                                                                           */
    /* ******************************************************************************************* */

    /**
     * 主用户信息
     */
    private C025UserDetail userDetail;
    
    /**
     * 子用户信息集合
     */
    private List<C025UserDetail> userList;
    
    /* ******************************************************************************************* */
    /*                                       公共函数声明区域                                                                                           */
    /* ******************************************************************************************* */
    public C025UserOutput()
    {
        functionCode = CommonBizFunCode.USER_C025;
    }

    public C025UserDetail getUserDetail()
    {
        return userDetail;
    }

    public void setUserDetail(C025UserDetail userDetail)
    {
        this.userDetail = userDetail;
    }

    public List<C025UserDetail> getUserList()
    {
        return userList;
    }

    public void setUserList(List<C025UserDetail> userList)
    {
        this.userList = userList;
    }

    /* ******************************************************************************************* */
    /*                                       私有函数声明区域                                                                                           */
    /* ******************************************************************************************* */
}
