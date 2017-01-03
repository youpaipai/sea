/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：获取服务器时间， 输出参数
 * 文件名称：C014QueryServerTimeOutput.java
 * 修改时间：2016年7月26日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.biz.bean.param.common;

import java.util.Date;

import com.hzw.du.biz.bean.constant.CommonBizFunCode;
import com.hzw.du.biz.bean.param.BaseCommonOutput;

/**
 * 获取服务器时间， 输出参数
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class C014QueryServerTimeOutput extends BaseCommonOutput{
    
    public C014QueryServerTimeOutput(){
        functionCode = CommonBizFunCode.QUERY_SERVER_TIME_C014;
    }
    
    /**
     * 服务器当前时间
     */
    private Date serverTime;

    /**
     * @return the serverTime
     */
    public Date getServerTime() {
        return this.serverTime;
    }

    /**
     * @param serverTime the serverTime to set
     */
    public void setServerTime(Date serverTime) {
        this.serverTime = serverTime;
    }

}
