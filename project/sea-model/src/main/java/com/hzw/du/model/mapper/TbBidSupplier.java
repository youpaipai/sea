/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[TB_BID_SUPPLIER 中标供应商， 序列seq_bidsupplierid]
 * 文件名称：TbBidSupplier.java
 * 修改时间：2016年7月21日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.math.BigDecimal;

/**
 * [TB_BID_SUPPLIER 中标供应商， 序列seq_bidsupplierid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class TbBidSupplier extends BaseBean {

    /**
     * BIDSUPPLIERID   NUMBER  N           中标供应商id
     */
    private Long bidSupplierId;

    /**
     * SUBID   NUMBER  Y           标段ID
     */
    private Long subId;

    /**
     * TENDERPROJECTID NUMBER  Y           招标项目ID
     */
    private Long tenderProjectId;

    /**
     * STANDARDID  NUMBER  Y           参标供应商id
     */
    private Long standarId;

    /***
     * WINBIDPRICE NUMBER(20,2)    Y           中标金额
     */
    private BigDecimal winBidPrice;

    /**
     * CURRENCYCODE    VARCHAR2(10)    Y           价格币种代码
     */
    private String currencyCode;

    /**
     * PRICEUNIT   NUMBER(1)   Y           价格单位
     */
    private String priceUnit;

    /**
     * OTHEREXPLANATION    VARCHAR2(1000)  Y           其他说明
     */
    private String otherExplanation;

    /**
     * BIDFILEID   NUMBER  Y           中标通知书/未中标通知书文件id
     */
    private Long bidFileId;

    /**
     * BIDSTATUS   NUMBER(1)   Y           "中标状态 0：未中标  1：中标"
     */
    private Integer bidStatus;

    /**
     * CONTRACTFILEID  NUMBER  Y           合同附件id
     */
    private Long contractFileId;

//    CREATEUSER  NUMBER  Y           创建人
//    CREATETIME  DATE    Y           创建时间
//    UPDATEUSER  NUMBER  Y           修改人
//    UPDATETIME  DATE    Y           修改时间
    /**
     * STATUS  NUMBER  Y           状态 0：未删除  1：删除
     */
    private Integer status;

    /**
     * @return the bidSupplierId
     */
    public Long getBidSupplierId() {
        return this.bidSupplierId;
    }

    /**
     * @param bidSupplierId the bidSupplierId to set
     */
    public void setBidSupplierId(Long bidSupplierId) {
        this.bidSupplierId = bidSupplierId;
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
     * @return the standarId
     */
    public Long getStandarId() {
        return this.standarId;
    }

    /**
     * @param standarId the standarId to set
     */
    public void setStandarId(Long standarId) {
        this.standarId = standarId;
    }

    /**
     * @return the winBidPrice
     */
    public BigDecimal getWinBidPrice() {
        return this.winBidPrice;
    }

    /**
     * @param winBidPrice the winBidPrice to set
     */
    public void setWinBidPrice(BigDecimal winBidPrice) {
        this.winBidPrice = winBidPrice;
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
     * @return the otherExplanation
     */
    public String getOtherExplanation() {
        return this.otherExplanation;
    }

    /**
     * @param otherExplanation the otherExplanation to set
     */
    public void setOtherExplanation(String otherExplanation) {
        this.otherExplanation = otherExplanation;
    }

    /**
     * @return the bidFileId
     */
    public Long getBidFileId() {
        return this.bidFileId;
    }

    /**
     * @param bidFileId the bidFileId to set
     */
    public void setBidFileId(Long bidFileId) {
        this.bidFileId = bidFileId;
    }

    /**
     * @return the bidStatus
     */
    public Integer getBidStatus() {
        return this.bidStatus;
    }

    /**
     * @param bidStatus the bidStatus to set
     */
    public void setBidStatus(Integer bidStatus) {
        this.bidStatus = bidStatus;
    }

    /**
     * @return the contractFileId
     */
    public Long getContractFileId() {
        return this.contractFileId;
    }

    /**
     * @param contractFileId the contractFileId to set
     */
    public void setContractFileId(Long contractFileId) {
        this.contractFileId = contractFileId;
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
