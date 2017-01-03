/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：供应招标文件下载地址获取，输入参数
 * 文件名称：C030SupplierDownTendFileInput.java
 * 修改时间：2016年8月4日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.biz.bean.param.bussiness;

import com.hzw.du.biz.bean.constant.BussinessBizFunCode;
import com.hzw.du.biz.bean.param.BaseCommonInput;

/**
 * 供应招标文件下载地址获取，输入参数
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class B001SupplierDownTendFileInput extends BaseCommonInput{
    
    public B001SupplierDownTendFileInput(){
        functionCode = BussinessBizFunCode.B001_SUPPLIER_DOWNLOAD_TEND_FILE;
    }

    /**
     * 参标供应商ID（参标人标志）  --必填
     */
    private Long supplierUserId;
    
    /**
     * 招标项目id   --必填
     */
    private Long tenderProjectId;

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
    
    
}
