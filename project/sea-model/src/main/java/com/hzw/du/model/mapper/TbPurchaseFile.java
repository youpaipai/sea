/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[TB_PURCHASE_FILE 招标文件表， 序列seq_purchaseid]
 * 文件名称：TbPurchaseFile.java
 * 修改时间：2016年7月21日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.math.BigDecimal;
import java.util.Date;

/**
 * [TB_PURCHASE_FILE 招标文件表， 序列seq_purchaseid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class TbPurchaseFile extends BaseBean {
    
    /**
     * PURCHASEID  NUMBER  N           招标文件编号
     */
    private Long purchaseId;
    
    /**
     * SUBID   NUMBER  Y           标段id
     */
    private Long subId;
    
    /**
     * TENDERPROJECTID NUMBER  Y           招标项目id
     */
    private Long tenderProjectId;
    
    /**
     * FILEID  NUMBER  Y           招标文件ID
     */
    private Long fileId;
    
    /**
     * OPENMOULDFILEID NUMBER  Y           开标一览表模板文件ID
     */
    private Long openMouldFileId;
    
    /**
     * CHARGINGUNIT    VARCHAR2(300)   Y           收费单位
     */
    private String chargingUnit;
    
    /**
     * CHARGINGTYPE    NUMBER(1)   Y           收费类型 0：免费 1：收费
     */
    private Integer chargingType;
    
    /**
     * SETFLAG NUMBER(1)   Y           按套收费标识 0:不按套,1:按套
     */
    private Integer setFlag;
    
    /**
     * FILECOSTS   NUMBER(20,2)    Y           文件费用
     */
    private BigDecimal fileCosts;
    
    /**
     * BIDQUALIFICATION    VARCHAR2(500)   Y           投标资格
     */
    private String bidQualification;
    
    /**
     * VALIDPERIOD NUMBER(5)   Y           投标有效期(天)
     */
    private Integer validPeriod;
    
    /**
     * BIDDOCREFERMETHOD   VARCHAR2(500)   Y           投标文件递交办法
     */
    private String bidDocReferMethod;
    
    /**
     * BAILMONEY   NUMBER(20,2)    Y           保证金金额
     */
    private BigDecimal bailMoney;
    
    /**
     * CURRENCYCODE    VARCHAR2(3) Y           币种代码
     */
    private String currencyCode;
    
    /**
     * PRICEUNIT   VARCHAR2(1) Y           币种单位
     */
    private String priceUnit;
    
    /**
     * EVALUATINGMETHOD    VARCHAR2(500)   Y           评标办法
     */
    private String evaluatingMehtod;
    
    /**
     * CONTACT VARCHAR2(50)    Y           联系人
     */
    private String contact;
    
    /**
     * PHONE   VARCHAR2(20)    Y           电话
     */
    private String phone;
    
    /**
     * SALEENDTIME DATE    Y           招标文件发售截止时间
     */
    private Date saleEndTime;
    
    /**
     * TENDERTIME  DATE    Y           投标文件上传截止时间
     */
    private Date tenderTime;
    
    /**
     * SUBMITENDTIME   DATE    Y           开标时间
     */
    private Date submitEndTime;
    
    /**
     * OPENADDRESS VARCHAR2(1000)  Y           开标地点
     */
    private String openAddress;
    
