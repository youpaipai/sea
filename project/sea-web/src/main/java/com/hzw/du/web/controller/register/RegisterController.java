/*
 * 公司名称：江苏华招网信息技术有限公司
 * 版权信息：江苏华招网信息技术有限公司版权所有
 * 描述：所有用户注册的Controller
 * 文件名称：RegisterController.java
 * 修改时间：2016年8月1日
 * 修改人：朱加健
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.web.controller.register;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hzw.du.biz.bean.constant.SysConstants;
import com.hzw.du.biz.bean.param.common.C011UserInput;
import com.hzw.du.biz.bean.param.common.C011UserOutput;
import com.hzw.du.biz.bean.param.common.C024RegisterSysUserInput;
import com.hzw.du.biz.bean.param.common.C024RegisterSysUserOutput;
import com.hzw.du.common.isempty.EmptyUtils;
import com.hzw.du.web.controller.base.BaseController;
import com.hzw.du.web.entity.BaseResponse;
import com.hzw.du.web.entity.request.register.RegisterRequest;;

/**
 * <一句话功能简述> 所有用户注册的Controller
 * @author 朱加健
 * @version V1.0[产品/模块版本]
 */
@Controller
@RequestMapping("/register")
public class RegisterController extends BaseController
{
    /* ******************************************************************************************* */
    /*                                       序列化代码区域                                                                                               */
    /* ******************************************************************************************* */
    
    /* ******************************************************************************************* */
    /*                                       全局变量声明区域                                                                                           */
    /* ******************************************************************************************* */
    
    /* ******************************************************************************************* */
    /*                                       公共函数声明区域                                                                                           */
    /* ******************************************************************************************* */
    /**
     * 函数功能描述：开始注册——进入注册页面
     * @return String
     */
    @RequestMapping("/registerStarting")
    public String registerStarting()
    {
        //返回结果页
        return "/register/register";
    }
    
    /**
     * 函数功能描述：唯一性校验——登录名
     * @return BaseResponse
     */
    @RequestMapping("/queryStaffCode")
    @ResponseBody
    public BaseResponse queryStaffCode(RegisterRequest req)
    {
        BaseResponse res = new BaseResponse();
        String tipMsg = null;
        try
        {
            //1、定义输入接口对象
            C011UserInput input = new C011UserInput();
            //1.1、设置参数：登录名
            String staffCode = req.getStaffCode();
            if (!EmptyUtils.isEmpty(staffCode))
            {
                input.setStaffCode(staffCode);
            }
            else
            {
                tipMsg = "登录名不能为空！";
            }
            //2、定义输出接口对象
            C011UserOutput out = new C011UserOutput();
            if (EmptyUtils.isEmpty(tipMsg))
            {
                //2.1获取校验结果:登录名可用时返回"0000",其他情况则会返回相应的ErrorCode
                out = baseBiz.queryUserCount(input);
                if (!"0000".equals(out.getErrorCode()))
                {
                    tipMsg = out.getErrorMsg();
                }
            }
        }
        catch (Exception e)
        {
            processException(res, "注册时登录名唯一性校验失败", e);
        }
        //处理ajax返回结果tipMsg    
        processAjaxResult(res, tipMsg);
        return res;
    }
    
    /**
     * 函数功能描述：唯一性校验——手机号
     * @return BaseResponse
     */
    @RequestMapping("/queryPhone")
    @ResponseBody
    public BaseResponse queryPhone(RegisterRequest req)
    {
        BaseResponse res = new BaseResponse();
        String tipMsg = null;
        try
        {
            //1、定义输入接口对象
            C011UserInput input = new C011UserInput();
            //1.1、设置参数：手机号
            String phone = req.getPhone();
            if (!EmptyUtils.isEmpty(phone))
            {
                input.setPhone(phone);
            }
            else
            {
                tipMsg = "手机号不能为空！";
            }
            //2、定义输出接口对象
            C011UserOutput out = new C011UserOutput();
            if (EmptyUtils.isEmpty(tipMsg))
            {
                //2.1获取校验结果:登录名可用时返回"0000",其他情况则会返回相应的ErrorCode
                out = baseBiz.queryUserCount(input);
                if (!"0000".equals(out.getErrorCode()))
                {
                    tipMsg = out.getErrorMsg();
                }
            }
        }
        catch (Exception e)
        {
            processException(res, "注册时手机号唯一性校验失败", e);
        }
        
        processAjaxResult(res, tipMsg);
        return res;
    }
    
    /**
     * 函数功能描述：开始注册--提交注册基本信息
     * @return BaseResponse
     */
    @RequestMapping("/registerBasicInformation")
    @ResponseBody
    public BaseResponse registerBasicInformation(RegisterRequest req)
    {
        BaseResponse res = new BaseResponse();
        String tipMsg = null;
        try
        {
            //1、定义输入接口对象
            C024RegisterSysUserInput input = new C024RegisterSysUserInput();
            //1.1、设置参数：登录名
            String staffCode = req.getStaffCode();
            if (!EmptyUtils.isEmpty(staffCode))
            {
                input.setStaffCode(staffCode);
            }
            else
            {
                tipMsg = "登录名不能为空！";
            }
            //1.2、设置参数：用户名
            String userName = req.getUserName();
            if (!EmptyUtils.isEmpty(userName))
            {
                input.setUserName(userName);
            }
            else
            {
                tipMsg = "用户名不能为空！";
            }
            //1.3、设置参数：手机号
            String phone = req.getPhone();
            if (!EmptyUtils.isEmpty(phone))
            {
                input.setPhone(phone);
            }
            else
            {
                tipMsg = "手机号不能为空！";
            }
            //1.4、设置参数：密码
            String password = req.getPassword();
            if (!EmptyUtils.isEmpty(password))
            {
                input.setPassword(password);
            }
            else
            {
                tipMsg = "密码不能为空！";
            }
//            //1.5、设置参数：验证码
//            String phoneCode = req.getPhoneCode();
//            if(!EmptyUtils.isEmpty(phoneCode)){
//                input.setPhoneCode
//            }else{
//                tipMsg = "验证码不能为空！";
//            }
            //1.6、设置参数：OPERATE_TYPE
            input.setOperateType(SysConstants.OPERATE_TYPE.OPERATE_ADD);
            
            //2、定义输出接口对象
            C024RegisterSysUserOutput out = new C024RegisterSysUserOutput();
            if (EmptyUtils.isEmpty(tipMsg))
            {
                //2.1获取校验结果:登录名可用时返回"0000",其他情况则会返回相应的ErrorCode
                out = baseBiz.registerSysUser(input);
                if (!"0000".equals(out.getErrorCode()))
                {
                    tipMsg = out.getErrorMsg();
                }
            }
        }
        catch (Exception e)
        {
            processException(res, "注册新用户失败！", e);
        }
        
        processAjaxResult(res, tipMsg);
        return res;
    }
    /* ******************************************************************************************* */
    /*                                       私有函数声明区域                                                                                           */
    /* ******************************************************************************************* */
    
}
