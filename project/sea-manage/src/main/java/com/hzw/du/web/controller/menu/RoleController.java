/*
 * 公司名称：江苏华招网信息技术有限公司
 * 版权信息：江苏华招网信息技术有限公司版权所有
 * 描述：角色管理
 * 文件名称：RoleController.java
 * 修改时间：2016-8-1
 * 修改人：zl
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
package com.hzw.du.web.controller.menu;

import java.util.ArrayList;
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
import com.hzw.du.web.entity.request.RoleQueryRequest;
import com.hzw.du.web.entity.request.RoleRequest;

/**
 * 角色管理类 
 * @author
 * @version V1.0[产品/模块版本]
 */
@Controller
@RequestMapping("/role")
public class RoleController extends BaseController
{
    /**
     * 函数功能描述：查询角色信息列表
     * @param model
     * @param request
     * @return
     */
    @RequestMapping("/queryRoleList")
    public String queryRoleList(HttpServletRequest request, Model model)
    {
        BaseRequest req = new BaseRequest();
        req.setTitle("角色列表");
        //调用接口 获取角色信息
        //.....   
        try
        {
            Map<String, Object> roleParentMap = new HashMap<String, Object>();
            roleParentMap.put("roleId", 1);
            roleParentMap.put("roleName", "系统管理员角色");
            roleParentMap.put("type", 1);
            roleParentMap.put("createId", 1);
            roleParentMap.put("status", 0);
            Map<String, Object> roleChildMap = new HashMap<String, Object>();
            roleChildMap.put("roleId", 1);
            roleChildMap.put("roleName", "招标人角色");
            roleChildMap.put("type", 1);
            roleChildMap.put("createId", 1);
            roleChildMap.put("status", 0);
            List<Map<String, Object>> roleList = new ArrayList<Map<String, Object>>();
            roleList.add(roleChildMap);
            roleList.add(roleParentMap);

            model.addAttribute("req", req);
            request.setAttribute("roleList", roleList);
        }
        catch (Exception e)
        {
            //异常处理
        }
        //获取数据后 跳转到对应页面
        return "role/role_query";
    }

    /**
     * 函数功能描述：对角色进行启用 停用
     * @param request
     * @param model
     * @param roleQuery
     * @return
     */
    @RequestMapping("/ajaxHandleRole")
    @ResponseBody
    public BaseResponse ajaxHandleRole(Model model, RoleQueryRequest roleQuery)
    {
        BaseRequest req = new BaseRequest();
        req.setTitle("角色信息");
        BaseResponse res = new BaseResponse();
        model.addAttribute("req", req);
        String tipMsg = null;
        //若roleids以-分割
        String[] roleId = {};
        try
        {
            roleId = roleQuery.getRoleIds().split("-");
            for (int i = 0; i < roleId.length; i++)
            {
                //调用接口 进行操作
                if (roleQuery.getOp().equals("stop"))
                {
                    //停用角色
                }
                if (roleQuery.getOp().equals("start"))
                {
                    //启用角色     
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
     * 函数功能描述：查询角色信息、角色类型
     * @param request
     * @param roleQuery
     * @return
     */
    @RequestMapping("/queryRoleInfo")
    public String queryRoleInfo(HttpServletRequest request, RoleQueryRequest roleQuery, Model model)
    {
        BaseRequest req = new BaseRequest();
        req.setTitle("保存角色页面");
        try
        {
            //调用接口 查询角色类型信息
            //......
            if (roleQuery.getOp().equals("edit"))
            {
                // 调用接口  根据主键查询需修改的角色信息
                //...
                request.setAttribute("role", "");
            }
            request.setAttribute("roleTypeList", "");
            request.setAttribute("op", roleQuery.getOp());
            model.addAttribute("req", req);
        }
        catch (Exception e)
        {
            // 异常处理
        }
        return "role/role_add";
    }

    /**
     * 函数功能描述：保存角色信息
     * @param roleQuery
     * @param model
     * @return
     */
    @RequestMapping("/ajaxSaveRoleInfo")
    @ResponseBody
    public BaseResponse ajaxSaveRoleInfo(Model model, RoleRequest role)
    {
        BaseRequest req = new BaseRequest();
        req.setTitle("保存角色信息");
        BaseResponse res = new BaseResponse();
        String tipMsg = null;
        //调用接口 完善角色信息
        //.....
        try
        {
            if (role.getOp().equals("add"))
            {
                //保存角色信息
            }
            if (role.getOp().equals("edit"))
            {
                //修改角色信息
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
     * 函数功能描述：动态加载树形角色菜单按钮权限
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("/queryInitTree")
    @ResponseBody
    public BaseResponse queryInitTree(Model model, RoleQueryRequest roleQuery)
    {
        BaseRequest req = new BaseRequest();
        BaseResponse res = new BaseResponse();
        String tipMsg = "";
        req.setTitle("角色权限页面");
        if (roleQuery.getOp().equals("add"))
        {
            //查询全部菜单及权限集合
        }
        if (roleQuery.getOp().equals("edit"))
        {
            //查询该角色下的菜单及权限集合
        }
      
        //调用接口
        List<ButtonTest> menuList = new ArrayList<ButtonTest>();
        //list menuList   menuid   buttonstr 该角色的菜单按钮集合 sys_role_menu_button
        menuList.add(new ButtonTest(1,"5,6"));
        menuList.add(new ButtonTest(2,"3,4"));
        
        List<ButtonTest> menubuttonList = new ArrayList<ButtonTest>();
        //menuid  menuname  parentid  
        menubuttonList.add(new ButtonTest( 1,"用户管理", 0));
        menubuttonList.add(new ButtonTest(2,"菜单管理",0));
    
        //buttonid  buttonname menuid
        menubuttonList.add(new ButtonTest(5, "启用", 1));
        menubuttonList.add(new ButtonTest(6, "停用", 1));
        menubuttonList.add(new ButtonTest(3, "新增", 2));
        menubuttonList.add(new ButtonTest(4, "修改", 2));
        List<Tree> childTreeList = SysUtil.packToTree(menubuttonList);
        //menuList add
        for (ButtonTest menu : menuList)
        {
            //获取菜单编号
            int menuId = menu.getMenuId();
            for (Tree tree : childTreeList)
            {
                //菜单编号等于树的菜单编号
                if (menuId == tree.getId())
                {
                    //默认选中
                    tree.setChecked(true);
                    //获取菜单写的按钮集合
                    String buttonIdAll = menu.getButtonStr();
                    if (buttonIdAll != "")
                    {
                        //进行分割
                        String[] buttonIds = buttonIdAll.split(",");
                        for (String bid : buttonIds)
                        {
                            int buttonIdInt = Integer.parseInt(bid);
                            for (Tree treeButton : childTreeList)
                            {//遍历菜单树
                                if (buttonIdInt == treeButton.getId() && menuId == treeButton.getpId(   ))
                                {
                                    treeButton.setChecked(true);
                                }
                            }
                        }
                    }
                    break;
                }
            }
           
        }
        res.getData().put("buttonList", childTreeList);
        model.addAttribute("req", req);
      
        processAjaxResult(res, tipMsg);
        //返回验证数据
      return res;
    }

}
