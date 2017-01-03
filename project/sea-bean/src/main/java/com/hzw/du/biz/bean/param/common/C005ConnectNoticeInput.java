/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：项目立项输入参数
 * 文件名称：C005ConnectNoticeInput.java
 * 修改时间：2016年7月23日
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
 * 项目立项输入参数
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class C005ConnectNoticeInput extends BaseCommonInput {

    public C005ConnectNoticeInput() {
        functionCode = CommonBizFunCode.CONNECT_NOTICE_C005;
    }

    /**
     * 公告编号id列表，之间用“逗号”隔开，注意逗号是英文半角
     */
    private String noticeIdList;

    /**
     * 招标项目id列表，之间用“逗号”隔开，注意逗号是英文半角
     */
    private String tenderProjectIdList;

    /**
     * 标段id列表
     */
    private String subIdList;

    /**
     * 标题
     */
    private String title;
    
    /**
     * 标题；模糊查询使用
     */
    private String likeTitle;

    /**
     * 公告类型 1:招标公告 2:更正公告 3:中标公告 4.中标候选人公示；多个类型用逗号隔开
     */
    private String noticeTypeList;
    
    /**
     * 公告性质:1正常公告、2更正公告、9其他；多个公告性质用逗号隔开
     */
    private String noticeNatureList;
    
    /**
     * 行业类别list，多个类别可用逗号隔开
     */
    private String projectTypeList;

    /**
     * 公告开始时间；用list包含每个单元
     * 每个单元包含两部分（条件符号,时间值）
     * 例如：表示小于时间：（lt,时间值）或者（<,时间值）
     * lte（小于等于）,gt（大于）,gte（大于等于）,eq（等于）
     */
    private List<String> startTimeList;
    
    /**
     * 公告截止时间；用list包含每个单元
     * 每个单元包含两部分（条件符号,时间值）
     * 例如：表示小于时间：（lt,时间值）或者（<,时间值）
     * lte（小于等于）,gt（大于）,gte（大于等于）,eq（等于）
     */
    private List<String>  endTimeList;
    
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
     * @return the subIdList
     */
    public String getSubIdList() {
        return this.subIdList;
    }

    /**
     * @param subIdList the subIdList to set
     */
    public void setSubIdList(String subIdList) {
        this.subIdList = subIdList;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the likeTitle
     */
    public String getLikeTitle() {
        return this.likeTitle;
    }

    /**
     * @param likeTitle the likeTitle to set
     */
    public void setLikeTitle(String likeTitle) {
        this.likeTitle = likeTitle;
    }

    /**
     * @return the noticeTypeList
     */
    public String getNoticeTypeList() {
        return this.noticeTypeList;
    }

    /**
     * @param noticeTypeList the noticeTypeList to set
     */
    public void setNoticeTypeList(String noticeTypeList) {
        this.noticeTypeList = noticeTypeList;
    }

    /**
     * @return the noticeNatureList
     */
    public String getNoticeNatureList() {
        return this.noticeNatureList;
    }

    /**
     * @param noticeNatureList the noticeNatureList to set
     */
    public void setNoticeNatureList(String noticeNatureList) {
        this.noticeNatureList = noticeNatureList;
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
     * @return the noticeIdList
     */
    public String getNoticeIdList() {
        return this.noticeIdList;
    }

    /**
     * @param noticeIdList the noticeIdList to set
     */
    public void setNoticeIdList(String noticeIdList) {
        this.noticeIdList = noticeIdList;
    }

    /**
     * @return the startTimeList
     */
    public List<String> getStartTimeList() {
        return this.startTimeList;
    }

    /**
     * @param startTimeList the startTimeList to set
     */
    public void setStartTimeList(List<String> startTimeList) {
        this.startTimeList = startTimeList;
    }

    /**
     * @return the endTimeList
     */
    public List<String> getEndTimeList() {
        return this.endTimeList;
    }

    /**
     * @param endTimeList the endTimeList to set
     */
    public void setEndTimeList(List<String> endTimeList) {
        this.endTimeList = endTimeList;
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
     * @return the projectTypeList
     */
    public String getProjectTypeList() {
        return this.projectTypeList;
    }

    /**
     * @param projectTypeList the projectTypeList to set
     */
    public void setProjectTypeList(String projectTypeList) {
        this.projectTypeList = projectTypeList;
    }

}
