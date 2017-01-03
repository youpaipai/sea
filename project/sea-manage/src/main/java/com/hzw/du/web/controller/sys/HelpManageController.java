/*
 * 公司名称：江苏华招网信息技术有限公司
 * 版权信息：江苏华招网信息技术有限公司版权所有
 * 描述：TODO
 * 文件名称：HelpManageController.java
 * 修改时间：2016-7-23
 * 修改人：丁乙宁
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.web.controller.sys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hzw.du.web.entity.BaseRequest;

/**
 * <一句话功能简述> 帮助管理页面
 * <功能详细描述>
 * @author 丁乙宁
 * @version V1.0[产品/模块版本]
 */
@Controller
@RequestMapping("/helpManage")
public class HelpManageController
{
    /**
     * 
     * 函数功能描述：帮助管理首页，查询，跳转至添加页面、修改页面、删除
     * @param model
     * @return
     */
    @RequestMapping(value="/toHelpManagePage")
    public String toHelpManagePage(Model model){
        BaseRequest req=new BaseRequest();
        req.setTitle("帮助管理");
      //接口
        //List<MH_HELP> logs = xxx.getallLog();
        
        
        HashMap<String,Object> map = new HashMap<String,Object>();
        map.put("HELPID", 1);
        map.put("TITLE", "帮助");
        map.put("TYPE", "帮助");
        map.put("CREATEUSER", "admin");
        map.put("CREATETIME", "2012-1-1");
        map.put("UPDATEUSER", "admin");
        map.put("UPDATETIME", "2012-1-2");
        List<HashMap<String,Object>> list = new ArrayList<HashMap<String,Object>>();
        list.add(map);
        model.addAttribute("HelpList", list);
        model.addAttribute("req", req);
        return "/sys/sysHelp";
    }
    
    /**
     * 
     * 函数功能描述：根据id查询该帮助消息的详细信息
     * @param model
     * @param id
     * @return
     */
    @RequestMapping(value="/toHelpDetailPage")
    public String toHelpDetailPage(HttpServletRequest request,Model model,Integer id){
        BaseRequest req = new BaseRequest();
        req.setTitle("帮助消息");
      //接口------------------------------------------------------------------------
        HashMap<String,Object> map = new HashMap<String,Object>();
        map.put("ID", 2);
        //---------------------------------------------------------------------------
        model.addAttribute("req", req);
        model.addAttribute("HelpDetail", map);
        return "/sys/sysHelpDetail";
    }
    
    /**
     * 
     * 函数功能描述：添加帮助消息
     * @param model
     * @return
     */
    @RequestMapping(value="/toaddHelpPage")
    public String toaddMessagesPage(HttpServletRequest request,Model model){   
        BaseRequest req=new BaseRequest();
        req.setTitle("发布帮助消息");
        model.addAttribute("req",req);
        return "/sys/sysHelpAdd";
    }
    
    
    
}
