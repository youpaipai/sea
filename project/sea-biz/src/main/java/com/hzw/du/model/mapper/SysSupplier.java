/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_SUPPLIER  供应商信息表， 序列seq_supplierid]
 * 文件名称：SysSupplier.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

/**
 * [SYS_SUPPLIER  供应商信息表， 序列seq_supplierid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class SysSupplier extends BaseBean {
    
    /**
     * SUPPLIERID  NUMBER  N           供应商编号
     */
    private Long supplierId;
    
    /**
     * PRODUCTTYPE VARCHAR2(100)   Y           供应商产品类别
     */
    private String productType;
    
    /**
     * BUSINESSRANGE   VARCHAR2(4000)  Y           经营范围
     */
    private String businessRange;
    
    /**
     * PINYINMA    VARCHAR2(300)   Y           企业名称的拼音码
     */
    private String pinYinMa;
    
    /**
     * QUALISEQ    VARCHAR2(50)    Y           资质序列
     */
    private String qualiSeq;
    
    /**
     * ORGANIZATIONID  NUMBER  Y           所属组织机构编号
     */
    private Long organizationId;
    
//    CREATEUSER  NUMBER  Y           创建人
//    CREATETIME  DATE    Y           创建时间
//    UPDATEUSER  NUMBER  Y           修改人
//    UPDATETIME  DATE    Y           修改时间
    /**
     * STATUS  NUMBER  Y           状态 0：未删除 1:删除
     */
    private Integer status;

    /**
     * @return the supplierId
     */
    public Long getSupplierId() {
        return this.supplierId;
    }

    /**
     * @param supplierId the supplierId to set
     */
    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * @return the productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @param productType the productType to set
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * @return the businessRange
     */
    public String getBusinessRange() {
        return this.businessRange;
    }

    /**
     * @param businessRange the businessRange to set
     */
    public void setBusinessRange(String businessRange) {
        this.businessRange = businessRange;
    }

    /**
     * @return the pinYinMa
     */
    public String getPinYinMa() {
        return this.pinYinMa;
    }

    /**
     * @param pinYinMa the pinYinMa to set
     */
    public void setPinYinMa(String pinYinMa) {
        this.pinYinMa = pinYinMa;
    }

    /**
     * @return the qualiSeq
     */
    public String getQualiSeq() {
        return this.qualiSeq;
    }

    /**
     * @param qualiSeq the qualiSeq to set
     */
    public void setQualiSeq(String qualiSeq) {
        this.qualiSeq = qualiSeq;
    }

    /**
     * @return the organizationId
     */
    public Long getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @param organizationId the organizationId to set
     */
    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
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
