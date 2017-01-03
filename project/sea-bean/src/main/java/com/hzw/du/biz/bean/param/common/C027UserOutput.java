/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：C027UserOutput.java
 * 修改时间：2016-8-2
 * 修改人：libb
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */



 	
package com.hzw.du.biz.bean.param.common;

import java.util.List;

import com.hzw.du.biz.bean.constant.CommonBizFunCode;
import com.hzw.du.biz.bean.param.BaseCommonOutput;
import com.hzw.du.biz.bean.param.bean.ConstantBean;

/**
 * <一句话功能简述> 用户信息输出参数
 * <功能详细描述>
 * @author libb
 * @version V1.0[产品/模块版本]
 */
public class C027UserOutput extends BaseCommonOutput
{

    /* ******************************************************************************************* */
    /*                                       序列化代码区域                                                                                               */
    /* ******************************************************************************************* */

    /* ******************************************************************************************* */
    /*                                       全局变量声明区域                                                                                           */
    /* ******************************************************************************************* */
    
    /**
     * 用户类型
     */
    private List<ConstantBean> uhlxList;
    
    /**
     * 证件类型数据
     */
    private List<ConstantBean> sfzList;

    /* ******************************************************************************************* */
    /*                                       公共函数声明区域                                                                                           */
    /* ******************************************************************************************* */
    public C027UserOutput()
    {
        functionCode = CommonBizFunCode.USER_C027;
    }

    public List<ConstantBean> getUhlxList()
    {
        return uhlxList;
    }

    public void setUhlxList(List<ConstantBean> uhlxList)
    {
        this.uhlxList = uhlxList;
    }

    public List<ConstantBean> getSfzList()
    {
        return sfzList;
    }

    public void setSfzList(List<ConstantBean> sfzList)
    {
        this.sfzList = sfzList;
    }

    /* ******************************************************************************************* */
    /*                                       私有函数声明区域                                                                                           */
    /* ******************************************************************************************* */
}
