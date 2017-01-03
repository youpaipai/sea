/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：C018ConstantsOutput.java
 * 修改时间：2016-7-28
 * 修改人：libb
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */



 	
package com.hzw.du.biz.bean.param.common;

import java.util.Map;

import com.hzw.du.biz.bean.constant.CommonBizFunCode;
import com.hzw.du.biz.bean.param.BaseCommonOutput;
import com.hzw.du.biz.bean.param.bean.ConstantBean;

/**
 * <一句话功能简述> 数据字典输出参数
 * <功能详细描述>
 * @author libb
 * @version V1.0[产品/模块版本]
 */
public class C018ConstantOutput extends BaseCommonOutput

{
    /* ******************************************************************************************* */
    /*                                       序列化代码区域                                                                                               */
    /* ******************************************************************************************* */

    /* ******************************************************************************************* */
    /*                                       全局变量声明区域                                                                                           */
    /* ******************************************************************************************* */
    
    private Map<String, ConstantBean> constantMap;
    
    /* ******************************************************************************************* */
    /*                                       公共函数声明区域                                                                                           */
    /* ******************************************************************************************* */
    
    public C018ConstantOutput()
    {
        functionCode = CommonBizFunCode.CONSTANT_C018;
    }

    public Map<String, ConstantBean> getConstantMap()
    {
        return constantMap;
    }

    public void setConstantMap(Map<String, ConstantBean> constantMap)
    {
        this.constantMap = constantMap;
    }
    
    /* ******************************************************************************************* */
    /*                                       私有函数声明区域                                                                                           */
    /* ******************************************************************************************* */
}
