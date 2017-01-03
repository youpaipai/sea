/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[TB_QUESTION 澄清答疑表， 序列seq_questionid]
 * 文件名称：TbQuestion.java
 * 修改时间：2016年7月21日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

/**
 * [TB_QUESTION 澄清答疑表， 序列seq_questionid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class TbQuestion extends BaseBean {
    
    /**
     * QUESTIONID  NUMBER  N           澄清答疑编号
     */
    private Long questionId;
    
    /**
     * SUBID   NUMBER  Y           标段id
     */
    private Long subId;
    
    /**
     * TENDERPROJECTID NUMBER  Y           招标项目id
     */
    private Long tenderProjectId;
    
    /**
     * PROBLEMSOURCE   VARCHAR2(200)   Y           问题来源
     */
    private String problemSource;
    
    /**
     * QUESTIONFILEID  NUMBER  Y           澄清答疑回复文件id
     */
    private Long questionFileId;
    
    /**
     * PROBLEMFILEID   NUMBER  Y           问题来源文件id
     */
    private Long problemFileId;
    
    /**
     * QUESTIONNUM NUMBER  Y           澄清答疑次数
     */
    private Integer questionNum;
    
    /**
     * ANSWERFILEID    NUMBER  Y           澄清答疑回复文件
     */
    private Long answerFileId;
    
    /**
     * CQFLAG  NUMBER  Y           "按包件回复标识0:不按包件1:按包件 "
     */
    private Integer cqFlag;

//    CREATEUSER  NUMBER  Y           创建人
//    CREATETIME  DATE    Y           创建时间
//    UPDATEUSER  NUMBER  Y           修改人
//    UPDATETIME  DATE    Y           修改时间
    /**
     * STATUS  NUMBER  Y           状态 0：未删除  1：删除
     */
    private Integer status;

    /**
     * @return the questionId
     */
    public Long getQuestionId() {
        return this.questionId;
    }

    /**
     * @param questionId the questionId to set
     */
    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
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
     * @return the problemSource
     */
    public String getProblemSource() {
        return this.problemSource;
    }

    /**
     * @param problemSource the problemSource to set
     */
    public void setProblemSource(String problemSource) {
        this.problemSource = problemSource;
    }

    /**
     * @return the questionFileId
     */
    public Long getQuestionFileId() {
        return this.questionFileId;
    }

    /**
     * @param questionFileId the questionFileId to set
     */
    public void setQuestionFileId(Long questionFileId) {
        this.questionFileId = questionFileId;
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
     * @return the questionNum
     */
    public Integer getQuestionNum() {
        return this.questionNum;
    }

    /**
     * @param questionNum the questionNum to set
     */
    public void setQuestionNum(Integer questionNum) {
        this.questionNum = questionNum;
    }

    /**
     * @return the answerFileId
     */
    public Long getAnswerFileId() {
        return this.answerFileId;
    }

    /**
     * @param answerFileId the answerFileId to set
     */
    public void setAnswerFileId(Long answerFileId) {
        this.answerFileId = answerFileId;
    }

    /**
     * @return the cqFlag
     */
    public Integer getCqFlag() {
        return this.cqFlag;
    }

    /**
     * @param cqFlag the cqFlag to set
     */
    public void setCqFlag(Integer cqFlag) {
        this.cqFlag = cqFlag;
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
