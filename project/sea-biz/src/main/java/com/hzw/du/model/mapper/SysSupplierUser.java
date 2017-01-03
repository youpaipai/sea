/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_SUPPLIER_USER  供应商用户表， 序列seq_supplieruserid]
 * 文件名称：SysSupplierUser.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

/**
 * [SYS_SUPPLIER_USER  供应商用户表， 序列seq_supplieruserid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class SysSupplierUser extends BaseBean {

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

//    CREATEUSER  NUMBER  Y           创建人
//    CREATETIME  DATE    Y           创建时间
//    UPDATEUSER  NUMBER  Y           修改人
//    UPDATETIME  DATE    Y           修改时间
    /**
     * STATUS  NUMBER  Y           状态 0：未删除 1:删除
     */
    private Integer status;

    /**
     * @return the supplierUserId
     */
    public Long getSupplierUserId() {
        return this.supplierUserId;
    }

    /**
     * @param supplierUserId the supplierUserId to set
     */
    public void setSupplierUserId(Long supplierUserId) {
        this.supplierUserId = supplierUserId;
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
     * @return the userId
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * @return the personFile
     */
    public Long getPersonFile() {
        return this.personFile;
    }

    /**
     * @param personFile the personFile to set
     */
    public void setPersonFile(Long personFile) {
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

    /**
     * @return the cardFile
     */
    public Long getCardFile() {
        return this.cardFile;
    }

    /**
     * @param cardFile the cardFile to set
     */
    public void setCardFile(Long cardFile) {
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
