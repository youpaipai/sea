/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_LOGIN_SOURCE  登录来源表， 序列seq_loginid]
 * 文件名称：SysLoginSource.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.Date;

/**
 * [SYS_LOGIN_SOURCE  登录来源表， 序列seq_loginid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class SysLoginSource extends BaseBean {
    
    /**
     * LOGINID NUMBER  N           登录来源ID
     */
    private Long loginId;
    
    /**
     * LOGINSOURCE NUMBER  Y           登录来源0：app登录 1：web登录
     */
    private Integer loginSource;
    
    /**
     * USERID  NUMBER  Y           用户ID
     */
    private Long userId;
    
    /**
     * STAFFCODE   VARCHAR2(50)    Y           登录号
     */
    private String staffCode;
    
    /**
     * USERNAME    VARCHAR2(100)   Y           用户名称
     */
    private String userName;
    
    /**
     * USERTYPE    NUMBER  Y           用户类型
     */
    private Integer userType;
    
    /**
     * LOGINIP VARCHAR2(50)    Y           登录ip
     */
    private String loginIp;
    
    /**
     * LOGINTIME   DATE    Y           登录时间
     */
    private Date loginTime;

    /**
     * @return the loginId
     */
    public Long getLoginId() {
        return this.loginId;
    }

    /**
     * @param loginId the loginId to set
     */
    public void setLoginId(Long loginId) {
        this.loginId = loginId;
    }

    /**
     * @return the loginSource
     */
    public Integer getLoginSource() {
        return this.loginSource;
    }

    /**
     * @param loginSource the loginSource to set
     */
    public void setLoginSource(Integer loginSource) {
        this.loginSource = loginSource;
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
     * @return the loginIp
     */
    public String getLoginIp() {
        return this.loginIp;
    }

    /**
     * @param loginIp the loginIp to set
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    /**
     * @return the loginTime
     */
    public Date getLoginTime() {
        return this.loginTime;
    }

    /**
     * @param loginTime the loginTime to set
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
    

}
