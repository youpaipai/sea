/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[KP_REVIEW_INFO  详细评审明细表， 序列seq_infoid]
 * 文件名称：KpReviewInfo.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

/**
 * [KP_REVIEW_INFO  详细评审明细表， 序列seq_infoid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class KpReviewInfo extends BaseBean{
    /**
     * INFOID  NUMBER  N           主键ID
     */
    private Long infoId;
    
    /**
     * SUPPLIERID  NUMBER  Y           供应商ID
     */
    private Long supplierId;
    
    /**
     * RULESID NUMBER  Y           项目评标规则ID
     */
    private Long rulesId;
    
    /**
     * DETAILID    NUMBER  Y           详细评审ID
     */
    private Long detailId;
    
    /**
     * SCORE   NUMBER(10,2)    Y           分值
     */
    private Double score;
    
    /**
     * ISMARKS NUMBER  Y           打分状态   0：草稿   1：提交
     */
    private Integer isMarks;
    
    /**
     * STATUS  NUMBER  Y           删除标志  0正常 1删除
     */
    private Integer status;
    

    /**
     * @return the infoId
     */
    public Long getInfoId() {
        return this.infoId;
    }

    /**
     * @param infoId the infoId to set
     */
    public void setInfoId(Long infoId) {
        this.infoId = infoId;
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
     * @return the rulesId
     */
    public Long getRulesId() {
        return this.rulesId;
    }

    /**
     * @param rulesId the rulesId to set
     */
    public void setRulesId(Long rulesId) {
        this.rulesId = rulesId;
    }

    /**
     * @return the detailId
     */
    public Long getDetailId() {
        return this.detailId;
    }

    /**
     * @param detailId the detailId to set
     */
    public void setDetailId(Long detailId) {
        this.detailId = detailId;
    }

    /**
     * @return the isMarks
     */
    public Integer getIsMarks() {
        return this.isMarks;
    }

    /**
     * @param isMarks the isMarks to set
     */
    public void setIsMarks(Integer isMarks) {
        this.isMarks = isMarks;
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

}
