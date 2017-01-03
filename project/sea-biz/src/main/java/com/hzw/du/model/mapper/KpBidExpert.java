/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：评标专家信息表 KP_BID_EXPERT,序列 seq_bidexpertid
 * 文件名称：KpBidExpert.java
 * 修改时间：2016年7月13日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.Date;

/**
 * KP_BID_EXPERT 评标专家信息表, 序列 seq_bidexpertid
 * <功能详细描述>
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class KpBidExpert extends BaseBean{
    
    /**
     * BIDEXPERTID NUMBER  N           主键ID
     */
    private Long bidExpertId;
    
    /**
     * USERID  NUMBER  Y           用户ID
     */
    private Long userId;
    
    /**
     * USERNAME    VARCHAR2(100)   Y           专家名称
     */
    private String userName;
    
    /**
     * SUBID   NUMBER  Y           标段ID
     */
    private Long subId;
    
    /**
     * NOTIFICATION    VARCHAR2(50)    Y           通知方式
     */
    private String notification;
    
    /**
     * NOTIFYTIME  DATE    Y           通知时间
     */
    private Date notifyTime;
    
    /**
     * EXAMRECORD  CLOB    Y           专家考核记录
     */
    private String examRecord;
    
    /**
     * STATUS  NUMBER  Y           状态 0未删除  1删除
     */
    private Integer status;

    /**
     * @return the bidExpertId
     */
    public Long getBidExpertId() {
        return this.bidExpertId;
    }

    /**
     * @param bidExpertId the bidExpertId to set
     */
    public void setBidExpertId(Long bidExpertId) {
        this.bidExpertId = bidExpertId;
    }

    /**
     * @return the userId
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
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
     * @return the notification
     */
    public String getNotification() {
        return this.notification;
    }

    /**
     * @param notification the notification to set
     */
    public void setNotification(String notification) {
        this.notification = notification;
    }

    /**
     * @return the notifyTime
     */
    public Date getNotifyTime() {
        return this.notifyTime;
    }

    /**
     * @param notifyTime the notifyTime to set
     */
    public void setNotifyTime(Date notifyTime) {
        this.notifyTime = notifyTime;
    }

    /**
     * @return the examRecord
     */
    public String getExamRecord() {
        return this.examRecord;
    }

    /**
     * @param examRecord the examRecord to set
     */
    public void setExamRecord(String examRecord) {
        this.examRecord = examRecord;
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
