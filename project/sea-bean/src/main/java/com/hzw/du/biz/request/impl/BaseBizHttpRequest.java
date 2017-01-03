/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：调用业务系统接口的htpp
 * 文件名称：BizHttpRequest.java
 * 修改时间：2016年7月14日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.biz.request.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.slf4j.LoggerFactory;

import com.hzw.du.biz.bean.BaseRequestInput;
import com.hzw.du.biz.bean.BaseResponseOutput;
import com.hzw.du.biz.bean.constant.BizErrorCode;
import com.hzw.du.biz.bean.param.BaseCommonInput;
import com.hzw.du.biz.bean.param.BaseCommonOutput;
import com.hzw.du.biz.bean.param.common.DemoInput;
import com.hzw.du.biz.bean.param.common.DemoOutput;
import com.hzw.du.biz.util.BaseOutputObjectFactory;
import com.hzw.du.common.utils.StringUtils;

import ch.qos.logback.classic.Logger;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import flexjson.transformer.DateTransformer;

/**
 * 调用业务系统接口的htpp
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class BaseBizHttpRequest {
    
    protected Logger log = (Logger) LoggerFactory.getLogger(BaseBizHttpRequest.class);
    
    /**
     * 业务系统请求url
     */
    private String url;
    
    /**
     * 字符编码格式，默认utf-8
     */
    private String dataEncoding = "utf-8";
    
    /**
     * 默认服务器功能版本号
     */
    private String bizVersion = "1.0";
    
    /**
     * 请求客户端类型，1web网站、2手机app
     */
    private String clientType = "1";
    
    /**
     * 连接接口服务超时设置，单位秒
     */
    private int conntectionTimeOut = 5;
    /**
     * 连接接口服务器，读取数据超时时间设置，单位秒
     */
    private int readTimeOut = 5;
    
    @SuppressWarnings("unchecked")
    public <T> T request(BaseCommonInput baseRequestInput, Class<T> type){
        BaseCommonOutput itemOutput = null;
        try{
            BaseRequestInput input = new BaseRequestInput();
            input.setBizVersion(bizVersion);
            input.setClientType(clientType);
            input.setTimeStamp(new Date().getTime() + "");
            input.getList().add(baseRequestInput);
            BaseResponseOutput output = request(input);
            itemOutput = output.getList().get(0);
        }catch(Exception e){
            log.error("请求失败", e);
            itemOutput = new BaseCommonOutput();
            itemOutput.setErrorCode(BizErrorCode.UNKNOW_ERROR_CODE);
            itemOutput.setErrorMsg(BizErrorCode.UNKNOW_ERROR_Msg_9999);
        }
        return (T)itemOutput;
    }
    private BaseResponseOutput request(BaseRequestInput baseRequestInput) throws Exception{
        log.info("业务系统url=["+ url +"]");
        if(StringUtils.isEmpty(url)){
            new Exception("请地址不存在");
        }
        if(baseRequestInput == null){
            new Exception("无效的请求[null]");
        }
        if(baseRequestInput.getList() == null || baseRequestInput.getList().size() <= 0){
            new Exception("未明确请求功能");
        }
        String requestData = new JSONSerializer().exclude("*.class","*.hashKey").transform(new DateTransformer("yyyyMMddHHmmss"), java.util.Date.class).deepSerialize(baseRequestInput);
        String responseData = request(url, requestData, dataEncoding);
        BaseResponseOutput output = new JSONDeserializer<BaseResponseOutput>().use(null, BaseResponseOutput.class).use(java.util.Date.class, new DateTransformer("yyyyMMddHHmmss")).use(new BaseOutputObjectFactory(), "list.values").deserialize(responseData);
        
        return output;
    }
    public static void main(String[] args) throws Exception{
        DemoInput input1 = new DemoInput();
        input1.setBizVersion("1.0");
        input1.setClientType("1");
        input1.setTimeStamp("1222222");
        
        BaseBizHttpRequest request = new BaseBizHttpRequest();
        request.setUrl("http://localhost:8081/ctp/GatewayAPIServlet.servlet");
        DemoOutput output = request.request(input1, DemoOutput.class);
        System.out.println(output);
    }
    
    
    
    private String request(String urlStr, String requestData, String dataEncoding){
        log.info("requestData=["+ requestData +"]");
        StringBuffer sb = new StringBuffer();
        try{
            URL url = new URL(urlStr);
            HttpURLConnection conn = null;
            if(!urlStr.startsWith("https")){
                conn = (HttpURLConnection)url.openConnection();
            }else{
                TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
                    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                        return null;
                    }

                    public void checkClientTrusted(
                            java.security.cert.X509Certificate[] certs, String authType) {
                    }

                    public void checkServerTrusted(
                            java.security.cert.X509Certificate[] certs, String authType) {
                    }
                } };
                SSLContext sc = SSLContext.getInstance("SSL");
                sc.init(null, trustAllCerts, new java.security.SecureRandom());
                HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
                HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
                            public boolean verify(String urlHostName,
                                    SSLSession session) {
                                return true;
                            }
                        });

                HttpsURLConnection conn1 = (HttpsURLConnection)url.openConnection();
                conn1.setHostnameVerifier(new HostnameVerifier() {
                    public boolean verify(String arg0, SSLSession arg1) {
                        return true;
                    }
                });
                conn = conn1;
            }
            
            //http正文内，因此需要设为true, 默认情况下是false;   
            conn.setDoOutput(true);
            //设置是否从httpUrlConnection读入，默认情况下是true; 
            conn.setDoInput(true);
            // Post 请求不能使用缓存   
            conn.setUseCaches(false);
            //设置超时
            if(conntectionTimeOut >= 0){
                conn.setConnectTimeout(conntectionTimeOut * 1000);
            }
            if(readTimeOut >= 0){
                conn.setReadTimeout(readTimeOut * 1000);
            }
            conn.setRequestMethod("POST"); 
            // 设定传送的内容类型是可序列化的java对象   
            // (如果不设此项,在传送序列化对象时,当WEB服务默认的不是这种类型时可能抛java.io.EOFException)   
            conn.setRequestProperty("Content-type", "application/octet-stream"); 
            Writer writer = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream(), dataEncoding));
            writer.write(requestData);
            writer.flush();
            writer.close();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(), dataEncoding));
            char[] buf = new char[512];
            int readCount = reader.read(buf, 0, 512);
            while(readCount >= 0){
                sb.append(buf,0,readCount);
                readCount = reader.read(buf, 0, 512);
            }
            String line = reader.readLine();
            while(line != null){
                sb.append(line);
                line = reader.readLine();
            }
            reader.close();
            log.info(" 请求返回字符串 = " + sb.toString());
        }catch(Exception ex){
            log.error(ex.getMessage(), ex);
        }
        return sb.toString();
    }



    /**
     * @return the url
     */
    public String getUrl() {
        return this.url;
    }
    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
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
     * @return the bizVersion
     */
    public String getBizVersion() {
        return this.bizVersion;
    }
    /**
     * @param bizVersion the bizVersion to set
     */
    public void setBizVersion(String bizVersion) {
        this.bizVersion = bizVersion;
    }
    /**
     * @return the clientType
     */
    public String getClientType() {
        return this.clientType;
    }
    /**
     * @param clientType the clientType to set
     */
    public void setClientType(String clientType) {
        this.clientType = clientType;
    }
    /**
     * @return the conntectionTimeOut
     */
    public int getConntectionTimeOut() {
        return this.conntectionTimeOut;
    }
    /**
     * @param conntectionTimeOut the conntectionTimeOut to set
     */
    public void setConntectionTimeOut(int conntectionTimeOut) {
        this.conntectionTimeOut = conntectionTimeOut;
    }
    /**
     * @return the readTimeOut
     */
    public int getReadTimeOut() {
        return this.readTimeOut;
    }
    /**
     * @param readTimeOut the readTimeOut to set
     */
    public void setReadTimeOut(int readTimeOut) {
        this.readTimeOut = readTimeOut;
    }
}
