/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：菜单controller
 * 文件名称：MenuCotroller.java
 * 修改时间：2016年7月21日
 * 修改人：zl
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
package com.hzw.du.web.controller.menu;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hzw.du.web.common.SysUtil;
import com.hzw.du.web.controller.base.BaseController;
import com.hzw.du.web.entity.BaseRequest;
import com.hzw.du.web.entity.BaseResponse;
import com.hzw.du.web.entity.ButtonTest;
import com.hzw.du.web.entity.Tree.Tree;
import com.hzw.du.web.entity.request.MenuQueryRequest;
import com.hzw.du.web.entity.request.MenuRequest;

/**
 * 菜单controller
 * @author zl
 *
 */
@Controller
@RequestMapping("/menu")
public class MenuController extends BaseController
{
    /**
     * 函数功能描述：查询菜单信息列表
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("/queryMenuList")
    public String queryMenuList(HttpServletRequest request, Model model)
    {
        BaseRequest req = new BaseRequest();
        req.setTitle("菜单列表");
        //调用接口 获取菜单信息
        //.....   
        try
        {
            Map<String, Object> menuParentMap = new HashMap<String, Object>();
            menuParentMap.put("menuId", 1);
            menuParentMap.put("menuName", "基础管理");
            menuParentMap.put("urlPath", "/menu/menu_query");
            menuParentMap.put("parentId", 0);
            menuParentMap.put("parentName", "无");
            menuParentMap.put("createTime", new Date());
            menuParentMap.put("status", 0);
            Map<String, Object> menuChildMap = new HashMap<String, Object>();
            menuChildMap.put("menuId", 2);
            menuChildMap.put("menuName", "用户管理");
            menuChildMap.put("urlPath", "/user/user_query");
            menuChildMap.put("parentId", 1);
            menuChildMap.put("parentName", "无");
            menuChildMap.put("createTime", new Date());
            menuChildMap.put("status", 0);
            List<Map<String, Object>> menuList = new ArrayList<Map<String, Object>>();
            menuList.add(menuChildMap);
            menuList.add(menuParentMap);
            model.addAttribute("req", req);
            request.setAttribute("menuList", menuList);
        }
        catch (Exception e)
        {
            //异常处理
        }
        //获取数据后 跳转到对应页面
        return "menu/menu_query";
    }

    /**
     * 函数功能描述：查询父菜单
     * @param request
     * @param menuId
     * @return
     */
    @RequestMapping("/queryMenuInfo")
    public String queryMenuInfo(HttpServletRequest request, MenuQueryRequest menuQuery, Model model)
    {
        BaseRequest req = new BaseRequest();
        req.setTitle("保存菜单页面");
        try
        {
            //调用接口 查询所有主菜单信息
            //.....
            if (menuQuery.getOp().equals("edit"))
            {
                // 调用接口  根据主键查询需修改的菜单信息
                //
                request.setAttribute("menu", "");
            }
            request.setAttribute("parentMenuList", "");
            request.setAttribute("op", menuQuery.getOp());
            model.addAttribute("req", req);
        }
        catch (Exception e)
        {
            // 异常处理
        }
        return "menu/menu_add";
    }

