/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_CERTIFICATE  证书管理信息表， 序列seq_certificateid]
 * 文件名称：SysCertificate.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.Date;

/**
 * [SYS_CERTIFICATE  证书管理信息表， 序列seq_certificateid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class SysCertificate extends BaseBean {
    
    /**
     * CERTIFICATEID   NUMBER  N           证书ID
     */
    private Long certificateId;
    
    /**
     * CERTIFICATEKEY  VARCHAR2(100)   Y           证书序列号
     */
    private String certificateKey;
    
    /**
     * REGISTERUSER    NUMBER  Y           用户编号(供应商)
     */
    private Long registerUser;
    
    /**
     * CERTIFICATETYPE NUMBER  Y           证书类型
     */
    private Integer certificateType;
    
    /**
     * GMPTIME DATE    Y           证书有效期
     */
    private Date gmpTime;
    
    /**
     * USEOFFICE   VARCHAR2(200)   Y           发放证书机关
     */
    private String useOffice;
    
    /**
     * USEDATE DATE    Y           发放证书时间
     */
    private Date useDate;
    
    /**
     * OWNERNAME   VARCHAR2(50)    Y           证书持有人
     */
    private String ownerName;
    
    /**
     * OWNERVALIDATION VARCHAR2(50)    Y           证书持有人签名验证
     */
    private String ownerValidation;
    
    /**
     * OFFICEVALIDATION    VARCHAR2(50)    Y           服务机构签名
     */
    private String officeValidation;
    
//    CREATEUSER  NUMBER  Y           创建人
//    CREATETIME  DATE    Y           创建时间
//    UPDATEUSER  NUMBER  Y           修改人
//    UPDATETIME  DATE    Y           修改时间
    /**
     * STATUS  NUMBER  Y   0       0：有效 1：无效
     */
    private Integer status;

    /**
     * @return the certificateId
     */
    public Long getCertificateId() {
        return this.certificateId;
    }

    /**
     * @param certificateId the certificateId to set
     */
    public void setCertificateId(Long certificateId) {
        this.certificateId = certificateId;
    }

    /**
     * @return the certificateKey
     */
    public String getCertificateKey() {
        return this.certificateKey;
    }

    /**
     * @param certificateKey the certificateKey to set
     */
    public void setCertificateKey(String certificateKey) {
        this.certificateKey = certificateKey;
    }

    /**
     * @return the registerUser
     */
    public Long getRegisterUser() {
        return this.registerUser;
    }

    /**
     * @param registerUser the registerUser to set
     */
    public void setRegisterUser(Long registerUser) {
        this.registerUser = registerUser;
    }

    /**
     * @return the gmpTime
     */
    public Date getGmpTime() {
        return this.gmpTime;
    }

    /**
     * @param gmpTime the gmpTime to set
     */
    public void setGmpTime(Date gmpTime) {
        this.gmpTime = gmpTime;
    }

    /**
     * @return the useOffice
     */
    public String getUseOffice() {
        return this.useOffice;
    }

    /**
     * @param useOffice the useOffice to set
     */
    public void setUseOffice(String useOffice) {
        this.useOffice = useOffice;
    }

    /**
     * @return the useDate
     */
    public Date getUseDate() {
        return this.useDate;
    }

    /**
     * @param useDate the useDate to set
     */
    public void setUseDate(Date useDate) {
        this.useDate = useDate;
    }

    /**
     * @return the ownerName
     */
    public String getOwnerName() {
        return this.ownerName;
    }

    /**
     * @param ownerName the ownerName to set
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * @return the ownerValidation
     */
    public String getOwnerValidation() {
        return this.ownerValidation;
    }

    /**
     * @param ownerValidation the ownerValidation to set
     */
    public void setOwnerValidation(String ownerValidation) {
        this.ownerValidation = ownerValidation;
    }

    /**
     * @return the officeValidation
     */
    public String getOfficeValidation() {
        return this.officeValidation;
    }

    /**
     * @param officeValidation the officeValidation to set
     */
    public void setOfficeValidation(String officeValidation) {
        this.officeValidation = officeValidation;
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

    /**
     * @return the certificateType
     */
    public Integer getCertificateType() {
        return this.certificateType;
    }

    /**
     * @param certificateType the certificateType to set
     */
    public void setCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
    }

}
