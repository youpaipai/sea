/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：招标项目（新增、修改、删除） 输出参数
 * 文件名称：PorjectApprovalOutput.java
 * 修改时间：2016年7月22日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.biz.bean.param.common;

import com.hzw.du.biz.bean.constant.CommonBizFunCode;
import com.hzw.du.biz.bean.param.BaseCommonOutput;

/**
 * 招标项目（新增、修改、删除） 输出参数
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class C004TenderProjectOutput extends BaseCommonOutput{
    
    public C004TenderProjectOutput(){
        functionCode = CommonBizFunCode.TENDER_PROJECT_C004;
    }
    
}
