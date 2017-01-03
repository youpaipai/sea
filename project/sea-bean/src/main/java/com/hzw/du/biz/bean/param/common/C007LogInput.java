/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：M007LogInput.java
 * 修改时间：2016-7-25
 * 修改人：libb
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */



 	
package com.hzw.du.biz.bean.param.common;

import java.util.List;

import com.hzw.du.biz.bean.constant.CommonBizFunCode;
import com.hzw.du.biz.bean.param.BaseQueryCommonInput;

/**
 * <一句话功能简述> 日志信息输入参数
 * <功能详细描述>
 * @author libb
 * @version V1.0[产品/模块版本]
 */
public class C007LogInput extends BaseQueryCommonInput
{
    /* ******************************************************************************************* */
    /*                                       序列化代码区域                                                                                               */
    /* ******************************************************************************************* */

    /* ******************************************************************************************* */
    /*                                       全局变量声明区域                                                                                           */
    /* ******************************************************************************************* */
    
    /**
     * LOGTYPE NUMBER  Y           日志类型
     */
    private Integer logType;
    
    /**
     * ROLENAME    VARCHAR2(50)    Y           角色名称
     */
    private String roleName;
    
    /**
     * OPERATETIME DATE    Y           操作的时间
     * 每个单元包含两部分（条件符号|时间值）
     * 例如：表示小于时间：（lt|时间）
     * lte（小于等于）,gt（大于）,gte（大于等于）,eq（等于）
     */
    private List<String> operateTimeList;
    
    /* ******************************************************************************************* */
    /*                                       公共函数声明区域                                                                                           */
    /* ******************************************************************************************* */
    
    public C007LogInput()
    {
        functionCode = CommonBizFunCode.LOG_C007;
    }

    public Integer getLogType()
    {
        return logType;
    }

    public void setLogType(Integer logType)
    {
        this.logType = logType;
    }

    public String getRoleName()
    {
        return roleName;
    }

    public void setRoleName(String roleName)
    {
        this.roleName = roleName;
    }

    public List<String> getOperateTimeList()
    {
        return operateTimeList;
    }

    public void setOperateTimeList(List<String> operateTimeList)
    {
        this.operateTimeList = operateTimeList;
    }

    /* ******************************************************************************************* */
    /*                                       私有函数声明区域                                                                                           */
    /* ******************************************************************************************* */
}
