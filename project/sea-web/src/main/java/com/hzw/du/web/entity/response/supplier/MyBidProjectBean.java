/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：我的投标项目list bean
 * 文件名称：MyBidProjectBean.java
 * 修改时间：2016年7月27日
 * 修改人：wjy
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
package com.hzw.du.web.entity.response.supplier;

/**
 * 我的投标项目list bean
 * @author wjy
 * @version V1.0[产品/模块版本]
 */
public class MyBidProjectBean{
    
    /**
     * 项目名称
     */
    private String projectName;
    
    /**
     * 项目编号
     */
    private String projectNum;
    
    /**
     * 是否中标
     */
    private String bidStatus;
    
    /**
     * 包号
     */
    private String subName;
    
    /**
     * 开标地点
     */
    private String openAddress;
    
    /**
     * 开标时间
     */
    private String openTime;

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

    public String getBidStatus()
    {
        return bidStatus;
    }

    public void setBidStatus(String bidStatus)
    {
        this.bidStatus = bidStatus;
    }

    public String getSubName()
    {
        return subName;
    }

    public void setSubName(String subName)
    {
        this.subName = subName;
    }

    public String getOpenAddress()
    {
        return openAddress;
    }

    public void setOpenAddress(String openAddress)
    {
        this.openAddress = openAddress;
    }

    public String getOpenTime()
    {
        return openTime;
    }

    public void setOpenTime(String openTime)
    {
        this.openTime = openTime;
    }
    
    
    
}
