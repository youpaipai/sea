/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：开标记录表
 * 文件名称：KpBidRecord.java
 * 修改时间：2016年7月13日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.math.BigDecimal;
import java.util.Date;

/**
 * KP_BID_RECORD 开标记录表，序列seq_bidrecord
 * <功能详细描述>
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class KpBidRecord extends BaseBean{
    /**
     * RECORDID    NUMBER  N           开标记录id
     */
    private Long recordId;
    
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
    private Long standardId;
    
    /**
     * TENDERFILEID    NUMBER  Y           投标文件id
     */
    private Long tenderFileId;
    
    /**
     * OPENFILEID  NUMBER  Y           开标一览表文件id
     */
    private Long openFileId;
    
    /**
     * PRICE   NUMBER(20,2)    Y           报价
     */
    private BigDecimal price;
    
    /**
     * DURATION    NUMBER(10)  Y           工期交货期
     */
    private Integer duration;
    
    /**
     * CURRENCYCODE    VARCHAR2(3) Y           价格币种代码
     */
    private String currencyCode;
    
    /**
     * PRICEUNIT   VARCHAR2(1) Y           价格单位
     */
    private String priceUnit;
    
    /**
     * INITREVIEWSTATUS    NUMBER(10)  Y           初审状态
     */
    private Integer initreviewStatus;
    
    /**
     * BIDFILESTATUS   NUMBER  Y           投标文件上传状态
     */
    private Integer bidFileStatus;
    
    /**
     * SCORE   NUMBER(10,2)    Y           价格分
     */
    private Double score;
    
    /**
     * BIDOPENINGACTOR VARCHAR2(500)   Y           开标参与人
     */
    private String bidOpeningActor;
    
    /**
     * BIDOPENINGTIME  DATE    Y           开标时间
     */
    private Date bidOpeningTime;
    
    /**
     * BIDOPENINGCONTENT   VARCHAR2(1000)  Y           开标记录内容
     */
    private String bidOpeningContend;
    
    /**
     * BIDOPENINGADDRESS   VARCHAR2(200)   Y           开标地点
     */
    private String bidOpeningAddress;
    
    /**
     * STATUS  NUMBER(1)   Y           状态：0未删除  1删除
     */
    private Integer status;

    /**
     * @return the recordId
     */
    public Long getRecordId() {
        return this.recordId;
    }

    /**
     * @param recordId the recordId to set
     */
    public void setRecordId(Long recordId) {
        this.recordId = recordId;
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
     * @return the tenderFileId
     */
    public Long getTenderFileId() {
        return this.tenderFileId;
    }

    /**
     * @param tenderFileId the tenderFileId to set
     */
    public void setTenderFileId(Long tenderFileId) {
        this.tenderFileId = tenderFileId;
    }

    /**
     * @return the openFileId
     */
    public Long getOpenFileId() {
        return this.openFileId;
    }

    /**
     * @param openFileId the openFileId to set
     */
    public void setOpenFileId(Long openFileId) {
        this.openFileId = openFileId;
    }

    /**
     * @return the price
     */
    public BigDecimal getPrice() {
        return this.price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * @return the duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * @return the initreviewStatus
     */
    public Integer getInitreviewStatus() {
        return this.initreviewStatus;
    }

    /**
     * @param initreviewStatus the initreviewStatus to set
     */
    public void setInitreviewStatus(Integer initreviewStatus) {
        this.initreviewStatus = initreviewStatus;
    }

    /**
     * @return the bidFileStatus
     */
    public Integer getBidFileStatus() {
        return this.bidFileStatus;
    }

    /**
     * @param bidFileStatus the bidFileStatus to set
     */
    public void setBidFileStatus(Integer bidFileStatus) {
        this.bidFileStatus = bidFileStatus;
    }

    /**
     * @return the score
     */
    public Double getScore() {
        return this.score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * @return the bidOpeningActor
     */
    public String getBidOpeningActor() {
        return this.bidOpeningActor;
    }

    /**
     * @param bidOpeningActor the bidOpeningActor to set
     */
    public void setBidOpeningActor(String bidOpeningActor) {
        this.bidOpeningActor = bidOpeningActor;
    }

    /**
     * @return the bidOpeningTime
     */
    public Date getBidOpeningTime() {
        return this.bidOpeningTime;
    }

    /**
     * @param bidOpeningTime the bidOpeningTime to set
     */
    public void setBidOpeningTime(Date bidOpeningTime) {
        this.bidOpeningTime = bidOpeningTime;
    }

    /**
     * @return the bidOpeningContend
     */
    public String getBidOpeningContend() {
        return this.bidOpeningContend;
    }

    /**
     * @param bidOpeningContend the bidOpeningContend to set
     */
    public void setBidOpeningContend(String bidOpeningContend) {
        this.bidOpeningContend = bidOpeningContend;
    }

    /**
     * @return the bidOpeningAddress
     */
    public String getBidOpeningAddress() {
        return this.bidOpeningAddress;
    }

    /**
     * @param bidOpeningAddress the bidOpeningAddress to set
     */
    public void setBidOpeningAddress(String bidOpeningAddress) {
        this.bidOpeningAddress = bidOpeningAddress;
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
    

}
