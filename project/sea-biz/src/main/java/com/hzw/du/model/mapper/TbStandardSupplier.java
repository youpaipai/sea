/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[TB_STANDARD_SUPPLIER 参标供应商表， 序列seq_standardid]
 * 文件名称：TbStandardSupplier.java
 * 修改时间：2016年7月21日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.Date;

/**
 * [TB_STANDARD_SUPPLIER 参标供应商表， 序列seq_standardid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class TbStandardSupplier extends BaseBean {

    /**
     * STANDARDID  NUMBER  N           参标供应商编号
     */
    private Long standardId;
    
    /**
     * SUBID   NUMBER  Y           标段ID
     */
    private Long subId;
    
    /***
     * TENDERPROJECTID NUMBER  Y           招标项目ID
     */
    private Long tenderProjectId;
    
    /**
     * SUPPLIERORGID   NUMBER  Y           组织机构id(供应商)
     */
    private Long supplierOrgId;
    
    /**
     * SUPPLIERORGNAME VARCHAR2(100)   Y           供应商名称
     */
    private String supplierOrgName;
    
    /**
     * SUPPLIERUSERID  NUMBER  Y           供应商用户id(用户表)
     */
    private Long supplierUserId;
    
    /**
     * SUPPLIERUSERNAME    VARCHAR2(100)   Y           供应商用户名称
     */
    private String supplierUserName;
    
    /**
     * PHONE   VARCHAR2(50)    Y           联系电话
     */
    private String phone;
    
    /**
     * ISPAYMENT   NUMBER(1)   Y           付款标识(0：未付款，1：已付款)
     */
    private Integer isPayment;
    
    /**
     * PAYMENTTYPE NUMBER(10)  Y           付款类型
     */
    private Integer paymentType;
    
    /**
     * TTFILEID    NUMBER(10)  Y           电汇附件id
     */
    private Long ttFileId;
    
    /**
     * ISINVITE    NUMBER(1)   Y           邀请标识（0：否，1：是）
     */
    private Integer isInvite;
    
    /**
     * ISDOWNPOWER NUMBER(1)   Y           开通下载权限 0：已开通 1：未开通
     */
    private Integer isDownPower;
    
    /**
     * ISUNION NUMBER(1)   Y           是否联合体
     */
    private Integer isUnion;
    
    /**
     * UNIONCODETYPE   VARCHAR2(20)    Y           联合体代码类型
     */
    private String unionCodeType;
    
    /**
     * UNIONCODE   VARCHAR2(200)   Y           联合体代码
     */
    private String unionCode;
    
    /**
     * UNIONNAME   VARCHAR2(1000)  Y           联合体名称
     */
    private String unionName;
    
