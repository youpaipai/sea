package org.sea.log;

/**
 * 
 * <一句话功能简述> 日志接口
 * <功能详细描述>
 * @author 尤拍拍
 * @version V1.0[产品/模块版本]
 */
public interface Logger {

    /**
     * 
     * 函数功能描述：debug 级别日志
     * @param msg 日志信息
     */
    void debug(String msg);

    /**
     * 
     * 函数功能描述：debug 级别日志
     * @param msg 日志信息
     * @param e 异常对象
     */
    void debug(String msg, Throwable e);

    /**
     * 
     * 函数功能描述：info 级别日志
     * @param msg 日志信息
     */
    void info(String msg);

    /**
     * 
     * 函数功能描述：info 级别日志
     * @param msg 日志信息
     * @param e 异常对象
     */
    void info(String msg, Throwable e);

    /**
     * 
     * 函数功能描述：warn 级别日志
     * @param msg 日志信息
     */
    void warn(String msg);

    /**
     * 
     * 函数功能描述：warn 级别日志
     * @param msg 日志信息
     * @param e 异常对象
     */
    void warn(String msg, Throwable e);

    /**
     * 
     * 函数功能描述：error 级别日志
     * @param msg 日志信息
     */
    void error(String msg);

    /**
     * 
     * 函数功能描述：error 级别日志
     * @param msg 日志信息
     * @param e 异常对象
     */
    void error(String msg, Throwable e);

}
