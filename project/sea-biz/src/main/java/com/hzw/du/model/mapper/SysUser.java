/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_USER  用户表， 序列seq_userid]
 * 文件名称：SysUser.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.Date;

/**
 * [SYS_USER  用户表， 序列seq_userid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class SysUser extends BaseBean {
    /**
     * USERID  NUMBER  N           用户编号
     */
    private Long userId;
    
    /***
     * STAFFCODE   VARCHAR2(50)    Y           登陆号
     */
    private String staffCode;
    
    /**
     * USERNAME    VARCHAR2(100)   Y           用户名称
     */
    private String userName;
    
    /**
     * PASSWORD    VARCHAR2(100)   Y           密码
     */
    private String password;
    
    /**
     * USERTYPE    NUMBER  Y           用户类型
     */
    private Integer userType;
    
    /**
     * DEPARTMENTID    NUMBER  Y           所属部门编号
     */
    private Long departmentId;
    
    /**
     * LASTLOGINTIME   DATE    Y           最后登录时间
     */
    private Date lastLoginTime;
    
    /**
     * USERCLASSIFY    NUMBER  Y           0主用户 1子用户 2采购中心管理员
     */
    private Integer userClassify;
    
    /**
     * CARDTYPE    VARCHAR2(2)  Y           证件类型
     */
    private String cardType;
    
    /***
     * CARDNO  VARCHAR2(50)  Y           证件号码
     */
    private String cardNo;
    
    /**
     * ROLEID  NUMBER   Y           角色编号
     */
    private Long roleId;
    
    /**
     * COUNT   NUMBER  Y           记录输入密码错误的次数
     */
    private Integer count = 0;
    
    /**
     * ERRORDATE   DATE    Y           最后一次输入密码错误的时间
     */
    private Date errorDate;
    
    /**
     * PHONE   VARCHAR2(50)    Y           手机号码
     */
    private String phone;
    
    /**
     * EMAIL   VARCHAR2(200)   Y           邮箱
     */
    private String email;
    
    /**
     * TELNO   VARCHAR2(50)    Y           固定电话
     */
    private String telNo;
    
    /**
     * GENDER  NUMBER  Y           性别 0：男 1：女
     */
    private Integer gender;
    
    /**
     * REGINDATE   DATE    Y           注册时间
     */
    private Date reginDate;
    
    /**
     * ORGANIZATIONID  NUMBER  Y           所属组织机构编号
     */
    private Long organizationId;
//    CREATEUSER  NUMBER  Y           创建人
//    CREATETIME  DATE    Y           创建时间
//    UPDATEUSER  NUMBER  Y           修改人
//    UPDATETIME  DATE    Y           修改时间
    /**
     * STATUS  NUMBER  Y           用户状态
     */
    private Integer status;
    
    /**
     * AUDITSTATUS NUMBER  Y           审核状态
     */
    private Integer auditStatus;
    
    
    // 组织编号名称
    private String organizationName;
    
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
     * @return the staffCode
     */
    public String getStaffCode() {
        return this.staffCode;
    }
    /**
     * @param staffCode the staffCode to set
     */
    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
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
     * @return the password
     */
    public String getPassword() {
        return this.password;
    }
    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * @return the userType
     */
    public Integer getUserType() {
        return this.userType;
    }
    /**
     * @param userType the userType to set
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }
    /**
     * @return the departmentId
     */
    public Long getDepartmentId() {
        return this.departmentId;
    }
    /**
     * @param departmentId the departmentId to set
     */
    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }
    /**
     * @return the lastLoginTime
     */
    public Date getLastLoginTime() {
        return this.lastLoginTime;
    }
    /**
     * @param lastLoginTime the lastLoginTime to set
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
    /**
     * @return the userClassify
     */
    public Integer getUserClassify() {
        return this.userClassify;
    }
    /**
     * @param userClassify the userClassify to set
     */
    public void setUserClassify(Integer userClassify) {
        this.userClassify = userClassify;
    }
    /**
     * @return the cardType
     */
    public String getCardType() {
        return this.cardType;
    }
    /**
     * @param cardType the cardType to set
     */
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
    /**
     * @return the cardNo
     */
    public String getCardNo() {
        return this.cardNo;
    }
    /**
     * @param cardNo the cardNo to set
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
    /**
     * @return the roleId
     */
    public Long getRoleId() {
        return this.roleId;
    }
    /**
     * @param roleId the roleId to set
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
    /**
     * @return the count
     */
    public Integer getCount() {
        return this.count;
    }
    /**
     * @param count the count to set
     */
    public void setCount(Integer count) {
        this.count = count;
    }
    /**
     * @return the errorDate
     */
    public Date getErrorDate() {
        return this.errorDate;
    }
    /**
     * @param errorDate the errorDate to set
     */
    public void setErrorDate(Date errorDate) {
        this.errorDate = errorDate;
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
     * @return the email
     */
    public String getEmail() {
        return this.email;
    }
    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * @return the telNo
     */
    public String getTelNo() {
        return this.telNo;
    }
    /**
     * @param telNo the telNo to set
     */
    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }
    /**
     * @return the gender
     */
    public Integer getGender() {
        return this.gender;
    }
    /**
     * @param gender the gender to set
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }
    /**
     * @return the reginDate
     */
    public Date getReginDate() {
        return this.reginDate;
    }
    /**
     * @param reginDate the reginDate to set
     */
    public void setReginDate(Date reginDate) {
        this.reginDate = reginDate;
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
    
    public Integer getAuditStatus()
    {
        return auditStatus;
    }
    public void setAuditStatus(Integer auditStatus)
    {
        this.auditStatus = auditStatus;
    }
    /**
     * @return the organizationName
     */
    public String getOrganizationName() {
        return this.organizationName;
    }
    /**
     * @param organizationName the organizationName to set
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

}
