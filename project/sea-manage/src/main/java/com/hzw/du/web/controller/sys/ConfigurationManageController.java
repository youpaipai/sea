/*
 * 公司名称：江苏华招网信息技术有限公司
 * 版权信息：江苏华招网信息技术有限公司版权所有
 * 描述：TODO
 * 文件名称：ConfigurationManageController.java
 * 修改时间：2016-8-1
 * 修改人：丁乙宁
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.web.controller.sys;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hzw.du.web.entity.BaseRequest;

/**
 * <一句话功能简述> 配置项
 * <功能详细描述>
 * @author 丁乙宁
 * @version V1.0[产品/模块版本]
 */
@Controller
@RequestMapping("/configuration")
public class ConfigurationManageController
{
        /**
         * 函数功能描述：配置项跳转
         * @param Model model
         * @return
         */
        @RequestMapping(value="/toConfigurationManagePage")
        public String toConfigurationManagePage(Model model){
            BaseRequest req = new BaseRequest();
            req.setTitle("系统配置项");
            model.addAttribute("req", req);
            return "/sys/sysConfiguration";
        }
    }

