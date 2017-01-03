/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：招标文件下载信息bean
 * 文件名称：DownTenderProFileBean.java
 * 修改时间：2016年8月4日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.biz.bean.param.bean;

/**
 * <一句话功能简述> 招标文件下载信息bean
 * <功能详细描述>
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class SysFileBean {
    
    /**
     *  文件编号
     */
    private Long fileId;
    
    /**
     *  文件标识号
     */
    private String ideNumber;
    
    /**
     *  原文件名称
     */
    private String oldFileName;
    
    /**
     *  存储文件名称
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
     * @return the fileId
     */
    public Long getFileId() {
        return this.fileId;
    }

    /**
     * @param fileId the fileId to set
     */
    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    /**
     * @return the ideNumber
     */
    public String getIdeNumber() {
        return this.ideNumber;
    }

    /**
     * @param ideNumber the ideNumber to set
     */
    public void setIdeNumber(String ideNumber) {
        this.ideNumber = ideNumber;
    }

    /**
     * @return the oldFileName
     */
    public String getOldFileName() {
        return this.oldFileName;
    }

    /**
     * @param oldFileName the oldFileName to set
     */
    public void setOldFileName(String oldFileName) {
        this.oldFileName = oldFileName;
    }

    /**
     * @return the fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * @return the fileDir
     */
    public String getFileDir() {
        return this.fileDir;
    }

    /**
     * @param fileDir the fileDir to set
     */
    public void setFileDir(String fileDir) {
        this.fileDir = fileDir;
    }

    /**
     * @return the subId
     */
    public Long getSubId() {
        return this.subId;
    }

    /**
     * @param subId the subId to set
     */
    public void setSubId(Long subId) {
        this.subId = subId;
    }

    /**
     * @return the tenderProjectId
     */
    public Long getTenderProjectId() {
        return this.tenderProjectId;
    }

    /**
     * @param tenderProjectId the tenderProjectId to set
     */
    public void setTenderProjectId(Long tenderProjectId) {
        this.tenderProjectId = tenderProjectId;
    }

    /**
     * @return the fileType
     */
    public String getFileType() {
        return this.fileType;
    }

    /**
     * @param fileType the fileType to set
     */
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    /**
     * @return the formart
     */
    public String getFormart() {
        return this.formart;
    }

    /**
     * @param formart the formart to set
     */
    public void setFormart(String formart) {
        this.formart = formart;
    }



}
