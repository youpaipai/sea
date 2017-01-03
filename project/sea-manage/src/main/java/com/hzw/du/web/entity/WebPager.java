/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：网页分页器
 * 文件名称：WebPager.java
 * 修改时间：2016年7月30日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.web.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * 网页分页器
 * <功能详细描述>
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class WebPager {
    
    //默认显示多少页
    private final static int SHOW_TOTAL_PAGES = 10;
    //默认每页显示的记录数
    public final static int SHOW_PER_PAGE_ROWS = 10;
    
    /**
     * 显示的页数数量，每次只显示当前页前5页、当前页后4页，正好10页，算法为居中显示两端页数
     */
    private int showTotalPages = SHOW_TOTAL_PAGES;
    
    /**
     * 总行数
     */
    private int totalRows;

    /**
     *每页显示的行数
     */
    private int pageRows = SHOW_PER_PAGE_ROWS;

    /**
     *当前页号
     */
    private int currentPage = 1;
    
    /**
     *总页数
     */
    private int totalPages;
    
    /**
     * 要调用的地址
     */
    private String relativeUrl;
    
    /**
     * 要显示的页数列表,算法为居中显示两端页数
     * 已10为准，每次只显示当前页前5页、当前页后4页，正好10页，也要考虑首页、和尾页
     */
    private List<Integer> showPagesList = new ArrayList<Integer>();
    
    /**
     * 
     * 函数功能描述：创建分页对象，并进行分页
     * @param totalRows
     * @param currentPage
     * @return
     */
    public static WebPager factoryBuilderPager(int totalRows, int currentPage){
        return factoryBuilderPager(totalRows, currentPage, SHOW_PER_PAGE_ROWS);
    }
    /**
     * 
     * 函数功能描述：创建分页对象，并进行分页
     * @param totalRows
     * @param currentPage
     * @return
     */
    public static WebPager factoryBuilderPager(Integer totalRows, Integer currentPage){
        return factoryBuilderPager(totalRows, currentPage, SHOW_PER_PAGE_ROWS);
    }
    /**
     * 
     * 函数功能描述：创建分页对象，并进行分页
     * @param totalRows
     * @param currentPage
     * @return
     */
    public static WebPager factoryBuilderPager(int totalRows, int currentPage, int pageRows){
        //1、创建分页对象，并赋初始值
        WebPager pager = new WebPager();
        pager.setTotalRows(totalRows);
        pager.setCurrentPage(currentPage);
        pager.setPageRows(pageRows);
        //2、计算总页数、要显示的页数
        pager.calculatePages();
        
        return pager;
    }
    /**
     * 
     * 函数功能描述：创建分页对象，并进行分页
     * @param totalRows
     * @param currentPage
     * @return
     */
    public static WebPager factoryBuilderPager(Integer totalRows, Integer currentPage, Integer pageRows){
        int _totalRows = 0;
        if(totalRows != null){
            _totalRows = totalRows;
        }
        int _currentPage = 0;
        if(currentPage != null){
            _currentPage = currentPage;
        }
        int _pageRows = SHOW_PER_PAGE_ROWS;
        if(pageRows != null){
            _pageRows = pageRows;
        }
        return factoryBuilderPager(_totalRows, _currentPage, _pageRows);
    }
    /**
     * 
     * 函数功能描述：创建分页对象，并进行分页
     * @param totalRows
     * @param currentPage
     * @return
     */
    public static WebPager factoryBuilderPager(Integer totalRows, Integer currentPage, int pageRows){
        int _totalRows = 0;
        if(totalRows != null){
            _totalRows = totalRows;
        }
        int _currentPage = 0;
        if(currentPage != null){
            _currentPage = currentPage;
        }
        return factoryBuilderPager(_totalRows, _currentPage, pageRows);
    }
    /**
     * 
     * 函数功能描述：创建分页对象，并进行分页
     * @param totalRows
     * @param currentPage
     * @return
     */
    public static WebPager factoryBuilderPager(int totalRows, int currentPage, String relativeUrl){
        
        WebPager pager = factoryBuilderPager(totalRows, currentPage);
        pager.setRelativeUrl(relativeUrl);
        
        return pager;
    }
    /**
     * 
     * 函数功能描述：创建分页对象，并进行分页
     * @param totalRows
     * @param currentPage
     * @return
     */
    public static WebPager factoryBuilderPager(Integer totalRows, Integer currentPage, String relativeUrl){
        WebPager pager = factoryBuilderPager(totalRows, currentPage);
        pager.setRelativeUrl(relativeUrl);
        
        return pager;
    }
    
    /**
     * 函数功能描述：计算当前分页对象的页数，等等
     */
    public void calculatePages(){
        if(getTotalRows() <= 0){
            setTotalRows(0);
        }
        if(getCurrentPage() <= 0){
            setCurrentPage(1);
        }
        
        if(getPageRows() <= 0){
            setPageRows(SHOW_PER_PAGE_ROWS);
        }
        //计算总页数
        int totalPages = (totalRows + getPageRows() - 1) / getPageRows();
        setTotalPages(totalPages);
        if(getCurrentPage() > totalPages){
            setCurrentPage(totalPages);
        }
        //计算要显示哪些页数
        if(getShowTotalPages() <= 0){
            setShowTotalPages(SHOW_TOTAL_PAGES);
        }
        //开始页
        int startPages = getCurrentPage() - ((getShowTotalPages() + 1)/2) ;
        //结束页
        int endPages = getCurrentPage() + ((getShowTotalPages() - 1)/2);
        //如果开始页小于0，那么把开始页变成整数添加到之后显示的总页数中
        if(startPages <= 0){
            endPages += 0 - startPages;
            startPages = 1;
        }
        if(endPages > totalPages){
            endPages = totalPages;
        }
        getShowPagesList().clear();
        for(int i= startPages; i <= endPages; i++){
            getShowPagesList().add(i);
        }
    }

    /**
     * @return the showTotalPages
     */
    public int getShowTotalPages() {
        return this.showTotalPages;
    }

    /**
     * @param showTotalPages the showTotalPages to set
     */
    public void setShowTotalPages(int showTotalPages) {
        this.showTotalPages = showTotalPages;
    }

    /**
     * @return the totalRows
     */
    public int getTotalRows() {
        return this.totalRows;
    }

    /**
     * @param totalRows the totalRows to set
     */
    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    /**
     * @return the currentPage
     */
    public int getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @param currentPage the currentPage to set
     */
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    /**
     * @return the totalPages
     */
    public int getTotalPages() {
        return this.totalPages;
    }

    /**
     * @param totalPages the totalPages to set
     */
    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    /**
     * @return the showPagesList
     */
    public List<Integer> getShowPagesList() {
        return this.showPagesList;
    }

    /**
     * @param showPagesList the showPagesList to set
     */
    public void setShowPagesList(List<Integer> showPagesList) {
        this.showPagesList = showPagesList;
    }

    /**
     * @return the pageRows
     */
    public int getPageRows() {
        return this.pageRows;
    }

    /**
     * @param pageRows the pageRows to set
     */
    public void setPageRows(int pageRows) {
        this.pageRows = pageRows;
    }
    /**
     * @return the relativeUrl
     */
    public String getRelativeUrl() {
        return this.relativeUrl;
    }
    /**
     * @param relativeUrl the relativeUrl to set
     */
    public void setRelativeUrl(String relativeUrl) {
        this.relativeUrl = relativeUrl;
    }
    
    
}