    /**
     * 函数功能描述：保存菜单信息
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("/ajaxSaveMenuInfo")
    @ResponseBody
    public BaseResponse ajaxSaveMenuInfo(Model model, MenuRequest menu)
    {
        BaseRequest req = new BaseRequest();
        req.setTitle("保存菜单信息");
        BaseResponse res = new BaseResponse();
        String tipMsg = null;
        //调用接口 完善用户信息
        //.....
        try
        {
            if (menu.getOp().equals("add"))
            {
                //保存菜单信息
                //buttonIds  sys_menu_button
            }
            if (menu.getOp().equals("edit"))
            {
                //修改菜单信息
                //buttonIds  sys_menu_button
            }
        }
        catch (Exception e)
        {
            //异常处理
        }
        //处理ajax返回结果
        processAjaxResult(res, tipMsg);
        ////返回验证数据
        return res;
    }

    /**
     * 函数功能描述：对菜单进行启用 停用
     * @param request
     * @param model
     * @param op   stop、start:分别对菜单执行不同的操作
     * @return
     */
    @RequestMapping("/ajaxHandleMenu")
    @ResponseBody
    public BaseResponse ajaxHandleMenu(Model model, MenuQueryRequest menuQuery)
    {
        BaseRequest req = new BaseRequest();
        req.setTitle("菜单信息");
        BaseResponse res = new BaseResponse();
        model.addAttribute("req", req);
        String tipMsg = null;
        //若menuids以-分割
        String[] menuId = {};
        try
        {
            menuId = menuQuery.getMenuIds().split("-");
            for (int i = 0; i < menuId.length; i++)
            {
                //调用接口 进行操作
                if (menuQuery.getOp().equals("stop"))
                {
                    //停用菜单
                }
                if (menuQuery.getOp().equals("start"))
                {
                    //启用菜单           
                }
            }

        }
        catch (Exception e)
        {
            //异常处理
        }
        //处理ajax返回结果
        processAjaxResult(res, tipMsg);
        ////返回验证数据
        return res;
    }

    /**
     * 函数功能描述：动态加载树形菜单按钮权限
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("/queryInitTree")
    @ResponseBody
    public BaseResponse queryInitTree(Model model, MenuQueryRequest menuQuery)
    {
        BaseRequest req = new BaseRequest();
        BaseResponse res = new BaseResponse();
        String tipMsg = "";
        req.setTitle("菜单权限页面");
        if (menuQuery.getOp().equals("add"))
        {
            //查询全部按钮数据
        }
        if (menuQuery.getOp().equals("edit"))
        {
            //查询所有按钮  该菜单下的按钮集合为选中状态
        }
        //调用接口 ... 
        List<ButtonTest> buttonList = new ArrayList<ButtonTest>();
        buttonList.add(new ButtonTest(2, "新增", 1));
        buttonList.add(new ButtonTest(3, "修改", 1));
        buttonList.add(new ButtonTest(4, "删除", 1));
        //buttonList.add(new Button(1,"用户管理",0));   

        List<Tree> childTreeList = SysUtil.packToTree(buttonList);
        if (buttonList != null && buttonList.size() > 0)
        {
            for (Tree child : childTreeList)
            {
                child.setChecked(true);
            }
            model.addAttribute("req", req);
            res.getData().put("buttonList", childTreeList);
        }
        processAjaxResult(res, tipMsg);
        //返回验证数据
        return res;
    }

    /**
     * 函数功能描述：查询主菜单和主菜单下的子菜单信息
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("/index")
    public String queryMainIndx(HttpServletRequest request, Model model)
    {
        BaseRequest req = new BaseRequest();
        req.setTitle("主页");
        //调用接口 获取菜单信息
        //.....   
        try
        {
            Map<String, Object> menuParentMap = new HashMap<String, Object>();
            menuParentMap.put("menuId", 1);
            menuParentMap.put("menuName", "基础管理");
            menuParentMap.put("urlPath", "/menu/menu_query");
            menuParentMap.put("parentId", 0);
            menuParentMap.put("status", 0);
            Map<String, Object> menuChildMap = new HashMap<String, Object>();

            menuChildMap.put("menuId", 2);
            menuChildMap.put("menuName", "用户管理");
            menuChildMap.put("urlPath", "/user/user_query");
            menuChildMap.put("parentId", 1);
            Map<String, Object> menuChildMap1 = new HashMap<String, Object>();

            menuChildMap1.put("menuId", 3);
            menuChildMap1.put("menuName", "数据字典管理");
            menuChildMap1.put("urlPath", "/user/..");
            menuChildMap1.put("parentId", 1);
            List<Map<String, Object>> menuList = new ArrayList<Map<String, Object>>();
            menuList.add(menuParentMap);
            menuList.add(menuChildMap);
            menuList.add(menuChildMap1);
            model.addAttribute("req", req);
            request.setAttribute("menuList", menuList);
        }
        catch (Exception e)
        {
            //异常处理
        }
        //获取数据后 跳转到对应页面
        return "main/index";
    }
}
