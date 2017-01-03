/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：用户 controller
 * 文件名称：UsersCotroller.java
 * 修改时间：2016年7月18日
 * 修改人：zl
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.web.controller.users;

import java.net.URLDecoder;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.hzw.du.web.controller.base.BaseController;
import com.hzw.du.web.entity.BaseRequest;
import com.hzw.du.web.entity.BaseResponse;
import com.hzw.du.web.entity.UsersTest;

/**
 * <一句话功能简述>对用户进行操作：具体可执行新增、启用、停用、权限分配等
 * @author zl
 * @version V1.0[产品/模块版本]
 */
@Controller
@RequestMapping("/users")
public class UsersController extends BaseController
{
    /**
     * 函数功能描述：查询用户数据列表信息
     * @param request
     * @param model
     * @param username
     * @param phone
     * @param staffcode
     * @return
     */
    @RequestMapping("/queryUser")
    public String queryUser(HttpServletRequest request, Model model, String username, String phone, String staffcode)
    {
        BaseRequest req = new BaseRequest();
        req.setTitle("用户列表");
        //调用接口 获取用户信息
        //.....   
        try
        {
            //请求参数：username phone  staffcode 
            // 显示字段：userid   username  phone staffcode  status  regindate
            List<UsersTest> userList = new ArrayList<UsersTest>();
            userList.add(new UsersTest(1, "张三", "13921992194", "admin", 1, new Date()));
            userList.add(new UsersTest(2, "李四", "13921992194", "admin1", 2, new Date()));
            List<UsersTest> buttonList = new ArrayList<UsersTest>();
            buttonList.add(new UsersTest(1, "Users.addUserInfo()", "添加"));
            model.addAttribute("req", req);
            request.setAttribute("userList", userList);
            //按钮集合
            request.setAttribute("buttonList", buttonList);
        }
        catch (Exception e)
        {
            //异常处理
        }
        //获取数据后 跳转到对应页面
        return "users/user_query";
    }

    /**
     *  函数功能描述：跳转到完善用户信息页面
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("/addUser")
    public String addUser(HttpServletRequest request, Model model)
    {
        BaseRequest req = new BaseRequest();
        req.setTitle("完善用户信息");
        model.addAttribute("req", req);
        model.addAttribute("op", "add");
        //加载证件类型数据
        //加载角色类型数据
        //加载机构类型数据   	
        //获取数据后 跳转到对应页面
        return "users/user_add";
    }

    /**
     * 函数功能描述：验证：账号是否唯一
     * @param request
     * @param model
     * @param staffcode
     * @return
     */
    @RequestMapping("/ajaxCheckStaffcode")
    @ResponseBody
    public BaseResponse ajaxCheckStaffcode(HttpServletRequest request, Model model, String staffcode)
    {
        BaseResponse res = new BaseResponse();
        BaseRequest req = new BaseRequest();
        req.setTitle("完善用户信息");
        model.addAttribute("req", req);
        String tipMsg = null;
        //调用接口 判断此账号是否已存在
        //.....
        try
        {
            //if(条件判断){
            //不存在
            tipMsg = "";
            //}else{
            //已存在
            tipMsg = "exists";
            //}
        }
        catch (Exception e)
        {
            //异常处理
        }
        //处理ajax返回结果
        processAjaxResult(res, tipMsg);
        //返回验证数据
        return res;
    }

