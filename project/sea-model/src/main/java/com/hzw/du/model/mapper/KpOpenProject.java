/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[KP_OPEN_PROJECT  开标项目配置表， 序列seq_openid]
 * 文件名称：KpOpenProject.java
 * 修改时间：2016年7月19日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

/**
 * [KP_OPEN_PROJECT  开标项目配置表， 序列seq_openid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class KpOpenProject extends BaseBean{
    
    /**
     * OPENID  NUMBER  N           主键ID
     */
    private Long openId;
    
    /**
     * SUBMETERID  NUMBER  Y           分表ID
     */
    private Long subMeterId;
    
    /**
     * REVIEWTYPE  NUMBER  Y           专家评审方式
     */
    private Integer reviewType;
    
    /**
     * AGGREGATE   NUMBER  Y           汇总方式
     */
    private Integer aggreGate;
    
    /**
     * ORDERCALC   NUMBER  Y           排名计算方式 0：跳号 1：不跳号
     */
    private Integer orderCalc;

    /**
     * STATUS  NUMBER  Y           状态 0未删除  1删除
     */
    private Integer status;
    
//  CREATEUSER  NUMBER  Y           创建人
//  CREATETIME  DATE    Y           创建时间
//  UPDATEUSER  NUMBER  Y           修改人
//  UPDATETIME  DATE    Y           修改时间


    /**
     * @return the openId
     */
    public Long getOpenId() {
        return this.openId;
    }

    /**
     * @param openId the openId to set
     */
    public void setOpenId(Long openId) {
        this.openId = openId;
    }

    /**
     * @return the subMeterId
     */
    public Long getSubMeterId() {
        return this.subMeterId;
    }

    /**
     * @param subMeterId the subMeterId to set
     */
    public void setSubMeterId(Long subMeterId) {
        this.subMeterId = subMeterId;
    }

    /**
     * @return the reviewType
     */
    public Integer getReviewType() {
        return this.reviewType;
    }

    /**
     * @param reviewType the reviewType to set
     */
    public void setReviewType(Integer reviewType) {
        this.reviewType = reviewType;
    }

    /**
     * @return the aggreGate
     */
    public Integer getAggreGate() {
        return this.aggreGate;
    }

    /**
     * @param aggreGate the aggreGate to set
     */
    public void setAggreGate(Integer aggreGate) {
        this.aggreGate = aggreGate;
    }

    /**
     * @return the orderCalc
     */
    public Integer getOrderCalc() {
        return this.orderCalc;
    }

    /**
     * @param orderCalc the orderCalc to set
     */
    public void setOrderCalc(Integer orderCalc) {
        this.orderCalc = orderCalc;
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
