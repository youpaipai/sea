/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：项目标段对应的参标供应商 关系bean
 * 文件名称：StrandardSupplierProject.java
 * 修改时间：2016年8月2日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.biz.bean.param.bean;

import java.util.List;

/**
 * 项目标段对应的参标供应商 关系bean
 * <功能详细描述>
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class SubProSupplierUser {
    
    /**
     * 标段ID
     */
    private Long subId;
    
    /**
     * 供应商用户id(用户表)
     */
    private List<Long> supplierUserIdList;

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
     * @return the supplierUserIdList
     */
    public List<Long> getSupplierUserIdList() {
        return this.supplierUserIdList;
    }

    /**
     * @param supplierUserIdList the supplierUserIdList to set
     */
    public void setSupplierUserIdList(List<Long> supplierUserIdList) {
        this.supplierUserIdList = supplierUserIdList;
    }
    
}
