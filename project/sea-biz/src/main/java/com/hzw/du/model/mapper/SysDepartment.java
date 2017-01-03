/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_DEPARTMENT  部门表， 序列seq_departmentid]
 * 文件名称：SysDepartment.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

/**
 * [SYS_DEPARTMENT  部门表， 序列seq_departmentid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class SysDepartment extends BaseBean {
    
    /**
     * DEPARTMENTID    NUMBER  N           部门ID
     */
    private Long departmentId;
    
    /**
     * DEPARTMENTNAME  VARCHAR2(200)   Y           部门名称
     */
    private String departmentName;
    
    /**
     * ORGANIZATIONID  NUMBER  Y           组织机构ID
     */
    private Long organizationId;

//  CREATEUSER  NUMBER  Y           创建人
//  CREATETIME  DATE    Y           创建时间
//  UPDATEUSER  NUMBER  Y           修改人
//  UPDATETIME  DATE    Y           修改时间
    /**
     * STATUS  NUMBER  Y           0:未删除  1：已删除
     */
    private Integer status;
    
    /**
     * @return the departmentId
     */
    public Long getDepartmentId() {
        return this.departmentId;
    }

    /**
     * @param departmentId the departmentId to set
     */
    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * @return the departmentName
     */
    public String getDepartmentName() {
        return this.departmentName;
    }

    /**
     * @param departmentName the departmentName to set
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
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
