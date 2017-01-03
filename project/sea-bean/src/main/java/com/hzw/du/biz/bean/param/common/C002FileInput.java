/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：FileInput.java
 * 修改时间：2016-7-21
 * 修改人：libb
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */



 	
package com.hzw.du.biz.bean.param.common;

import com.hzw.du.biz.bean.constant.CommonBizFunCode;
import com.hzw.du.biz.bean.param.BaseCommonInput;

/**
 * <一句话功能简述> 文件信息输入参数
 * <功能详细描述>
 * @author libb
 * @version V1.0[产品/模块版本]
 */
public class C002FileInput extends BaseCommonInput
{

    /* ******************************************************************************************* */
    /*                                       序列化代码区域                                                                                               */
    /* ******************************************************************************************* */

    /* ******************************************************************************************* */
    /*                                       全局变量声明区域                                                                                           */
    /* ******************************************************************************************* */
    
    /**
     * 主键ID
     */
    private Long fileId;
    
    /* ******************************************************************************************* */
    /*                                       公共函数声明区域                                                                                           */
    /* ******************************************************************************************* */
    
    public C002FileInput()
    {
        functionCode = CommonBizFunCode.FILE_C002;
    }

    public Long getFileId()
    {
        return fileId;
    }

    public void setFileId(Long fileId)
    {
        this.fileId = fileId;
    }

    /* ******************************************************************************************* */
    /*                                       私有函数声明区域                                                                                           */
    /* ******************************************************************************************* */
}