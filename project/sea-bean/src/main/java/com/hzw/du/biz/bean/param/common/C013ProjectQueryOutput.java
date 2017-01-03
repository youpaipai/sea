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
public class C013ProjectQueryOutput extends BaseCommonOutput{
    
    public C013ProjectQueryOutput(){
        functionCode = CommonBizFunCode.QUERY_PROJECT_C013;
    }
    /**
     * 符合条件的总记录数
     */
    private Integer totalCount;
    
    /**
     * 结果列表
     */
    private List<C013ProjectQueryDetail> detail = new ArrayList<C013ProjectQueryDetail>();

    /**
     * @return the detail
     */
    public List<C013ProjectQueryDetail> getDetail() {
        return this.detail;
    }

    /**
     * @param detail the detail to set
     */
    public void setDetail(List<C013ProjectQueryDetail> detail) {
        this.detail = detail;
    }

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

}
