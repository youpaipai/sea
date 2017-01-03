/*
 * 公司名称：江苏华招网信息技术有限公司
 * 版权信息：江苏华招网信息技术有限公司版权所有
 * 描述：TODO
 * 文件名称：UsersInfoController.java
 * 修改时间：2016-7-25
 * 修改人：丁乙宁
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.web.controller.users;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.logging.LogSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hzw.du.biz.bean.constant.SysConstants;
import com.hzw.du.biz.bean.param.bean.PersonUserBean;
import com.hzw.du.biz.bean.param.bean.SupplierUserBean;
import com.hzw.du.biz.bean.param.bean.UserBean;
import com.hzw.du.biz.bean.param.common.C008LogDetail;
import com.hzw.du.biz.bean.param.common.C008LogInput;
import com.hzw.du.biz.bean.param.common.C008LogOutput;
import com.hzw.du.biz.bean.param.common.C011UserInput;
import com.hzw.du.biz.bean.param.common.C011UserOutput;
import com.hzw.du.biz.bean.param.common.C028UserInput;
import com.hzw.du.biz.bean.param.common.C028UserOutput;
import com.hzw.du.biz.bean.param.common.C029UserInput;
import com.hzw.du.biz.bean.param.common.C029UserOutput;
import com.hzw.du.common.isempty.EmptyUtils;
import com.hzw.du.web.controller.base.BaseController;
import com.hzw.du.web.entity.BaseRequest;
import com.hzw.du.web.entity.BaseResponse;
import com.hzw.du.web.entity.SessionUser;
import com.hzw.du.web.entity.request.UsersRequest;

/**
 * <一句话功能简述>个人用户信息的查看 & 修改
 * <功能详细描述>
 * @author 丁乙宁
 * @version V1.0[产品/模块版本]
 */
@Controller
@RequestMapping("/users")
public class UsersInfoController extends BaseController
{
    private long userId=1;
    /**
     * 函数功能描述：查询当前用户的个人信息至页面
     * @param request
     * @param model
     * @return
     */
    @RequestMapping(value="/toUserManagePage")
     public String toUserManagePage(Model model ,UsersRequest user){
         BaseRequest req=new BaseRequest();
         req.setTitle("个人信息");
        // SessionUser sessionUser = getWebSessionUser();
         C029UserInput userInput = new C029UserInput();
         userInput.setUserId(userId);//sessionUser.getUserId()
         C029UserOutput output =  baseBiz.initModifyUser(userInput);
         UserBean userlist = output.getUserBean();
         model.addAttribute("userlist", userlist );
         model.addAttribute("req", req);
         return "users/user_info";
     }
    
    /**
     * 函数功能描述：验证：手机号码是否唯一
     * @param request
     * @param model
     * @param phone
     * @return
     */
    @RequestMapping("/ajaxCheckMobliePhone")
    @ResponseBody
    public BaseResponse ajaxCheckMobliePhone(UsersRequest user)
    {
        BaseResponse res = new BaseResponse();
        String tipMsg = null;
        try {
            //1、定义输入接口对象
            C011UserInput input = new C011UserInput();
            //1.1、设置参数：手机号
            String phone = user.getPhone();
            if(!EmptyUtils.isEmpty(phone)){
                input.setPhone(phone);
            }else{
                tipMsg = "手机号不能为空！";
            }
            //2、定义输出接口对象
            C011UserOutput out = new C011UserOutput();
            if(EmptyUtils.isEmpty(tipMsg)){
                //2.1获取校验结果:手机号可用时返回"0000",其他情况则会返回相应的ErrorCode
                out = baseBiz.queryUserCount(input);
                if(!"0000".equals(out.getErrorCode())){
                    tipMsg = out.getErrorMsg();
                }
            }
        } catch (Exception e) {
            processException(res, "注册时手机号唯一性校验失败", e);
        }
        processAjaxResult(res, tipMsg);
        return res;
    }


    

    /**
     * 函数功能描述：修改用户信息
     * @return
     */
    @RequestMapping("/ajaxEditUsersInfo")
    @ResponseBody
    public BaseResponse ajaxEditUsersInfo(UsersRequest user)
    {
        BaseResponse res = new BaseResponse();
        String tipMsg = null;
        try
        {
            C028UserInput userInput = new C028UserInput();
            userInput.setOperateType(SysConstants.OPERATE_TYPE.OPERATE_MODIFY);
            UserBean userBean = new UserBean();
            //传id
            userBean.setUserId(userId);
            //传info
            userBean.setUserName(user.getUsername());
            userBean.setPhone(user.getPhone());
            userBean.setOrganizationId(Long.parseLong(user.getOrganizationId().toString()));
            userBean.setTelNo(user.getTelNo());
            userBean.setEmail(user.getEmail());
            userInput.setUserBean(userBean);
            //调用接口
            C028UserOutput output = new C028UserOutput();
            output = baseBiz.modifyUser(userInput);
            
            if(!"0000".equals(output.getErrorCode())){
                tipMsg = output.getErrorMsg();
            }
        }
        catch (Exception e)
        {
            //异常处理
            processException(res, tipMsg, e);
        }
        //处理ajax返回结果
        processAjaxResult(res, tipMsg);
        ////返回验证数据
        return res;
    }

}
