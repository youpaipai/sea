/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_FILE  文件表， 序列seq_fileid]
 * 文件名称：SysFile.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

/**
 * [SYS_FILE  文件表， 序列seq_fileid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class SysFile extends BaseBean {
    
    /**
     * FILEID  NUMBER  N           文件编号
     */
    private Long fileId;
    
    /**
     * IDENUMBER   VARCHAR2(36)    Y           文件标识号
     */
    private String ideNumber;
    
    /**
     * OLDFILENAME VARCHAR2(500)   Y            原文件名称
     */
    private String oldFileName;
    
    /**
     * FILENAME    VARCHAR2(500)   Y           存储文件名称
     */
    private String fileName;
    
    /**
     * FILEDIR VARCHAR2(1000)  Y           存储文件路径
     */
    private String fileDir;
    
    /**
     * SUBID   NUMBER  Y           标段ID
     */
    private Long subId;
    
    /**
     * TENDERPROJECTID NUMBER  Y           招标项目ID
     */
    private Long tenderProjectId;
    
    /**
     * FILETYPE    VARCHAR2(10)    Y           文件类型
     */
    private String fileType;
    
    /**
     * FORMART VARCHAR2(50)    Y           文件格式
     */
    private String formart;

//  CREATEUSER  NUMBER  Y           创建人
//  CREATETIME  DATE    Y           创建时间
    /**
     * STATUS  NUMBER  Y           0:未删除  1：已删除
     */
    private Integer status;

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

    /**
     * @return the status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

}
