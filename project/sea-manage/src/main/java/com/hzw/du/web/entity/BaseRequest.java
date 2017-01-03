/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 文件名称：BaseRequest.java
 * 修改时间：2016年4月15日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
 	
package com.hzw.du.web.entity;

/**
 * 基础请求父基础bean
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class BaseRequest{
    /**
     * 网页标题title
     */
    private String title;
    
    /**
     *分页查询时，当前页号
     */
    private int currentPage = 1;
    
    /**
     * 版本号，留给静态文件引入用
     */
    private String version;
    
    /**
     * 
     */
    private String userName;

    
    public int getCurrentPage()
    {
        return currentPage;
    }

    public void setCurrentPage(int currentPage)
    {
        this.currentPage = currentPage;
    }

    /**
     * @return the title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title)
    {
        this.title = title;
    }

    /**
     * @return the version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

}
