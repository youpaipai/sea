/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：业务系统接口输入参数，以及copy
 * 文件名称：BussinessInputCheck.java
 * 修改时间：2016年7月22日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
 	
package com.hzw.du.biz.check;

import org.springframework.util.StringUtils;

import com.hzw.du.biz.bean.constant.BizErrorCode;
import com.hzw.du.biz.bean.param.bean.SupplierTendFeeBean;
import com.hzw.du.biz.bean.param.bussiness.B001SupplierDownTendFileInput;
import com.hzw.du.biz.bean.param.bussiness.B002SupplierTendFeeInput;
import com.hzw.du.biz.exception.BizException;

/**
 * 业务系统接口输入参数，以及copy
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class BussinessInputCheck extends BaseInputCheck{
    
    /**
     * 
     * 函数功能描述：供应招标文件下载地址获取
     * @param input
     * @return
     */
    public static void check_B001TendFile(B001SupplierDownTendFileInput input){
        
        if(StringUtils.isEmpty(input.getSupplierUserId())){
            throw new BizException(BizErrorCode.ERROR_CODE_9997, "[参标供应商ID]" + BizErrorCode.ERROR_Msg_9997);
        }
        
        if(StringUtils.isEmpty(input.getTenderProjectId())){
            throw new BizException(BizErrorCode.ERROR_CODE_9997, "[招标项目ID]" + BizErrorCode.ERROR_Msg_9997);
        }
        
    }
    
    /**
     * 
     * 函数功能描述：供应商，标书费付费凭证上传状态修改（校验参数）
     * @param input
     * @return
     */
    public static void check_B002Update(B002SupplierTendFeeInput input){
        
        if(StringUtils.isEmpty(input.getSupplierUserId())){
            throw new BizException(BizErrorCode.ERROR_CODE_9997, "[参标供应商ID]" + BizErrorCode.ERROR_Msg_9997);
        }
        
        if(input.getTendFeeList() == null || input.getTendFeeList().size() <= 0){
            throw new BizException(BizErrorCode.ERROR_CODE_9997, "[参标项目付费凭证列表]" + BizErrorCode.ERROR_Msg_9997);
        }
        for(SupplierTendFeeBean item : input.getTendFeeList()){
            if(StringUtils.isEmpty(item.getStandardId())){
                throw new BizException(BizErrorCode.ERROR_CODE_9997, "[供应商项目参标ID]" + BizErrorCode.ERROR_Msg_9997);
            }
            
            if(StringUtils.isEmpty(item.getTtFileId())){
                throw new BizException(BizErrorCode.ERROR_CODE_9997, "[电汇附件id]" + BizErrorCode.ERROR_Msg_9997);
            }
        }
    }
    
}
