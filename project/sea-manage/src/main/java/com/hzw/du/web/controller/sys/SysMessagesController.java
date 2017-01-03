/*
 * 公司名称：江苏华招网信息技术有限公司
 * 版权信息：江苏华招网信息技术有限公司版权所有
 * 描述：TODO
 * 文件名称：SysMessagesController.java
 * 修改时间：2016-7-22
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
 * <一句话功能简述> 查询所有已发布的系统消息，仅后台管理员可发布系统消息。
 * <功能详细描述>
 * @author 丁乙宁
 * @version V1.0[产品/模块版本]
 */
@Controller
@RequestMapping("/sysMessages")
public class SysMessagesController {
    
    /**
     * 
     * 函数功能描述：查询系统消息
     * @param model
     * @return
     */
    @RequestMapping(value="/toSysMessagesPage")
    public String toSysMessagesPage(HttpServletRequest request,Model model){
        BaseRequest req = new BaseRequest();
        req.setTitle("系统消息");
        
        //接口------------------------------------------------------------------------SMID \ SMTITLE \ CREATEUSER \ SMDATE 
                HashMap<String, Object>map=new HashMap<String,Object>();
                map.put("id", 1);
                map.put("title", "系统");
                map.put("create", "admin");
                map.put("date", "2016-02-15");
                List<HashMap<String,Object>>list=new ArrayList<HashMap<String,Object>>();
                list.add(map);
        //---------------------------------------------------------------------------
        model.addAttribute("req", req);
        model.addAttribute("SysMessagesList", list);
        return "sys/sysMessages";
    }
    
    /**
     * 
     * 函数功能描述：根据id查询该系统消息的详细信息
     * @param model
     * @param id
     * @return
     */
    @RequestMapping(value="/toMessagesDetailPage")
    public String toMessagesDetailPage(HttpServletRequest request,Model model,Integer id){
        BaseRequest req = new BaseRequest();
        req.setTitle("系统消息");
      //接口------------------------------------------------------------------------SMID \ SMTITLE \ SMCONTENT \ SMDATE \ ISADMIN \ TOUSERID \ CREATEUSER \ CREATETIME \ UPDATEUSER \ UPDATETIME  
        HashMap<String,Object> map = new HashMap<String,Object>();
        map.put("ID", 2);
        //---------------------------------------------------------------------------
        model.addAttribute("req", req);
        model.addAttribute("MessagesDetail", map);
        return "/sys/sysMessagesDetail";
    }
    
    /**
     * 
     * 函数功能描述：添加系统消息
     * @param model
     * @return
     */
    @RequestMapping(value="/toaddMessagesPage")
    public String toaddMessagesPage(HttpServletRequest request,Model model){   //SMID\SMTITLE\SMCONTENT\TOUSERID
        BaseRequest req=new BaseRequest();
        req.setTitle("发布系统消息");
        model.addAttribute("req",req);
        return "/sys/sysMessagesAdd";
    }
    /**
     * 
     * 函数功能描述：选择接收人至添加页面
     * @param model
     * @return
     */
    @RequestMapping(value="/toaddPersonPage")
    public String toaddPersonPage(HttpServletRequest request,Model model   ){ //ORGANIZATIONID \ USERNAME
        BaseRequest req=new BaseRequest();
        req.setTitle("选择接收人");
        model.addAttribute("req",req);
        return "/sys/sysMessagesPerson";
    }
}
