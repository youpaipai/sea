package com.hzw.du.web.entity.request;

import com.hzw.du.web.entity.BaseRequest;

/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：文件信息类
 * 文件名称：FileRequest.java
 * 修改时间：2016-7-18
 * 修改人：libb
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
public class FileRequest extends BaseRequest
{
    /* ******************************************************************************************* */
    /*                                       序列化代码区域                                                                                               */
    /* ******************************************************************************************* */

    /* ******************************************************************************************* */
    /*                                       全局变量声明区域                                                                                           */
    /* ******************************************************************************************* */
    
    /* 主键 */
    private Long fileId;
    
    /* 原文件名称 */
    private String oldFileName;
    
    /* 存储文件名称 */
    private String fileName;
    
    /* 存储文件路径 */
    private String fileDir;
    
    /* 标段ID */
    private Long subId;
    
    /* 招标项目ID */
    private Long tenderProjectId;

    /* ******************************************************************************************* */
    /*                                       公共函数声明区域                                                                                           */
    /* ******************************************************************************************* */

    public Long getFileId()
    {
        return fileId;
    }

    public void setFileId(Long fileId)
    {
        this.fileId = fileId;
    }

    public String getOldFileName()
    {
        return oldFileName;
    }

    public void setOldFileName(String oldFileName)
    {
        this.oldFileName = oldFileName;
    }

    public String getFileName()
    {
        return fileName;
    }

    public void setFileName(String fileName)
    {
        this.fileName = fileName;
    }

    public String getFileDir()
    {
        return fileDir;
    }

    public void setFileDir(String fileDir)
    {
        this.fileDir = fileDir;
    }

    public Long getSubId()
    {
        return subId;
    }

    public void setSubId(Long subId)
    {
        this.subId = subId;
    }

    public Long getTenderProjectId()
    {
        return tenderProjectId;
    }

    public void setTenderProjectId(Long tenderProjectId)
    {
        this.tenderProjectId = tenderProjectId;
    }
    
    /* ******************************************************************************************* */
    /*                                       私有函数声明区域                                                                                           */
    /* ******************************************************************************************* */
    
}
