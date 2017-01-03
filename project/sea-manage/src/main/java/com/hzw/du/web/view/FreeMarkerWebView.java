/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：读取spring中配置的bean
 * 文件名称：SpringApplicationContext.java
 * 修改时间：2016年5月18日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
package com.hzw.du.web.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.view.freemarker.FreeMarkerView;

/**
 * 重写FreeMarkerView视图，获取根路径base
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class FreeMarkerWebView extends FreeMarkerView {

    private final static String CONTEXT_PATH = "base";
    /* (non-Javadoc)
     * @see org.springframework.web.servlet.view.freemarker.FreeMarkerView#exposeHelpers(java.util.Map, javax.servlet.http.HttpServletRequest)
     */
    @Override
    protected void exposeHelpers(Map<String, Object> model, HttpServletRequest request)
            throws Exception {
        super.exposeHelpers(model, request);
        model.put(CONTEXT_PATH, request.getContextPath());
    }

    
}
