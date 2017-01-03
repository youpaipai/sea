/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：BussinessException.java
 * 修改时间：2016年7月13日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */



 	
package com.hzw.du.model.exception;

/**
 * 业务逻辑异常类
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class DaoException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    /**
     * 异常码
     */
    private String errorCode;

    /**
     * 异常信息
     */
    private String errorMsg;
    
    public DaoException() {
        super();
    }
    
    public DaoException(String errorMsg) {
        super(errorMsg);
        this.errorMsg = errorMsg;
    }
    
    public DaoException(String errorCode, String errorMsg) {
        super("errorCode=[" + errorCode +"]" + errorMsg);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    /**
     * @return the errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @param errorCode the errorCode to set
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * @return the errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @param errorMsg the errorMsg to set
     */
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    
}
