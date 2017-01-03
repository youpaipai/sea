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

/**
 * 公共接口功能编码 ，以“c_”开头，001-zzz进行排序
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class BaseBizFunCode {
    
    public static BaseCommonInput creatInput(String functionCode){
        BaseCommonInput input = CommonBizFunCode.creatCmnInput(functionCode);
        if(input != null){
            return input;
        }
        input = BussinessBizFunCode.creatBizInput(functionCode);
        if(input != null){
            return input;
        }
        input = ManageBizFunCode.creatManInput(functionCode);
        if(input != null){
            return input;
        }
        input = PortalBizFunCode.creatPorInput(functionCode);
        if(input != null){
            return input;
        }
        
        return new BaseCommonInput();
    }
    public static BaseCommonOutput creatOutput(String functionCode){
        BaseCommonOutput output = CommonBizFunCode.creatCmnOutput(functionCode);
        if(output != null){
            return output;
        }
        output = BussinessBizFunCode.creatBizOutput(functionCode);
        if(output != null){
            return output;
        }
        output = ManageBizFunCode.creatManOutput(functionCode);
        if(output != null){
            return output;
        }
        output = PortalBizFunCode.creatPorOutput(functionCode);
        if(output != null){
            return output;
        }
        
        return new BaseCommonOutput();
    }
    
}
