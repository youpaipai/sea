/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：M008LogOutput.java
 * 修改时间：2016-7-25
 * 修改人：libb
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */



 	
package com.hzw.du.biz.bean.param.common;

import com.hzw.du.biz.bean.constant.CommonBizFunCode;
import com.hzw.du.biz.bean.param.BaseCommonOutput;

/**
 * <一句话功能简述> TODO
 * <功能详细描述>
 * @author libb
 * @version V1.0[产品/模块版本]
 */
public class C008LogOutput extends BaseCommonOutput
{
    /* ******************************************************************************************* */
    /*                                       序列化代码区域                                                                                               */
    /* ******************************************************************************************* */

    /* ******************************************************************************************* */
    /*                                       全局变量声明区域                                                                                           */
    /* ******************************************************************************************* */

    private C008LogDetail logDetail;
    
    /* ******************************************************************************************* */
    /*                                       公共函数声明区域                                                                                           */
    /* ******************************************************************************************* */
    
    public C008LogOutput()
    {
        functionCode = CommonBizFunCode.LOG_C008;
    }

    public C008LogDetail getLogDetail()
    {
        return logDetail;
    }

    public void setLogDetail(C008LogDetail logDetail)
    {
        this.logDetail = logDetail;
    }

    /* ******************************************************************************************* */
    /*                                       私有函数声明区域                                                                                           */
    /* ******************************************************************************************* */
}
