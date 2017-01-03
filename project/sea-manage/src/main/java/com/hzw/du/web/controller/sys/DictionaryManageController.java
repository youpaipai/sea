/*
 * 公司名称：江苏华招网信息技术有限公司
 * 版权信息：江苏华招网信息技术有限公司版权所有
 * 描述：TODO
 * 文件名称：DictionaryManageController.java
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
 * <一句话功能简述> 数据字典
 * <功能详细描述>
 * @author 丁乙宁
 * @version V1.0[产品/模块版本]
 */
@Controller
@RequestMapping("/dictionary")
public class DictionaryManageController
{
    /**
     * 函数功能描述：数据字典跳转
     * @param Model model
     * @return
     */
    @RequestMapping(value="/toDictionaryManagePage")
    public String toDictionaryManagePage(Model model){
        BaseRequest req = new BaseRequest();
        req.setTitle("数据字典");
        model.addAttribute("req", req);
        return "/sys/sysDictionary";
    }
}
