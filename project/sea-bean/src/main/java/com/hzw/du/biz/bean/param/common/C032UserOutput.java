/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：C032UserOutput.java
 * 修改时间：2016-8-4
 * 修改人：libb
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */



 	
package com.hzw.du.biz.bean.param.common;

import com.hzw.du.biz.bean.constant.CommonBizFunCode;
import com.hzw.du.biz.bean.param.BaseCommonOutput;

/**
 * <一句话功能简述> 个人中心输出参数
 * <功能详细描述>
 * @author libb
 * @version V1.0[产品/模块版本]
 */
public class C032UserOutput extends BaseCommonOutput
{
    /* ******************************************************************************************* */
    /*                                       序列化代码区域                                                                                               */
    /* ******************************************************************************************* */

    /* ******************************************************************************************* */
    /*                                       全局变量声明区域                                                                                           */
    /* ******************************************************************************************* */
    
    /**
     * 新注册用户个数（系统管理员）
     */
    private Integer newUserCount;

    /**
     * 用户信息变更个数（系统管理员）
     */
    private Integer modifyUserCount;

    /**
     * 新注册招标人个数（系统管理员）
     */
    private Integer newPersonCount;

    /**
     * 招标人信息变更个数（系统管理员）
     */
    private Integer modifyPersonCount;

    /**
     * 新注册供应商个数 （系统管理员）
     */
    private Integer newSupplierCount;

    /**
     * 供应商信息变更个数（系统管理员）
     */
    private Integer modifySupplierCount;

    /**
     * 新注册代理机构个数（系统管理员）
     */
    private Integer newAgencyCount;

    /**
     * 代理机构信息变更个数（系统管理员）
     */
    private Integer modifyAgencyCount;
    
    /**
     * 近期待开标项目个数（代理机构、招标人、监管机构、专家）
     */
    private Integer toBidCount;
    
    /**
     * 供应商标书费待审核个数（代理机构、招标人）
     */
    private Integer toAuditCount;
    
    /**
     * 供应商保证金待退还项目个数（代理机构、招标人、供应商）
     */
    private Integer toReturnCount;

    
    /* ******************************************************************************************* */
    /*                                       公共函数声明区域                                                                                           */
    /* ******************************************************************************************* */
    
    public C032UserOutput()
    {
        functionCode = CommonBizFunCode.USER_C032;
    }

    public Integer getNewUserCount()
    {
        return newUserCount;
    }

    public void setNewUserCount(Integer newUserCount)
    {
        this.newUserCount = newUserCount;
    }

    public Integer getModifyUserCount()
    {
        return modifyUserCount;
    }

    public void setModifyUserCount(Integer modifyUserCount)
    {
        this.modifyUserCount = modifyUserCount;
    }

    public Integer getNewPersonCount()
    {
        return newPersonCount;
    }

    public void setNewPersonCount(Integer newPersonCount)
    {
        this.newPersonCount = newPersonCount;
    }

    public Integer getModifyPersonCount()
    {
        return modifyPersonCount;
    }

    public void setModifyPersonCount(Integer modifyPersonCount)
    {
        this.modifyPersonCount = modifyPersonCount;
    }

    public Integer getNewSupplierCount()
    {
        return newSupplierCount;
    }

    public void setNewSupplierCount(Integer newSupplierCount)
    {
        this.newSupplierCount = newSupplierCount;
    }

    public Integer getModifySupplierCount()
    {
        return modifySupplierCount;
    }

    public void setModifySupplierCount(Integer modifySupplierCount)
    {
        this.modifySupplierCount = modifySupplierCount;
    }

    public Integer getNewAgencyCount()
    {
        return newAgencyCount;
    }

    public void setNewAgencyCount(Integer newAgencyCount)
    {
        this.newAgencyCount = newAgencyCount;
    }

    public Integer getModifyAgencyCount()
    {
        return modifyAgencyCount;
    }

    public void setModifyAgencyCount(Integer modifyAgencyCount)
    {
        this.modifyAgencyCount = modifyAgencyCount;
    }

    public Integer getToBidCount()
    {
        return toBidCount;
    }

    public void setToBidCount(Integer toBidCount)
    {
        this.toBidCount = toBidCount;
    }

    public Integer getToAuditCount()
    {
        return toAuditCount;
    }

    public void setToAuditCount(Integer toAuditCount)
    {
        this.toAuditCount = toAuditCount;
    }

    public Integer getToReturnCount()
    {
        return toReturnCount;
    }

    public void setToReturnCount(Integer toReturnCount)
    {
        this.toReturnCount = toReturnCount;
    }

    /* ******************************************************************************************* */
    /*                                       私有函数声明区域                                                                                           */
    /* ******************************************************************************************* */
}
