/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：项目立项输入参数
 * 文件名称：ProjectApprovalInput.java
 * 修改时间：2016年7月22日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.biz.bean.param.common;

import java.util.List;

import com.hzw.du.biz.bean.constant.CommonBizFunCode;
import com.hzw.du.biz.bean.param.BaseCommonInput;
import com.hzw.du.biz.bean.param.bean.SubProSupplierUser;

/**
 * 项目立项输入参数
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class C022StandardSupplierAddInput extends BaseCommonInput{
    
    public C022StandardSupplierAddInput(){
        functionCode = CommonBizFunCode.C022_STANDARD_SUPPLIER_ADD;
    }

    /**
     * 招标人用户ID，如果为null表示供应商自己参标，否则是招标人邀请招标
     */
    private Long personUserId;
    
    /**
     * 邀请标识（0：否，1：是）
     */
    private Integer isInvite;
    
    /***
     * 招标项目ID
     */
    private Long tenderProjectId;
    
    /**
     * 项目标段对应的参标供应商关系列表
     */
    private List<SubProSupplierUser> subProSupplierList;
    
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
     * @return the personUserId
     */
    public Long getPersonUserId() {
        return this.personUserId;
    }

    /**
     * @param personUserId the personUserId to set
     */
    public void setPersonUserId(Long personUserId) {
        this.personUserId = personUserId;
    }

    /**
     * @return the isInvite
     */
    public Integer getIsInvite() {
        return this.isInvite;
    }

    /**
     * @param isInvite the isInvite to set
     */
    public void setIsInvite(Integer isInvite) {
        this.isInvite = isInvite;
    }

    /**
     * @return the subProSupplierList
     */
    public List<SubProSupplierUser> getSubProSupplierList() {
        return this.subProSupplierList;
    }

    /**
     * @param subProSupplierList the subProSupplierList to set
     */
    public void setSubProSupplierList(List<SubProSupplierUser> subProSupplierList) {
        this.subProSupplierList = subProSupplierList;
    }

    

}
