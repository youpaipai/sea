/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：M007LogOutput.java
 * 修改时间：2016-7-25
 * 修改人：libb
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */



 	
package com.hzw.du.biz.bean.param.common;

import java.util.ArrayList;
import java.util.List;

import com.hzw.du.biz.bean.constant.CommonBizFunCode;
import com.hzw.du.biz.bean.param.BaseQueryCommonOutput;

/**
 * <一句话功能简述> 日志信息输出参数
 * <功能详细描述>
 * @author libb
 * @version V1.0[产品/模块版本]
 */
public class C007LogOutput extends  BaseQueryCommonOutput
{
    /* ******************************************************************************************* */
    /*                                       序列化代码区域                                                                                               */
    /* ******************************************************************************************* */

    /* ******************************************************************************************* */
    /*                                       全局变量声明区域                                                                                           */
    /* ******************************************************************************************* */
    
    private List<C007LogDetail> logDetailList = new ArrayList<C007LogDetail>();
 
    /* ******************************************************************************************* */
    /*                                       公共函数声明区域                                                                                           */
    /* ******************************************************************************************* */
    
    public C007LogOutput()
    {
        functionCode = CommonBizFunCode.LOG_C007;
    }

    public List<C007LogDetail> getLogDetailList()
    {
        return logDetailList;
    }

    public void setLogDetailList(List<C007LogDetail> logDetailList)
    {
        this.logDetailList = logDetailList;
    }
    
    /* ******************************************************************************************* */
    /*                                       私有函数声明区域                                                                                           */
    /* ******************************************************************************************* */
}
