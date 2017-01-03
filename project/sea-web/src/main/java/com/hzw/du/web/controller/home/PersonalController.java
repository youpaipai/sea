/*
 * 公司名称：江苏华招网信息技术有限公司
 * 版权信息：江苏华招网信息技术有限公司版权所有
 * 描述：TODO
 * 文件名称：PersonalController.java
 * 修改时间：2016-7-29
 * 修改人：丁乙宁
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.web.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hzw.du.biz.bean.param.bean.UserBean;
import com.hzw.du.biz.bean.param.common.C029UserInput;
import com.hzw.du.biz.bean.param.common.C029UserOutput;
import com.hzw.du.biz.bean.param.common.C032UserInput;
import com.hzw.du.biz.bean.param.common.C032UserOutput;
import com.hzw.du.biz.request.BaseBiz;
import com.hzw.du.web.controller.base.BaseController;
import com.hzw.du.web.entity.BaseRequest;

/**
 * <一句话功能简述> 个人中心
 * <功能详细描述>
 * @author 丁乙宁
 * @version V1.0[产品/模块版本]
 */

@Controller
@RequestMapping("/personal")
public class PersonalController extends BaseController
{
    /**
     * 函数功能描述：个人中心页面
     * @param model
     * @return
     */
    @RequestMapping(value="/toPersonalPage")
    public String toPersonalPage(Model model){
        BaseRequest req=new BaseRequest();
        req.setTitle("个人中心");
        C032UserInput userInput = new C032UserInput();
        userInput.setUserId(this.getWebSessionUser().getUserId());
        userInput.setUserType(this.getWebSessionUser().getUserType());
        C032UserOutput output = baseBiz.getPersonCenter(userInput);
        model.addAttribute("output",output);
        model.addAttribute("userType", this.getWebSessionUser().getUserType());
        model.addAttribute("req",req);
        return "home/personal";
    }
}