//    CREATEUSER  NUMBER  Y           创建人
//    CREATETIME  DATE    Y           创建时间
//    UPDATEUSER  NUMBER  Y           修改人
//    UPDATETIME  DATE    Y           修改时间
    /**
     * STATUS  NUMBER  Y           状态 0：未删除  1：删除
     */
    private Integer status;
    
    //所属项目id
    private Long projectId;
    //招标项目编号
    private String tenderProjectNum;
    // 招标项目名称
    private String tenderProjectName;
     //招标内容与范围及招标方案说明
    private String tenderContent;
    //招标项目对应的标段的数量
    private Integer subNum;
    //异常标识 0:正常 1：暂停 2：终止
    private Integer abnormalFlag;
    //标段号
    private Integer sortNo;
    //标段名称
    private String subName;
    //标段内容
    private String subContent;
    //开标日期
    private Date openTime;
    //开标地点
    private String openAddress;
    //中标状态 0：未中标  1：中标
    private String bidStatus;
    

    /**
     * @return the standardId
     */
    public Long getStandardId() {
        return this.standardId;
    }

    /**
     * @param standardId the standardId to set
     */
    public void setStandardId(Long standardId) {
        this.standardId = standardId;
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
     * @return the supplierOrgId
     */
    public Long getSupplierOrgId() {
        return this.supplierOrgId;
    }

    /**
     * @param supplierOrgId the supplierOrgId to set
     */
    public void setSupplierOrgId(Long supplierOrgId) {
        this.supplierOrgId = supplierOrgId;
    }

    /**
     * @return the supplierOrgName
     */
    public String getSupplierOrgName() {
        return this.supplierOrgName;
    }

    /**
     * @param supplierOrgName the supplierOrgName to set
     */
    public void setSupplierOrgName(String supplierOrgName) {
        this.supplierOrgName = supplierOrgName;
    }

    /**
     * @return the supplierUserId
     */
    public Long getSupplierUserId() {
        return this.supplierUserId;
    }

    /**
     * @param supplierUserId the supplierUserId to set
     */
    public void setSupplierUserId(Long supplierUserId) {
        this.supplierUserId = supplierUserId;
    }

    /**
     * @return the supplierUserName
     */
    public String getSupplierUserName() {
        return this.supplierUserName;
    }

    /**
     * @param supplierUserName the supplierUserName to set
     */
    public void setSupplierUserName(String supplierUserName) {
        this.supplierUserName = supplierUserName;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the isPayment
     */
    public Integer getIsPayment() {
        return this.isPayment;
    }

    /**
     * @param isPayment the isPayment to set
     */
    public void setIsPayment(Integer isPayment) {
        this.isPayment = isPayment;
    }

    /**
     * @return the paymentType
     */
    public Integer getPaymentType() {
        return this.paymentType;
    }

    /**
     * @param paymentType the paymentType to set
     */
    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * @return the ttFileId
     */
    public Long getTtFileId() {
        return this.ttFileId;
    }

    /**
     * @param ttFileId the ttFileId to set
     */
    public void setTtFileId(Long ttFileId) {
        this.ttFileId = ttFileId;
    }

    /**
     * @return the isInvite
     */
    public Integer getIsInvite() {
        return this.isInvite;
    }

    /**
     * @param isInvite the isInvite to set
     */
    public void setIsInvite(Integer isInvite) {
        this.isInvite = isInvite;
    }

    /**
     * @return the isDownPower
     */
    public Integer getIsDownPower() {
        return this.isDownPower;
    }

    /**
     * @param isDownPower the isDownPower to set
     */
    public void setIsDownPower(Integer isDownPower) {
        this.isDownPower = isDownPower;
    }

    /**
     * @return the isUnion
     */
    public Integer getIsUnion() {
        return this.isUnion;
    }

    /**
     * @param isUnion the isUnion to set
     */
    public void setIsUnion(Integer isUnion) {
        this.isUnion = isUnion;
    }

    /**
     * @return the unionCodeType
     */
    public String getUnionCodeType() {
        return this.unionCodeType;
    }

    /**
     * @param unionCodeType the unionCodeType to set
     */
    public void setUnionCodeType(String unionCodeType) {
        this.unionCodeType = unionCodeType;
    }

    /**
     * @return the unionCode
     */
    public String getUnionCode() {
        return this.unionCode;
    }

    /**
     * @param unionCode the unionCode to set
     */
    public void setUnionCode(String unionCode) {
        this.unionCode = unionCode;
    }

    /**
     * @return the unionName
     */
    public String getUnionName() {
        return this.unionName;
    }

    /**
     * @param unionName the unionName to set
     */
    public void setUnionName(String unionName) {
        this.unionName = unionName;
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
     * @return the abnormalFlag
     */
    public Integer getAbnormalFlag() {
        return this.abnormalFlag;
    }

    /**
     * @param abnormalFlag the abnormalFlag to set
     */
    public void setAbnormalFlag(Integer abnormalFlag) {
        this.abnormalFlag = abnormalFlag;
    }

    /**
     * @return the sortNo
     */
    public Integer getSortNo() {
        return this.sortNo;
    }

    /**
     * @param sortNo the sortNo to set
     */
    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    /**
     * @return the subName
     */
    public String getSubName() {
        return this.subName;
    }

    /**
     * @param subName the subName to set
     */
    public void setSubName(String subName) {
        this.subName = subName;
    }

    /**
     * @return the subContent
     */
    public String getSubContent() {
        return this.subContent;
    }

    /**
     * @param subContent the subContent to set
     */
    public void setSubContent(String subContent) {
        this.subContent = subContent;
    }

    /**
     * @return the openTime
     */
    public Date getOpenTime() {
        return this.openTime;
    }

    /**
     * @param openTime the openTime to set
     */
    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    /**
     * @return the openAddress
     */
    public String getOpenAddress() {
        return this.openAddress;
    }

    /**
     * @param openAddress the openAddress to set
     */
    public void setOpenAddress(String openAddress) {
        this.openAddress = openAddress;
    }

    /**
     * @return the bidStatus
     */
    public String getBidStatus() {
        return this.bidStatus;
    }

    /**
     * @param bidStatus the bidStatus to set
     */
    public void setBidStatus(String bidStatus) {
        this.bidStatus = bidStatus;
    }

}
