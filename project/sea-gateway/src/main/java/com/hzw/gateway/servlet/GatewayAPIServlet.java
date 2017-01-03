/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：业务系统servlet
 * 文件名称：GatewayAPIServlet.java
 * 修改时间：2016年7月13日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */



 	
package com.hzw.gateway.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

/**
 * 业务系统servlet
 * <功能详细描述>
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class GatewayAPIServlet extends BaseApiServlet implements HttpRequestHandler {

    
    /**
     * servlet请求处理入口
     */
    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        super.handleRequest(request, response);
        
    }
    
}
