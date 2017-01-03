/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：项目立项 输出参数
 * 文件名称：C005ConnectNoticeDetail.java
 * 修改时间：2016年7月23日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.biz.bean.param.common;

import java.util.Date;

/**
 * 项目立项 输出参数
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class C005ConnectNoticeDetail {

    /**
     * 公告编号
     */
    private Long noticeId;

    /**
     *  招标项目id
     */
    private Long tenderProjectId;

    /**
     *  标段id
     */
    private Long subId;

    /**
     *  标题
     */
    private String title;

    /**
     *  内容
     */
    private String content;

    /**
     * 公告类型 1:招标公告 2:更正公告 3:中标公告 4.中标候选人公示
     */
    private Integer noticeType;

    /**
     * 公告性质
     */
    private Integer noticeNature;

    /**
     *  公告开始时间
     */
    private Date startTime;

    /**
     *  公告截止时间
     */
    private Date endTime;

    /**
     *  附件文件id
     */
    private Long fileId;

    /**
     *  发布媒体
     */
    private String releasesMedia;

    /**
     *  开标时间
     */
    private Date openTime;

    /**
     *  开标地点
     */
    private String openAddress;

    /**
     *  公告次数
     */
    private Integer noticeNum;

    /**
     *  状态 0：未删除  1：删除
     */
    private Integer status;
    
    /**
     * 创建时间
     */
    protected Date createTime;
    
    /**
     * 剩余投标天数
     */
    private String remainBidTime;
    
    /**
     * 是否可以投标
     */
    private boolean bidFlag;
    
    /**
     * TENDERPROJECTTYPE   VARCHAR2(10)  Y           招标项目类型
     */
    private String tenderProjectType;

    /**
     * @return the noticeId
     */
    public Long getNoticeId() {
        return this.noticeId;
    }

    /**
     * @param noticeId the noticeId to set
     */
    public void setNoticeId(Long noticeId) {
        this.noticeId = noticeId;
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
     * @return the title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the noticeType
     */
    public Integer getNoticeType() {
        return this.noticeType;
    }

    /**
     * @param noticeType the noticeType to set
     */
    public void setNoticeType(Integer noticeType) {
        this.noticeType = noticeType;
    }

    /**
     * @return the noticeNature
     */
    public Integer getNoticeNature() {
        return this.noticeNature;
    }

    /**
     * @param noticeNature the noticeNature to set
     */
    public void setNoticeNature(Integer noticeNature) {
        this.noticeNature = noticeNature;
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
     * @return the releasesMedia
     */
    public String getReleasesMedia() {
        return this.releasesMedia;
    }

    /**
     * @param releasesMedia the releasesMedia to set
     */
    public void setReleasesMedia(String releasesMedia) {
        this.releasesMedia = releasesMedia;
    }

    /**
     * @return the openTime
     */
    public Date getOpenTime() {
        return this.openTime;
    }

    /**
     * @param openTime the openTime to set
     */
    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    /**
     * @return the openAddress
     */
    public String getOpenAddress() {
        return this.openAddress;
    }

    /**
     * @param openAddress the openAddress to set
     */
    public void setOpenAddress(String openAddress) {
        this.openAddress = openAddress;
    }

    /**
     * @return the noticeNum
     */
    public Integer getNoticeNum() {
        return this.noticeNum;
    }

    /**
     * @param noticeNum the noticeNum to set
     */
    public void setNoticeNum(Integer noticeNum) {
        this.noticeNum = noticeNum;
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
     * @return the createTime
     */
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * @param createTime the createTime to set
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return the remainBidTime
     */
    public String getRemainBidTime() {
        return this.remainBidTime;
    }

    /**
     * @param remainBidTime the remainBidTime to set
     */
    public void setRemainBidTime(String remainBidTime) {
        this.remainBidTime = remainBidTime;
    }

    /**
     * @return the bidFlag
     */
    public boolean isBidFlag() {
        return this.bidFlag;
    }

    /**
     * @param bidFlag the bidFlag to set
     */
    public void setBidFlag(boolean bidFlag) {
        this.bidFlag = bidFlag;
    }

    /**
     * @return the tenderProjectType
     */
    public String getTenderProjectType() {
        return this.tenderProjectType;
    }

    /**
     * @param tenderProjectType the tenderProjectType to set
     */
    public void setTenderProjectType(String tenderProjectType) {
        this.tenderProjectType = tenderProjectType;
    }

}
