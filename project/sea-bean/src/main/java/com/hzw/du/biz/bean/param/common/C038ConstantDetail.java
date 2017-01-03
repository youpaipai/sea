/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：C038ConstantDetail.java
 * 修改时间：2016-8-5
 * 修改人：libb
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */



 	
package com.hzw.du.biz.bean.param.common;

import java.util.List;

import com.hzw.du.biz.bean.param.bean.ConstantBean;

/**
 * <一句话功能简述> 数据字典信息
 * <功能详细描述>
 * @author libb
 * @version V1.0[产品/模块版本]
 */
public class C038ConstantDetail
{
    /* ******************************************************************************************* */
    /*                                       序列化代码区域                                                                                               */
    /* ******************************************************************************************* */

    /* ******************************************************************************************* */
    /*                                       全局变量声明区域                                                                                           */
    /* ******************************************************************************************* */

    /**
     * CONSTANTID  NUMBER  N           数据字典ID
     */
    private Long constantId;
    
    /**
     * CODETYPE    VARCHAR2(100)   Y           代码
     */
    private String codeType;
    
    /**
     * CODELEVEL   NUMBER  Y           等级
     */
    private Integer codeLevel;
    
    /**
     * CODENAME   VARCHAR2(100)   Y           数据字典名称
     */
    private String codeName;
    
    /**
     * CODEVAL VARCHAR2(100)   Y           数据字典值
     */
    private String codeVal;
    
    /**
     * PARENTID    NUMBER  Y           所属父级编号
     */
    private Long parentId;
    
    /**
     * ORDERFLAG   NUMBER  Y           排序编号
     */
    private Integer orderFlag;
    
    /**
     * 数字字典子项
     */
    private List<C038ConstantDetail> constantDetailList;
    /* ******************************************************************************************* */
    /*                                       公共函数声明区域                                                                                           */
    /* ******************************************************************************************* */
    
    public Long getConstantId()
    {
        return constantId;
    }
    
    public void setConstantId(Long constantId)
    {
        this.constantId = constantId;
    }
    
    public String getCodeType()
    {
        return codeType;
    }
    
    public void setCodeType(String codeType)
    {
        this.codeType = codeType;
    }
    
    public Integer getCodeLevel()
    {
        return codeLevel;
    }
    
    public void setCodeLevel(Integer codeLevel)
    {
        this.codeLevel = codeLevel;
    }
    
    public String getCodeName()
    {
        return codeName;
    }
    
    public void setCodeName(String codeName)
    {
        this.codeName = codeName;
    }
    
    public String getCodeVal()
    {
        return codeVal;
    }
    
    public void setCodeVal(String codeVal)
    {
        this.codeVal = codeVal;
    }
    
    public Long getParentId()
    {
        return parentId;
    }
    
    public void setParentId(Long parentId)
    {
        this.parentId = parentId;
    }
    
    public Integer getOrderFlag()
    {
        return orderFlag;
    }
    
    public void setOrderFlag(Integer orderFlag)
    {
        this.orderFlag = orderFlag;
    }
    
    public List<C038ConstantDetail> getConstantDetailList()
    {
        return constantDetailList;
    }
    
    public void setConstantDetailList(List<C038ConstantDetail> constantDetailList)
    {
        this.constantDetailList = constantDetailList;
    }

    /* ******************************************************************************************* */
    /*                                       私有函数声明区域                                                                                           */
    /* ******************************************************************************************* */
}
