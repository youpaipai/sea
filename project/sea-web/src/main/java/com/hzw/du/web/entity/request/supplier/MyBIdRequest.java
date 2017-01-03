/*
 * 公司名称：江苏华招网信息技术有限公司
 * 版权信息：江苏华招网信息技术有限公司版权所有
 * 描述：TODO
 * 文件名称：MyBidRequest.java
 * 修改时间：2016-7-27
 * 修改人：王继洋
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.web.entity.request.supplier;

/**
 * 我的投标项目请求bean
 * <功能详细描述>
 * @author 王继洋
 * @version V1.0[产品/模块版本]
 */
public class MyBIdRequest
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
     * 是否中标
     */
    private String bidStatus;
    
    /**
     * 是否开标
     */
    private String openBid;
    
    /**
     * 开始时间（起始）
     */
    private String startTime;
    
    /**
     * 开标时间（结束）
     */
    private String endTime;

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

    public String getOpenBid()
    {
        return openBid;
    }

    public void setOpenBid(String openBid)
    {
        this.openBid = openBid;
    }

    public String getStartTime()
    {
        return startTime;
    }

    public void setStartTime(String startTime)
    {
        this.startTime = startTime;
    }

    public String getEndTime()
    {
        return endTime;
    }

    public void setEndTime(String endTime)
    {
        this.endTime = endTime;
    }
    
   
}
