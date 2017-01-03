/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：参标项目付费凭证列表
 * 文件名称：SupplierTendFeeBean.java
 * 修改时间：2016年8月3日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
 	
package com.hzw.du.biz.bean.param.bean;

/**
 * 参标项目付费凭证列表
 * 标书费付费凭证上传状态修改，包段对应的参标项目各个标段对应标书费bean
 * <功能详细描述>
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class SupplierTendFeeBean {
    
    /**
     * 供应商项目参标ID（这个是已经参标的项目标志，不是项目ID，而是参标ID） --必填
     */
    private Long standardId;
    
    /**
     * 电汇附件id --非必填
     */
    private Long ttFileId;

    /**
     * @return the standardId
     */
    public Long getStandardId() {
        return this.standardId;
    }

    /**
     * @param standardId the standardId to set
     */
    public void setStandardId(Long standardId) {
        this.standardId = standardId;
    }

    /**
     * @return the ttFileId
     */
    public Long getTtFileId() {
        return this.ttFileId;
    }

    /**
     * @param ttFileId the ttFileId to set
     */
    public void setTtFileId(Long ttFileId) {
        this.ttFileId = ttFileId;
    }
    
}
