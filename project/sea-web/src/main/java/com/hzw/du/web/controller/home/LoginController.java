/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：登录 controller
 * 文件名称：LoginCotroller.java
 * 修改时间：2016年7月15日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
 	
package com.hzw.du.web.controller.home;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hzw.du.biz.bean.param.common.C009LoginInput;
import com.hzw.du.biz.bean.param.common.C009LoginOutput;
import com.hzw.du.common.md5.MD5Util;
import com.hzw.du.common.utils.StringUtils;
import com.hzw.du.web.controller.base.BaseController;
import com.hzw.du.web.entity.BaseRequest;
import com.hzw.du.web.entity.BaseResponse;
import com.hzw.du.web.entity.SessionUser;
import com.hzw.du.web.entity.request.LoginRequest;
import com.hzw.du.web.entity.response.LoginResponse;

/**
 * 登录 controller
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
@Controller
@RequestMapping("/home")
public class LoginController extends BaseController{
    
	/** 
	 * 
	 * 用户和Session绑定关系 
	 */  
	public static final Map<String, HttpSession> USER_SESSION=new HashMap<String, HttpSession>();  
	
	/** 
	 * 
 	 * seeionId和用户的绑定关系 
	 */  
	public static final Map<String, String> SESSIONID_USER=new HashMap<String, String>(); 

	
    @RequestMapping("/login")
    public String login(Model model){
        BaseRequest req = new BaseRequest();
        req.setTitle("登录");
        model.addAttribute("req", req);
        return "home/login";
    }
    
    
    @RequestMapping("/index")
    public String index(Model model){
    	BaseRequest req = new BaseRequest();
    	req.setTitle("首页");
    	model.addAttribute("req", req);
    	return "home/index";
    }
    
    @RequestMapping("/ajaxCheckLogin")
    @ResponseBody
    public BaseResponse ajaxCheckLogin(LoginRequest req,HttpServletRequest request, HttpServletResponse response){
        LoginResponse res = new LoginResponse();
        String tipMsg = null;
        C009LoginOutput loginOutput = null;
        try{
            //1、校验输入参数是否正确
            tipMsg = req.checkAjaxCheckLogin();
            
            //2、判断验证码是否正确
            SessionUser sessionUser = getWebSessionUser();
            if(StringUtils.isEmpty(tipMsg)){
                if(StringUtils.isEmpty(sessionUser.getLoginVerifyCode())){
                    tipMsg = "请先获取验证码!";
                }
                if(StringUtils.isEmpty(tipMsg) && !req.getLoginCode().equalsIgnoreCase(sessionUser.getLoginVerifyCode())){
                    tipMsg = "验证码错误！";
                }
            }
            
            //3、判断账号、密码是否正确
            if(StringUtils.isEmpty(tipMsg)){
            	C009LoginInput loginInput = new C009LoginInput();
            	loginInput.setLoginName(req.getLoginAcc());
            	//密码加密
            	loginInput.setPassWord(MD5Util.getSecret(req.getPassword()));
            	loginOutput  = baseBiz.login(loginInput);
            	
            	if(loginOutput!=null && !loginOutput.isLoginFlag()){
            		tipMsg = loginOutput.getErrorMsg();
            	}
            }	
            
        	//4、登陆成功再做以下操作
        	if(StringUtils.isEmpty(tipMsg) && loginOutput!=null){
        		HttpSession  session = request.getSession();
                //处理用户登录(保持同一时间同一账号只能在一处登录)  
                userLoginHandle(request, loginOutput.getUserId());  
                //添加用户与HttpSession的绑定  
                USER_SESSION.put(loginOutput.getUserId(), session);  
                //添加sessionId和用户的绑定  
                SESSIONID_USER.put(session.getId(), loginOutput.getUserId()); 
        	}
            
            //5、把用户信息放到session中
            if(StringUtils.isEmpty(tipMsg) && loginOutput!=null){
            	sessionUser.setLogin(true);
            	sessionUser.setUserId(Long.parseLong(loginOutput.getUserId()));
            	sessionUser.setUserName(loginOutput.getUserName());
            	sessionUser.setMobilePhoneNum(loginOutput.getPhone());
            }
            
        }catch(Exception e){
            processException(res, "登录失败", e);
        }
        
        processAjaxResult(res, tipMsg);
        return res;
    }
    /** 
     * 用户登录时的处理 
     * 处理一个账号同时只有一个地方登录
     * @param request 
     * @param userID  当前登录的用户ID
     */  
    public static void userLoginHandle(HttpServletRequest request, String userID){  
        //当前sessionId  
        String sessionId=request.getSession().getId();  
        //删除当前sessionId绑定的用户，用户--HttpSession  
        USER_SESSION.remove(SESSIONID_USER.remove(sessionId));  
        //删除当前登录用户绑定的HttpSession  
        HttpSession session=USER_SESSION.remove(userID);  
        if(session!=null){  
            SESSIONID_USER.remove(session.getId());  
            session.removeAttribute(userID);  
            session.setAttribute("userMsg", "您的账号已经在另一处登录了,你被迫下线!"); 
            session.invalidate();
        }  
    }  
    
}
