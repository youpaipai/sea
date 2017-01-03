/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：公共接口功能编码
 * 文件名称：CommonBizFunCode.java
 * 修改时间：2016年7月14日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.biz.bean.constant;

import com.hzw.du.biz.bean.param.BaseCommonInput;
import com.hzw.du.biz.bean.param.BaseCommonOutput;
import com.hzw.du.biz.bean.param.bussiness.B001SupplierDownTendFileInput;
import com.hzw.du.biz.bean.param.bussiness.B001SupplierDownTendFileOutput;
import com.hzw.du.biz.bean.param.bussiness.B002SupplierTendFeeInput;
import com.hzw.du.biz.bean.param.bussiness.B002SupplierTendFeeOutput;

/**
 * 业务系统接口功能编码，以“b”开头，001-zzz进行排序
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class BussinessBizFunCode{
    
    /**
     * 供应招标文件下载地址获取
     */
    public static final String B001_SUPPLIER_DOWNLOAD_TEND_FILE = "b001";
    
    /**
     * 参标供应商参标项目；新增
     */
    public static final String B002_STANDARD_SUPPLIER_UPDATE = "b002";
    
    public static BaseCommonInput creatBizInput(String functionCode){
        if (B001_SUPPLIER_DOWNLOAD_TEND_FILE.equals(functionCode)) {
            return new B001SupplierDownTendFileInput();
        }
        if (B002_STANDARD_SUPPLIER_UPDATE.equals(functionCode)) {
            return new B002SupplierTendFeeInput();
        }
        
        return null;
    }
    public static BaseCommonOutput creatBizOutput(String functionCode){
        
        if (B001_SUPPLIER_DOWNLOAD_TEND_FILE.equals(functionCode)) {
            return new B001SupplierDownTendFileOutput();
        }
        if (B002_STANDARD_SUPPLIER_UPDATE.equals(functionCode)) {
            return new B002SupplierTendFeeOutput();
        }
        
        return null;
    }
    
}
