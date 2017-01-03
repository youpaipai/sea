/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[TB_BAIL_CERTIFICATES 供应商保证金表， 序列seq_bailid]
 * 文件名称：TbBailCertificates.java
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
 * [TB_BAIL_CERTIFICATES 供应商保证金表， 序列seq_bailid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class TbBailCertificates extends BaseBean {
    
    /**
     * BAILID   NUMBER  N           主键ID
     */
    private Long bailId;
    
    /**
     * SUBID   NUMBER  Y           标段ID
     */
    private Long subId;
    
    /**
     * TENDERPROJECTID NUMBER  Y           招标项目ID
     */
    private Long tenderProjectId;
    
    /**
     * STANDARDID  NUMBER  Y           参标供应商ID
     */
    private Long standardId;
    
    /**
     * FILEID  NUMBER  Y           凭证文件ID
     */
    private Long fileId;
    
    /***
     * PAYTYPE VARCHAR2(100)   Y           保证金支付形式
     */
    private String payType;
    
    /**
     * BAILMONEY   NUMBER(20,2)    Y           保证金金额
     */
    private BigDecimal bailMoney;
    
    /**
     * CURRENCYCODE    VARCHAR2(3) Y           投标保证金币种代码
     */
    private String currencyCode;
    
    /***
     * PRICEUNIT   VARCHAR2(1) Y           投标保证金单位
     */
    private String priceUnit;
    
    /**
     * RETURNSTATUS    NUMBER(1)   Y           "退回保证金状态  0:未退回 1：已提交
     */
    private Integer returnStatus;
    
    /**
     * ARRIVALTIME DATE    Y           保证金到账时间
     */
    private Date arrivalTime;
    
    /**
     * RETURNTIME  DATE    Y           保证金退还时间
     */
    private Date returnTime;
    
//    CREATEUSER  NUMBER  Y           创建人
//    CREATETIME  DATE    Y           创建时间
//    UPDATEUSER  NUMBER  Y           修改人
//    UPDATETIME  DATE    Y           修改时间
    /**
     * STATUS  NUMBER  Y           状态 0：未删除  1：删除
     */
    private Integer status;

    /**
     * @return the bailId
     */
    public Long getBailId() {
        return this.bailId;
    }

    /**
     * @param bailId the bailId to set
     */
    public void setBailId(Long bailId) {
        this.bailId = bailId;
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
     * @return the payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @param payType the payType to set
     */
    public void setPayType(String payType) {
        this.payType = payType;
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
     * @return the returnStatus
     */
    public Integer getReturnStatus() {
        return this.returnStatus;
    }

    /**
     * @param returnStatus the returnStatus to set
     */
    public void setReturnStatus(Integer returnStatus) {
        this.returnStatus = returnStatus;
    }

    /**
     * @return the arrivalTime
     */
    public Date getArrivalTime() {
        return this.arrivalTime;
    }

    /**
     * @param arrivalTime the arrivalTime to set
     */
    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    /**
     * @return the returnTime
     */
    public Date getReturnTime() {
        return this.returnTime;
    }

    /**
     * @param returnTime the returnTime to set
     */
    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
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
