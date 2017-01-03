/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_PERSON_USER  招标人用户表， 序列seq_personuserid]
 * 文件名称：SysPersonUser.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

/**
 * [SYS_PERSON_USER  招标人用户表， 序列seq_personuserid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class SysPersonUser extends BaseBean {
    
    /**
     * PERSONUSERID    NUMBER  N           招标人用户ID
     */
    private Long personUserId;
    
    /**
     * ORGANIZATIONID  NUMBER  Y           组织机构ID（招标人）
     */
    private Long organizationId;
    
    /**
     * USERID  NUMBER  Y           用户ID
     */
    private Long userId;
    
    /**
     * CARDFILE    NUMBER  Y           名片文件
     */
    private Long cardFile;
    
    /**
     * 名片文件名称
     */
    private String cardFileName;
    
    //CREATEUSER  NUMBER  Y           创建人
    //CREATETIME  DATE    Y           创建时间
    //UPDATEUSER  NUMBER  Y           修改人
    //UPDATETIME  DATE    Y           修改时间
    /**
     * STATUS  NUMBER  Y           状态 0未删除  1删除
     */
    private Integer status;

    /**
     * @return the personUserId
     */
    public Long getPersonUserId() {
        return this.personUserId;
    }

    /**
     * @param personUserId the personUserId to set
     */
    public void setPersonUserId(Long personUserId) {
        this.personUserId = personUserId;
    }

    /**
     * @return the organizationId
     */
    public Long getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @param organizationId the organizationId to set
     */
    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
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
     * @return the cardFile
     */
    public Long getCardFile() {
        return this.cardFile;
    }

    /**
     * @param cardFile the cardFile to set
     */
    public void setCardFile(Long cardFile) {
        this.cardFile = cardFile;
    }

    public String getCardFileName()
    {
        return cardFileName;
    }

    public void setCardFileName(String cardFileName)
    {
        this.cardFileName = cardFileName;
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
