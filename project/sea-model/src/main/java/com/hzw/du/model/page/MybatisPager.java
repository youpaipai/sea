/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：页面通用类
 * 文件名称：Pager.java
 * 修改时间：2016-3-7
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.page;

import java.io.Serializable;

/**
 * <一句话功能简述> 分页实体类
 * <功能详细描述>
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class MybatisPager implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private static int PAGE_SIZE = 10;

    /**
     * 总行数
     */
    private int totalRows;

    /**
     *每页显示的行数
     */
    private int pageSize = PAGE_SIZE;

    /**
     *当前页号
     */
    private int currentPage = 1;

    /**
     *总页数
     */
    private int totalPages;

    /**
     *当前页在数据库中的起始行
     */
    private int startRow = 0;

    /**
     *结束行 此为oracle查询需要增加
     */
    private int endRow;
    
    /**
     * 是否查询总记录数，默认true（查询），false（不查询）
     */
    private boolean queryTotalRowsFlag = true;


    public int getTotalRows() {
        return totalRows;
    }

    public MybatisPager() {
    }

    public MybatisPager(int _totalRows) {
        totalRows = _totalRows;
        totalPages = (totalRows + pageSize -1)/pageSize;
    }
    /**
     * 根据当前页数生成Page对象
     * @param currentPage 当前第几页，默认每页10条数据
     * @return
     */
    public static MybatisPager factoryPageByPageSize(int currentPage){
        return factoryPageByPageSize(currentPage, PAGE_SIZE);
    }
    
    /**
     * 根据当前页数生成Page对象
     * @param currentPage 当前第几页，默认每页10条数据
     * @return
     */
    public static MybatisPager factoryPageByPageSize(Integer currentPage){
        int _currentPage = 0;
        if( currentPage == null){
            _currentPage = 1;
        }else{
            _currentPage = currentPage;
        }
        return factoryPageByPageSize(_currentPage, PAGE_SIZE);
    }
    
    /**
     * 根据当前页数生成Page对象
     * @param pageSize 当前页，从1开始
     * @param currentPage
     * @return
     */
    public static MybatisPager factoryPageByPageSize(int currentPage, int pageSize){
        MybatisPager page = new MybatisPager();
        page.setPageSize(pageSize);
        page.setCurrentPage(currentPage);
        page.setStartRow(pageSize * (currentPage - 1));
        page.setEndRow(pageSize * currentPage);
        return page;
    }
    
    /**
     * 根据当前页数生成Page对象
     * @param pageSize 当前页，从1开始
     * @param currentPage
     * @return
     */
    public static MybatisPager factoryPageByPageSize(Integer currentPage, Integer pageSize){
        if(currentPage == null){
            currentPage = 1;
        }
        if(pageSize == null){
            pageSize = Integer.MAX_VALUE;
        }
        MybatisPager page = new MybatisPager();
        page.setPageSize(pageSize);
        page.setCurrentPage(currentPage);
        page.setStartRow(pageSize * (currentPage - 1));
        page.setEndRow(pageSize * currentPage);
        return page;
    }
    
    /**
     * 
     * 根据开始、结束行生成Page对象
     * @param startRow 开始行
     * @param endRow 结束行
     * @return
     */
    public static MybatisPager factoryPageByRows(int startRow, int endRow){
        MybatisPager page = new MybatisPager();
        page.setStartRow(startRow);
        page.setEndRow(endRow);
        
        return page;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getStartRow() {
        return (currentPage - 1) * pageSize;
    }

    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }

    public int getEndRow() {
        return pageSize * currentPage;
    }

    public void setEndRow(int endRow) {
        this.endRow = endRow;
    }

    /**
     * 函数功能描述：首页
     */
    public void first() {
        currentPage = 1;
        startRow = 0;
    }

    /**
     * 函数功能描述：上一页
     */
    public void previous() {
        if (currentPage == 1 || currentPage == 0) {
            return;
        }

        currentPage--;

        startRow = (currentPage - 1) * pageSize;
    }

    /**
     * 函数功能描述：下一页 
     */
    public void next() {
        if (currentPage < totalPages) {
            currentPage++;
        }
        startRow = (currentPage - 1) * pageSize;
    }

    /**
     * 函数功能描述：最后一页  
     */
    public void last() {
        currentPage = totalPages;
        startRow = (currentPage - 1) * pageSize;
    }

    /**
     * 函数功能描述：定位页面
     */
    public void locationPage() {
        startRow = (currentPage - 1) * pageSize;
    }

    @Override
    public String toString() {
        return "Pager [totalRows=" + totalRows + ", pageSize=" + pageSize + ", currentPage="
                + currentPage + ", totalPages=" + totalPages + ", startRow=" + startRow
                + ", endRow=" + endRow + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + currentPage;
        result = prime * result + endRow;
        result = prime * result + pageSize;
        result = prime * result + startRow;
        result = prime * result + totalPages;
        result = prime * result + totalRows;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        MybatisPager other = (MybatisPager) obj;
        if (currentPage != other.currentPage) return false;
        if (endRow != other.endRow) return false;
        if (pageSize != other.pageSize) return false;
        if (startRow != other.startRow) return false;
        if (totalPages != other.totalPages) return false;
        if (totalRows != other.totalRows) return false;
        return true;
    }

    /**
     * @return the queryTotalRowsFlag
     */
    public boolean isQueryTotalRowsFlag() {
        return this.queryTotalRowsFlag;
    }

    /**
     * @param queryTotalRowsFlag the queryTotalRowsFlag to set
     */
    public void setQueryTotalRowsFlag(boolean queryTotalRowsFlag) {
        this.queryTotalRowsFlag = queryTotalRowsFlag;
    }
}
