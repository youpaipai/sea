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

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.code.kaptcha.Producer;
import com.hzw.du.biz.bean.param.common.DemoInput;
import com.hzw.du.biz.bean.param.common.DemoOutput;
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
    
	//生产验证码对象（自动注入）
	@Autowired
    private Producer captchaProducer = null;
	
	
    @RequestMapping("/login")
    public String login(Model model){
        BaseRequest req = new BaseRequest();
        req.setTitle("登录");
        model.addAttribute("req", req);
        return "home/login";
    }
    
    @RequestMapping("/ajaxCheckLogin")
    @ResponseBody
    public BaseResponse ajaxCheckLogin(LoginRequest req){
        LoginResponse res = new LoginResponse();
        String tipMsg = null;
        try{
            tipMsg = req.checkAjaxCheckLogin();
            
            //判断验证码
            if(StringUtils.isEmpty(tipMsg)){
            	SessionUser sessionUser = getWebSessionUser();
            	String checkCode = sessionUser.getCheckCode();
            	if(!StringUtils.isEmpty(checkCode)){
            		if(!checkCode.equalsIgnoreCase(req.getLoginCode())){
            			tipMsg = "验证码错误！";
            		}
            	}else{
            		tipMsg = "验证码异常！";
            	}
            }
            
            if(StringUtils.isEmpty(tipMsg)){
                DemoInput input = new DemoInput();
                DemoOutput output = baseBiz.queryDemo(input);
            }
        }catch(Exception e){
            processException(res, "登录失败", e);
        }
        
        processAjaxResult(res, tipMsg);
        return res;
    }
    
    /**
     * 
     * 函数功能描述：生产验证码
     
     [验证码参数说明]
     
     kaptcha.border  是否有边框  默认为true  我们可以自己设置yes，no  
     kaptcha.border.color   边框颜色   默认为Color.BLACK  
     kaptcha.border.thickness  边框粗细度  默认为1  
     kaptcha.producer.impl   验证码生成器  默认为DefaultKaptcha  
     kaptcha.textproducer.impl   验证码文本生成器  默认为DefaultTextCreator  
     kaptcha.textproducer.char.string   验证码文本字符内容范围  默认为abcde2345678gfynmnpwx  
     kaptcha.textproducer.char.length   验证码文本字符长度  默认为5  
     kaptcha.textproducer.font.names    验证码文本字体样式  默认为new Font("Arial", 1, fontSize), new Font("Courier", 1, fontSize)  
     kaptcha.textproducer.font.size   验证码文本字符大小  默认为40  
     kaptcha.textproducer.font.color  验证码文本字符颜色  默认为Color.BLACK  
     kaptcha.textproducer.char.space  验证码文本字符间距  默认为2  
     kaptcha.noise.impl    验证码噪点生成对象  默认为DefaultNoise  
     kaptcha.noise.color   验证码噪点颜色   默认为Color.BLACK  
     kaptcha.obscurificator.impl   验证码样式引擎  默认为WaterRipple  
     kaptcha.word.impl   验证码文本字符渲染   默认为DefaultWordRenderer  
     kaptcha.background.impl   验证码背景生成器   默认为DefaultBackground  
     kaptcha.background.clear.from   验证码背景颜色渐进   默认为Color.LIGHT_GRAY  
     kaptcha.background.clear.to   验证码背景颜色渐进   默认为Color.WHITE  
     kaptcha.image.width   验证码图片宽度  默认为200  
     kaptcha.image.height  验证码图片高度  默认为50
     
     * @param request 请求对象
     * @param response 响应对象
     * @param uMUser 模型
     * @return
     */
    @RequestMapping(value = "/AuthImg")
    public String AuthImg(HttpServletRequest request, HttpServletResponse response) {
        try {
            //设置验证码参数
            response.setDateHeader("Expires", 0);
            response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
            response.addHeader("Cache-Control", "post-check=0, pre-check=0");
            response.setHeader("Pragma", "no-cache");
            response.setContentType("image/jpeg");

            //将验证码放到session中
            String checkCode = captchaProducer.createText();
            SessionUser sessionUser = getWebSessionUser();
            sessionUser.setCheckCode(checkCode);

            BufferedImage bi = captchaProducer.createImage(checkCode);

            ServletOutputStream out = response.getOutputStream();

            ImageIO.write(bi, "jpg", out);
        }catch (Exception e) {
            log.error("生产验证码失败", e);
        }
        return null;
    }
    
}
