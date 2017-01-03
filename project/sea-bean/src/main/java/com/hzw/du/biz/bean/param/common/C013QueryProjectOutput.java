/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：项目信息查询， 输出参数
 * 文件名称：C013ProjectQueryOutput.java
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
 * 项目信息查询， 输出参数
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class C013QueryProjectOutput extends BaseCommonOutput{
    
    public C013QueryProjectOutput(){
        functionCode = CommonBizFunCode.QUERY_PROJECT_C013;
    }
    /**
     * 符合条件的总记录数
     */
    private Integer totalCount;
    
    /**
     * 结果列表
     */
    private List<C013QueryProjectDetail> detailList = new ArrayList<C013QueryProjectDetail>();


    /**
     * @return the totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @param totalCount the totalCount to set
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * @return the detailList
     */
    public List<C013QueryProjectDetail> getDetailList() {
        return this.detailList;
    }

    /**
     * @param detailList the detailList to set
     */
    public void setDetailList(List<C013QueryProjectDetail> detailList) {
        this.detailList = detailList;
    }

}
