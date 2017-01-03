/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[KP_INIT_REVIEW  初步评审表， 序列seq_initid]
 * 文件名称：KpInitReview.java
 * 修改时间：2016年7月19日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

/**
 * [KP_INIT_REVIEW  初步评审表， 序列seq_initid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class KpInitReview extends BaseBean{
    /**
     * INITID  NUMBER  N           主键ID
     */
    private Long initId;
    
    /**
     * SUBID   NUMBER  Y           标段ID
     */
    private Long subId;
    
    /**
     * TENDERPROJECTID NUMBER  Y           招标项目ID
     */
    private Long tenderProjectId;
    
    /**
     * SUPPLIERID  NUMBER  Y           供应商ID
     */
    private Long supplierId;
    
    /**
     * EXPERTID    NUMBER  Y           专家用户ID
     */
    private Long expertId;
    
    /**
     * ISBARELY    NUMBER  Y           合格标识    0：合格   1：不合格
     */
    private Integer isBarely;
    
    /**
     * RESULT  VARCHAR2(100)   Y           初步评审结果
     */
    private String result;
    
    /**
     * STATUS  NUMBER  Y           状态 0未删除  1删除
     */
    private Integer status;
    
//    CREATEUSER  NUMBER  Y           创建人
//    CREATETIME  DATE    Y           创建时间
//    UPDATEUSER  NUMBER  Y           修改人
//    UPDATETIME  DATE    Y           修改时间
    

    /**
     * @return the initId
     */
    public Long getInitId() {
        return this.initId;
    }

    /**
     * @param initId the initId to set
     */
    public void setInitId(Long initId) {
        this.initId = initId;
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
     * @return the tenderProjectId
     */
    public Long getTenderProjectId() {
        return this.tenderProjectId;
    }

    /**
     * @param tenderProjectId the tenderProjectId to set
     */
    public void setTenderProjectId(Long tenderProjectId) {
        this.tenderProjectId = tenderProjectId;
    }

    /**
     * @return the supplierId
     */
    public Long getSupplierId() {
        return this.supplierId;
    }

    /**
     * @param supplierId the supplierId to set
     */
    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * @return the expertId
     */
    public Long getExpertId() {
        return this.expertId;
    }

    /**
     * @param expertId the expertId to set
     */
    public void setExpertId(Long expertId) {
        this.expertId = expertId;
    }

    /**
     * @return the isBarely
     */
    public Integer getIsBarely() {
        return this.isBarely;
    }

    /**
     * @param isBarely the isBarely to set
     */
    public void setIsBarely(Integer isBarely) {
        this.isBarely = isBarely;
    }

    /**
     * @return the result
     */
    public String getResult() {
        return this.result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(String result) {
        this.result = result;
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
