/*
 * 公司名称：江苏华招网信息技术有限公司
 * 版权信息：江苏华招网信息技术有限公司版权所有
 * 描述：TODO
 * 文件名称：PasswordController.java
 * 修改时间：2016-7-27
 * 修改人：丁乙宁
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.web.controller.home;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hzw.du.biz.bean.constant.BizErrorCode;
import com.hzw.du.biz.bean.constant.SysConstants;
import com.hzw.du.biz.bean.param.common.C001FileInput;
import com.hzw.du.biz.bean.param.common.C001FileOutput;
import com.hzw.du.biz.bean.param.common.C012UserInput;
import com.hzw.du.biz.bean.param.common.C012UserOutput;
import com.hzw.du.biz.request.BaseBiz;
import com.hzw.du.common.utils.StringUtils;
import com.hzw.du.web.controller.base.BaseController;
import com.hzw.du.web.entity.BaseRequest;
import com.hzw.du.web.entity.BaseResponse;
import com.hzw.du.web.entity.request.PasswordRequest;

/**
 * <一句话功能简述> 用户密码修改
 * <功能详细描述>
 * @author 丁乙宁
 * @version V1.0[产品/模块版本]
 */
@Controller
@RequestMapping("/password")
public class PasswordController extends BaseController
{
    /**
     * 函数功能描述：用户修改密码跳转页面
     * @param request 请求对象
     * @param model
     * @return
     */
    @RequestMapping(value="/toUpdatePasswordPage")
   public String toUpdatePasswordPage(HttpServletRequest request , Model model){
       BaseRequest req=new BaseRequest();
       req.setTitle("密码修改");
       model.addAttribute("req",req);
    return "home/password";
   }
    

    /**
     * 函数功能描述：密码修改方法
     * @param response 响应对象
     * @param model
     * @return
     */
    @RequestMapping(value="/toUpdatePasswordSub")
    @ResponseBody
    public BaseResponse toUpdatePasswordSub(PasswordRequest passwordRequest)
    {
        BaseResponse res = new BaseResponse();
       // 请求参数：C012UserInput   响应参数：C012UserOutput   调用接口：modifyPassword
            //封装的接口方法
            C012UserInput input =new C012UserInput();
            input.setUserId(this.getWebSessionUser().getUserId());
            input.setOldPassword(passwordRequest.getPassword());
            input.setNewPassword(passwordRequest.getENnewpassWord());
           C012UserOutput output=baseBiz.modifyPassword(input);
           // 0000表示成功，其它或者null表示失败
           if(BizErrorCode.SUCCESS_CODE.equals(output.getErrorCode())){
               res.setSuccess(true);
               res.setTipMsg("密码修改成功!");
           }
           else if (BizErrorCode.ERROR_CODE_0004.equals(output.getErrorCode()))
           {
               res.setSuccess(false);
               res.setTipMsg("旧密码错误!");
           }
           else{
               res.setSuccess(false);
               res.setTipMsg("密码修改失败!");
           }
          // res.setTipMsg(BizErrorCode.SUCCESS_CODE.equals(output.getErrorCode()) ? "success" : "fail");
           return res;
       }
}