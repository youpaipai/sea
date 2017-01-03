/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：我要投标list bean
 * 文件名称：BidBean.java
 * 修改时间：2016年7月15日
 * 修改人：wjy
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
package com.hzw.du.web.entity.response.supplier;

/**
 * 我要投标list bean
 * @author wjy
 * @version V1.0[产品/模块版本]
 */
public class BidBean{
    /**
     * 公告标题
     */
    private String title;
    /**
     * 公告内容
     */
    private String content;
    /**
     * 行业分类
     */
    private String projectType;
    /**
     * 行业分类描述
     */
    private String projectTypeDesc;
    /**
     * 剩余时间
     */
    private String remainTime;
    /**
     * 是否可以投标
     */
    private boolean bidFlag;
    /**
     * 开标日期
     */
    private String openBidTimeStr;
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public String getContent()
    {
        return content;
    }
    public void setContent(String content)
    {
        this.content = content;
    }
    public String getProjectType()
    {
        return projectType;
    }
    public void setProjectType(String projectType)
    {
        this.projectType = projectType;
    }
    public String getProjectTypeDesc()
    {
        return projectTypeDesc;
    }
    public void setProjectTypeDesc(String projectTypeDesc)
    {
        this.projectTypeDesc = projectTypeDesc;
    }
    public String getRemainTime()
    {
        return remainTime;
    }
    public void setRemainTime(String remainTime)
    {
        this.remainTime = remainTime;
    }
    public boolean isBidFlag()
    {
        return bidFlag;
    }
    public void setBidFlag(boolean bidFlag)
    {
        this.bidFlag = bidFlag;
    }
    public String getOpenBidTimeStr()
    {
        return openBidTimeStr;
    }
    public void setOpenBidTimeStr(String openBidTimeStr)
    {
        this.openBidTimeStr = openBidTimeStr;
    }
    
}
