/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：C035HelpDetail.java
 * 修改时间：2016-8-5
 * 修改人：libb
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */



 	
package com.hzw.du.biz.bean.param.common;

/**
 * <一句话功能简述> 帮助信息
 * <功能详细描述>
 * @author libb
 * @version V1.0[产品/模块版本]
 */
public class C035HelpDetail
{
    /* ******************************************************************************************* */
    /*                                       序列化代码区域                                                                                               */
    /* ******************************************************************************************* */

    /* ******************************************************************************************* */
    /*                                       全局变量声明区域                                                                                           */
    /* ******************************************************************************************* */

    /**
     * HELPID  NUMBER  N           帮助编号
     */
    private Long helpId;
    
    /***
     * TITLE   VARCHAR2(200)   Y           帮助标题
     */
    private String title;
    
    /**
     * CONTENT VARCHAR2(4000)  Y           帮助内容
     */
    private String content;
    
    /**
     * TYPE    NUMBER  Y           帮助分类
     */
    private Integer type;
    
    /**
     * STATUS  NUMBER  Y           状态 0：未删除  1：删除
     */
    private Integer status;
    
    /* ******************************************************************************************* */
    /*                                       公共函数声明区域                                                                                           */
    /* ******************************************************************************************* */

    public Long getHelpId()
    {
        return helpId;
    }

    public void setHelpId(Long helpId)
    {
        this.helpId = helpId;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public Integer getType()
    {
        return type;
    }

    public void setType(Integer type)
    {
        this.type = type;
    }

    public Integer getStatus()
    {
        return status;
    }

    public void setStatus(Integer status)
    {
        this.status = status;
    }
    
    /* ******************************************************************************************* */
    /*                                       私有函数声明区域                                                                                           */
    /* ******************************************************************************************* */
}
