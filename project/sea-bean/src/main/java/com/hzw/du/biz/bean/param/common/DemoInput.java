/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：基础输入参数
 * 文件名称：BaseInput.java
 * 修改时间：2016年7月14日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.biz.bean.param.common;

import com.hzw.du.biz.bean.constant.CommonBizFunCode;
import com.hzw.du.biz.bean.param.BaseCommonInput;

/**
 * 基础输入参数
 * <功能详细描述>
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class DemoInput extends BaseCommonInput{
    
    public DemoInput(){
        functionCode = CommonBizFunCode.DEMO;
    }
}
