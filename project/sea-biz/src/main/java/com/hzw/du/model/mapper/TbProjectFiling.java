/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[TB_PROJECT_FILING 项目归档表， 序列seq_filingid]
 * 文件名称：TbProjectFiling.java
 * 修改时间：2016年7月21日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

/**
 * [TB_PROJECT_FILING 项目归档表， 序列seq_filingid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class TbProjectFiling extends BaseBean {
    
    /**
     * FILINGID    NUMBER  N           主键ID
     */
    private Long filingId;
    
    /**
     * SUBID   NUMBER  Y           标段ID
     */
    private Long subId;
    
    /**
     * TENDERPROJECTID NUMBER  Y           招标项目ID
     */
    private Long tenderProjectId;
    
    /**
     * ORGTYPE NUMBER  Y           机构分类
     */
    private Integer orgType;
    
    /**
     * ORGANIZATIONID  NUMBER  Y           组织机构ID
     */
    private Long organizationId;
    
    /**
     * FILINGDATAID    NUMBER  Y           归档资料ID
     */
    private Long filingDataId;
    
    /**
     * FILEID  NUMBER  Y           文件ID
     */
    private Long fileID;

    
//    CREATEUSER  NUMBER  Y           创建人
//    CREATETIME  DATE    Y           创建时间
//    UPDATEUSER  NUMBER  Y           修改人
//    UPDATETIME  DATE    Y           修改时间
    /**
     * STATUS  NUMBER  Y           状态 0：未删除  1：删除
     */
    private Integer status;


    /**
     * @return the filingId
     */
    public Long getFilingId() {
        return this.filingId;
    }


    /**
     * @param filingId the filingId to set
     */
    public void setFilingId(Long filingId) {
        this.filingId = filingId;
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
     * @return the orgType
     */
    public Integer getOrgType() {
        return this.orgType;
    }


    /**
     * @param orgType the orgType to set
     */
    public void setOrgType(Integer orgType) {
        this.orgType = orgType;
    }


    /**
     * @return the organizationId
     */
    public Long getOrganizationId() {
        return this.organizationId;
    }


    /**
     * @param organizationId the organizationId to set
     */
    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }


    /**
     * @return the filingDataId
     */
    public Long getFilingDataId() {
        return this.filingDataId;
    }


    /**
     * @param filingDataId the filingDataId to set
     */
    public void setFilingDataId(Long filingDataId) {
        this.filingDataId = filingDataId;
    }


    /**
     * @return the fileID
     */
    public Long getFileID() {
        return this.fileID;
    }


    /**
     * @param fileID the fileID to set
     */
    public void setFileID(Long fileID) {
        this.fileID = fileID;
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
