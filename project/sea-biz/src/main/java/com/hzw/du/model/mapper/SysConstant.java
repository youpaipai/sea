/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_CONSTANT  数据字典表， 序列seq_constantid]
 * 文件名称：SysConstant.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

/**
 * [SYS_CONSTANT  数据字典表， 序列seq_constantid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class SysConstant extends BaseBean {
    
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
     * STATUS  NUMBER  Y   0       0:未删除  1：已删除
     */
    private Integer status;

    /**
     * @return the constantId
     */
    public Long getConstantId() {
        return this.constantId;
    }

    /**
     * @param constantId the constantId to set
     */
    public void setConstantId(Long constantId) {
        this.constantId = constantId;
    }

    /**
     * @return the codeType
     */
    public String getCodeType() {
        return this.codeType;
    }

    /**
     * @param codeType the codeType to set
     */
    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    /**
     * @return the codeLevel
     */
    public Integer getCodeLevel() {
        return this.codeLevel;
    }

    /**
     * @param codeLevel the codeLevel to set
     */
    public void setCodeLevel(Integer codeLevel) {
        this.codeLevel = codeLevel;
    }

    /**
     * @return the codeName
     */
    public String getCodeName() {
        return this.codeName;
    }

    /**
     * @param codeName the codeName to set
     */
    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    /**
     * @return the codeVal
     */
    public String getCodeVal() {
        return this.codeVal;
    }

    /**
     * @param codeVal the codeVal to set
     */
    public void setCodeVal(String codeVal) {
        this.codeVal = codeVal;
    }

    /**
     * @return the parentId
     */
    public Long getParentId() {
        return this.parentId;
    }

    /**
     * @param parentId the parentId to set
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * @return the orderFlag
     */
    public Integer getOrderFlag() {
        return this.orderFlag;
    }

    /**
     * @param orderFlag the orderFlag to set
     */
    public void setOrderFlag(Integer orderFlag) {
        this.orderFlag = orderFlag;
    }

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
    

}
