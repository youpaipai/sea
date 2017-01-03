/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：招标人（代理机构）招标项目查询，输出参数
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

/**
 * 招标人（代理机构）招标项目查询，输出参数
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class C015QueryTenderProjectOutput extends BaseCommonOutput{
    
    public C015QueryTenderProjectOutput(){
        functionCode = CommonBizFunCode.QUERY_TENDER_PROJECT_C015;
    }
    
    /**
     * 返回list
     */
    List<C015QueryTenderProjectDetail> detailList = new ArrayList<C015QueryTenderProjectDetail>();

    /**
     * @return the detailList
     */
    public List<C015QueryTenderProjectDetail> getDetailList() {
        return this.detailList;
    }

    /**
     * @param detailList the detailList to set
     */
    public void setDetailList(List<C015QueryTenderProjectDetail> detailList) {
        this.detailList = detailList;
    }

    
}
