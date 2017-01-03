/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：项目立项 输出参数
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
 * 项目立项 输出参数
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class C022StandardSupplierAddOutput extends BaseCommonOutput{
    
    public C022StandardSupplierAddOutput(){
        functionCode = CommonBizFunCode.C022_STANDARD_SUPPLIER_ADD;
    }
    
    /**
     * 备注说明，如果是批量添加，那么这个说明哪些成功，哪些失败
     */
    private String remark;

    /**
     * @return the remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @param remark the remark to set
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
    
}
