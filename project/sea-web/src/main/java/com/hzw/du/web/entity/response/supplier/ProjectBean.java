/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：项目操作list bean
 * 文件名称：ProjectBean.java
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
public class ProjectBean{
    /**
     * 招标项目id
     */
    private Long tenderProjectId;
    
    /**
     * 招标项目编号
     */
    private String tenderProjectNum;
    
    /**
     * 招标项目名称
     */
    private String tenderProjectName;
    
    /**
     * 分包编号
     */
    private String subId;
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
     * 开标时间
     */
    private String openBidTime;
    
    /**
     * 投标流程未完成数量（2016-7-28：目前共5个流程：
     * 1.上传付费凭证
     * 2.下载招标文件
     * 3.上传投标文件
     * 4.我的评标报告
     * 5.中标结果通知书
     */
    private String unfinished;
    
    
    
    public String getOpenBidTime()
    {
        return openBidTime;
    }
    public void setOpenBidTime(String openBidTime)
    {
        this.openBidTime = openBidTime;
    }
    public String getUnfinished()
    {
        return unfinished;
    }
    public void setUnfinished(String unfinished)
    {
        this.unfinished = unfinished;
    }
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
    public Long getTenderProjectId()
    {
        return tenderProjectId;
    }
    public void setTenderProjectId(Long tenderProjectId)
    {
        this.tenderProjectId = tenderProjectId;
    }
    public String getTenderProjectNum()
    {
        return tenderProjectNum;
    }
    public void setTenderProjectNum(String tenderProjectNum)
    {
        this.tenderProjectNum = tenderProjectNum;
    }
    public String getTenderProjectName()
    {
        return tenderProjectName;
    }
    public void setTenderProjectName(String tenderProjectName)
    {
        this.tenderProjectName = tenderProjectName;
    }
    public String getSubId()
    {
        return subId;
    }
    public void setSubId(String subId)
    {
        this.subId = subId;
    }
    
}
