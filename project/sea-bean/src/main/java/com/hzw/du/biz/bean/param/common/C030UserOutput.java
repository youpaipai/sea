/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：C030UserOutput.java
 * 修改时间：2016-8-2
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
 * <一句话功能简述> 组织机构输出参数
 * <功能详细描述>
 * @author libb
 * @version V1.0[产品/模块版本]
 */
public class C030UserOutput extends BaseQueryCommonOutput
{

    /* ******************************************************************************************* */
    /*                                       序列化代码区域                                                                                               */
    /* ******************************************************************************************* */

    /* ******************************************************************************************* */
    /*                                       全局变量声明区域                                                                                           */
    /* ******************************************************************************************* */
    
    private List<C030UserDetail> detailList = new ArrayList<C030UserDetail>();

    /* ******************************************************************************************* */
    /*                                       公共函数声明区域                                                                                           */
    /* ******************************************************************************************* */
    public C030UserOutput()
    {
        functionCode = CommonBizFunCode.USER_C030;
    }

    public List<C030UserDetail> getDetailList()
    {
        return detailList;
    }

    public void setDetailList(List<C030UserDetail> detailList)
    {
        this.detailList = detailList;
    }

    /* ******************************************************************************************* */
    /*                                       私有函数声明区域                                                                                           */
    /* ******************************************************************************************* */
}
