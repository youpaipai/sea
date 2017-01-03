/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：M007LogDetail.java
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
public class C007LogDetail
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
    private String ipaddr;

    /**
     * OPERATETIME DATE    Y           操作的时间
     */
    private Date operateTime;
    
    /* ******************************************************************************************* */
    /*                                       公共函数声明区域                                                                                           */
    /* ******************************************************************************************* */
    
    
    public Integer getLogType()
    {
        return logType;
    }
    
    public Long getLogId()
    {
        return logId;
    }

    public void setLogId(Long logId)
    {
        this.logId = logId;
    }

    public void setLogType(Integer logType)
    {
        this.logType = logType;
    }
    
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
    
    public String getIpaddr()
    {
        return ipaddr;
    }
    
    public void setIpaddr(String ipaddr)
    {
        this.ipaddr = ipaddr;
    }
    
    public Date getOperateTime()
    {
        return operateTime;
    }
    
    public void setOperateTime(Date operateTime)
    {
        this.operateTime = operateTime;
    }
    
    /* ******************************************************************************************* */
    /*                                       私有函数声明区域                                                                                           */
    /* ******************************************************************************************* */
}
