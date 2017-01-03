/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[MH_HELP  系统帮助表， 序列seq_helpid]
 * 文件名称：MHHelp.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

/**
 * [MH_HELP  系统帮助表， 序列seq_helpid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class MHHelp extends BaseBean{
    
    /**
     * HELPID  NUMBER  N           帮助编号
     */
    private Long helpId;
    
    /***
     * TITLE   VARCHAR2(200)   Y           帮助标题
     */
    private String title;
    
    /**
     * CONTENT VARCHAR2(4000)  Y           帮助内容
     */
    private String content;
    
    /**
     * TYPE    NUMBER  Y           帮助分类
     */
    private Integer type;

    /**
     * FILEID  NUMBER  Y           附件ID
     */
    private Long fileId;
    
//    CREATEUSER  NUMBER  Y           创建人
//    CREATETIME  DATE    Y           创建时间
//    UPDATEUSER  NUMBER  Y           修改人
//    UPDATETIME  DATE    Y           修改时间
    /**
     * STATUS  NUMBER  Y           状态 0：未删除  1：删除
     */
    private Integer status;

    /**
     * @return the helpId
     */
    public Long getHelpId() {
        return this.helpId;
    }

    /**
     * @param helpId the helpId to set
     */
    public void setHelpId(Long helpId) {
        this.helpId = helpId;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
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
     * @return the fileId
     */
    public Long getFileId() {
        return this.fileId;
    }

    /**
     * @param fileId the fileId to set
     */
    public void setFileId(Long fileId) {
        this.fileId = fileId;
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
