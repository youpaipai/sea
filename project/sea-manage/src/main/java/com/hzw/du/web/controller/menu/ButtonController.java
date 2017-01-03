/*
 * 公司名称：江苏华招网信息技术有限公司
 * 版权信息：江苏华招网信息技术有限公司版权所有
 * 描述：按钮 controller
 * 文件名称：ButtonController.java
 * 修改时间：2016-7-22
 * 修改人：zl
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.web.controller.menu;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hzw.du.web.entity.BaseRequest;

/**
 * 按钮Controller
 * @author zl
 * @version V1.0[产品/模块版本]
 */
@Controller
@RequestMapping("/button")
public class ButtonController
{
    /**
     * 函数功能描述：查询子菜单的所有按钮
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("/queryButton")
    public String queryButton(HttpServletRequest request, Model model)
    {
        BaseRequest req = new BaseRequest();
        req.setTitle("按钮列表");
        //调用接口 获取按钮信息
        //.....   
        try
        {

            model.addAttribute("req", req);

        }
        catch (Exception e)
        {
            //异常处理
        }
        //获取数据后 跳转到对应页面
        return "menu/menu_query";
    }
}