//    CREATEUSER  NUMBER  Y           创建人
//    CREATETIME  DATE    Y           创建时间
//    UPDATEUSER  NUMBER  Y           修改人
//    UPDATETIME  DATE    Y           修改时间
    /**
     * STATUS  NUMBER  Y           状态 0：未删除  1：删除
     */
    private Integer status;

    /**
     * @return the purchaseId
     */
    public Long getPurchaseId() {
        return this.purchaseId;
    }

    /**
     * @param purchaseId the purchaseId to set
     */
    public void setPurchaseId(Long purchaseId) {
        this.purchaseId = purchaseId;
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
     * @return the openMouldFileId
     */
    public Long getOpenMouldFileId() {
        return this.openMouldFileId;
    }

    /**
     * @param openMouldFileId the openMouldFileId to set
     */
    public void setOpenMouldFileId(Long openMouldFileId) {
        this.openMouldFileId = openMouldFileId;
    }

    /**
     * @return the chargingUnit
     */
    public String getChargingUnit() {
        return this.chargingUnit;
    }

    /**
     * @param chargingUnit the chargingUnit to set
     */
    public void setChargingUnit(String chargingUnit) {
        this.chargingUnit = chargingUnit;
    }

    /**
     * @return the chargingType
     */
    public Integer getChargingType() {
        return this.chargingType;
    }

    /**
     * @param chargingType the chargingType to set
     */
    public void setChargingType(Integer chargingType) {
        this.chargingType = chargingType;
    }

    /**
     * @return the setFlag
     */
    public Integer getSetFlag() {
        return this.setFlag;
    }

    /**
     * @param setFlag the setFlag to set
     */
    public void setSetFlag(Integer setFlag) {
        this.setFlag = setFlag;
    }

    /**
     * @return the fileCosts
     */
    public BigDecimal getFileCosts() {
        return this.fileCosts;
    }

    /**
     * @param fileCosts the fileCosts to set
     */
    public void setFileCosts(BigDecimal fileCosts) {
        this.fileCosts = fileCosts;
    }

    /**
     * @return the bidQualification
     */
    public String getBidQualification() {
        return this.bidQualification;
    }

    /**
     * @param bidQualification the bidQualification to set
     */
    public void setBidQualification(String bidQualification) {
        this.bidQualification = bidQualification;
    }

    /**
     * @return the validPeriod
     */
    public Integer getValidPeriod() {
        return this.validPeriod;
    }

    /**
     * @param validPeriod the validPeriod to set
     */
    public void setValidPeriod(Integer validPeriod) {
        this.validPeriod = validPeriod;
    }

    /**
     * @return the bidDocReferMethod
     */
    public String getBidDocReferMethod() {
        return this.bidDocReferMethod;
    }

    /**
     * @param bidDocReferMethod the bidDocReferMethod to set
     */
    public void setBidDocReferMethod(String bidDocReferMethod) {
        this.bidDocReferMethod = bidDocReferMethod;
    }

    /**
     * @return the bailMoney
     */
    public BigDecimal getBailMoney() {
        return this.bailMoney;
    }

    /**
     * @param bailMoney the bailMoney to set
     */
    public void setBailMoney(BigDecimal bailMoney) {
        this.bailMoney = bailMoney;
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
     * @return the evaluatingMehtod
     */
    public String getEvaluatingMehtod() {
        return this.evaluatingMehtod;
    }

    /**
     * @param evaluatingMehtod the evaluatingMehtod to set
     */
    public void setEvaluatingMehtod(String evaluatingMehtod) {
        this.evaluatingMehtod = evaluatingMehtod;
    }

    /**
     * @return the contact
     */
    public String getContact() {
        return this.contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
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
     * @return the saleEndTime
     */
    public Date getSaleEndTime() {
        return this.saleEndTime;
    }

    /**
     * @param saleEndTime the saleEndTime to set
     */
    public void setSaleEndTime(Date saleEndTime) {
        this.saleEndTime = saleEndTime;
    }

    /**
     * @return the tenderTime
     */
    public Date getTenderTime() {
        return this.tenderTime;
    }

    /**
     * @param tenderTime the tenderTime to set
     */
    public void setTenderTime(Date tenderTime) {
        this.tenderTime = tenderTime;
    }

    /**
     * @return the submitEndTime
     */
    public Date getSubmitEndTime() {
        return this.submitEndTime;
    }

    /**
     * @param submitEndTime the submitEndTime to set
     */
    public void setSubmitEndTime(Date submitEndTime) {
        this.submitEndTime = submitEndTime;
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
