/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：招标项目信息查询，详细
 * 文件名称：C013ProjectQueryDetail.java
 * 修改时间：2016年7月26日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.biz.bean.param.common;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 招标项目信息查询，详细
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class C015QueryTenderProjectDetail {


    /**
     *  招标项目id
     */
    private Long tenderProjectId;
    
    /**
     * 所属项目id
     */
    private Long projectId;
    
    /**
     *  招标项目编号
     */
    private String tenderProjectNum;
    
    /**
     *  招标项目名称
     */
    private String tenderProjectName;
    
    /**
     * 招标内容与范围及招标方案说明
     */
    private String tenderContent;
    
    /**
     * 监督部门id
     */
    private Long orgSuperviseDeptId;
    
    /**
     * 审核部门id
     */
    private Long orgApproveDeptId;
    
    /**
     * 招标人id
     */
    private Long tenderId;
    
    /**
     * 招标方式
     */
    private Integer tenderMode;
    
    /**
     * 招标组织形式
     */
    private Integer tenderOrganziForm;
    
    /**
     * 委托合同
     */
    private Long contractFile;
    
    /**
     * 标段委托金额
     */
    private BigDecimal subMoney;
    
    /**
     * 标段合同估算价
     */
    private BigDecimal subReckonPrice;
    
    /**
     * 金额币种
     */
    private String currencyCode;
    
    /**
     * 金额单位
     */
    private String priceUnit;
    
    /**
     * 招标项目类型
     */
    private String tenderProjectType;

    /**
     * 创建时间
     */
    private Date createTime;
    
    /**
     * STATUS  NUMBER  Y           状态 0：未删除  1：删除
     */
    private Integer status;
    
    //标段数量
    private Integer subNum;
    //发布公告数
    private Integer pushNoticeNum;
    //变更公告数量
    private Integer changeNoticeNum;
    //供应商数量
    private Integer supplierNum;
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
     * @return the projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }
    /**
     * @param projectId the projectId to set
     */
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }
    /**
     * @return the tenderProjectNum
     */
    public String getTenderProjectNum() {
        return this.tenderProjectNum;
    }
    /**
     * @param tenderProjectNum the tenderProjectNum to set
     */
    public void setTenderProjectNum(String tenderProjectNum) {
        this.tenderProjectNum = tenderProjectNum;
    }
    /**
     * @return the tenderProjectName
     */
    public String getTenderProjectName() {
        return this.tenderProjectName;
    }
    /**
     * @param tenderProjectName the tenderProjectName to set
     */
    public void setTenderProjectName(String tenderProjectName) {
        this.tenderProjectName = tenderProjectName;
    }
    /**
     * @return the tenderContent
     */
    public String getTenderContent() {
        return this.tenderContent;
    }
    /**
     * @param tenderContent the tenderContent to set
     */
    public void setTenderContent(String tenderContent) {
        this.tenderContent = tenderContent;
    }
    /**
     * @return the orgSuperviseDeptId
     */
    public Long getOrgSuperviseDeptId() {
        return this.orgSuperviseDeptId;
    }
    /**
     * @param orgSuperviseDeptId the orgSuperviseDeptId to set
     */
    public void setOrgSuperviseDeptId(Long orgSuperviseDeptId) {
        this.orgSuperviseDeptId = orgSuperviseDeptId;
    }
    /**
     * @return the orgApproveDeptId
     */
    public Long getOrgApproveDeptId() {
        return this.orgApproveDeptId;
    }
    /**
     * @param orgApproveDeptId the orgApproveDeptId to set
     */
    public void setOrgApproveDeptId(Long orgApproveDeptId) {
        this.orgApproveDeptId = orgApproveDeptId;
    }
    /**
     * @return the tenderId
     */
    public Long getTenderId() {
        return this.tenderId;
    }
    /**
     * @param tenderId the tenderId to set
     */
    public void setTenderId(Long tenderId) {
        this.tenderId = tenderId;
    }
    /**
     * @return the tenderMode
     */
    public Integer getTenderMode() {
        return this.tenderMode;
    }
    /**
     * @param tenderMode the tenderMode to set
     */
    public void setTenderMode(Integer tenderMode) {
        this.tenderMode = tenderMode;
    }
    /**
     * @return the tenderOrganziForm
     */
    public Integer getTenderOrganziForm() {
        return this.tenderOrganziForm;
    }
    /**
     * @param tenderOrganziForm the tenderOrganziForm to set
     */
    public void setTenderOrganziForm(Integer tenderOrganziForm) {
        this.tenderOrganziForm = tenderOrganziForm;
    }
    /**
     * @return the contractFile
     */
    public Long getContractFile() {
        return this.contractFile;
    }
    /**
     * @param contractFile the contractFile to set
     */
    public void setContractFile(Long contractFile) {
        this.contractFile = contractFile;
    }
    /**
     * @return the subMoney
     */
    public BigDecimal getSubMoney() {
        return this.subMoney;
    }
    /**
     * @param subMoney the subMoney to set
     */
    public void setSubMoney(BigDecimal subMoney) {
        this.subMoney = subMoney;
    }
    /**
     * @return the subReckonPrice
     */
    public BigDecimal getSubReckonPrice() {
        return this.subReckonPrice;
    }
    /**
     * @param subReckonPrice the subReckonPrice to set
     */
    public void setSubReckonPrice(BigDecimal subReckonPrice) {
        this.subReckonPrice = subReckonPrice;
    }
    /**
     * @return the currencyCode
     */
    public String getCurrencyCode() {
        return this.currencyCode;
    }
    /**
     * @param currencyCode the currencyCode to set
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
    /**
     * @return the priceUnit
     */
    public String getPriceUnit() {
        return this.priceUnit;
    }
    /**
     * @param priceUnit the priceUnit to set
     */
    public void setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit;
    }
    /**
     * @return the tenderProjectType
     */
    public String getTenderProjectType() {
        return this.tenderProjectType;
    }
    /**
     * @param tenderProjectType the tenderProjectType to set
     */
    public void setTenderProjectType(String tenderProjectType) {
        this.tenderProjectType = tenderProjectType;
    }
    /**
     * @return the createTime
     */
    public Date getCreateTime() {
        return this.createTime;
    }
    /**
     * @param createTime the createTime to set
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
    /**
     * @return the subNum
     */
    public Integer getSubNum() {
        return this.subNum;
    }
    /**
     * @param subNum the subNum to set
     */
    public void setSubNum(Integer subNum) {
        this.subNum = subNum;
    }
    /**
     * @return the pushNoticeNum
     */
    public Integer getPushNoticeNum() {
        return this.pushNoticeNum;
    }
    /**
     * @param pushNoticeNum the pushNoticeNum to set
     */
    public void setPushNoticeNum(Integer pushNoticeNum) {
        this.pushNoticeNum = pushNoticeNum;
    }
    /**
     * @return the changeNoticeNum
     */
    public Integer getChangeNoticeNum() {
        return this.changeNoticeNum;
    }
    /**
     * @param changeNoticeNum the changeNoticeNum to set
     */
    public void setChangeNoticeNum(Integer changeNoticeNum) {
        this.changeNoticeNum = changeNoticeNum;
    }
    /**
     * @return the supplierNum
     */
    public Integer getSupplierNum() {
        return this.supplierNum;
    }
    /**
     * @param supplierNum the supplierNum to set
     */
    public void setSupplierNum(Integer supplierNum) {
        this.supplierNum = supplierNum;
    }
    
}
