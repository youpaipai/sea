/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_ENTRUST_PERSON  招标人表， 序列seq_personid]
 * 文件名称：SysEntrustPerson.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

/**
 * [SYS_ENTRUST_PERSON  招标人表， 序列seq_personid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class SysEntrustPerson extends BaseBean {

    /**
     * PERSONTID   NUMBER  N           招标人ID
     */
    private Long personId;

    /**
     * FEX VARCHAR2(50)    Y           传真
     */
    private String fex;

    /**
     * ORGANIZATIONID  NUMBER  Y           所属组织机构编号
     */
    private Long organizationId;

    /**
     * INDUSTRYCODE    VARCHAR2(3) Y           行业代码
     */
    private String industryCode;

//  CREATEUSER  NUMBER  Y           创建人
//  CREATETIME  DATE    Y           创建时间
//  UPDATEUSER  NUMBER  Y           修改人
//  UPDATETIME  DATE    Y           修改时间
    /**
     * STATUS  NUMBER  Y           0:未删除  1：已删除
     */
    private Integer status;

    /**
     * @return the fex
     */
    public String getFex() {
        return this.fex;
    }

    /**
     * @param fex the fex to set
     */
    public void setFex(String fex) {
        this.fex = fex;
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
     * @return the industryCode
     */
    public String getIndustryCode() {
        return this.industryCode;
    }

    /**
     * @param industryCode the industryCode to set
     */
    public void setIndustryCode(String industryCode) {
        this.industryCode = industryCode;
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
     * @return the personId
     */
    public Long getPersonId() {
        return this.personId;
    }

    /**
     * @param personId the personId to set
     */
    public void setPersonId(Long personId) {
        this.personId = personId;
    }

}
