package com.hzw.du.web.entity.request;

/*
 * 公司名称：江苏华招网信息技术有限公司
 * 版权信息：江苏华招网信息技术有限公司版权所有
 * 描述：用户信息类
 * 文件名称：UsersRequest.java
 * 修改时间：2016-8-2
 * 修改人：zl
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
public class UsersRequest
{
    /*主键id*/
    private Integer userId;
    
    /*用户姓名*/
    private String  username;
    
    /*登录号*/
    private String  staffCode;
    
    /*用户类型*/
    private Integer userType;
    
    /*状态 0：启用 1：停用    2：已锁定 3.无效   4.删除*/
    private Integer status;
    
    /*所属部门编号*/
    private Integer departmentNo;
    
    /* 0主用户 1子用户 2采购中心管理员*/
    private Integer userClassify;
    
    /*证件类型*/
    private String cardType;
    
    /*证件号码*/
    private String cardNo;
    
    /*角色编号*/
    private Integer roleId;
    
    /*手机号*/
    private String  phone;
    
    /*邮箱*/
    private String email;
    
    /*固定电话*/
    private String telNo;
    
    /*性别 0：男 1：女*/    
    private Integer gender;
    
    /*所属组织机构编号*/
    private Integer organizationId;
    
    /*名片文件*/
    private Long cardfile ;
    
    /*法人代表授权书文件*/
    private Long personfile ;
    
    
   

    /*区分功能： add、edit、start、stop、del*/
    private String  op;
//    /**/
//    private String[] roleIds;
    public Integer getUserId()
    {
        return userId;
    }

    public void setUserId(Integer userId)
    {
        this.userId = userId;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getStaffCode()
    {
        return staffCode;
    }

    public void setStaffCode(String staffCode)
    {
        this.staffCode = staffCode;
    }

    public Integer getUserType()
    {
        return userType;
    }

    public void setUserType(Integer userType)
    {
        this.userType = userType;
    }

    public Integer getStatus()
    {
        return status;
    }

    public void setStatus(Integer status)
    {
        this.status = status;
    }

    public Integer getDepartmentNo()
    {
        return departmentNo;
    }

    public void setDepartmentNo(Integer departmentNo)
    {
        this.departmentNo = departmentNo;
    }

    public Integer getUserClassify()
    {
        return userClassify;
    }

    public void setUserClassify(Integer userClassify)
    {
        this.userClassify = userClassify;
    }

    public String getCardType()
    {
        return cardType;
    }

    public void setCardType(String cardType)
    {
        this.cardType = cardType;
    }

    public String getCardNo()
    {
        return cardNo;
    }

    public void setCardNo(String cardNo)
    {
        this.cardNo = cardNo;
    }

    public Integer getRoleId()
    {
        return roleId;
    }

    public void setRoleId(Integer roleId)
    {
        this.roleId = roleId;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getTelNo()
    {
        return telNo;
    }

    public void setTelNo(String telNo)
    {
        this.telNo = telNo;
    }

    public Integer getGender()
    {
        return gender;
    }

    public void setGender(Integer gender)
    {
        this.gender = gender;
    }

    public Integer getOrganizationId()
    {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId)
    {
        this.organizationId = organizationId;
    }

    public String getOp()
    {
        return op;
    }

    public void setOp(String op)
    {
        this.op = op;
    }
    public Long getCardfile()
    {
        return cardfile;
    }

    public void setCardfile(Long cardfile)
    {
        this.cardfile = cardfile;
    }

    public Long getPersonfile()
    {
        return personfile;
    }

    public void setPersonfile(Long personfile)
    {
        this.personfile = personfile;
    }
    
   
    
}
