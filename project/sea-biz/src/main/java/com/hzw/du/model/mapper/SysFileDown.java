/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_FILE_DOWN  文件下载表， 序列seq_downid]
 * 文件名称：SysFileDown.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.Date;

/**
 * [SYS_FILE_DOWN  文件下载表， 序列seq_downid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class SysFileDown extends BaseBean {

    /**
     * DOWNID  NUMBER  N           主键ID
     */
    private Long downId;

    /**
     * SUBID   NUMBER  Y           分包ID
     */
    private Long subId;

    /***
     * ORGID   NUMBER  Y           组织机构ID（供应商）
     */
    private Long orgId;

    /**
     * DOWNFILEID  NUMBER  Y           下载文件ID
     */
    private Long downFileId;

    /**
     * DOWNPERSON NUMBER    Y           下载人
     */
    private Long downPerson;

    /**
     * DOWNTIME    DATE    Y           下载时间
     */
    private Date downTime;

    /**
     * STATUS  NUMBER  Y           删除标识   0：未删除  1：已删除
     */
    private Integer status;

    /**
     * @return the downId
     */
    public Long getDownId() {
        return this.downId;
    }

    /**
     * @param downId the downId to set
     */
    public void setDownId(Long downId) {
        this.downId = downId;
    }

    /**
     * @return the subId
     */
    public Long getSubId() {
        return this.subId;
    }

    /**
     * @param subId the subId to set
     */
    public void setSubId(Long subId) {
        this.subId = subId;
    }

    /**
     * @return the orgId
     */
    public Long getOrgId() {
        return this.orgId;
    }

    /**
     * @param orgId the orgId to set
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
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
     * @return the downFileId
     */
    public Long getDownFileId() {
        return this.downFileId;
    }

    /**
     * @param downFileId the downFileId to set
     */
    public void setDownFileId(Long downFileId) {
        this.downFileId = downFileId;
    }

    /**
     * @return the downPerson
     */
    public Long getDownPerson() {
        return this.downPerson;
    }

    /**
     * @param downPerson the downPerson to set
     */
    public void setDownPerson(Long downPerson) {
        this.downPerson = downPerson;
    }

    /**
     * @return the downTime
     */
    public Date getDownTime() {
        return this.downTime;
    }

    /**
     * @param downTime the downTime to set
     */
    public void setDownTime(Date downTime) {
        this.downTime = downTime;
    }

}
