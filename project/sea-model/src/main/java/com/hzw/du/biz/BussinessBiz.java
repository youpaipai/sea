/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：BussinessBiz.java
 * 修改时间：2016年7月14日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.biz;

import com.hzw.du.biz.bean.param.bussiness.B001SupplierDownTendFileInput;
import com.hzw.du.biz.bean.param.bussiness.B001SupplierDownTendFileOutput;
import com.hzw.du.biz.bean.param.bussiness.B002SupplierTendFeeInput;
import com.hzw.du.biz.bean.param.bussiness.B002SupplierTendFeeOutput;

/**
 * 业务系统独有接口
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface BussinessBiz {

    /**
     * 函数功能描述：供应商本人上传标书费，标书费付费凭证上传状态修改
     * @param input
     * @return
     */  
    B001SupplierDownTendFileOutput supplierDownTendFile(B001SupplierDownTendFileInput input);
    
    /**
     * 函数功能描述：标书费付费凭证上传状态修改
     * @param input
     * @return
     */    
    B002SupplierTendFeeOutput standardSupplierUpdate(B002SupplierTendFeeInput input);
   
    
    
}
