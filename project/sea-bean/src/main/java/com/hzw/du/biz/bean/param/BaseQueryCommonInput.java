/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：基础查询功能输入参数
 * 文件名称：BaseQueryCommonInput.java
 * 修改时间：2016年7月26日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.biz.bean.param;

import java.util.List;

/**
 * 基础查询功能输入参数
 * <功能详细描述>
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class BaseQueryCommonInput extends BaseCommonInput{
    
    /**
     * 状态 0：未删除  1：删除
     */
    protected Integer status;
    
    /**
     *每页显示的行数
     */
    protected Integer pageSize;

    /**
     *当前页号
     */
    protected Integer currentPage;
    
    /**
     * 创建时间
     * 用list包含每个单元
     * 每个单元包含两部分（条件符号,时间值）
     * 例如：表示小于时间：（lt,时间值）或者（<,时间值）
     * lte（小于等于）,gt（大于）,gte（大于等于）,eq（等于）
     */
    protected List<String> createTimeList;

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
    
}
