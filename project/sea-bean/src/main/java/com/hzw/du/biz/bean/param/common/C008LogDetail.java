/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：M008LogDetail.java
 * 修改时间：2016-7-25
 * 修改人：libb
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */



 	
package com.hzw.du.biz.bean.param.common;

import java.util.Date;

/**
 * <一句话功能简述> 日志信息返回对象
 * <功能详细描述>
 * @author libb
 * @version V1.0[产品/模块版本]
 */
public class C008LogDetail
{
    /* ******************************************************************************************* */
    /*                                       序列化代码区域                                                                                               */
    /* ******************************************************************************************* */

    /* ******************************************************************************************* */
    /*                                       全局变量声明区域                                                                                           */
    /* ******************************************************************************************* */

    /**
     * OPERATOR    VARCHAR2(100)   Y           操作人名称
     */
    private String operator;

    /**
     * ROLENAME    VARCHAR2(50)    Y           角色名称
     */
    private String roleName;

    /**
     * IPADDR  VARCHAR2(50)    Y           操作的ip地址
     */
    private String ipAddr;

    /**
     * OPERATETIME DATE    Y           操作的时间
     */
    private Date operateTime;

    /**
     * MENUNAME    VARCHAR2(100)   Y           操作的菜单名称
     */
    private String menuName;

    /**
     * BUTTONNAME  VARCHAR2(100)   Y           操作的按钮名称
     */
    private String buttonName;

    /**
     * RECEIVERNAME    VARCHAR2(100)   Y           接收人名称
     */
    private String receiverName;

    /**
     * OPERATENOTE VARCHAR2(4000)  Y           操作的内容
     */
    private String operateNote;

    /**
     * REMARK  VARCHAR2(4000)  Y           备注
     */
    private String remark;
    
    /**
     * CREATEUSER  NUMBER  Y           创建人
     */
    protected Long createUser;
    
    /**
     * CREATETIME  DATE    Y           创建时间
     */
    protected Date createTime;
    
    /**
     * STATUS  NUMBER  Y   0       0:未删除 1：已删除
     */
    private Integer status;
    
    /* ******************************************************************************************* */
    /*                                       公共函数声明区域                                                                                           */
    /* ******************************************************************************************* */

    public String getOperator()
    {
        return operator;
    }

    public void setOperator(String operator)
    {
        this.operator = operator;
    }

    public String getRoleName()
    {
        return roleName;
    }

    public void setRoleName(String roleName)
    {
        this.roleName = roleName;
    }

    public String getIpAddr()
    {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr)
    {
        this.ipAddr = ipAddr;
    }

    public Date getOperateTime()
    {
        return operateTime;
    }

    public void setOperateTime(Date operateTime)
    {
        this.operateTime = operateTime;
    }

    public String getMenuName()
    {
        return menuName;
    }

    public void setMenuName(String menuName)
    {
        this.menuName = menuName;
    }

    public String getButtonName()
    {
        return buttonName;
    }

    public void setButtonName(String buttonName)
    {
        this.buttonName = buttonName;
    }

    public String getReceiverName()
    {
        return receiverName;
    }

    public void setReceiverName(String receiverName)
    {
        this.receiverName = receiverName;
    }

    public String getOperateNote()
    {
        return operateNote;
    }

    public void setOperateNote(String operateNote)
    {
        this.operateNote = operateNote;
    }

    public String getRemark()
    {
        return remark;
    }

    public void setRemark(String remark)
    {
        this.remark = remark;
    }

    public Long getCreateUser()
    {
        return createUser;
    }

    public void setCreateUser(Long createUser)
    {
        this.createUser = createUser;
    }

    public Date getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }

    public Integer getStatus()
    {
        return status;
    }

    public void setStatus(Integer status)
    {
        this.status = status;
    }
    
    /* ******************************************************************************************* */
    /*                                       私有函数声明区域                                                                                           */
    /* ******************************************************************************************* */
}
