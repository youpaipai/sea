/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[KP_BID_RULES  评标规则模板表， 序列seq_bidid]
 * 文件名称：KpBidRules.java
 * 修改时间：2016年7月19日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

/**
 * [KP_BID_RULES  评标规则模板表， 序列seq_bidid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class KpBidRules extends BaseBean{
    /**
     * BIDID   NUMBER  N           主键ID
     */
    private Long bidId;
    
    /**
     * BIDNAME VARCHAR2(100)   Y           模板名称
     */
    private String bidName;
    
    /**
     * FILEID  NUMBER  Y           模板文件ID
     */
    private Long fileId;
    
    /**
     * STATUS  NUMBER  Y           删除标识   0：未删除  1：已删除
     */
    private Integer status;

    /**
     * @return the bidId
     */
    public Long getBidId() {
        return this.bidId;
    }

    /**
     * @param bidId the bidId to set
     */
    public void setBidId(Long bidId) {
        this.bidId = bidId;
    }

    /**
     * @return the bidName
     */
    public String getBidName() {
        return this.bidName;
    }

    /**
     * @param bidName the bidName to set
     */
    public void setBidName(String bidName) {
        this.bidName = bidName;
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

}
