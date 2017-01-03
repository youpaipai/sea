/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：SupplierUserBean.java
 * 修改时间：2016-8-3
 * 修改人：libb
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */



 	
package com.hzw.du.biz.bean.param.bean;

/**
 * <一句话功能简述> 供应商用户信息
 * <功能详细描述>
 * @author libb
 * @version V1.0[产品/模块版本]
 */
public class SupplierUserBean
{
    /* ******************************************************************************************* */
    /*                                       序列化代码区域                                                                                               */
    /* ******************************************************************************************* */

    /* ******************************************************************************************* */
    /*                                       全局变量声明区域                                                                                           */
    /* ******************************************************************************************* */

    /**
     * SUPPLIERUSERID  NUMBER  N           供应商用户ID
     */
    private Long supplierUserId;

    /**
     * ORGANIZATIONID  NUMBER  Y           组织机构ID（供应商）
     */
    private Long organizationId;

    /**
     * USERID  NUMBER  Y           用户ID
     */
    private Long userId;

    /**
     * PERSONFILE  NUMBER  Y           法人代表授权书文件
     */
    private Long personFile;
    
    /**
     * 法人代表授权书文件名称
     */
    private String personFileName;

    /**
     * CARDFILE    NUMBER  Y           名片文件
     */
    private Long cardFile;
    
    /**
     * 名片文件名称
     */
    private String cardFileName;

    /**
     * STATUS  NUMBER  Y           状态 0：未删除 1:删除
     */
    private Integer status;
    
    /* ******************************************************************************************* */
    /*                                       公共函数声明区域                                                                                           */
    /* ******************************************************************************************* */
    
    public Long getSupplierUserId()
    {
        return supplierUserId;
    }
    
    public void setSupplierUserId(Long supplierUserId)
    {
        this.supplierUserId = supplierUserId;
    }
    
    public Long getOrganizationId()
    {
        return organizationId;
    }
    
    public void setOrganizationId(Long organizationId)
    {
        this.organizationId = organizationId;
    }
    
    public Long getUserId()
    {
        return userId;
    }
    
    public void setUserId(Long userId)
    {
        this.userId = userId;
    }
    
    public Long getPersonFile()
    {
        return personFile;
    }
    
    public void setPersonFile(Long personFile)
    {
        this.personFile = personFile;
    }
    
    public String getPersonFileName()
    {
        return personFileName;
    }

    public void setPersonFileName(String personFileName)
    {
        this.personFileName = personFileName;
    }

    public Long getCardFile()
    {
        return cardFile;
    }
    
    public void setCardFile(Long cardFile)
    {
        this.cardFile = cardFile;
    }
    
    public String getCardFileName()
    {
        return cardFileName;
    }

    public void setCardFileName(String cardFileName)
    {
        this.cardFileName = cardFileName;
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
