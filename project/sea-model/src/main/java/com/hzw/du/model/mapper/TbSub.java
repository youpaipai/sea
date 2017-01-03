/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[TB_SUB 标段表， 序列seq_subid]
 * 文件名称：TbSub.java
 * 修改时间：2016年7月21日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.Date;

/**
 * [TB_SUB 标段表， 序列seq_subid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class TbSub extends BaseBean {

    /**
     * SUBID   NUMBER  N           标段id
     */
    private Long subId;
    
    /**
     * SUBNAME VARCHAR2(200)   Y           标段名称
     */
    private String subName;
    
    /**
     * SUBCONTENT  VARCHAR2(500)   Y           标段内容
     */
    private String subContent;
    
    /**
     * TENDERPROJECTID NUMBER  Y           招标项目id
     */
    private Long tenderProjectId;
    
    /**
     * TENDERPROJECTNUM    VARCHAR2(100)   Y           招标项目编号
     */
    private String tenderProejectNum;
    
    /**
     * TENDERPROJECTNAME   VARCHAR2(300)   Y           招标项目名称
     */
    private String tenderProjectName;
    
    /**
     * SORTNO  NUMBER(10)  Y           标段号
     */
    private Integer sortNo;
    
    /**
     * BIDQUALIFICATION    VARCHAR2(500)   Y           投标人资格条件
     */
    private String bidQualification;
    
    /**
     * SUBPROJECTTYPE  VARCHAR2(10)    Y           行业分类
     */
    private String subProjectType;
    
    /**
     * OPENTIME    DATE    Y           开标时间
     */
    private Date openTime;
    
    /**
     * OPENADDRESS VARCHAR2(200)   Y           开标地点
     */
    private String openAddress;
    


//    CREATEUSER  NUMBER  Y           创建人
//    CREATETIME  DATE    Y           创建时间
//    UPDATEUSER  NUMBER  Y           修改人
//    UPDATETIME  DATE    Y           修改时间
    /**
     * STATUS  NUMBER  Y           状态 0：未删除  1：删除
     */
    private Integer status;

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
     * @return the tenderProejectNum
     */
    public String getTenderProejectNum() {
        return this.tenderProejectNum;
    }

    /**
     * @param tenderProejectNum the tenderProejectNum to set
     */
    public void setTenderProejectNum(String tenderProejectNum) {
        this.tenderProejectNum = tenderProejectNum;
    }

    /**
     * @return the tenderProjectName
     */
    public String getTenderProjectName() {
        return this.tenderProjectName;
    }

    /**
     * @param tenderProjectName the tenderProjectName to set
     */
    public void setTenderProjectName(String tenderProjectName) {
        this.tenderProjectName = tenderProjectName;
    }

    /**
     * @return the sortNo
     */
    public Integer getSortNo() {
        return this.sortNo;
    }

    /**
     * @param sortNo the sortNo to set
     */
    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    /**
     * @return the bidQualification
     */
    public String getBidQualification() {
        return this.bidQualification;
    }

    /**
     * @param bidQualification the bidQualification to set
     */
    public void setBidQualification(String bidQualification) {
        this.bidQualification = bidQualification;
    }

    /**
     * @return the status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return the subProjectType
     */
    public String getSubProjectType() {
        return this.subProjectType;
    }

    /**
     * @param subProjectType the subProjectType to set
     */
    public void setSubProjectType(String subProjectType) {
        this.subProjectType = subProjectType;
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

}
