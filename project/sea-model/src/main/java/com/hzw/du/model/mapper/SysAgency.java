/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_AGENCY  代理机构信息表， 序列seq_agencyid]
 * 文件名称：SysAgency.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

/**
 * [SYS_AGENCY  代理机构信息表， 序列seq_agencyid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class SysAgency extends BaseBean {

    /**
     * AGENCYID    NUMBER  N           代理机构编号
     */
    private Long agencyId;

    /**
     * WEBSITE VARCHAR2(100)   Y           机构网址
     */
    private String webSite;

    /**
     * DESCRIPTION VARCHAR2(4000)  Y           机构简介
     */
    private String description;

    /**
     * BUSINESSRANGE   VARCHAR2(4000)  Y           经营范围
     */
    private String businessRange;

    /**
     * PINYINMA    VARCHAR2(300)   Y           拼音码
     */
    private String pinYinMa;

    /**
     * ORGANIZATIONID  NUMBER  Y           所属组织机构编号
     */
    private Long organizationId;

    /**
     * QUALICATEGORY   VARCHAR2(50)    Y           资质类别
     */
    private String qualiCategory;

    /**
     * QUALIGRADE  VARCHAR2(50)    Y           资质等级
     */
    private String qualiGrade;

//    CREATEUSER  NUMBER  Y           创建人
//    CREATETIME  DATE    Y           创建时间
//    UPDATEUSER  NUMBER  Y           修改人
//    UPDATETIME  DATE    Y           修改时间
    /**
     * STATUS  NUMBER  Y           状态 0：未删除  1：删除
     */
    private Integer status;

    /**
     * @return the agencyId
     */
    public Long getAgencyId() {
        return this.agencyId;
    }

    /**
     * @param agencyId the agencyId to set
     */
    public void setAgencyId(Long agencyId) {
        this.agencyId = agencyId;
    }

    /**
     * @return the webSite
     */
    public String getWebSite() {
        return this.webSite;
    }

    /**
     * @param webSite the webSite to set
     */
    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
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
     * @return the qualiGrade
     */
    public String getQualiGrade() {
        return this.qualiGrade;
    }

    /**
     * @param qualiGrade the qualiGrade to set
     */
    public void setQualiGrade(String qualiGrade) {
        this.qualiGrade = qualiGrade;
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
     * @return the qualiCategory
     */
    public String getQualiCategory() {
        return this.qualiCategory;
    }

    /**
     * @param qualiCategory the qualiCategory to set
     */
    public void setQualiCategory(String qualiCategory) {
        this.qualiCategory = qualiCategory;
    }

}
