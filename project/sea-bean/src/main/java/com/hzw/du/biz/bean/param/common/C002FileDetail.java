/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：FileDetail.java
 * 修改时间：2016-7-21
 * 修改人：libb
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */



 	
package com.hzw.du.biz.bean.param.common;

/**
 * <一句话功能简述> 文件信息返回对象
 * <功能详细描述>
 * @author libb
 * @version V1.0[产品/模块版本]
 */
public class C002FileDetail
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
    
    /**
     * 文件标识号
     */
    private String ideNumber;
    
    /**
     * 原文件名称
     */
    private String oldFileName;
    
    /**
     * 存储文件名称
     */
    private String fileName;
    
    /**
     * 存储文件路径
     */
    private String fileDir;
    
    /**
     * 标段ID
     */
    private Long subId;
    
    /**
     * 招标项目ID
     */
    private Long tenderProjectId;
    
    /**
     * 文件类型
     */
    private String fileType;
    
    /**
     * 文件格式
     */
    private String formart;

    /**
     * 0:未删除  1：已删除
     */
    private Integer status;

    public Long getFileId()
    {
        return fileId;
    }

    public void setFileId(Long fileId)
    {
        this.fileId = fileId;
    }

    public String getIdeNumber()
    {
        return ideNumber;
    }

    public void setIdeNumber(String ideNumber)
    {
        this.ideNumber = ideNumber;
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

    public String getFileType()
    {
        return fileType;
    }

    public void setFileType(String fileType)
    {
        this.fileType = fileType;
    }

    public String getFormart()
    {
        return formart;
    }

    public void setFormart(String formart)
    {
        this.formart = formart;
    }

    public Integer getStatus()
    {
        return status;
    }

    public void setStatus(Integer status)
    {
        this.status = status;
    }
    
    /* ******************************************************************************************* */
    /*                                       公共函数声明区域                                                                                           */
    /* ******************************************************************************************* */

    /* ******************************************************************************************* */
    /*                                       私有函数声明区域                                                                                           */
    /* ******************************************************************************************* */
    
}
