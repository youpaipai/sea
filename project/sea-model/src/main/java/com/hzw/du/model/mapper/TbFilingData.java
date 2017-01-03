/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[TB_FILING_DATA 项目归档配置表， 序列seq_filingdataid]
 * 文件名称：TbFilingData.java
 * 修改时间：2016年7月21日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

/**
 * [TB_FILING_DATA 项目归档配置表， 序列seq_filingdataid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class TbFilingData extends BaseBean {
    
    /**
     * FILINGDATAID NUMBER  N           主键ID
     */
    private Long filingDataId;
    
    /**
     * ORGTYPE NUMBER  Y           机构分类
     */
    private Integer orgType;
    
    /**
     * ORGANIZATIONID  NUMBER  Y           组织机构ID
     */
    private Long organizationId;
    
    /**
     * COMMENT VARCHAR2(200)   Y           文档注释
     */
    private String comment;
    
    /**
     * FILINGDATANAME  VARCHAR2(200)   Y           资料文件名称
     */
    private String filingDataName;
    
//    CREATEUSER  NUMBER  Y           创建人
//    CREATETIME  DATE    Y           创建时间
    /**
     * STATUS  NUMBER  Y           状态 0：未删除  1：删除
     */
    private Integer status;

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
     * @return the comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * @return the filingDataName
     */
    public String getFilingDataName() {
        return this.filingDataName;
    }

    /**
     * @param filingDataName the filingDataName to set
     */
    public void setFilingDataName(String filingDataName) {
        this.filingDataName = filingDataName;
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
