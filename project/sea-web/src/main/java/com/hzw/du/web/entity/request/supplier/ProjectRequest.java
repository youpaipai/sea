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

import java.util.List;

import com.hzw.du.biz.bean.param.bean.SubProSupplierUser;
import com.hzw.du.web.entity.BaseRequest;

/**
 * 我的投标项目请求bean
 * <功能详细描述>
 * @author 王继洋
 * @version V1.0[产品/模块版本]
 */
public class ProjectRequest extends BaseRequest
{
    /**
     * 招标项目名称
     */
    private String tenderProjectName;
    
    /***
     * 招标招标项目ID
     */
    private Long tenderProjectId;
    
    /***
     * 招标招标项目编号
     */
    private String tenderProjectNum;
    
    /**
     * 项目标段对应的参标供应商关系列表
     */
    private List<SubProSupplierUser> subProSupplierList;
    
    /**
     * 标段ID
     */
    private Long subId;
    
    /**
     * 公告类型 1:招标公告 2:更正公告 3:中标公告 4.中标候选人公示
     */
    private String bidType;

    /**
     *  发布起始时间
     */
    private String openBIdStratTime;

    /**
     * 发布结束时间
     */
    private String openBidEndTime;

    /**
     * 截止时间起始时间
     */
    private String closeStart;

    /**
     * 截止时间结束时间
     */
    private String closeEnd;
     
    

    public String getTenderProjectNum()
    {
        return tenderProjectNum;
    }

    public void setTenderProjectNum(String tenderProjectNum)
    {
        this.tenderProjectNum = tenderProjectNum;
    }

    public String getBidType()
    {
        return bidType;
    }

    public void setBidType(String bidType)
    {
        this.bidType = bidType;
    }

    public String getOpenBIdStratTime()
    {
        return openBIdStratTime;
    }

    public void setOpenBIdStratTime(String openBIdStratTime)
    {
        this.openBIdStratTime = openBIdStratTime;
    }

    public String getOpenBidEndTime()
    {
        return openBidEndTime;
    }

    public void setOpenBidEndTime(String openBidEndTime)
    {
        this.openBidEndTime = openBidEndTime;
    }

    public String getCloseStart()
    {
        return closeStart;
    }

    public void setCloseStart(String closeStart)
    {
        this.closeStart = closeStart;
    }

    public String getCloseEnd()
    {
        return closeEnd;
    }

    public void setCloseEnd(String closeEnd)
    {
        this.closeEnd = closeEnd;
    }

    public Long getSubId()
    {
        return subId;
    }

    public void setSubId(Long subId)
    {
        this.subId = subId;
    }

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

    
    public long getTenderProjectId()
    {
        return tenderProjectId;
    }

    public void setTenderProjectId(long tenderProjectId)
    {
        this.tenderProjectId = tenderProjectId;
    }
    

    public String getTenderProjectName()
    {
        return tenderProjectName;
    }

    public void setTenderProjectName(String tenderProjectName)
    {
        this.tenderProjectName = tenderProjectName;
    }

    public List<SubProSupplierUser> getSubProSupplierList()
    {
        return subProSupplierList;
    }

    public void setSubProSupplierList(List<SubProSupplierUser> subProSupplierList)
    {
        this.subProSupplierList = subProSupplierList;
    }

    public void setTenderProjectId(Long tenderProjectId)
    {
        this.tenderProjectId = tenderProjectId;
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
