/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[KP_DETAIL_REVIEW  详细评审表， 序列seq_detailid]
 * 文件名称：KpDetailReview.java
 * 修改时间：2016年7月19日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

/**
 * [KP_DETAIL_REVIEW  详细评审表， 序列seq_detailid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class KpDetailReview extends BaseBean{
    /**
     * DETAILID    NUMBER  N           主键ID
     */
    private Long detailId;
    
    /**
     * SUBID   NUMBER  Y           标段ID
     */
    private Long subId;
    
    /***
     * TENDERPROJECTID NUMBER  Y           招标项目ID
     */
    private Long tenderProjectId;
    
    /**
     * EXPERTID    NUMBER  Y           专家用户ID
     */
    private Long expertId;
    
    /**
     * ISMARKS NUMBER  Y           打分状态   0：草稿   1：提交
     */
    private Integer isMarks;
    
    /**
     * STATUS  NUMBER  Y           状态 0未删除  1删除
     */
    private Integer Status;
    
//  CREATEUSER  NUMBER  Y           创建人
//  CREATETIME  DATE    Y           创建时间
//  UPDATEUSER  NUMBER  Y           修改人
//  UPDATETIME  DATE    Y           修改时间

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
     * @return the expertId
     */
    public Long getExpertId() {
        return this.expertId;
    }

    /**
     * @param expertId the expertId to set
     */
    public void setExpertId(Long expertId) {
        this.expertId = expertId;
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
        return this.Status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Integer status) {
        this.Status = status;
    }

}
