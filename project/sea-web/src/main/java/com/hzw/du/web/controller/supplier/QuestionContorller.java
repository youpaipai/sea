/*
 * 公司名称：江苏华招网信息技术有限公司
 * 版权信息：江苏华招网信息技术有限公司版权所有
 * 描述：异常项目
 * 文件名称：QuestionContorller.java
 * 修改时间：2016-7-29
 * 修改人：王继洋
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.web.controller.supplier;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



import com.hzw.du.web.controller.base.BaseController;
import com.hzw.du.web.entity.BaseRequest;


/**
 * 
 * 异常项目查询
 * @author 王继洋
 * @version V1.0[产品/模块版本]
 */
@Controller
@RequestMapping("/supplier")
public class QuestionContorller extends BaseController
{
    /**
     * 
     * 异议详情
     * @param model
     * @return
     */
    @RequestMapping("/questionInfo")
    public String questionInfo(Model model) {
        BaseRequest req = new BaseRequest();
        req.setTitle("澄清问题");
        model.addAttribute("req", req);
        return "supplier/myQuestion";
    }
    
    
}