/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[MH_FILE_IMAGES  动态图片展示表， 序列seq_imageid]
 * 文件名称：MHFileImages.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.Date;

/**
 * [MH_FILE_IMAGES  动态图片展示表， 序列seq_imageid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class MHFileImages extends BaseBean{
    
    /**
     * IMAGEID NUMBER  N           图片编号
     */
    private Long imageId;
    
    /**
     * STARTTIME   DATE    Y           开始时间
     */
    private Date startTime;
    
    /**
     * ENDTIME DATE    Y           结束时间
     */
    private Date endTime;
    
    /**
     * IMAGENAME   VARCHAR2(200)   Y           图片名称
     */
    private String imageName;
    
    /**
     * HOVERDESC   VARCHAR2(500)   Y           鼠标悬浮时备注
     */
    private String hoverDesc;
    
    /**
     * REMARK  VARCHAR2(500)   Y           备注
     */
    private String remark;
    
    /**
     * FILEID  NUMBER  Y           文件ID
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
     * @return the imageId
     */
    public Long getImageId() {
        return this.imageId;
    }

    /**
     * @param imageId the imageId to set
     */
    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    /**
     * @return the startTime
     */
    public Date getStartTime() {
        return this.startTime;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the endTime
     */
    public Date getEndTime() {
        return this.endTime;
    }

    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * @return the imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @param imageName the imageName to set
     */
    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    /**
     * @return the hoverDesc
     */
    public String getHoverDesc() {
        return this.hoverDesc;
    }

    /**
     * @param hoverDesc the hoverDesc to set
     */
    public void setHoverDesc(String hoverDesc) {
        this.hoverDesc = hoverDesc;
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
