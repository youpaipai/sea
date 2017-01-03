/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_LOG  日志信息表， 序列seq_logid]
 * 文件名称：SysLog.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.Date;

/**
 * [SYS_LOG  日志信息表， 序列seq_logid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class SysLog extends BaseBean {

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

    //CREATEUSER  NUMBER  Y           创建人
    //CREATETIME  DATE    Y           创建时间

    /**
     * STATUS  NUMBER  Y   0       0:未删除 1：已删除
     */
    private Integer status;

    /**
     * @return the operatorId
     */
    public Long getOperatorId() {
        return this.operatorId;
    }

    /**
     * @param operatorId the operatorId to set
     */
    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * @return the operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @param operator the operator to set
     */
    public void setOperator(String operator) {
        this.operator = operator;
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
     * @return the roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * @param roleName the roleName to set
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * @return the ipAddr
     */
    public String getIpAddr() {
        return this.ipAddr;
    }

    /**
     * @param ipAddr the ipAddr to set
     */
    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    /**
     * @return the operateTime
     */
    public Date getOperateTime() {
        return this.operateTime;
    }

    /**
     * @param operateTime the operateTime to set
     */
    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    /**
     * @return the menuId
     */
    public Long getMenuId() {
        return this.menuId;
    }

    /**
     * @param menuId the menuId to set
     */
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    /**
     * @return the menuName
     */
    public String getMenuName() {
        return this.menuName;
    }

    /**
     * @param menuName the menuName to set
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * @return the buttonId
     */
    public Long getButtonId() {
        return this.buttonId;
    }

    /**
     * @param buttonId the buttonId to set
     */
    public void setButtonId(Long buttonId) {
        this.buttonId = buttonId;
    }

    /**
     * @return the buttonName
     */
    public String getButtonName() {
        return this.buttonName;
    }

    /**
     * @param buttonName the buttonName to set
     */
    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }

    /**
     * @return the receiverId
     */
    public Long getReceiverId() {
        return this.receiverId;
    }

    /**
     * @param receiverId the receiverId to set
     */
    public void setReceiverId(Long receiverId) {
        this.receiverId = receiverId;
    }

    /**
     * @return the receiverName
     */
    public String getReceiverName() {
        return this.receiverName;
    }

    /**
     * @param receiverName the receiverName to set
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    /**
     * @return the operateNote
     */
    public String getOperateNote() {
        return this.operateNote;
    }

    /**
     * @param operateNote the operateNote to set
     */
    public void setOperateNote(String operateNote) {
        this.operateNote = operateNote;
    }

    /**
     * @return the remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @param remark the remark to set
     */
    public void setRemark(String remark) {
        this.remark = remark;
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
     * @return the logId
     */
    public Long getLogId() {
        return this.logId;
    }

    /**
     * @param logId the logId to set
     */
    public void setLogId(Long logId) {
        this.logId = logId;
    }

    /**
     * @return the logType
     */
    public Integer getLogType() {
        return this.logType;
    }

    /**
     * @param logType the logType to set
     */
    public void setLogType(Integer logType) {
        this.logType = logType;
    }

}
