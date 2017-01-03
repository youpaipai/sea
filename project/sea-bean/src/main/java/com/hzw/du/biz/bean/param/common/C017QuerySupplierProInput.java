/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：供应商查询招标的项目信息（更具项目进行分组查询）查询，输入参数
 * 文件名称：C015ProjectArrpovalInput.java
 * 修改时间：2016年7月26日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.biz.bean.param.common;

import java.util.List;

import com.hzw.du.biz.bean.constant.CommonBizFunCode;
import com.hzw.du.biz.bean.param.BaseQueryCommonInput;

/**
 * 供应商查询招标的项目信息（更具项目进行分组查询）查询，输入参数
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class C017QuerySupplierProInput extends BaseQueryCommonInput {

    public C017QuerySupplierProInput() {
        functionCode = CommonBizFunCode.QUERY_SUPPLIER_PROJECT_C017;
    }
    
    /**
     * 招标项目id 列表，之间用“逗号”隔开，注意逗号是英文半角
     */
    private String tenderProjectIdList;
    
    /**
     * 标段ID 列表，之间用“逗号”隔开，注意逗号是英文半角
     */
    private String subIdList;
    
    /**
     * 招标项目编号列表，之间用“逗号”隔开，注意逗号是英文半角
     */
    private String tenderProjectNumList;

    /**
     * 招标项目编号；模糊查询使用
     */
    private String tenderProjectNumLike;

    /**
     * 招标项目名称列表，之间用“逗号”隔开，注意逗号是英文半角
     */
    private String tenderProjectNameList;
    
    /**
     * 招标项目名称；模糊查询使用
     */
    private String tenderProjectNameLike;
    
    /**
     * 中标状态 0：未中标  1：中标
     */
    private String bidStatus;
    
    /**
     * 参标供应商id列表，之间用“逗号”隔开，注意逗号是英文半角
     */
    private String supplierUserIdList;
    
   
    
    /**
     * 开标时间
     * 用list包含每个单元
     * 每个单元包含两部分（条件符号,时间值）
     * 例如：表示小于时间：（lt,时间值）或者（<,时间值）
     * lte（小于等于）,gt（大于）,gte（大于等于）,eq（等于）
     */
    protected List<String> openTimeList;

    /**
     * @return the tenderProjectNumList
     */
    public String getTenderProjectNumList() {
        return this.tenderProjectNumList;
    }

    /**
     * @param tenderProjectNumList the tenderProjectNumList to set
     */
    public void setTenderProjectNumList(String tenderProjectNumList) {
        this.tenderProjectNumList = tenderProjectNumList;
    }

    /**
     * @return the tenderProjectNumLike
     */
    public String getTenderProjectNumLike() {
        return this.tenderProjectNumLike;
    }

    /**
     * @param tenderProjectNumLike the tenderProjectNumLike to set
     */
    public void setTenderProjectNumLike(String tenderProjectNumLike) {
        this.tenderProjectNumLike = tenderProjectNumLike;
    }

    /**
     * @return the tenderProjectNameList
     */
    public String getTenderProjectNameList() {
        return this.tenderProjectNameList;
    }

    /**
     * @param tenderProjectNameList the tenderProjectNameList to set
     */
    public void setTenderProjectNameList(String tenderProjectNameList) {
        this.tenderProjectNameList = tenderProjectNameList;
    }

    /**
     * @return the tenderProjectNameLike
     */
    public String getTenderProjectNameLike() {
        return this.tenderProjectNameLike;
    }

    /**
     * @param tenderProjectNameLike the tenderProjectNameLike to set
     */
    public void setTenderProjectNameLike(String tenderProjectNameLike) {
        this.tenderProjectNameLike = tenderProjectNameLike;
    }

    /**
     * @return the bidStatus
     */
    public String getBidStatus() {
        return this.bidStatus;
    }

    /**
     * @param bidStatus the bidStatus to set
     */
    public void setBidStatus(String bidStatus) {
        this.bidStatus = bidStatus;
    }

    /**
     * @return the openTimeList
     */
    public List<String> getOpenTimeList() {
        return this.openTimeList;
    }

    /**
     * @param openTimeList the openTimeList to set
     */
    public void setOpenTimeList(List<String> openTimeList) {
        this.openTimeList = openTimeList;
    }

    /**
     * @return the supplierUserIdList
     */
    public String getSupplierUserIdList() {
        return this.supplierUserIdList;
    }

    /**
     * @param supplierUserIdList the supplierUserIdList to set
     */
    public void setSupplierUserIdList(String supplierUserIdList) {
        this.supplierUserIdList = supplierUserIdList;
    }

    /**
     * @return the tenderProjectIdList
     */
    public String getTenderProjectIdList() {
        return this.tenderProjectIdList;
    }

    /**
     * @param tenderProjectIdList the tenderProjectIdList to set
     */
    public void setTenderProjectIdList(String tenderProjectIdList) {
        this.tenderProjectIdList = tenderProjectIdList;
    }

    /**
     * @return the subIdList
     */
    public String getSubIdList() {
        return this.subIdList;
    }

    /**
     * @param subIdList the subIdList to set
     */
    public void setSubIdList(String subIdList) {
        this.subIdList = subIdList;
    }
}
