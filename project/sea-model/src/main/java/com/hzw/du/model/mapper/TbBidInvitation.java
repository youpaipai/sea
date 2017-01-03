/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[TB_BID_INVITATION 投标邀请书， 序列seq_invitationid]
 * 文件名称：TbBidInvitation.java
 * 修改时间：2016年7月21日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.Date;

/**
 * [TB_BID_INVITATION 投标邀请书， 序列seq_invitationid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class TbBidInvitation extends BaseBean {
    
    /**
     * INVITATIONID    NUMBER  N           投标邀请书id
     */
    private Long invitationId;
    
    /**
     * SUBID   NUMBER  Y           标段id
     */
    private Long subId;
    
    /**
     * TENDERPROJECTID NUMBER  Y           招标项目ID
     */
    private Long tenderProjectId;
    
    /**
     * BIDQUALIFICATION    VARCHAR2(500)   Y           投标资格
     */
    private String bidQualification;
    
    /**
     * PURCHASEFILEGTIME   DATE    Y           招标文件获取时间
     */
    private Date purchaseFileGTime;
    
    /**
     * PURCHASEFILEMETHOD  VARCHAR2(500)   Y           招标文件获取方法
     */
    private String purchaseFileMethod;
    
    /**
     * BIDDOCREFERENDTIME  DATE    Y           投标文件递交截止时间
     */
    private Date bidDocReferEndTime;
    
    /**
     * BIDDOCREFERMETHOD   VARCHAR2(500)   Y           投标文件递交方法
     */
    private String BidDocReferMethod;
    
    /**
     * BIDINVITEENDTIME    DATE    Y           回复截止时间
     */
    private Date bidInviteEndTime;
    
    /**
     * BIDINVITEISSUETIME  DATE    Y           投标邀请发出时间
     */
    private Date bidInviteIssueTime;

    
//    CREATEUSER  NUMBER  Y           创建人
//    CREATETIME  DATE    Y           创建时间
//    UPDATEUSER  NUMBER  Y           修改人
//    UPDATETIME  DATE    Y           修改时间
    /**
     * STATUS  NUMBER  Y           状态 0：未删除  1：删除
     */
    private Integer status;


    /**
     * @return the invitationId
     */
    public Long getInvitationId() {
        return this.invitationId;
    }


    /**
     * @param invitationId the invitationId to set
     */
    public void setInvitationId(Long invitationId) {
        this.invitationId = invitationId;
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
     * @return the bidQualification
     */
    public String getBidQualification() {
        return this.bidQualification;
    }


    /**
     * @param bidQualification the bidQualification to set
     */
    public void setBidQualification(String bidQualification) {
        this.bidQualification = bidQualification;
    }


    /**
     * @return the purchaseFileGTime
     */
    public Date getPurchaseFileGTime() {
        return this.purchaseFileGTime;
    }


    /**
     * @param purchaseFileGTime the purchaseFileGTime to set
     */
    public void setPurchaseFileGTime(Date purchaseFileGTime) {
        this.purchaseFileGTime = purchaseFileGTime;
    }


    /**
     * @return the purchaseFileMethod
     */
    public String getPurchaseFileMethod() {
        return this.purchaseFileMethod;
    }


    /**
     * @param purchaseFileMethod the purchaseFileMethod to set
     */
    public void setPurchaseFileMethod(String purchaseFileMethod) {
        this.purchaseFileMethod = purchaseFileMethod;
    }


    /**
     * @return the bidDocReferEndTime
     */
    public Date getBidDocReferEndTime() {
        return this.bidDocReferEndTime;
    }


    /**
     * @param bidDocReferEndTime the bidDocReferEndTime to set
     */
    public void setBidDocReferEndTime(Date bidDocReferEndTime) {
        this.bidDocReferEndTime = bidDocReferEndTime;
    }


    /**
     * @return the bidDocReferMethod
     */
    public String getBidDocReferMethod() {
        return this.BidDocReferMethod;
    }


    /**
     * @param bidDocReferMethod the bidDocReferMethod to set
     */
    public void setBidDocReferMethod(String bidDocReferMethod) {
        this.BidDocReferMethod = bidDocReferMethod;
    }


    /**
     * @return the bidInviteEndTime
     */
    public Date getBidInviteEndTime() {
        return this.bidInviteEndTime;
    }


    /**
     * @param bidInviteEndTime the bidInviteEndTime to set
     */
    public void setBidInviteEndTime(Date bidInviteEndTime) {
        this.bidInviteEndTime = bidInviteEndTime;
    }


    /**
     * @return the bidInviteIssueTime
     */
    public Date getBidInviteIssueTime() {
        return this.bidInviteIssueTime;
    }


    /**
     * @param bidInviteIssueTime the bidInviteIssueTime to set
     */
    public void setBidInviteIssueTime(Date bidInviteIssueTime) {
        this.bidInviteIssueTime = bidInviteIssueTime;
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
