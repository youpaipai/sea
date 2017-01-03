/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：供应商查询招标的项目信息（根据项目进行分组查询）查询，输出参数
 * 文件名称：C015ProjectArrpovalOutput.java
 * 修改时间：2016年7月26日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.biz.bean.param.common;

import java.util.ArrayList;
import java.util.List;

import com.hzw.du.biz.bean.constant.CommonBizFunCode;
import com.hzw.du.biz.bean.param.BaseCommonOutput;
import com.hzw.du.biz.bean.param.BaseQueryCommonOutput;

/**
 * 供应商查询招标的项目信息（根据项目进行分组查询）查询，输出参数
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class C017QuerySupplierProOutput extends BaseQueryCommonOutput{
    
    public C017QuerySupplierProOutput(){
        functionCode = CommonBizFunCode.QUERY_SUPPLIER_PROJECT_C017;
    }
    
    /**
     * 招标项目list
     */
    private List<C017TenderProjectDetail> detailList = new ArrayList<C017TenderProjectDetail>();

    /**
     * 标段list
     */
    private List<C017SubDetail> subDetailList = new ArrayList<C017SubDetail>();
    
    /**
     * @return the detailList
     */
    public List<C017TenderProjectDetail> getDetailList() {
        return this.detailList;
    }

    /**
     * @param detailList the detailList to set
     */
    public void setDetailList(List<C017TenderProjectDetail> detailList) {
        this.detailList = detailList;
    }

    /**
     * @return the subDetailList
     */
    public List<C017SubDetail> getSubDetailList() {
        return this.subDetailList;
    }

    /**
     * @param subDetailList the subDetailList to set
     */
    public void setSubDetailList(List<C017SubDetail> subDetailList) {
        this.subDetailList = subDetailList;
    }
    
}
