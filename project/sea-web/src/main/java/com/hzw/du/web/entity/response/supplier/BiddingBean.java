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
public class BiddingBean
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
    private String unfinished ;

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
    
    
    
}
