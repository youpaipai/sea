/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：供应招标文件下载地址获取，输出参数
 * 文件名称：C030SupplierDownTendFileOutput.java
 * 修改时间：2016年8月4日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.biz.bean.param.bussiness;

import java.util.ArrayList;
import java.util.List;

import com.hzw.du.biz.bean.constant.BussinessBizFunCode;
import com.hzw.du.biz.bean.param.BaseCommonOutput;
import com.hzw.du.biz.bean.param.bean.SysFileBean;

/**
 * 供应招标文件下载地址获取，输出参数
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class B001SupplierDownTendFileOutput extends BaseCommonOutput{
    
    public B001SupplierDownTendFileOutput(){
        functionCode = BussinessBizFunCode.B001_SUPPLIER_DOWNLOAD_TEND_FILE;
    }
    
    /**
     * 文件下载列表
     */
    private List<SysFileBean> detail = new ArrayList<SysFileBean>();
    
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

    /**
     * @return the detail
     */
    public List<SysFileBean> getDetail() {
        return this.detail;
    }

    /**
     * @param detail the detail to set
     */
    public void setDetail(List<SysFileBean> detail) {
        this.detail = detail;
    }
    
}
