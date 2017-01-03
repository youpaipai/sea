/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：json反序列化的时候，把baseinput转换成对应的input
 * 文件名称：BaseObjectFactory.java
 * 修改时间：2016年7月15日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.biz.util;

import com.hzw.du.biz.bean.constant.BaseBizFunCode;

/**
 * json反序列化的时候，把baseinput转换成对应的input
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class BaseInputObjectFactory extends BaseObjectFactory{

    /**
     * 生产功能对应的input
     */
    @Override
    public Object createInptOrOutput(String functionCode) {
        return BaseBizFunCode.creatInput(functionCode);
    }
    
}
