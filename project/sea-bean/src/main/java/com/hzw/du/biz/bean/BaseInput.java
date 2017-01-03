/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：基础输入参数
 * 文件名称：BaseInput.java
 * 修改时间：2016年7月14日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.biz.bean;

/**
 * 基础输入参数
 * <功能详细描述>
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class BaseInput {
    
    /**
     * 请求客户端类型，1web网站、2手机app
     */
    protected String clientType;
    
    /**
     * 业务系统版本，比如1.0
     */
    protected String bizVersion;
    
    /**
     * 请求时间戳，精确到毫秒
     */
    protected String timeStamp;

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
     * @return the timeStamp
     */
    public String getTimeStamp() {
        return this.timeStamp;
    }

    /**
     * @param timeStamp the timeStamp to set
     */
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
    
}
