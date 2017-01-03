/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：我要投标 controller
 * 文件名称：BidCotroller.java
 * 修改时间：2016年7月15日
 * 修改人：wjy
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.web.controller.supplier;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.hzw.du.biz.bean.constant.SysConstants;
import com.hzw.du.biz.bean.param.common.C017QuerySupplierProInput;
import com.hzw.du.biz.bean.param.common.C017QuerySupplierProOutput;
import com.hzw.du.biz.bean.param.common.C017SubDetail;
import com.hzw.du.biz.bean.param.common.C017TenderProjectDetail;
import com.hzw.du.common.isempty.EmptyUtils;
import com.hzw.du.web.controller.base.BaseController;
import com.hzw.du.web.entity.BaseRequest;
import com.hzw.du.web.entity.BaseResponse;
import com.hzw.du.web.entity.WebPager;
import com.hzw.du.web.entity.request.supplier.ProjectRequest;
import com.hzw.du.web.entity.response.supplier.MyBidProjectBean;

/**
 * 已完成项目
 * @author wjy
 * @version V1.0[产品/模块版本]
 */
@Controller
@RequestMapping("/supplier")
public class BiddedController extends BaseController {

    /**
     * 
     * 我的投标项目
     * @param model
     * @return
     */
    @RequestMapping("/myBidProject")
    public String myBidProject(Model model) {
        BaseRequest req = new BaseRequest();
        req.setTitle("已完成项目");
        model.addAttribute("req", req);
        return "supplier/BiddedProject";
    }
    
    /**
     * 
     * 函数功能描述：我的投标项目查询
     * @return
     */
    
    @RequestMapping("/queryBiddedProject")
    @ResponseBody
    public BaseResponse queryBidProject(ProjectRequest req) {
        BaseResponse res = new BaseResponse();
        String tipMsg = null;
        try {
            //1、传参
            C017QuerySupplierProInput input=new C017QuerySupplierProInput();
            
            //项目名称条件
            if(!EmptyUtils.isEmpty(req.getTenderProjectName())){
                input.setTenderProjectNameLike(req.getTenderProjectName());
            }
            
            //项目编号条件
            if(!EmptyUtils.isEmpty(req.getTenderProjectNum())){
                input.setTenderProjectNumLike(req.getTenderProjectNum());
            }
            
            //是否中标
            if(!EmptyUtils.isEmpty(req.getBidStatus())){
                input.setBidStatus(req.getBidStatus());
            }
            
            input.setSupplierUserIdList("1");
            
            
            //2.从接口获取数据
            C017QuerySupplierProOutput output=baseBiz.querySupplierPro(input);
            
            //3.处理返回的output，校验返回是否成功
            checkOutput(output);
            
            //4.创建分页对象
            WebPager webPager = WebPager.factoryBuilderPager(output.getTotalRows(), req.getCurrentPage());
            
            //5.处理返回detail，组成自己的bean返回
            List<C017TenderProjectDetail> list =output.getDetailList();
            List<MyBidProjectBean> biddedList = new ArrayList<MyBidProjectBean>();
            if(list != null){
                for(C017TenderProjectDetail item : list){
                    if(item == null || item.getTenderProjectId() == null){
                        continue;
                    }
                    MyBidProjectBean bean = new MyBidProjectBean();
                    bean.setProjectName(item.getTenderProjectName());//项目名称
                    bean.setProjectNum(item.getTenderProjectNum());//项目编号
                    //处理包号
                    if(SysConstants.BOOLEAN_TYPE.TRUE.equals(item.getHaveSubFlag())){
                        for (C017SubDetail subItem : output.getSubDetailList()){
                            if (!diffLongObjValue(subItem.getSupplierUserId(), item.getSupplierUserId()) 
                                    || !diffLongObjValue(subItem.getTenderProjectId(), item.getTenderProjectId())){
                                continue;
                            }
                            bean.setSubName(subItem.getSubName());//包号名称
                            bean.setOpenAddress(subItem.getOpenAddress());//开标地点
                            bean.setBidStatus(subItem.getBidStatus());//是否中标
                        }
                    }
                    biddedList.add(bean);
                }
            }
            //存放查询结果
            res.getData().put("webPager", webPager);
            res.getData().put("biddedList", biddedList);
        } catch (Exception e) {
            processException(res, "查询失败", e);
        }
            
        processAjaxResult(res, tipMsg);
        return res;
    }
    
    
}
