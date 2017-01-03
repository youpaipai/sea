/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_MESSAGE  系统消息表， 序列seq_smid]
 * 文件名称：SysMessage.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.Date;

/**
 * [SYS_MESSAGE  系统消息表， 序列seq_smid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class SysMessage extends BaseBean {
    
    /**
     * SMID    NUMBER  N           消息ID
     */
    private Long smId;
    
    /**
     * SMTITLE VARCHAR2(400)   Y           消息标题
     */
    private String smTitle;
    
    /**
     * SMCONTENT   VARCHAR2(4000)  Y           消息内容
     */
    private String smContent;
    
    /**
     * SMDATE  DATE    Y           发布时间
     */
    private Date smDate;
    
    /**
     * ISTRUE  NUMBER  Y           0:未读 1:已读
     */
    private Integer isTrue;
    
    /**
     * ISADMIN NUMBER  Y           是否为系统发布  0:不是 1:是
     */
    private Integer isAdmin;
    
    /**
     * TOUSERID    NUMBER  Y           引用用户的编号（接收人）
     */
    private Long touserId;
    
    /**
     * TOISDEL NUMBER  Y           收件箱 0:未删除  1:已删除
     */
    private Integer toIsDel;
    
    /**
     * FORMISDEL   NUMBER  Y           发件箱 0:未删除  1:已删除
     */
    private Integer formIsDel;

//  CREATEUSER  NUMBER  Y           创建人
//  CREATETIME  DATE    Y           创建时间
//  UPDATEUSER  NUMBER  Y           修改人
//  UPDATETIME  DATE    Y           修改时间
  
    /**
     * @return the smId
     */
    public Long getSmId() {
        return this.smId;
    }

    /**
     * @param smId the smId to set
     */
    public void setSmId(Long smId) {
        this.smId = smId;
    }

    /**
     * @return the smTitle
     */
    public String getSmTitle() {
        return this.smTitle;
    }

    /**
     * @param smTitle the smTitle to set
     */
    public void setSmTitle(String smTitle) {
        this.smTitle = smTitle;
    }

    /**
     * @return the smContent
     */
    public String getSmContent() {
        return this.smContent;
    }

    /**
     * @param smContent the smContent to set
     */
    public void setSmContent(String smContent) {
        this.smContent = smContent;
    }

    /**
     * @return the smDate
     */
    public Date getSmDate() {
        return this.smDate;
    }

    /**
     * @param smDate the smDate to set
     */
    public void setSmDate(Date smDate) {
        this.smDate = smDate;
    }

    /**
     * @return the isTrue
     */
    public Integer getIsTrue() {
        return this.isTrue;
    }

    /**
     * @param isTrue the isTrue to set
     */
    public void setIsTrue(Integer isTrue) {
        this.isTrue = isTrue;
    }

    /**
     * @return the isAdmin
     */
    public Integer getIsAdmin() {
        return this.isAdmin;
    }

    /**
     * @param isAdmin the isAdmin to set
     */
    public void setIsAdmin(Integer isAdmin) {
        this.isAdmin = isAdmin;
    }

    /**
     * @return the touserId
     */
    public Long getTouserId() {
        return this.touserId;
    }

    /**
     * @param touserId the touserId to set
     */
    public void setTouserId(Long touserId) {
        this.touserId = touserId;
    }

    /**
     * @return the toIsDel
     */
    public Integer getToIsDel() {
        return this.toIsDel;
    }

    /**
     * @param toIsDel the toIsDel to set
     */
    public void setToIsDel(Integer toIsDel) {
        this.toIsDel = toIsDel;
    }

    /**
     * @return the formIsDel
     */
    public Integer getFormIsDel() {
        return this.formIsDel;
    }

    /**
     * @param formIsDel the formIsDel to set
     */
    public void setFormIsDel(Integer formIsDel) {
        this.formIsDel = formIsDel;
    }
}
