/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[TB_CONNECT_NOTICE 公告表， 序列seq_noticeid]
 * 文件名称：TbConnectNotice.java
 * 修改时间：2016年7月21日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.Date;

/**
 * [TB_CONNECT_NOTICE 公告表， 序列seq_noticeid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class TbConnectNotice extends BaseBean {
    
    /**
     * NOTICEID    NUMBER  N           公告编号
     */
    private Long noticeId;
    
    /**
     * TENDERPROJECTID NUMBER  Y           招标项目id
     */
    private Long tenderProjectId;
    
    /**
     * SUBID   NUMBER  Y           标段id
     */
    private Long subId;
    
    /**
     * TITLE   VARCHAR2(300)   Y           标题
     */
    private String title;
    
    /**
     * CONTENT CLOB    Y           内容
     */
    private String content;
    
    /**
     * NOTICETYPE  NUMBER(1)   Y           公告类型 1:招标公告 2:更正公告 3:中标公告 4.中标候选人公示
     */
    private Integer noticeType;
    
    /**
     * NOTICENATURE    NUMBER(1)   Y           公告性质
     */
    private Integer noticeNature;
    
    /**
     * STARTTIME   DATE    Y           公告开始时间
     */
    private Date startTime;
    
    /**
     * ENDTIME DATE    Y           公告截止时间
     */
    private Date endTime;
    
    /**
     * FILEID  NUMBER  Y           附件文件id
     */
    private Long fileId;
    
    /**
     * RELEASESMEDIA   VARCHAR2(2000)  Y           发布媒体
     */
    private String releasesMedia;
    
    /**
     * OPENTIME    DATE    Y           开标时间
     */
    private Date openTime;
    
    /**
     * OPENADDRESS VARCHAR2(200)   Y           开标地点
     */
    private String openAddress;
    
    /**
     * NOTICENUM   NUMBER(10)  Y           公告次数
     */
    private Integer noticeNum;
    
    /**
     * TENDERPROJECTTYPE   VARCHAR2(10)  Y           招标项目类型
     */
    private String tenderProjectType;

//    CREATEUSER  NUMBER  Y           创建人
//    CREATETIME  DATE    Y           创建时间
//    UPDATEUSER  NUMBER  Y           修改人
//    UPDATETIME  DATE    Y           修改时间
    /**
     * STATUS  NUMBER  Y           状态 0：未删除  1：删除
     */
    private Integer status;
    
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
