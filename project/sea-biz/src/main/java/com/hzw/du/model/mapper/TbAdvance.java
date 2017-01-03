/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[TB_ADVANCE 质疑投诉进度情况表， 序列seq_advanceid]
 * 文件名称：TbAdvance.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

/**
 * [TB_ADVANCE 质疑投诉进度情况表， 序列seq_advanceid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class TbAdvance extends BaseBean {
    
    /**
     * ADVANCEID    NUMBER  N           主键ID
     */
    private Long advanceId;
    
    /**
     * COMPLAINID  NUMBER  Y           异议ID
     */
    private Long complainId;
    
    /**
     * REMARK  VARCHAR2(500)   Y           进度情况说明
     */
    private String remark;
    
    /**
     * FILEID  NUMBER  Y           附件文件ID
     */
    private Long fileId;
    
//    CREATEUSER  NUMBER  Y           创建人
//    CREATETIME  DATE    Y           创建时间
//    UPDATEUSER  NUMBER  Y           修改人
//    UPDATETIME  DATE    Y           修改时间
    /**
     * STATUS  NUMBER  Y           状态 0：未删除  1：删除
     */
    private Integer status;

    /**
     * @return the advanceId
     */
    public Long getAdvanceId() {
        return this.advanceId;
    }

    /**
     * @param advanceId the advanceId to set
     */
    public void setAdvanceId(Long advanceId) {
        this.advanceId = advanceId;
    }

    /**
     * @return the complainId
     */
    public Long getComplainId() {
        return this.complainId;
    }

    /**
     * @param complainId the complainId to set
     */
    public void setComplainId(Long complainId) {
        this.complainId = complainId;
    }

    /**
     * @return the remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @param remark the remark to set
     */
    public void setRemark(String remark) {
        this.remark = remark;
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