    /**
     * 函数功能描述：验证：手机号码是否唯一
     * @param request
     * @param model
     * @param phone
     * @return
     */
    @RequestMapping("/ajaxCheckPhone")
    @ResponseBody
    public BaseResponse ajaxCheckPhone(HttpServletRequest request, Model model, String phone)
    {
        BaseResponse res = new BaseResponse();
        BaseRequest req = new BaseRequest();
        req.setTitle("完善用户信息");
        model.addAttribute("req", req);
        String tipMsg = null;
        //调用接口 判断此手机号码是否已存在
        //.....
        try
        {
            //if(条件判断){
            //不存在
            tipMsg = "";
            //}else{
            //已存在
            tipMsg = "exists";
            //}
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
     * 函数功能描述：完善用户信息
     * @param request
     * @param model
     * @param user
     * @return
     */
    @RequestMapping("/ajaxAddUserInfo")
    @ResponseBody
    public BaseResponse ajaxAddUserInfo(HttpServletRequest request, Model model, UsersTest user)
    {
        BaseResponse res = new BaseResponse();
        BaseRequest req = new BaseRequest();
        req.setTitle("完善用户信息");
        model.addAttribute("req", req);
        String tipMsg = null;
        //调用接口 完善用户信息
        //.....
        try
        {
            //
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
     * 函数功能描述：子用户数据
     * @param request
     * @param userId
     * @param model
     * @return
     */
    @RequestMapping("/detailPage")
    public String detailPage(HttpServletRequest request, Integer userId, Model model)
    {
        try
        {
            BaseRequest req = new BaseRequest();
            req.setTitle("完善用户信息");
            model.addAttribute("req", req);
            //获取主用户数据
            UsersTest user = new UsersTest(URLDecoder.decode(request.getParameter("username"), "utf-8"), 1, request.getParameter("phone"), request.getParameter("staffcode"), Integer.parseInt(request
                    .getParameter("status")));
            model.addAttribute("user", user);
            //获取主用户下的子用户详情列表
            //请求参数： 主用户id
            // 显示字段：userid   username  phone staffcode  status  regindate
            List<UsersTest> userChildList = new ArrayList<UsersTest>();
            userChildList.add(new UsersTest(1, "张三", "13921992194", "child", 1, new Date()));
            userChildList.add(new UsersTest(2, "李四", "13921992194", "child1", 2, new Date()));
            request.setAttribute("userChildList", userChildList);
        }
        catch (Exception e)
        {
            //异常处理
        }
        return "users/user_child";
    }

    /**
     * 函数功能描述：对用户进行操作 启用 停用 删除
     * @param request
     * @param userIds 用户id（可以多个 以-分割）
     * @param model
     * @param op stop、start、del:分别对用户执行不同的操作
     * @return
     */
    @RequestMapping("/ajaxHandleUser")
    public String ajaxHandleUser(HttpServletRequest request, String userIds, Model model, String op)
    {
        BaseRequest req = new BaseRequest();
        req.setTitle("完善用户信息");
        model.addAttribute("req", req);
        //若userids以-分割
        String[] userId = {};
        try
        {
            if (op.equals("stop"))
            {
                //停用用户
                userId = userIds.split("-");
                for (int i = 0; i < userId.length; i++)
                {
                    //调用接口 进行操作
                }
            }
            else if (op.equals("start"))
            {
                //启用用户    			
            }
            else
            {
                //删除用户
                userId = userIds.split("-");
                for (int i = 0; i < userId.length; i++)
                {
                    //调用接口 进行操作
                }
            }
        }
        catch (Exception e)
        {
            //异常处理
        }
        return "users/user_query";
    }

    /**
     * 函数功能描述：主用户详情
     * @param request
     * @param userIds
     * @param model
     * @param op
     * @return
     */
    @RequestMapping("/ajaxEditUser")
    public String ajaxEditUser(HttpServletRequest request, Integer userId, Model model)
    {
        BaseRequest req = new BaseRequest();
        req.setTitle("修改用户信息");
        model.addAttribute("req", req);
        model.addAttribute("op", "edit");
        try
        {
            //调用接口 获取数据
            UsersTest user = new UsersTest(1, "alice", 1, "13921992194", "admin", 1, new Date());
            request.setAttribute("u", user);

        }
        catch (Exception e)
        {
            // 异常处理
        }
        return "users/user_add";
    }

    /**
     * 函数功能描述：修改用户信息
     * @return
     */
    @RequestMapping("/ajaxEditUserInfo")
    @ResponseBody
    public BaseResponse ajaxEditUserInfo(HttpServletRequest request, Model model, UsersTest user)
    {
        BaseResponse res = new BaseResponse();
        BaseRequest req = new BaseRequest();
        req.setTitle("修改用户信息");
        model.addAttribute("req", req);
        String tipMsg = null;
        //调用接口 完善用户信息
        //.....
        try
        {

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
     * 函数功能描述：处理用户分配权限页面
     * @param request
     * @param model
     * @param op 区分功能：添加还是修改
     * @return
     */
    @RequestMapping("/menuAndButtonTree")
    public String menuAndButtonTree(HttpServletRequest request, Model model, String op, String roleId)
    {
        BaseResponse res = new BaseResponse();
        BaseRequest req = new BaseRequest();
        req.setTitle("修改用户信息");
        model.addAttribute("req", req);
        model.addAttribute("showButton", request.getParameter("showButton"));
        if (op.equals("add"))
        {
            roleId = "-1";
        }
        else
        {
            roleId = roleId;
        }
        model.addAttribute("roleId", roleId);// 选中的角色
        model.addAttribute("type", request.getParameter("type"));
        model.addAttribute("userId", request.getParameter("userId"));
        model.addAttribute("op", op);

        return "users/user_select_role";
    }

    @RequestMapping("/ajaxInitMenuAndButtonTree")
    public String ajaxMenuAndButtonTree(HttpServletRequest request, String roleId)
    {
        //判断操作时修改还是添加   

        return "";
    }
}
