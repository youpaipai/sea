/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：请求biz
 * 文件名称：BizServiceRequest.java
 * 修改时间：2016年7月15日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
 	
package com.hzw.gateway.servlet.service;

import com.hzw.du.biz.bean.param.BaseCommonInput;

/**
 * 请求biz
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class CheckReqInputParamService extends BizRequestService{
    
    /**
     * 
     * 函数功能描述：校验输入参数是否合法等
     * @param input 请求input对象，
     * @return 返回校验结果，如果结果为null或者“”空字符，那么表示参数校验通过，否则失败
     */
    @Override
    public String checkInputParam(BaseCommonInput input) {
        super.checkInputParam(input);
        return null;
    }
    
}
