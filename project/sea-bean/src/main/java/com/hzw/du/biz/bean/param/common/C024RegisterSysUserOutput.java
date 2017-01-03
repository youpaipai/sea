/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：C024RegisterSysUserOutput.java
 * 修改时间：2016-7-25
 * 修改人：王帅帅
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
package com.hzw.du.biz.bean.param.common;

import com.hzw.du.biz.bean.constant.BaseBizFunCode;
import com.hzw.du.biz.bean.constant.CommonBizFunCode;
import com.hzw.du.biz.bean.param.BaseCommonOutput;
/**
 * 
 *  用户基本信息注册
 * <功能详细描述>
 * @author 王帅帅
 * @version V1.0[产品/模块版本]
 */
public class C024RegisterSysUserOutput extends BaseCommonOutput{
    private  long sysUserId;
    
    public long getSysUserId()
    {
        return sysUserId;
    }

    public void setSysUserId(long sysUserId)
    {
        this.sysUserId = sysUserId;
    }

    public   C024RegisterSysUserOutput(){
        functionCode = CommonBizFunCode.REGISTER_SYSUSER_C024;
        
    }
    
}
