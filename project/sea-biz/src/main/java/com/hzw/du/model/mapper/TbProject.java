/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[TB_PROJECT 项目表， 序列seq_projectid]
 * 文件名称：TbProject.java
 * 修改时间：2016年7月21日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

/**
 * [TB_PROJECT 项目表， 序列seq_projectid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class TbProject extends BaseBean {
    
    /**
     * PROJECTID   NUMBER  N           项目id
     */
    private Long projectId;
    
    /**
     * PROJECTNUM  VARCHAR2(100)   Y           项目编号
     */
    private String projectNum;
    
    /**
     * PROJECTNAME VARCHAR2(300)   Y           项目名称
     */
    private String projectName;
    
    /**
     * REGIONCODE  VARCHAR2(6) Y           项目所在行政区域代码
     */
    private String regionCode;
    
    /**
     * ADDRESS VARCHAR2(200)   Y           项目地址
     */
    private String address;
    
    /**
     * PROJECTTYPE VARCHAR2(10)    Y   项目类型
     */
    private String projectType;
    
    /**
     * FUNDINGSOURCE   NUMBER  Y           资金来源
     */
    private Integer fundingSource;
    
    /**
     * LEGALPERSON VARCHAR2(100)   Y           项目法人
     */
    private String legalPerson;
    
    /**
     * PROJECTSCALE    VARCHAR2(1000)  Y           项目规模
     */
    private String projectScale;
    
    /**
     * CONNECTOR   VARCHAR2(50)    Y           联系人
     */
    private String connector;
    
    /**
     * PHONE   VARCHAR2(50)    Y           联系电话
     */
    private String phone;
    
    /**
     * APPROVALNAME    VARCHAR2(100)   Y           项目批文名称
     */
    private String approvalName;
    
    /**
     * APPROVALNUMBER  VARCHAR2(100)   Y           项目批准文号
     */
    private String approvalNumber;
    
    /**
     * APPROVALAUTHORITY   VARCHAR2(100)   Y           项目批准单位
     */
    private String approvalAuthority;
    
    /**
     * PROJECTMANAGER  NUMBER  Y           项目负责人
     */
    private Long projectManager;
    
    /**
     * PURCHASETYPE    NUMBER  Y           招标方式
     */
    private Integer purchaseType;
    
    /**
     * AREANAME    VARCHAR2(20)    Y           地级市名称
     */
    private String areaName;
    
//    CREATEUSER  NUMBER  Y           创建人
//    CREATETIME  DATE    Y           创建时间
//    UPDATEUSER  NUMBER  Y           修改人
//    UPDATETIME  DATE    Y           修改时间
    /**
     * STATUS  NUMBER  Y           状态 0：未删除  1：删除
     */
    private Integer status;

    /**
     * @return the projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @param projectId the projectId to set
     */
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    /**
     * @return the projectNum
     */
    public String getProjectNum() {
        return this.projectNum;
    }

    /**
     * @param projectNum the projectNum to set
     */
    public void setProjectNum(String projectNum) {
        this.projectNum = projectNum;
    }

    /**
     * @return the projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @param projectName the projectName to set
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * @return the regionCode
     */
    public String getRegionCode() {
        return this.regionCode;
    }

    /**
     * @param regionCode the regionCode to set
     */
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the fundingSource
     */
    public Integer getFundingSource() {
        return this.fundingSource;
    }

    /**
     * @param fundingSource the fundingSource to set
     */
    public void setFundingSource(Integer fundingSource) {
        this.fundingSource = fundingSource;
    }

    /**
     * @return the legalPerson
     */
    public String getLegalPerson() {
        return this.legalPerson;
    }

    /**
     * @param legalPerson the legalPerson to set
     */
    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    /**
     * @return the projectScale
     */
    public String getProjectScale() {
        return this.projectScale;
    }

    /**
     * @param projectScale the projectScale to set
     */
    public void setProjectScale(String projectScale) {
        this.projectScale = projectScale;
    }

    /**
     * @return the connector
     */
    public String getConnector() {
        return this.connector;
    }

    /**
     * @param connector the connector to set
     */
    public void setConnector(String connector) {
        this.connector = connector;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the approvalName
     */
    public String getApprovalName() {
        return this.approvalName;
    }

    /**
     * @param approvalName the approvalName to set
     */
    public void setApprovalName(String approvalName) {
        this.approvalName = approvalName;
    }

    /**
     * @return the approvalNumber
     */
    public String getApprovalNumber() {
        return this.approvalNumber;
    }

    /**
     * @param approvalNumber the approvalNumber to set
     */
    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber;
    }

    /**
     * @return the approvalAuthority
     */
    public String getApprovalAuthority() {
        return this.approvalAuthority;
    }

    /**
     * @param approvalAuthority the approvalAuthority to set
     */
    public void setApprovalAuthority(String approvalAuthority) {
        this.approvalAuthority = approvalAuthority;
    }

    /**
     * @return the projectManager
     */
    public Long getProjectManager() {
        return this.projectManager;
    }

    /**
     * @param projectManager the projectManager to set
     */
    public void setProjectManager(Long projectManager) {
        this.projectManager = projectManager;
    }

    /**
     * @return the purchaseType
     */
    public Integer getPurchaseType() {
        return this.purchaseType;
    }

    /**
     * @param purchaseType the purchaseType to set
     */
    public void setPurchaseType(Integer purchaseType) {
        this.purchaseType = purchaseType;
    }

    /**
     * @return the areaName
     */
    public String getAreaName() {
        return this.areaName;
    }

    /**
     * @param areaName the areaName to set
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName;
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
     * @return the projectType
     */
    public String getProjectType() {
        return this.projectType;
    }

    /**
     * @param projectType the projectType to set
     */
    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

}
