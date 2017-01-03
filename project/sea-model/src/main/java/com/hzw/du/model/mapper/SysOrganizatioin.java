/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_ORGANIZATION  组织机构表， 序列seq_organizationid]
 * 文件名称：SysOrganizatioin.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.math.BigDecimal;

/**
 * [SYS_ORGANIZATION  组织机构表， 序列seq_organizationid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class SysOrganizatioin extends BaseBean {
    
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
    
    /**
     * AREAID  VARCHAR2(6) Y           行政区域代码
     */
    private String areaId;
    
    /**
     * PROVINCE    VARCHAR2(100)   Y           省份
     */
    private String province;
    
    /**
     * CITY    VARCHAR2(100)   Y           城市
     */
    private String city;
    
    /**
     * DISTRICT    VARCHAR2(100)   Y           区县
     */
    private String district;
    
    /**
     * UNITPROPERTY    VARCHAR2(20)    Y           单位性质
     */
    private String unitProperty;
    
    /**
     * LICNUMBER   VARCHAR2(50)    Y           营业执照号码
     */
    private String licNumber;
    
    /**
     * LICFILEID   NUMBER(20)  Y           营业执照文件ID
     */
    private Long licFileId;
    
    /** 
     * ORGCODE VARCHAR2(50)    Y           组织机构代码（招标人代码、代理机构代码、投标人代码）
     */
    private String orgCode;
    
    /**
     * ORGFILEID   NUMBER(20)  Y           组织机构文件ID
     */
    private Long orgFileId;
    
    /**
     * CACODE  VARCHAR2(50)    Y           CA证书编号
     */
    private String caCode;
    
    /**
     * TAXNUMBER   VARCHAR2(50)    Y           税务登记号
     */
    private String taxNumber;
    
    /**
     * CREDITRATING    VARCHAR2(50)    Y           资信等级
     */
    private String creditRating;
    
    /**
     * LEGALPERSON VARCHAR2(100)   Y           法人
     */
    private String legalPerson;
    
    /**
     * LEGALDOCTYPE    VARCHAR2(2) Y           法人证件类型
     */
    private String legalDocType;
    
    /**
     * LEGALIDNUMBER   VARCHAR2(50)    Y           法人身份证号
     */
    private String legalIdNumber;
    
    /**
     * BANKACCOUNT VARCHAR2(100)   Y           开户银行
     */
    private String bankAccount;
    
    /**
     * ACCOUNT VARCHAR2(50)    Y           基本账户账号
     */
    private String account;
    
    /**
     * REGISTEREDCAPITAL   NUMBER(20,2)    Y           注册资本
     */
    private BigDecimal registeredCapital;
    
    /**
     * CURRENCYCODE    VARCHAR2(3) Y           注册资本币种
     */
    private String currencyCode;
    
    /**
     * PRICEUNIT    VARCHAR2(1) Y           注册资本单位
     */
    private String priceUnit;
    
    /**
     * TELEPHONE   VARCHAR2(100)   Y           联系电话
     */
    private String telephone;
    
    /**
     * ADDRESS VARCHAR2(100)   Y           联系地址
     */
    private String address;
    
    /**
     * POSTCODE    VARCHAR2(6) Y           邮政编码
     */
    private String postCode;
    
    /**
     * EMAIL   VARCHAR2(100)   Y           电子邮箱
     */
    private String email;
    
    //CREATEUSER  NUMBER  Y           创建人
    //CREATETIME  DATE    Y           创建时间
    //UPDATEUSER  NUMBER  Y           修改人
    //UPDATETIME  DATE    Y           修改时间
    /**
     * STATUS  NUMBER  Y           企业状态 0:已认证 1：新注册 2：未通过（注册） 3：待审核 4：未通过（变更） 5：已废弃
     */
    private Integer status;

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
     * @return the organizationName
     */
    public String getOrganizationName() {
        return this.organizationName;
    }

    /**
     * @param organizationName the organizationName to set
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /**
     * @return the type
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * @param type the type to set
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * @return the areaId
     */
    public String getAreaId() {
        return this.areaId;
    }

    /**
     * @param areaId the areaId to set
     */
    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    /**
     * @return the province
     */
    public String getProvince() {
        return this.province;
    }

    /**
     * @param province the province to set
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the district
     */
    public String getDistrict() {
        return this.district;
    }

    /**
     * @param district the district to set
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * @return the unitProperty
     */
    public String getUnitProperty() {
        return this.unitProperty;
    }

    /**
     * @param unitProperty the unitProperty to set
     */
    public void setUnitProperty(String unitProperty) {
        this.unitProperty = unitProperty;
    }

    /**
     * @return the licNumber
     */
    public String getLicNumber() {
        return this.licNumber;
    }

    /**
     * @param licNumber the licNumber to set
     */
    public void setLicNumber(String licNumber) {
        this.licNumber = licNumber;
    }

    /**
     * @return the licFileId
     */
    public Long getLicFileId() {
        return this.licFileId;
    }

    /**
     * @param licFileId the licFileId to set
     */
    public void setLicFileId(Long licFileId) {
        this.licFileId = licFileId;
    }

    /**
     * @return the orgCode
     */
    public String getOrgCode() {
        return this.orgCode;
    }

    /**
     * @param orgCode the orgCode to set
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    /**
     * @return the orgFileId
     */
    public Long getOrgFileId() {
        return this.orgFileId;
    }

    /**
     * @param orgFileId the orgFileId to set
     */
    public void setOrgFileId(Long orgFileId) {
        this.orgFileId = orgFileId;
    }

    /**
     * @return the caCode
     */
    public String getCaCode() {
        return this.caCode;
    }

    /**
     * @param caCode the caCode to set
     */
    public void setCaCode(String caCode) {
        this.caCode = caCode;
    }

    /**
     * @return the taxNumber
     */
    public String getTaxNumber() {
        return this.taxNumber;
    }

    /**
     * @param taxNumber the taxNumber to set
     */
    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    /**
     * @return the creditRating
     */
    public String getCreditRating() {
        return this.creditRating;
    }

    /**
     * @param creditRating the creditRating to set
     */
    public void setCreditRating(String creditRating) {
        this.creditRating = creditRating;
    }

    /**
     * @return the legalPerson
     */
    public String getLegalPerson() {
        return this.legalPerson;
    }

    /**
     * @param legalPerson the legalPerson to set
     */
    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    /**
     * @return the legalDocType
     */
    public String getLegalDocType() {
        return this.legalDocType;
    }

    /**
     * @param legalDocType the legalDocType to set
     */
    public void setLegalDocType(String legalDocType) {
        this.legalDocType = legalDocType;
    }

    /**
     * @return the legalIdNumber
     */
    public String getLegalIdNumber() {
        return this.legalIdNumber;
    }

    /**
     * @param legalIdNumber the legalIdNumber to set
     */
    public void setLegalIdNumber(String legalIdNumber) {
        this.legalIdNumber = legalIdNumber;
    }

    /**
     * @return the bankAccount
     */
    public String getBankAccount() {
        return this.bankAccount;
    }

    /**
     * @param bankAccount the bankAccount to set
     */
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    /**
     * @return the account
     */
    public String getAccount() {
        return this.account;
    }

    /**
     * @param account the account to set
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * @return the registeredCapital
     */
    public BigDecimal getRegisteredCapital() {
        return this.registeredCapital;
    }

    /**
     * @param registeredCapital the registeredCapital to set
     */
    public void setRegisteredCapital(BigDecimal registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    /**
     * @return the currencyCode
     */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * @param currencyCode the currencyCode to set
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * @return the priceUnit
     */
    public String getPriceUnit() {
        return this.priceUnit;
    }

    /**
     * @param priceUnit the priceUnit to set
     */
    public void setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit;
    }

    /**
     * @return the telephone
     */
    public String getTelephone() {
        return this.telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the postCode
     */
    public String getPostCode() {
        return this.postCode;
    }

    /**
     * @param postCode the postCode to set
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
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
