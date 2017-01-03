/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：获取服务器时间，输入参数
 * 文件名称：C014QueryServerTimeInput.java
 * 修改时间：2016年7月26日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.biz.bean.param.common;

import com.hzw.du.biz.bean.constant.CommonBizFunCode;
import com.hzw.du.biz.bean.param.BaseCommonInput;

/**
 * 获取服务器时间，输入参数
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class C014QueryServerTimeInput extends BaseCommonInput {

    public C014QueryServerTimeInput() {
        functionCode = CommonBizFunCode.QUERY_SERVER_TIME_C014;
    }

}
