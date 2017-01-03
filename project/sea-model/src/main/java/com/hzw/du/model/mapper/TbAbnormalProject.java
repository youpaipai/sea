/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[TB_ABNORMAL_PROJECT  异常项目表， 序列seq_abnormalid]
 * 文件名称：TbAbnormalProject.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.Date;

/**
 * [TB_ABNORMAL_PROJECT  异常项目表， 序列seq_abnormalid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class TbAbnormalProject extends BaseBean {
    
    /**
     * ABNORMALID  NUMBER  N           异常项目ID
     */
    private Long abnormalId;
    
    /**
     * SUBID   NUMBER  Y           标段id
     */
    private Long subId;
    
    /**
     * TENDERPROJECTID NUMBER  Y           招标项目id
     */
    private Long tenderProjectId;
    
    /**
     * ABNORMALFLAG    NUMBER  Y           异常标识 0:正常 1：暂停 2：终止
     */
    private Integer abnormalFlag;
    
    /**
     * ABNORMALTIME    DATE    Y           异常时间
     */
    private Date abnormalTime;
    
    /**
     * ABNORMALMARK    VARCHAR2(1000)  Y           异常原因
     */
    private String abnormalMark;
    
    /**
     * APPROVALRESULT  VARCHAR2(1000)  Y           审批或核准结果
     */
    private String approvalResult;
    
    /**
     * APPROVALTIME    DATE    Y           审批或核准时间
     */
    private Date approvalTime;
    
//    CREATEUSER  NUMBER  Y           创建人
//    CREATETIME  DATE    Y           创建时间
//    UPDATEUSER  NUMBER  Y           修改人
//    UPDATETIME  DATE    Y           修改时间
    /**
     * STATUS  NUMBER  Y           状态 0：未删除  1：删除
     */
    private Integer status;

    /**
     * @return the abnormalId
     */
    public Long getAbnormalId() {
        return this.abnormalId;
    }

    /**
     * @param abnormalId the abnormalId to set
     */
    public void setAbnormalId(Long abnormalId) {
        this.abnormalId = abnormalId;
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
     * @return the abnormalTime
     */
    public Date getAbnormalTime() {
        return this.abnormalTime;
    }

    /**
     * @param abnormalTime the abnormalTime to set
     */
    public void setAbnormalTime(Date abnormalTime) {
        this.abnormalTime = abnormalTime;
    }

    /**
     * @return the abnormalMark
     */
    public String getAbnormalMark() {
        return this.abnormalMark;
    }

    /**
     * @param abnormalMark the abnormalMark to set
     */
    public void setAbnormalMark(String abnormalMark) {
        this.abnormalMark = abnormalMark;
    }

    /**
     * @return the approvalResult
     */
    public String getApprovalResult() {
        return this.approvalResult;
    }

    /**
     * @param approvalResult the approvalResult to set
     */
    public void setApprovalResult(String approvalResult) {
        this.approvalResult = approvalResult;
    }

    /**
     * @return the approvalTime
     */
    public Date getApprovalTime() {
        return this.approvalTime;
    }

    /**
     * @param approvalTime the approvalTime to set
     */
    public void setApprovalTime(Date approvalTime) {
        this.approvalTime = approvalTime;
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
