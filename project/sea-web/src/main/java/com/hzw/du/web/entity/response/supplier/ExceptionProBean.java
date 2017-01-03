/*
 * 公司名称：江苏华招网信息技术有限公司
 * 版权信息：江苏华招网信息技术有限公司版权所有
 * 描述：投标项目list bean
 * 文件名称：BiddingBean.java
 * 修改时间：2016-7-28
 * 修改人：王继洋
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.web.entity.response.supplier;

/**
 * 
 * 投标项目list bean
 * @author 王继洋
 * @version V1.0[产品/模块版本]
 */
public class ExceptionProBean
{
    /**
     * 项目名称
     */
    private String projectName;
    
    /**
     * 项目编号
     */
    private String projectNum;
    
    /**
     * 异常处理人
     */
    private String setUser;
    
    /**
     * 联系方式
     */
    private String contact;
    
    /**
     * 异常原因
     */
    private String exeResult;
    
    /**
     * 设置异常时间
     */
    private String setDate;

    public String getProjectName()
    {
        return projectName;
    }

    public void setProjectName(String projectName)
    {
        this.projectName = projectName;
    }

    public String getProjectNum()
    {
        return projectNum;
    }

    public void setProjectNum(String projectNum)
    {
        this.projectNum = projectNum;
    }

    public String getSetUser()
    {
        return setUser;
    }

    public void setSetUser(String setUser)
    {
        this.setUser = setUser;
    }

    public String getContact()
    {
        return contact;
    }

    public void setContact(String contact)
    {
        this.contact = contact;
    }

    public String getExeResult()
    {
        return exeResult;
    }

    public void setExeResult(String exeResult)
    {
        this.exeResult = exeResult;
    }

    public String getSetDate()
    {
        return setDate;
    }

    public void setSetDate(String setDate)
    {
        this.setDate = setDate;
    }
    
    
}
