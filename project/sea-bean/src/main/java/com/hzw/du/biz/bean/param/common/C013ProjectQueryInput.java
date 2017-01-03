/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：项目信息查询，输入参数
 * 文件名称：C013ProjectQueryInput.java
 * 修改时间：2016年7月26日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.biz.bean.param.common;

import java.util.List;

import com.hzw.du.biz.bean.constant.CommonBizFunCode;
import com.hzw.du.biz.bean.param.BaseCommonInput;

/**
 * 项目信息查询，输入参数
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class C013ProjectQueryInput extends BaseCommonInput {

    public C013ProjectQueryInput() {
        functionCode = CommonBizFunCode.QUERY_PROJECT_C013;
    }

    /**
     * 项目信息id列表，之间用“逗号”隔开，注意逗号是英文半角
     */
    private String projectIdList;

    /**
     * 项目编号列表，之间用“逗号”隔开，注意逗号是英文半角
     */
    private String projectNumList;
    
    /**
     * 项目编号；模糊查询使用
     */
    private String projectNumLike;

    /**
     * 项目名称列表，之间用“逗号”隔开，注意逗号是英文半角
     */
    private String projectNameList;
    
    /**
     * 项目名称；模糊查询使用
     */
    private String projectNameLike;

    /**
     * 项目所在行政区域代码列表，之间用“逗号”隔开，注意逗号是英文半角
     */
    private String regionCodeList;
    
    /**
     * 项目类型
     */
    private String projectType;
    
    /**
     *  资金来源
     */
    private Integer fundingSource;
    
    /**
     * 联系人
     */
    private String connector;
    
    /**
     *  联系电话
     */
    private String phone;
    
    /**
     * 项目负责人
     */
    private Long projectManager;
    
    /**
     * 招标方式
     */
    private Integer purchaseType;

    /**
     * 公告开始时间；用list包含每个单元
     * 每个单元包含两部分（条件符号,时间值）
     * 例如：表示小于时间：（lt,时间值）或者（<,时间值）
     * lte（小于等于）,gt（大于）,gte（大于等于）,eq（等于）
     */
    private List<String> createTimeList;
    
    /**
     * 创建人
     */
    protected Long createUser;

    /**
     * 状态 0：未删除  1：删除
     */
    private Integer status;
    
    /**
     *每页显示的行数
     */
    private Integer pageSize;

    /**
     *当前页号
     */
    private Integer currentPage;

    /**
     * @return the projectIdList
     */
    public String getProjectIdList() {
        return this.projectIdList;
    }

    /**
     * @param projectIdList the projectIdList to set
     */
    public void setProjectIdList(String projectIdList) {
        this.projectIdList = projectIdList;
    }

    /**
     * @return the projectNumList
     */
    public String getProjectNumList() {
        return this.projectNumList;
    }

    /**
     * @param projectNumList the projectNumList to set
     */
    public void setProjectNumList(String projectNumList) {
        this.projectNumList = projectNumList;
    }

    /**
     * @return the projectNumLike
     */
    public String getProjectNumLike() {
        return this.projectNumLike;
    }

    /**
     * @param projectNumLike the projectNumLike to set
     */
    public void setProjectNumLike(String projectNumLike) {
        this.projectNumLike = projectNumLike;
    }

    /**
     * @return the projectNameList
     */
    public String getProjectNameList() {
        return this.projectNameList;
    }

    /**
     * @param projectNameList the projectNameList to set
     */
    public void setProjectNameList(String projectNameList) {
        this.projectNameList = projectNameList;
    }

    /**
     * @return the projectNameLike
     */
    public String getProjectNameLike() {
        return this.projectNameLike;
    }

    /**
     * @param projectNameLike the projectNameLike to set
     */
    public void setProjectNameLike(String projectNameLike) {
        this.projectNameLike = projectNameLike;
    }

    /**
     * @return the regionCodeList
     */
    public String getRegionCodeList() {
        return this.regionCodeList;
    }

    /**
     * @param regionCodeList the regionCodeList to set
     */
    public void setRegionCodeList(String regionCodeList) {
        this.regionCodeList = regionCodeList;
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
     * @return the createTimeList
     */
    public List<String> getCreateTimeList() {
        return this.createTimeList;
    }

    /**
     * @param createTimeList the createTimeList to set
     */
    public void setCreateTimeList(List<String> createTimeList) {
        this.createTimeList = createTimeList;
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
     * @return the pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @param pageSize the pageSize to set
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * @return the currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @param currentPage the currentPage to set
     */
    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    /**
     * @return the createUser
     */
    public Long getCreateUser() {
        return this.createUser;
    }

    /**
     * @param createUser the createUser to set
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

}
