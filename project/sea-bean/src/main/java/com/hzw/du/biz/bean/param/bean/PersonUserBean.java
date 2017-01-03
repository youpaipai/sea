/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：personUserBean.java
 * 修改时间：2016-8-3
 * 修改人：libb
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */



 	
package com.hzw.du.biz.bean.param.bean;

/**
 * <一句话功能简述> 招标人用户信息
 * <功能详细描述>
 * @author libb
 * @version V1.0[产品/模块版本]
 */
public class PersonUserBean
{
    /* ******************************************************************************************* */
    /*                                       序列化代码区域                                                                                               */
    /* ******************************************************************************************* */

    /* ******************************************************************************************* */
    /*                                       全局变量声明区域                                                                                           */
    /* ******************************************************************************************* */

    /**
     * PERSONUSERID    NUMBER  N           招标人用户ID
     */
    private Long personUserId;
    
    /**
     * ORGANIZATIONID  NUMBER  Y           组织机构ID（招标人）
     */
    private Long organizationId;
    
    /**
     * USERID  NUMBER  Y           用户ID
     */
    private Long userId;
    
    /**
     * CARDFILE    NUMBER  Y           名片文件
     */
    private Long cardFile;
    
    /**
     * 名片文件名称
     */
    private String cardFileName;
    
    /**
     * STATUS  NUMBER  Y           状态 0未删除  1删除
     */
    private Integer status;
    
    /* ******************************************************************************************* */
    /*                                       公共函数声明区域                                                                                           */
    /* ******************************************************************************************* */
    
    public Long getPersonUserId()
    {
        return personUserId;
    }
    
    public void setPersonUserId(Long personUserId)
    {
        this.personUserId = personUserId;
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
