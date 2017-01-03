/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：C009LoginOutput.java
 * 修改时间：2016-7-25
 * 修改人：libb
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.biz.bean.param.common;
import java.util.Date;

import com.hzw.du.biz.bean.constant.CommonBizFunCode;
import com.hzw.du.biz.bean.param.BaseCommonOutput;

/**
 * 
 * 登陆信息验证信息返回结果
 * <功能详细描述>
 * @author 王帅帅
 * @version V1.0[产品/模块版本]
 */
public class C009LoginOutput  extends BaseCommonOutput{
	
	

	/**
	 * 是否密码正确 1、 true  正确 2、 false 正确
	 */
	private  boolean    loginFlag=false;

	/**
	 * 用户ID
	 */
	private  String  userId;
	
	/**
	 * 用户姓名
	 */
	private String  userName;
	/**
	 * 输入密码错误次数
	 */
	private  int  count;
	/**
	 * 用户状态
	 */
	private  int  status;
	/**
	 * 最后输入密码错误时间
	 */
	private  Date    errorDate;
	
	/**
	 * 用户手机号
	 */
	private String  phone;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public   C009LoginOutput(){
			functionCode = CommonBizFunCode.SYS_LOGIN_C009;
	}
	
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	

	public boolean isLoginFlag() {
		return loginFlag;
	}

	public void setLoginFlag(boolean loginFlag) {
		this.loginFlag = loginFlag;
	}

    public int getCount()
    {
        return count;
    }

    public void setCount(int count)
    {
        this.count = count;
    }

    public int getStatus()
    {
        return status;
    }

    public void setStatus(int status)
    {
        this.status = status;
    }

    public Date getErrorDate()
    {
        return errorDate;
    }

    public void setErrorDate(Date errorDate)
    {
        this.errorDate = errorDate;
    }

	
	
}
