/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网 版权所有
 * 描述：拦截器
 * 文件名称：ServerLoginHandler.java
 * 修改时间：2015-7-22
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.web.handlers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.hzw.du.web.entity.SessionUser;
import com.hzw.du.web.session.SpringApplicationContext;

import ch.qos.logback.classic.Logger;

/**
 *  拦截器
 * <功能详细描述>
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class ServerLoginHandler implements HandlerInterceptor {

    private Logger log = (Logger) LoggerFactory.getLogger(ServerLoginHandler.class);

    /* (non-Javadoc)
     * @see org.springframework.web.servlet.HandlerInterceptor#preHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object)
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
            Object handler) throws Exception {
        SessionUser sessionUser = getWebSessionUser();
        
        
        
        return true;
    }

    /**
     * 处理session未过期情况
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {

    }

    /* (non-Javadoc)
     * @see org.springframework.web.servlet.HandlerInterceptor#afterCompletion(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, java.lang.Exception)
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
            Object handler, Exception ex) throws Exception {
        
    }

    private SessionUser getWebSessionUser(){
        return (SessionUser)SpringApplicationContext.getBean("sessionUser");
    }
}
