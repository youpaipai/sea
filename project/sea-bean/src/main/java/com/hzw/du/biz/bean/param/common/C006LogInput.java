/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：C006LogInput.java
 * 修改时间：2016-7-23
 * 修改人：libb
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */



 	
package com.hzw.du.biz.bean.param.common;

import java.util.Date;

import com.hzw.du.biz.bean.constant.CommonBizFunCode;
import com.hzw.du.biz.bean.param.BaseCommonInput;

/**
 * <一句话功能简述> 日志信息输入参数
 * <功能详细描述>
 * @author libb
 * @version V1.0[产品/模块版本]
 */
public class C006LogInput extends BaseCommonInput
{
    /* ******************************************************************************************* */
    /*                                       序列化代码区域                                                                                               */
    /* ******************************************************************************************* */

    /* ******************************************************************************************* */
    /*                                       全局变量声明区域                                                                                           */
    /* ******************************************************************************************* */
    
    /**
     * LOGID    NUMBER  N           日志ID
     */
    private Long logId;
    
    /**
     * LOGTYPE NUMBER  Y           日志类型
     */
    private Integer logType;

    /**
     * OPERATORID  NUMBER  Y           操作人编号
     */
    private Long operatorId;

    /**
     * OPERATOR    VARCHAR2(100)   Y           操作人名称
     */
    private String operator;

    /**
     * ROLEID  NUMBER  Y           角色编号
     */
    private Long roleId;

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
     * MENUID  NUMBER  Y           操作的菜单编号
     */
    private Long menuId;

    /**
     * MENUNAME    VARCHAR2(100)   Y           操作的菜单名称
     */
    private String menuName;

    /**
     * BUTTONID    NUMBER  Y           操作的按钮编号
     */
    private Long buttonId;

    /**
     * BUTTONNAME  VARCHAR2(100)   Y           操作的按钮名称
     */
    private String buttonName;

    /**
     * RECEIVERID  NUMBER  Y           接收人编号
     */
    private Long receiverId;

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
     * 用户ID
     */
    private Long userId;

    /* ******************************************************************************************* */
    /*                                       公共函数声明区域                                                                                           */
    /* ******************************************************************************************* */
    
    public C006LogInput()
    {
        this.functionCode = CommonBizFunCode.LOG_C006;
    }

    public Long getLogId()
    {
        return logId;
    }

    public void setLogId(Long logId)
    {
        this.logId = logId;
    }

    public Integer getLogType()
    {
        return logType;
    }

    public void setLogType(Integer logType)
    {
        this.logType = logType;
    }

    public Long getOperatorId()
    {
        return operatorId;
    }

    public void setOperatorId(Long operatorId)
    {
        this.operatorId = operatorId;
    }

    public String getOperator()
    {
        return operator;
    }

    public void setOperator(String operator)
    {
        this.operator = operator;
    }

    public Long getRoleId()
    {
        return roleId;
    }

    public void setRoleId(Long roleId)
    {
        this.roleId = roleId;
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

    public Long getMenuId()
    {
        return menuId;
    }

    public void setMenuId(Long menuId)
    {
        this.menuId = menuId;
    }

    public String getMenuName()
    {
        return menuName;
    }

    public void setMenuName(String menuName)
    {
        this.menuName = menuName;
    }

    public Long getButtonId()
    {
        return buttonId;
    }

    public void setButtonId(Long buttonId)
    {
        this.buttonId = buttonId;
    }

    public String getButtonName()
    {
        return buttonName;
    }

    public void setButtonName(String buttonName)
    {
        this.buttonName = buttonName;
    }

    public Long getReceiverId()
    {
        return receiverId;
    }

    public void setReceiverId(Long receiverId)
    {
        this.receiverId = receiverId;
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

    public Long getUserId()
    {
        return userId;
    }

    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    /* ******************************************************************************************* */
    /*                                       私有函数声明区域                                                                                           */
    /* ******************************************************************************************* */
}
