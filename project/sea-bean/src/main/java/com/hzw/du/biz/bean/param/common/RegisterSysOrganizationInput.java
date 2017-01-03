/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：C020SysSupplierOutput.java
 * 修改时间：2016-7-25
 * 修改人：libb
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
package com.hzw.du.biz.bean.param.common;

import java.math.BigDecimal;
/**
 * 
 * 组织机构信息 注册cs
 * <功能详细描述>
 * @author 王帅帅
 * @version V1.0[产品/模块版本]
 */
public class RegisterSysOrganizationInput {
	
		/** ORGANIZATIONID  NUMBER  N           组织机构ID
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
	    
	    /**
	     * STATUS  NUMBER  Y           企业状态 0:已认证 1：新注册 2：未通过（注册） 3：待审核 4：未通过（变更） 5：已废弃
	     */
	    private Integer status;

		public Long getOrganizationId() {
			return organizationId;
		}

		public void setOrganizationId(Long organizationId) {
			this.organizationId = organizationId;
		}

		public String getOrganizationName() {
			return organizationName;
		}

		public void setOrganizationName(String organizationName) {
			this.organizationName = organizationName;
		}

		public Integer getType() {
			return type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public String getAreaId() {
			return areaId;
		}

		public void setAreaId(String areaId) {
			this.areaId = areaId;
		}

		public String getProvince() {
			return province;
		}

		public void setProvince(String province) {
			this.province = province;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getDistrict() {
			return district;
		}

		public void setDistrict(String district) {
			this.district = district;
		}

		public String getUnitProperty() {
			return unitProperty;
		}

		public void setUnitProperty(String unitProperty) {
			this.unitProperty = unitProperty;
		}

		public String getLicNumber() {
			return licNumber;
		}

		public void setLicNumber(String licNumber) {
			this.licNumber = licNumber;
		}

		public Long getLicFileId() {
			return licFileId;
		}

		public void setLicFileId(Long licFileId) {
			this.licFileId = licFileId;
		}

		public String getOrgCode() {
			return orgCode;
		}

		public void setOrgCode(String orgCode) {
			this.orgCode = orgCode;
		}

		public Long getOrgFileId() {
			return orgFileId;
		}

		public void setOrgFileId(Long orgFileId) {
			this.orgFileId = orgFileId;
		}

		public String getCaCode() {
			return caCode;
		}

		public void setCaCode(String caCode) {
			this.caCode = caCode;
		}

		public String getTaxNumber() {
			return taxNumber;
		}

		public void setTaxNumber(String taxNumber) {
			this.taxNumber = taxNumber;
		}

		public String getCreditRating() {
			return creditRating;
		}

		public void setCreditRating(String creditRating) {
			this.creditRating = creditRating;
		}

		public String getLegalPerson() {
			return legalPerson;
		}

		public void setLegalPerson(String legalPerson) {
			this.legalPerson = legalPerson;
		}

		public String getLegalDocType() {
			return legalDocType;
		}

		public void setLegalDocType(String legalDocType) {
			this.legalDocType = legalDocType;
		}

		public String getLegalIdNumber() {
			return legalIdNumber;
		}

		public void setLegalIdNumber(String legalIdNumber) {
			this.legalIdNumber = legalIdNumber;
		}

		public String getBankAccount() {
			return bankAccount;
		}

		public void setBankAccount(String bankAccount) {
			this.bankAccount = bankAccount;
		}

		public String getAccount() {
			return account;
		}

		public void setAccount(String account) {
			this.account = account;
		}

		public BigDecimal getRegisteredCapital() {
			return registeredCapital;
		}

		public void setRegisteredCapital(BigDecimal registeredCapital) {
			this.registeredCapital = registeredCapital;
		}

		public String getCurrencyCode() {
			return currencyCode;
		}

		public void setCurrencyCode(String currencyCode) {
			this.currencyCode = currencyCode;
		}

		public String getPriceUnit() {
			return priceUnit;
		}

		public void setPriceUnit(String priceUnit) {
			this.priceUnit = priceUnit;
		}

		public String getTelephone() {
			return telephone;
		}

		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPostCode() {
			return postCode;
		}

		public void setPostCode(String postCode) {
			this.postCode = postCode;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Integer getStatus() {
			return status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}
	    
	    
	    
}
