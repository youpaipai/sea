/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_PHONE_MODIFY  手机号码变更记录表， 序列seq_phonemodifyid]
 * 文件名称：SysPhoneModify.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.Date;

/**
 * [SYS_PHONE_MODIFY  手机号码变更记录表， 序列seq_phonemodifyid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class SysPhoneModify extends BaseBean {

    /**
     * PHONEMODIFYID   NUMBER  N           手机号码变更记录ID
     */
    private Long phoneModifyId;

    /**
     * USERID  NUMBER  Y           用户ID
     */
    private Long userId;

    /**
     * ORGANIZATIONID  NUMBER  Y           所属组织机构编号
     */
    private Long organizationId;

    /**
     * USERNAME    VARCHAR2(50)    Y           用户名称
     */
    private String userName;

    /**
     * OLDPHONE    VARCHAR2(50)    Y           旧手机号码
     */
    private String oldPhone;

    /**
     * PHONE   VARCHAR2(50)    Y           新手机号码
     */
    private String phone;

    /**
     * UPDATETIME  DATE    Y           修改时间
     */
    private Date updateTime;

    /**
     * STATUS  NUMBER  Y           0：已审核  1：待审核 2：未通过
     */
    private Integer status;

    /**
     * @return the phoneModifyId
     */
    public Long getPhoneModifyId() {
        return this.phoneModifyId;
    }

    /**
     * @param phoneModifyId the phoneModifyId to set
     */
    public void setPhoneModifyId(Long phoneModifyId) {
        this.phoneModifyId = phoneModifyId;
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
     * @return the oldPhone
     */
    public String getOldPhone() {
        return this.oldPhone;
    }

    /**
     * @param oldPhone the oldPhone to set
     */
    public void setOldPhone(String oldPhone) {
        this.oldPhone = oldPhone;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
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
     * @return the updateTime
     */
    public Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @param updateTime the updateTime to set
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}
