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

import java.lang.reflect.Type;
import java.util.Map;

import com.hzw.du.common.utils.StringUtils;

import flexjson.ObjectBinder;
import flexjson.ObjectFactory;

/**
 * json反序列化的时候，把baseinput转换成对应的input
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public abstract class BaseObjectFactory implements ObjectFactory{

    /* (non-Javadoc)
     * @see flexjson.ObjectFactory#instantiate(flexjson.ObjectBinder, java.lang.Object, java.lang.reflect.Type, java.lang.Class)
     */
    @SuppressWarnings("rawtypes")
    @Override
    public Object instantiate(ObjectBinder context, Object value, Type targetType, Class targetClass) {
        Object inputOrOutput = null;
        if(value instanceof Map){
            Map map = (Map)value;
            String functionCode = null;
            if(map.containsKey("functionCode")){
                functionCode = (String)map.get("functionCode");
            }
            if(!StringUtils.isEmpty(functionCode)){
                inputOrOutput = createInptOrOutput(functionCode);
            }
            
        }else{
            inputOrOutput = createInptOrOutput(null);
        }
        return context.bindIntoObject((Map)value, inputOrOutput, targetType);
    }
    
    public abstract Object createInptOrOutput(String functionCode);
}
