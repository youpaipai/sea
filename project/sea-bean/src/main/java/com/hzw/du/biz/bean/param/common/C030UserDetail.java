/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：C030UserDetail.java
 * 修改时间：2016-8-4
 * 修改人：libb
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */



 	
package com.hzw.du.biz.bean.param.common;

/**
 * <一句话功能简述> 组织机构信息
 * <功能详细描述>
 * @author libb
 * @version V1.0[产品/模块版本]
 */
public class C030UserDetail
{
    /* ******************************************************************************************* */
    /*                                       序列化代码区域                                                                                               */
    /* ******************************************************************************************* */

    /* ******************************************************************************************* */
    /*                                       全局变量声明区域                                                                                           */
    /* ******************************************************************************************* */

    /**
     * ORGANIZATIONID  NUMBER  N           组织机构ID
     */
    private Long organizationId;
    
    /**
     * ORGANIZATIONNAME    VARCHAR2(100)   Y           组织编号名称
     */
    private String organizationName;
    
    /**
     * TYPE    NUMBER(1)   Y           组织分类
     */
    private Integer type;

    public Long getOrganizationId()
    {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId)
    {
        this.organizationId = organizationId;
    }

    public String getOrganizationName()
    {
        return organizationName;
    }

    public void setOrganizationName(String organizationName)
    {
        this.organizationName = organizationName;
    }

    public Integer getType()
    {
        return type;
    }

    public void setType(Integer type)
    {
        this.type = type;
    }
    
    /* ******************************************************************************************* */
    /*                                       公共函数声明区域                                                                                           */
    /* ******************************************************************************************* */

    /* ******************************************************************************************* */
    /*                                       私有函数声明区域                                                                                           */
    /* ******************************************************************************************* */
}
