/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：BaseApiServlet.java
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

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.hzw.du.biz.bean.BaseResponseOutput;
import com.hzw.du.biz.bean.constant.BizErrorCode;
import com.hzw.du.common.utils.StringUtils;
import com.hzw.gateway.servlet.service.BaseBizRequestService;

import ch.qos.logback.classic.Logger;
import flexjson.JSONSerializer;

/**
 * 网关公共接口 处理servlet 
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class BaseApiServlet {
    private Logger log = (Logger) LoggerFactory.getLogger(BaseApiServlet.class);
    /**
     * 默认编码为UTF-8
     */
    protected String dataEncoding = "utf-8";
    
    @Autowired
    @Qualifier("bizService")
    private BaseBizRequestService bizService;
    
    
    
    
    
    //公共servlet请求处理方法
    public void handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(log.isInfoEnabled()){
            String remoteIp = getRemoteIp(request);
            log.info("remoteIp=[" + remoteIp + "]");
        }
        
        response.setContentType("application/octet-stream");
        response.setCharacterEncoding(dataEncoding);
        String data = null;
        try{
            int contentLength = request.getContentLength();
            byte[] content = new byte[contentLength];
            request.getInputStream().read(content);
            String requestData = new String(content, dataEncoding);
            //调用不同biz进行业务处理
            data = bizService.excuteRequest(requestData);
            
        }catch(Exception e){
            log.error("调用异常：" + data, e);
            data = processException(e);
        }
        byte[] dataByte = data.getBytes(dataEncoding);
        response.setContentLength(dataByte.length);
        response.getOutputStream().write(dataByte);
        response.getOutputStream().flush();
        response.getOutputStream().close();
    }
    
    /**
     * 获得ip地址
     */
    private String getRemoteIp(HttpServletRequest request){
        String ip = "";
        try{
            ip = request.getHeader("x-forwarded-for");
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getHeader("Proxy-Client-IP");
            }
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getHeader("WL-Proxy-Client-IP");
            }
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getRemoteAddr();
            }
            String[] ips = ip.split(",");
            for(int i=0;i<ips.length;i++){
                if(!StringUtils.isEmpty(ips[i]) && !"unknown".equals(ips[i])){
                    ip = ips[i];
                    break;
                }
            }
        }catch(Exception e){
            ip = "error";
        }
        return ip;
    }
    
    private String processException(Exception e){
        String data = null;
        try{
            BaseResponseOutput output = new BaseResponseOutput();
            output.setErrorCode(BizErrorCode.UNKNOW_ERROR_CODE);
            output.setErrorMsg(e == null || StringUtils.isEmpty(e.getMessage()) ? "未知错误" : e.getMessage());
            data = new JSONSerializer().exclude("*.class","*.hashKey").deepSerialize(output);
        }catch(Exception e1){
            log.error(BizErrorCode.UNKNOW_ERROR_Msg_9999, e);
            data = "{code : 9999, msg : 未知错误}";
        }
        return data;
    }
    
    
    
    
    /**
     * @return the dataEncoding
     */
    public String getDataEncoding() {
        return this.dataEncoding;
    }
    /**
     * @param dataEncoding the dataEncoding to set
     */
    public void setDataEncoding(String dataEncoding) {
        this.dataEncoding = dataEncoding;
    }

    /**
     * @return the bizService
     */
    public BaseBizRequestService getBizService() {
        return this.bizService;
    }

    /**
     * @param bizService the bizService to set
     */
    public void setBizService(BaseBizRequestService bizService) {
        this.bizService = bizService;
    }

}
