/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[TB_QUESTION_PROBLEM 澄清答疑问题表， 序列seq_problemid]
 * 文件名称：TbQuestionProblem.java
 * 修改时间：2016年7月21日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

/**
 * [TB_QUESTION_PROBLEM 澄清答疑问题表， 序列seq_problemid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class TbQuestionProblem extends BaseBean {

    /**
     * PROBLEMID   NUMBER  N           澄清答疑问题ID
     */
    private Long problemId;
    
    /**
     * SUBID   NUMBER  Y           标段ID
     */
    private Long subId;
    
    /**
     * TENDERPROJECTID NUMBER  Y           招标项目ID
     */
    private Long tenderProjectId;

    /**
     * QUESTIONPROBLEM VARCHAR2(200)   Y           要求澄清的问题
     */
    private String questionProblem;

    /**
     * PROBLEMFILEID   NUMBER  Y           附件ID
     */
    private Long problemFileId;

//    CREATEUSER  NUMBER  Y           创建人
//    CREATETIME  DATE    Y           创建时间
//    UPDATEUSER  NUMBER  Y           修改人
//    UPDATETIME  DATE    Y           修改时间
    /**
     * STATUS  NUMBER  Y           状态 0：未删除  1：删除
     */
    private Integer status;

    /**
     * @return the problemId
     */
    public Long getProblemId() {
        return this.problemId;
    }

    /**
     * @param problemId the problemId to set
     */
    public void setProblemId(Long problemId) {
        this.problemId = problemId;
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
     * @return the questionProblem
     */
    public String getQuestionProblem() {
        return this.questionProblem;
    }

    /**
     * @param questionProblem the questionProblem to set
     */
    public void setQuestionProblem(String questionProblem) {
        this.questionProblem = questionProblem;
    }

    /**
     * @return the problemFileId
     */
    public Long getProblemFileId() {
        return this.problemFileId;
    }

    /**
     * @param problemFileId the problemFileId to set
     */
    public void setProblemFileId(Long problemFileId) {
        this.problemFileId = problemFileId;
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
