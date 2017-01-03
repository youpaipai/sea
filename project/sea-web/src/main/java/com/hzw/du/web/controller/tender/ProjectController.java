/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：招标人，项目立项、修改、删除、查询等操作
 * 文件名称：ProjectController.java
 * 修改时间：2016年8月5日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.web.controller.tender;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hzw.du.web.controller.base.BaseController;
import com.hzw.du.web.entity.BaseRequest;

/**
 * <一句话功能简述> 招标人，项目立项、修改、删除、查询等操作
 * <功能详细描述>
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
@Controller
@RequestMapping("/tender")
public class ProjectController extends BaseController{
    
    /**
     * 
     * 我要投标（招标项目查询）
     * @param model
     * @return
     */
    @RequestMapping("/projectAdd")
    public String projectAdd(Model model) {
        BaseRequest req = new BaseRequest();
        execute(req, "项目立项");
        
        model.addAttribute("req", req);
        
        
        
        return "tender/project";
    }

}
