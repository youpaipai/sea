/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网 版权所有
 * 描述：统一异常处理
 * 文件名称：SystemException.java
 * 修改时间：2015-5-20
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.web.handlers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.hzw.du.web.entity.BaseResponse;

import ch.qos.logback.classic.Logger;
import flexjson.JSONSerializer;

/**
 * <一句话功能简述> 统一异常处理
 * <功能详细描述>
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class ExceptionHandler implements HandlerExceptionResolver {

    /**
     * 定义全局日志对象
     */
    private final static Logger log = (Logger) LoggerFactory.getLogger(ExceptionHandler.class);

    /* (non-Javadoc)
     * @see org.springframework.web.servlet.HandlerExceptionResolver#resolveException(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, java.lang.Exception)
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response,
            Object object, Exception ex) {
        HandlerMethod handler = (HandlerMethod) object;
        ResponseBody responseBody = handler.getMethodAnnotation(ResponseBody.class);
        if (responseBody != null) {
            //ajax调用异常返回处理
            BaseResponse res = new BaseResponse();
            res.setSuccess(false);
            res.setTipMsg(ex.getMessage());

            response.setCharacterEncoding("utf-8");
            response.setContentType(MediaType.APPLICATION_JSON_VALUE); //设置ContentType  json
            response.setHeader("Cache-Control", "no-cache, must-revalidate");
            PrintWriter out = null;
            try {
                String responseData = new JSONSerializer().exclude("*.class", "*.hashKey")
                        .deepSerialize(res);
                out = response.getWriter();
                out.write(responseData);
                out.flush();
            }
            catch (IOException e) {
                log.error("json异常处理返回失败", e);
            }
            finally {
                if (out != null) {
                    out.close();
                }
            }
            return null;
        }
        else {
            //非ajax调用异常返回处理
            return rtnModelAndView(ex, "error/exception");
        }
    }

    //创建异常返回ModelAndView
    private ModelAndView rtnModelAndView(Exception e, String uri) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("tipMsg", e.getMessage());
        map.put("title", "错误");
        return new ModelAndView(uri, map);
    }
}
