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

package com.hzw.du.biz.bean.constant;

/**
 * 业务处理返回错误码
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class BizErrorCode {
    
    /**
     * 业务处理正确的返回码
     */
    public final static String SUCCESS_CODE = "0000";
    public final static String SUCCESS_Msg = "OK";
    
    /**
     * 新增失败错误码
     */
    public final static String ERROR_CODE_0001 = "0001";
    public final static String ERROR_Msg_0001 = "新增失败";
    
    /**
     * 修改失败错误码
     */
    public final static String ERROR_CODE_0002 = "0002";
    public final static String ERROR_Msg_0002 = "修改失败";
    
    /**
     * 删除失败错误码
     */
    public final static String ERROR_CODE_0003 = "0003";
    public final static String ERROR_Msg_0003 = "删除失败";
    
    /**
     * 获取对象信息不存在
     */
    public final static String ERROR_CODE_0004 = "0004";
    public final static String ERROR_Msg_0004 = "对象信息不存在";
    
    /**
     * 新增、修改、删除，校验是否有操作类型
     */
    public final static String ERROR_CODE_0005 = "0005";
    public final static String ERROR_Msg_0005 = "操作类型不能为空";
    
    /**
     * 无效操作类型
     */
    public final static String ERROR_CODE_0006 = "0006";
    public final static String ERROR_Msg_0006 = "无效操作类型";
    
    /**
     * 对象信息已存在
     */
    public final static String ERROR_CODE_0007 = "0007";
    public final static String ERROR_Msg_0007 = "对象信息已存在";
    
    /**
     * 登陆信息Code
     */
    public final static String ERROR_CODE_0008 = "0008";
    public final static String ERROR_Msg_0008 = "登陆密码错误";
    
    /**
     * 参标供应商不存在
     */
    public final static String ERROR_CODE_0009 = "0009";
    public final static String ERROR_Msg_0009 = "参标供应商不存在";
   
    /**
     * 参标项目或着标段不存在
     */
    public final static String ERROR_CODE_0010 = "0010";
    public final static String ERROR_Msg_0010 = "参标项目或着标段不存在";
    
    /**
     * 有标书费凭证未上传
     */
    public final static String ERROR_CODE_0011 = "0011";
    public final static String ERROR_Msg_0011 = "有标书费凭证未上传";
    
    /**
     * 招标项目的招标文件没有上传，供应商无法参标
     */
    public final static String ERROR_CODE_0012 = "0012";
    public final static String ERROR_Msg_0012 = "招标项目的招标文件没有上传，供应商无法参标";
    
    /**
     * 招标项目的招标文件有多次上传，视为无效招标
     */
    public final static String ERROR_CODE_0013 = "0013";
    public final static String ERROR_Msg_0013 = "招标项目的招标文件有多次上传，视为无效招标";
    
    /**
     * 还未参标
     */
    public final static String ERROR_CODE_0014 = "0014";
    public final static String ERROR_Msg_0014 = "还未参标";
    
    /**
     * 请求参数值不正确
     */
    public final static String ERROR_CODE_9995 = "9995";
    public final static String ERROR_Msg_9995 = "参数值不正确";
    
    /**
     * 请求参数为null
     */
    public final static String ERROR_CODE_9996 = "9996";
    public final static String ERROR_Msg_9996 = "数据转换异常";
    
    /**
     * 请求参数为null
     */
    public final static String ERROR_CODE_9997 = "9997";
    public final static String ERROR_Msg_9997 = "请求参数为null";
    
    /**
     * 请求功能不存在码
     */
    public final static String ERROR_CODE_9998 = "9998";
    public final static String ERROR_Msg_9998 = "请求功能不存在";
    
    /**
     * 未知错误码
     */
    public final static String UNKNOW_ERROR_CODE = "9999";
    public final static String UNKNOW_ERROR_Msg_9999 = "未知错误";
    
    
    
    
}
