package com.hzw.du.web.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Huazhao
 *
 */
public class UsersTest implements Serializable{
	private Integer userId;
	private String userName;
	private Integer gender;
	private String phone;
	private String staffCode;
	private Integer status;
	private Date regintime;
	
	private String functionName;
	private String buttonName;
	
	
	public Integer getuserId() {
		return userId;
	}
	public String getFunctionName()
    {
        return functionName;
    }
    public void setFunctionName(String functionName)
    {
        this.functionName = functionName;
    }
    public String getButtonName()
    {
        return buttonName;
    }
    public void setButtonName(String buttonName)
    {
        this.buttonName = buttonName;
    }
    
    
    public UsersTest(Integer userId, String functionName, String buttonName)
    {
        super();
        this.userId = userId;
        this.functionName = functionName;
        this.buttonName = buttonName;
    }
    public void setuserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getStaffCode() {
		return staffCode;
	}
	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getRegintime() {
		return regintime;
	}
	public void setRegintime(Date regintime) {
		this.regintime = regintime;
	}

	
	public UsersTest(Integer userId, String userName, String phone,
			String staffCode, Integer status, Date regintime) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.phone = phone;
		this.staffCode = staffCode;
		this.status = status;
		this.regintime = regintime;
	}
	
	
	public UsersTest(Integer userId, String userName, Integer gender, String phone,
			String staffCode, Integer status, Date regintime) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.gender = gender;
		this.phone = phone;
		this.staffCode = staffCode;
		this.status = status;
		this.regintime = regintime;
	}
	public UsersTest(String userName, Integer gender, String phone,
			String staffCode, Integer status) {
		super();
		this.userName = userName;
		this.gender = gender;
		this.phone = phone;
		this.staffCode = staffCode;
		this.status = status;
		this.regintime = regintime;
	}
	public UsersTest() {
		super();
	}
	
	
	

}
