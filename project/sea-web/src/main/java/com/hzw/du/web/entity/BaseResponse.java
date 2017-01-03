/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 文件名称：BaseRequest.java
 * 修改时间：2016年4月15日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
 	
package com.hzw.du.web.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * 基础返回父基础bean
 * 如果是返回的json数据，可以直接返回该类
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class BaseResponse {
    
    /**
     * ajax返回结果是否成功
     */
    private boolean success = true;
    
    /**
     * ajax返回结果信息
     */
    private String tipMsg;
    
    /**
     * 返回的数据对象（json）
     */
    private Map<String, Object> data = new HashMap<String, Object>();
    

    /**
     * @return the tipMsg
     */
    public String getTipMsg() {
        return tipMsg;
    }

    /**
     * @param tipMsg the tipMsg to set
     */
    public void setTipMsg(String tipMsg) {
        this.tipMsg = tipMsg;
    }
    
    /**
     * @return the data
     */
    public Map<String, Object> getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    /**
     * @return the success
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * @param success the success to set
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }
}
