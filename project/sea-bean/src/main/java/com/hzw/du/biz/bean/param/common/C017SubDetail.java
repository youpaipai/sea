/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：招标项目标段信息
 * 文件名称：C013ProjectQueryDetail.java
 * 修改时间：2016年7月26日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.biz.bean.param.common;

import java.util.Date;

/**
 * 招标项目标段信息
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class C017SubDetail {
    
    /**
     * 供应商参标ID
     */
    private Long standardId;
    
    /**
     * 供应商用户id(用户表)
     */
    private Long supplierUserId;
    
    /**
     *  招标项目id
     */
    private Long tenderProjectId;
    
    /**
     *  标段id
     */
    private Long subId;
    
    /**
     *  标段名称
     */
    private String subName;
    
    /**
     *  标段内容
     */
    private String subContent;
    
    
    /**
     * 开标日期
     */
    private Date openTime;
    
    /**
     * 开标地点
     */
    private String openAddress;
    
    /**
     * 中标状态 0：未中标  1：中标
     */
    private String bidStatus;
    
    /**
     * 异常标识 0:正常 1：暂停 2：终止
     */
    private Integer abnormalFlag;

    /**
     * @return the subId
     */
    public Long getSubId() {
        return this.subId;
    }

    /**
     * @param subId the subId to set
     */
    public void setSubId(Long subId) {
        this.subId = subId;
    }

    /**
     * @return the subName
     */
    public String getSubName() {
        return this.subName;
    }

    /**
     * @param subName the subName to set
     */
    public void setSubName(String subName) {
        this.subName = subName;
    }

    /**
     * @return the subContent
     */
    public String getSubContent() {
        return this.subContent;
    }

    /**
     * @param subContent the subContent to set
     */
    public void setSubContent(String subContent) {
        this.subContent = subContent;
    }

    /**
     * @return the tenderProjectId
     */
    public Long getTenderProjectId() {
        return this.tenderProjectId;
    }

    /**
     * @param tenderProjectId the tenderProjectId to set
     */
    public void setTenderProjectId(Long tenderProjectId) {
        this.tenderProjectId = tenderProjectId;
    }

    /**
     * @return the bidStatus
     */
    public String getBidStatus() {
        return this.bidStatus;
    }

    /**
     * @param bidStatus the bidStatus to set
     */
    public void setBidStatus(String bidStatus) {
        this.bidStatus = bidStatus;
    }

    /**
     * @return the openTime
     */
    public Date getOpenTime() {
        return this.openTime;
    }

    /**
     * @param openTime the openTime to set
     */
    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    /**
     * @return the openAddress
     */
    public String getOpenAddress() {
        return this.openAddress;
    }

    /**
     * @param openAddress the openAddress to set
     */
    public void setOpenAddress(String openAddress) {
        this.openAddress = openAddress;
    }

    /**
     * @return the supplierUserId
     */
    public Long getSupplierUserId() {
        return this.supplierUserId;
    }

    /**
     * @param supplierUserId the supplierUserId to set
     */
    public void setSupplierUserId(Long supplierUserId) {
        this.supplierUserId = supplierUserId;
    }

    /**
     * @return the abnormalFlag
     */
    public Integer getAbnormalFlag() {
        return this.abnormalFlag;
    }

    /**
     * @param abnormalFlag the abnormalFlag to set
     */
    public void setAbnormalFlag(Integer abnormalFlag) {
        this.abnormalFlag = abnormalFlag;
    }

    /**
     * @return the standardId
     */
    public Long getStandardId() {
        return this.standardId;
    }

    /**
     * @param standardId the standardId to set
     */
    public void setStandardId(Long standardId) {
        this.standardId = standardId;
    }
    
}
