/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[KP_CAST_RECORD  投标记录表， 序列seq_castrecordid]
 * 文件名称：KpCastRecord.java
 * 修改时间：2016年7月19日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.Date;

/**
 * [KP_CAST_RECORD  投标记录表， 序列seq_castrecordid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class KpCastRecord extends BaseBean{
    
    /**
     * CASTRECORDID    NUMBER  N           投标记录ID
     */
    private Long castRecordId;
    
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
     * CASTFILETIME    NUMBER  Y           投标文件上传时间
     */
    private Date castFileTime;
    
    /**
     * STATUS  NUMBER(1)   Y           回执状态
     */
    private Integer status;

    /**
     * @return the castRecordId
     */
    public Long getCastRecordId() {
        return this.castRecordId;
    }

    /**
     * @param castRecordId the castRecordId to set
     */
    public void setCastRecordId(Long castRecordId) {
        this.castRecordId = castRecordId;
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
     * @return the castFileTime
     */
    public Date getCastFileTime() {
        return this.castFileTime;
    }

    /**
     * @param castFileTime the castFileTime to set
     */
    public void setCastFileTime(Date castFileTime) {
        this.castFileTime = castFileTime;
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
