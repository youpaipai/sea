/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：项目立项 输出参数
 * 文件名称：C005ConnectNoticeOutput.java
 * 修改时间：2016年7月23日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.biz.bean.param.common;

import java.util.ArrayList;
import java.util.List;

import com.hzw.du.biz.bean.constant.CommonBizFunCode;
import com.hzw.du.biz.bean.param.BaseQueryCommonOutput;

/**
 * 项目立项 输出参数
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class C005ConnectNoticeOutput extends BaseQueryCommonOutput{
    
    public C005ConnectNoticeOutput(){
        functionCode = CommonBizFunCode.CONNECT_NOTICE_C005;
    }
    
    /**
     * 结果列表
     */
    private List<C005ConnectNoticeDetail> detail = new ArrayList<C005ConnectNoticeDetail>();

    /**
     * @return the detail
     */
    public List<C005ConnectNoticeDetail> getDetail() {
        return this.detail;
    }

    /**
     * @param detail the detail to set
     */
    public void setDetail(List<C005ConnectNoticeDetail> detail) {
        this.detail = detail;
    }
    
}
