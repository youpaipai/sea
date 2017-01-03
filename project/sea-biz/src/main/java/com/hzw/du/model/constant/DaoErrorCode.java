/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：业务处理返回错误码
 * 文件名称：BizErrorCode.java
 * 修改时间：2016年7月14日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.constant;

/**
 * 业务处理返回错误码
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class DaoErrorCode {
    
    /**
     * 未知错误码
     */
    public final static String UNKNOW_ERROR_CODE = "9999";
    public final static String UNKNOW_ERROR_Msg_9999 = "未知错误";
    
    /**
     * ID不能为空或者null
     */
    public final static String CODE_ID_0001 = "0001";
    public final static String Msg_ID_0001 = "ID不能为空或者null";
    
    /**
     * 返回结果不唯一
     */
    public final static String CODE_UNIQUE_0002 = "0002";
    public final static String Msg_UNIQUE_0002 = "返回结果不唯一";
    
    /**
     * 添加数据失败
     */
    public final static String Error_CODE_0003 = "0003";
    public final static String Error_Msg_0003 = "添加数据失败";
    
    /**
     * 删除记录失败
     */
    public final static String Error_CODE_0004 = "0004";
    public final static String Error_Msg_0004 = "删除记录失败";
    
    /**
     * 修改记录失败
     */
    public final static String Error_CODE_0005 = "0005";
    public final static String Error_Msg_0005 = "修改记录失败";
    
    
    
}
