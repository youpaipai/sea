/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：供应商，标书费付费凭证上传状态修改
 * 文件名称：C023StandardSupplierUpdateInput.java
 * 修改时间：2016年8月3日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.biz.bean.param.bussiness;

import java.util.List;

import com.hzw.du.biz.bean.constant.BussinessBizFunCode;
import com.hzw.du.biz.bean.param.BaseCommonInput;
import com.hzw.du.biz.bean.param.bean.SupplierTendFeeBean;

/**
 * 供应商，标书费付费凭证上传状态修改
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class B002SupplierTendFeeInput extends BaseCommonInput{
    
    public B002SupplierTendFeeInput(){
        functionCode = BussinessBizFunCode.B002_STANDARD_SUPPLIER_UPDATE;
    }

    /**
     * 参标供应商ID（参标人标志）  --必填
     */
    private Long supplierUserId;
    
    /**
     * 标书费付费凭证上传状态修改，包段对应的参标项目各个标段对应标书费bean List
     */
    private List<SupplierTendFeeBean> tendFeeList;
    
    /**
     * @return the supplierUserId
     */
    public Long getSupplierUserId() {
        return this.supplierUserId;
    }

    /**
     * @param supplierUserId the supplierUserId to set
     */
    public void setSupplierUserId(Long supplierUserId) {
        this.supplierUserId = supplierUserId;
    }

    /**
     * @return the tendFeeList
     */
    public List<SupplierTendFeeBean> getTendFeeList() {
        return this.tendFeeList;
    }

    /**
     * @param tendFeeList the tendFeeList to set
     */
    public void setTendFeeList(List<SupplierTendFeeBean> tendFeeList) {
        this.tendFeeList = tendFeeList;
    }
    
}
