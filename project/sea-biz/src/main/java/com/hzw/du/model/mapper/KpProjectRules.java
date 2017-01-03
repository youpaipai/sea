/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[KP_PROJECT_RULES  项目评标规则表， 序列seq_rulesid]
 * 文件名称：KpProjectRules.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

/**
 * [KP_PROJECT_RULES  项目评标规则表， 序列seq_rulesid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class KpProjectRules extends BaseBean{
    
    /**
     * RULESID NUMBER  N           主键ID
     */
    private Long rulesId;
    
    /**
     * SUBID   NUMBER  Y           分包ID
     */
    private Long subId;
    
    /**
     * RULESNAME   VARCHAR2(100)   Y           打分点名称
     */
    private String rulesName;
    
    /**
     * PARENTID    NUMBER  Y           父节点Id
     */
    private Long parentId;
    
    /**
     * SCORE   NUMBER(10,2)    Y           分值
     */
    private Double score;
    
    /**
     * SORTNO  NUMBER  Y           排序号
     */
    private Integer sortNo;
    
    /**
     * REMARK  VARCHAR2(500)   Y           打分说明
     */
    private String remark;
    
    /**
     * ISSCORE NUMBER  Y           价格分标识 0 是 1 否
     */
    private Integer isScore;
    
//    CREATEUSER  NUMBER  Y           创建人
//    CREATETIME  DATE    Y           创建时间
//    UPDATEUSER  NUMBER  Y           修改人
//    UPDATETIME  DATE    Y           修改时间
    /**
     * STATUS  NUMBER  Y           状态 0未删除  1删除
     */
    private Integer status;

    /**
     * @return the rulesId
     */
    public Long getRulesId() {
        return this.rulesId;
    }

    /**
     * @param rulesId the rulesId to set
     */
    public void setRulesId(Long rulesId) {
        this.rulesId = rulesId;
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
     * @return the rulesName
     */
    public String getRulesName() {
        return this.rulesName;
    }

    /**
     * @param rulesName the rulesName to set
     */
    public void setRulesName(String rulesName) {
        this.rulesName = rulesName;
    }

    /**
     * @return the parentId
     */
    public Long getParentId() {
        return this.parentId;
    }

    /**
     * @param parentId the parentId to set
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * @return the score
     */
    public Double getScore() {
        return this.score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * @return the sortNo
     */
    public Integer getSortNo() {
        return this.sortNo;
    }

    /**
     * @param sortNo the sortNo to set
     */
    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    /**
     * @return the remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @param remark the remark to set
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return the isScore
     */
    public Integer getIsScore() {
        return this.isScore;
    }

    /**
     * @param isScore the isScore to set
     */
    public void setIsScore(Integer isScore) {
        this.isScore = isScore;
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
