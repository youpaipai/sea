/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[KP_BID_REPORT  评标报告表， 序列seq_reportid]
 * 文件名称：KpBidReport.java
 * 修改时间：2016年7月13日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.math.BigDecimal;

/**
 * [KP_BID_REPORT  评标报告表， 序列seq_reportid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class KpBidReport extends BaseBean{
    
    /**
     * REPORTID    NUMBER  N           主键ID
     */
    private Long reportId;
    
    /**
     * SUBID   NUMBER  Y           分包ID
     */
    private Long subId;
    
    /**
     * TENDERPROJECTID NUMBER  Y           招标项目ID
     */
    private Long tenderProjectId;
    
    /**
     * SUPPLIERID  NUMBER  Y           组织机构编号（供应商）
     */
    private Long supplierId;
    
    /**
     * TOTALSCORE  NUMBER  Y           总分
     */
    private Double totalScore;
    
    /**
     * AVGSCORE    NUMBER(10,1)    Y           平均分
     */
    private Double avgScore;
    
    /**
     * RANKING NUMBER  Y           排名
     */
    private Integer ranking;
    
    /**
     * BIDPRICE    NUMBER(20,2)    Y           投标价格
     */
    private BigDecimal bidPrice;
    
    /**
     * SCORERESULT VARCHAR2(1000)  Y           评分结果
     */
    private String scoreResult;
    
    /**
     * BIDEVALPRICE    NUMBER(20,2)    Y           评标价格
     */
    private BigDecimal bidEvalPrice;
    
    /**
     * WINBIDPRICE NUMBER(20,2)    Y           中标价格
     */
    private BigDecimal winBidPrice;
    
    /**
     * CURRENCYCODE    VARCHAR2(3) Y           价格币种代码
     */
    private String currencyCode;
    
    /**
     * PRICEUNIT   VARCHAR2(1) Y           价格单位
     */
    private String priceUnit;
    
    /**
     * STATUS  NUMBER  Y           状态 0未删除  1删除
     */
    private Integer status;

    /**
     * @return the reportId
     */
    public Long getReportId() {
        return this.reportId;
    }

    /**
     * @param reportId the reportId to set
     */
    public void setReportId(Long reportId) {
        this.reportId = reportId;
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
     * @return the supplierId
     */
    public Long getSupplierId() {
        return this.supplierId;
    }

    /**
     * @param supplierId the supplierId to set
     */
    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * @return the avgScore
     */
    public Double getAvgScore() {
        return this.avgScore;
    }

    /**
     * @param avgScore the avgScore to set
     */
    public void setAvgScore(Double avgScore) {
        this.avgScore = avgScore;
    }

    /**
     * @return the ranking
     */
    public Integer getRanking() {
        return this.ranking;
    }

    /**
     * @param ranking the ranking to set
     */
    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    /**
     * @return the bidPrice
     */
    public BigDecimal getBidPrice() {
        return this.bidPrice;
    }

    /**
     * @param bidPrice the bidPrice to set
     */
    public void setBidPrice(BigDecimal bidPrice) {
        this.bidPrice = bidPrice;
    }

    /**
     * @return the scoreResult
     */
    public String getScoreResult() {
        return this.scoreResult;
    }

    /**
     * @param scoreResult the scoreResult to set
     */
    public void setScoreResult(String scoreResult) {
        this.scoreResult = scoreResult;
    }

    /**
     * @return the bidEvalPrice
     */
    public BigDecimal getBidEvalPrice() {
        return this.bidEvalPrice;
    }

    /**
     * @param bidEvalPrice the bidEvalPrice to set
     */
    public void setBidEvalPrice(BigDecimal bidEvalPrice) {
        this.bidEvalPrice = bidEvalPrice;
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

    /**
     * @return the totalScore
     */
    public Double getTotalScore() {
        return this.totalScore;
    }

    /**
     * @param totalScore the totalScore to set
     */
    public void setTotalScore(Double totalScore) {
        this.totalScore = totalScore;
    }

}
