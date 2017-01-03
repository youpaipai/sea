/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：登录、修改验证码等 controller
 * 文件名称：VerifyCodeController.java
 * 修改时间：2016年7月15日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
 	
package com.hzw.du.web.controller.verfycode;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hzw.du.common.utils.RandomValidateCodeUtil;
import com.hzw.du.web.controller.base.BaseController;
import com.hzw.du.web.entity.SessionUser;

/**
 * 登录、修改验证码等 controller
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
@Controller
@RequestMapping("/verfycode")
public class VerifyCodeController extends BaseController{
    
	
    /**
     * 
     * 函数功能描述：登录验证码
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/loginVerifyCode")
    public String login(HttpServletResponse response){
        //设置验证码参数
        response.setDateHeader("Expires", 0);
        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
        response.setHeader("Pragma", "no-cache");
        response.setContentType("image/jpeg");
        
        try {           
            String loginVerifyCode = RandomValidateCodeUtil.getRandomStrCode(4);
            //输出图片方法 
            BufferedImage image = RandomValidateCodeUtil.getImage(loginVerifyCode);
            //把验证码放到sessionUser中
            SessionUser sessionUser = getWebSessionUser();
            sessionUser.setLoginVerifyCode(loginVerifyCode);
            
          //将内存中的图片通过流动形式输出到客户端
            ImageIO.write(image, "JPEG", response.getOutputStream());
        } catch (Exception e) {     
            log.error(e.getMessage(),e);
        }  
        
        return null;
    }
    
}
