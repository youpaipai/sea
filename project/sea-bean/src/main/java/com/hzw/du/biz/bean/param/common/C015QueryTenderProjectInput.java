/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：招标人（代理机构）招标项目查询，输入参数
 * 文件名称：C015ProjectArrpovalInput.java
 * 修改时间：2016年7月26日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.biz.bean.param.common;

import com.hzw.du.biz.bean.constant.CommonBizFunCode;
import com.hzw.du.biz.bean.param.BaseQueryCommonInput;

/**
 * 招标人（代理机构）招标项目查询，输入参数
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class C015QueryTenderProjectInput extends BaseQueryCommonInput {

    public C015QueryTenderProjectInput() {
        functionCode = CommonBizFunCode.QUERY_TENDER_PROJECT_C015;
    }
    
    /**
     * 招标项目id列表，之间用“逗号”隔开，注意逗号是英文半角
     */
    private String tenderProjectIdList;
    
    /**
     * 所属项目id列表
     */
    private String projectIdList;
    
    /**
     * 招标项目编号列表，之间用“逗号”隔开，注意逗号是英文半角
     */
    private String tenderProjectNumList;

    /**
     * 招标项目编号；模糊查询使用
     */
    private String tenderProjectNumLike;

    /**
     * 招标项目名称列表，之间用“逗号”隔开，注意逗号是英文半角
     */
    private String tenderProjectNameList;
    
    /**
     * 招标项目名称；模糊查询使用
     */
    private String tenderProjectNameLike;
    
    /**
     * 监督部门id列表，之间用“逗号”隔开，注意逗号是英文半角
     */
    private String orgSuperviseDeptIdList;
    
    /**
     * 审核部门id列表，之间用“逗号”隔开，注意逗号是英文半角
     */
    private String orgApproveDeptIdList;
    
    /**
     * 招标人id列表，之间用“逗号”隔开，注意逗号是英文半角
     */
    private String tenderIdList;
    
    /**
     * 招标方式列表，之间用“逗号”隔开，注意逗号是英文半角
     */
    private String tenderModeList;
    
    /**
     * 招标组织形式列表，之间用“逗号”隔开，注意逗号是英文半角
     */
    private String tenderOrganziFormList;
    
    /**
     * 创建人ID列表，之间用“逗号”隔开，注意逗号是英文半角
     */
    private String userIdList;
    
    /**
     * 是否查询标段数量，0不查询、1查询
     */
    private String querySubNumFlag;
    
    /**
     * 是否查询发布公告数量，0不查询、1查询
     */
    private String queryPushNoticeFlag;
    
    /**
     * 是否查询补充公告数量，0不查询、1查询
     */
    private String queryChangeNoticeFlag;
    
    /**
     * 是否查询参标供应商数，0不查询、1查询
     */
    private String querySupplierFlag;
    
    /**
     * 招标项目类型
     */
    private String tenderProjectType;

    /**
     * @return the tenderProjectIdList
     */
    public String getTenderProjectIdList() {
        return this.tenderProjectIdList;
    }

    /**
     * @param tenderProjectIdList the tenderProjectIdList to set
     */
    public void setTenderProjectIdList(String tenderProjectIdList) {
        this.tenderProjectIdList = tenderProjectIdList;
    }

    /**
     * @return the tenderProjectNumList
     */
    public String getTenderProjectNumList() {
        return this.tenderProjectNumList;
    }

    /**
     * @param tenderProjectNumList the tenderProjectNumList to set
     */
    public void setTenderProjectNumList(String tenderProjectNumList) {
        this.tenderProjectNumList = tenderProjectNumList;
    }

    /**
     * @return the tenderProjectNumLike
     */
    public String getTenderProjectNumLike() {
        return this.tenderProjectNumLike;
    }

    /**
     * @param tenderProjectNumLike the tenderProjectNumLike to set
     */
    public void setTenderProjectNumLike(String tenderProjectNumLike) {
        this.tenderProjectNumLike = tenderProjectNumLike;
    }

    /**
     * @return the tenderProjectNameList
     */
    public String getTenderProjectNameList() {
        return this.tenderProjectNameList;
    }

    /**
     * @param tenderProjectNameList the tenderProjectNameList to set
     */
    public void setTenderProjectNameList(String tenderProjectNameList) {
        this.tenderProjectNameList = tenderProjectNameList;
    }

    /**
     * @return the tenderProjectNameLike
     */
    public String getTenderProjectNameLike() {
        return this.tenderProjectNameLike;
    }

    /**
     * @param tenderProjectNameLike the tenderProjectNameLike to set
     */
    public void setTenderProjectNameLike(String tenderProjectNameLike) {
        this.tenderProjectNameLike = tenderProjectNameLike;
    }

    /**
     * @return the orgSuperviseDeptIdList
     */
    public String getOrgSuperviseDeptIdList() {
        return this.orgSuperviseDeptIdList;
    }

    /**
     * @param orgSuperviseDeptIdList the orgSuperviseDeptIdList to set
     */
    public void setOrgSuperviseDeptIdList(String orgSuperviseDeptIdList) {
        this.orgSuperviseDeptIdList = orgSuperviseDeptIdList;
    }

    /**
     * @return the orgApproveDeptIdList
     */
    public String getOrgApproveDeptIdList() {
        return this.orgApproveDeptIdList;
    }

    /**
     * @param orgApproveDeptIdList the orgApproveDeptIdList to set
     */
    public void setOrgApproveDeptIdList(String orgApproveDeptIdList) {
        this.orgApproveDeptIdList = orgApproveDeptIdList;
    }

    /**
     * @return the tenderIdList
     */
    public String getTenderIdList() {
        return this.tenderIdList;
    }

    /**
     * @param tenderIdList the tenderIdList to set
     */
    public void setTenderIdList(String tenderIdList) {
        this.tenderIdList = tenderIdList;
    }

    /**
     * @return the tenderModeList
     */
    public String getTenderModeList() {
        return this.tenderModeList;
    }

    /**
     * @param tenderModeList the tenderModeList to set
     */
    public void setTenderModeList(String tenderModeList) {
        this.tenderModeList = tenderModeList;
    }

    /**
     * @return the tenderOrganziFormList
     */
    public String getTenderOrganziFormList() {
        return this.tenderOrganziFormList;
    }

    /**
     * @param tenderOrganziFormList the tenderOrganziFormList to set
     */
    public void setTenderOrganziFormList(String tenderOrganziFormList) {
        this.tenderOrganziFormList = tenderOrganziFormList;
    }

    /**
     * @return the userIdList
     */
    public String getUserIdList() {
        return this.userIdList;
    }

    /**
     * @param userIdList the userIdList to set
     */
    public void setUserIdList(String userIdList) {
        this.userIdList = userIdList;
    }

    /**
     * @return the querySubNumFlag
     */
    public String getQuerySubNumFlag() {
        return this.querySubNumFlag;
    }

    /**
     * @param querySubNumFlag the querySubNumFlag to set
     */
    public void setQuerySubNumFlag(String querySubNumFlag) {
        this.querySubNumFlag = querySubNumFlag;
    }

    /**
     * @return the queryPushNoticeFlag
     */
    public String getQueryPushNoticeFlag() {
        return this.queryPushNoticeFlag;
    }

    /**
     * @param queryPushNoticeFlag the queryPushNoticeFlag to set
     */
    public void setQueryPushNoticeFlag(String queryPushNoticeFlag) {
        this.queryPushNoticeFlag = queryPushNoticeFlag;
    }

    /**
     * @return the queryChangeNoticeFlag
     */
    public String getQueryChangeNoticeFlag() {
        return this.queryChangeNoticeFlag;
    }

    /**
     * @param queryChangeNoticeFlag the queryChangeNoticeFlag to set
     */
    public void setQueryChangeNoticeFlag(String queryChangeNoticeFlag) {
        this.queryChangeNoticeFlag = queryChangeNoticeFlag;
    }

    /**
     * @return the querySupplierFlag
     */
    public String getQuerySupplierFlag() {
        return this.querySupplierFlag;
    }

    /**
     * @param querySupplierFlag the querySupplierFlag to set
     */
    public void setQuerySupplierFlag(String querySupplierFlag) {
        this.querySupplierFlag = querySupplierFlag;
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
     * @return the tenderProjectType
     */
    public String getTenderProjectType() {
        return this.tenderProjectType;
    }

    /**
     * @param tenderProjectType the tenderProjectType to set
     */
    public void setTenderProjectType(String tenderProjectType) {
        this.tenderProjectType = tenderProjectType;
    }

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
    
}
