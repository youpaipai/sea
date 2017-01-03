/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：招标项目信息
 * 文件名称：C013ProjectQueryDetail.java
 * 修改时间：2016年7月26日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.biz.bean.param.common;

/**
 * 招标项目信息查询
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class C017TenderProjectDetail {
    
    /**
     * SUPPLIERUSERID  NUMBER  Y           供应商用户id(用户表)
     */
    private Long supplierUserId;

    /**
     *  招标项目id
     */
    private Long tenderProjectId;
    
    /**
     * 所属项目id
     */
    private Long projectId;
    
    /**
     *  招标项目编号
     */
    private String tenderProjectNum;
    
    /**
     *  招标项目名称
     */
    private String tenderProjectName;
    
    /**
     * 是否有标段，0没有，1有
     */
    private String haveSubFlag;
    
    /**
     * 状态 0：未删除  1：删除
     */
    private Integer status;

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
     * @return the tenderProjectNum
     */
    public String getTenderProjectNum() {
        return this.tenderProjectNum;
    }

    /**
     * @param tenderProjectNum the tenderProjectNum to set
     */
    public void setTenderProjectNum(String tenderProjectNum) {
        this.tenderProjectNum = tenderProjectNum;
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
     * @return the haveSubFlag
     */
    public String getHaveSubFlag() {
        return this.haveSubFlag;
    }

    /**
     * @param haveSubFlag the haveSubFlag to set
     */
    public void setHaveSubFlag(String haveSubFlag) {
        this.haveSubFlag = haveSubFlag;
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
    
}
