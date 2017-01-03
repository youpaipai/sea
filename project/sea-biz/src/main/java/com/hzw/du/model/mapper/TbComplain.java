/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[TB_COMPLAIN 质疑投诉表， 序列seq_complainid]
 * 文件名称：TbComplain.java
 * 修改时间：2016年7月21日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

/**
 * [TB_COMPLAIN 质疑投诉表， 序列seq_complainid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class TbComplain extends BaseBean {

    /**
     * COMPLAINID  NUMBER  N           主键ID
     */
    private Long complainId;
    
    /**
     * ORGANIZATIONID  NUMBER  Y           组织机构编号（供应商）
     */
    private Long organizationId;
    
    /**
     * SUBID   NUMBER  Y           标段ID
     */
    private Long subId;
    
    /**
     * TENDERPROJECTID NUMBER  Y           招标项目ID
     */
    private Long tenderProjectId;
    
    /**
     * BASIS   VARCHAR2(1000)  Y           依据和理由
     */
    private String basis;
    
    /**
     * CONTENT VARCHAR2(1000)  Y           异议、投诉内容
     */
    private String content;
    
    /**
     * COMPLAINFILEID  NUMBER  Y           异议、投诉文件ID
     */
    private Long complainFileId;
    
    /**
     * ACCEPTSTATE NUMBER  Y           受理状态
     */
    private Integer acceptState;

//    CREATEUSER  NUMBER  Y           创建人
//    CREATETIME  DATE    Y           创建时间
//    UPDATEUSER  NUMBER  Y           修改人
//    UPDATETIME  DATE    Y           修改时间
    /**
     * STATUS  NUMBER  Y           状态 0：未删除  1：删除
     */
    private Integer status;

    /**
     * @return the complainId
     */
    public Long getComplainId() {
        return this.complainId;
    }

    /**
     * @param complainId the complainId to set
     */
    public void setComplainId(Long complainId) {
        this.complainId = complainId;
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
     * @return the basis
     */
    public String getBasis() {
        return this.basis;
    }

    /**
     * @param basis the basis to set
     */
    public void setBasis(String basis) {
        this.basis = basis;
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
     * @return the content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the complainFileId
     */
    public Long getComplainFileId() {
        return this.complainFileId;
    }

    /**
     * @param complainFileId the complainFileId to set
     */
    public void setComplainFileId(Long complainFileId) {
        this.complainFileId = complainFileId;
    }

    /**
     * @return the acceptState
     */
    public Integer getAcceptState() {
        return this.acceptState;
    }

    /**
     * @param acceptState the acceptState to set
     */
    public void setAcceptState(Integer acceptState) {
        this.acceptState = acceptState;
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
