/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：登录请求bean
 * 文件名称：LoginRequest.java
 * 修改时间：2016年7月16日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
 	
package com.hzw.du.web.entity.request;

import com.hzw.du.common.utils.StringUtils;
import com.hzw.du.web.entity.BaseRequest;

/**
 * 登录请求bean
 * <功能详细描述>
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class LoginRequest extends BaseRequest{
    //登录账户
    private String loginAcc;
    //登录密码
    private String password;
    //登录验证码
    private String loginCode;
    //记住密码
    private boolean rememberPwd;
    
    public String checkAjaxCheckLogin(){
        String tipMsg = null;
        
        if(StringUtils.isEmpty(loginAcc) || StringUtils.isEmpty(loginAcc.trim())){
            tipMsg = "用户名不能为空";
        }
        if(StringUtils.isEmpty(tipMsg) && StringUtils.isEmpty(password) ){
            tipMsg = "密码不能为空";
        }
        if(StringUtils.isEmpty(tipMsg) && StringUtils.isEmpty(loginCode) || StringUtils.isEmpty(loginCode.trim() )){
            tipMsg = "验证码不能为空";
        }
        
        return tipMsg;
    }
    
    /**
     * @return the loginAcc
     */
    public String getLoginAcc() {
        return this.loginAcc;
    }
    /**
     * @param loginAcc the loginAcc to set
     */
    public void setLoginAcc(String loginAcc) {
        this.loginAcc = loginAcc;
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
     * @return the loginCode
     */
    public String getLoginCode() {
        return this.loginCode;
    }
    /**
     * @param loginCode the loginCode to set
     */
    public void setLoginCode(String loginCode) {
        this.loginCode = loginCode;
    }

	public boolean isRememberPwd() {
		return rememberPwd;
	}

	public void setRememberPwd(boolean rememberPwd) {
		this.rememberPwd = rememberPwd;
	}

 
}
