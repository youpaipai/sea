package com.hzw.du.web.entity;

import java.io.Serializable;

/**
 * session中的用户对象
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class SessionUser implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    //是否登录
    private boolean isLogin;
    //ID
    private Long userId;
    //登录用户名
    private String userName;
    //手机
    private String mobilePhoneNum;
    //登录验证码
    private String loginVerifyCode;
    
    /**
     * 用户类型
     */
    private Integer userType;
    
    public void clearSession(){
        isLogin = false;
        userId = null;
        userName = null;
        mobilePhoneNum = null;
        userType = null;
    }

    /**
     * @return the isLogin
     */
    public boolean isLogin() {
        return this.isLogin;
    }

    /**
     * @param isLogin the isLogin to set
     */
    public void setLogin(boolean isLogin) {
        this.isLogin = isLogin;
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
     * @return the mobilePhoneNum
     */
    public String getMobilePhoneNum() {
        return this.mobilePhoneNum;
    }

    /**
     * @param mobilePhoneNum the mobilePhoneNum to set
     */
    public void setMobilePhoneNum(String mobilePhoneNum) {
        this.mobilePhoneNum = mobilePhoneNum;
    }

    /**
     * @return the loginVerifyCode
     */
    public String getLoginVerifyCode() {
        return this.loginVerifyCode;
    }

    /**
     * @param loginVerifyCode the loginVerifyCode to set
     */
    public void setLoginVerifyCode(String loginVerifyCode) {
        this.loginVerifyCode = loginVerifyCode;
    }

    public Integer getUserType()
    {
        return userType;
    }

    public void setUserType(Integer userType)
    {
        this.userType = userType;
    }




    
}
