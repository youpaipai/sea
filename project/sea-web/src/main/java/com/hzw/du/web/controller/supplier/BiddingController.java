/*
 * 公司名称：江苏华招网信息技术有限公司
 * 版权信息：江苏华招网信息技术有限公司版权所有
 * 描述：已投标项目
 * 文件名称：BiddingController.java
 * 修改时间：2016-7-27
 * 修改人：王继洋
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.web.controller.supplier;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.time.DateUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hzw.du.biz.bean.constant.SysConstants;
import com.hzw.du.biz.bean.param.common.C017QuerySupplierProInput;
import com.hzw.du.biz.bean.param.common.C017QuerySupplierProOutput;
import com.hzw.du.biz.bean.param.common.C017SubDetail;
import com.hzw.du.biz.bean.param.common.C017TenderProjectDetail;
import com.hzw.du.common.date.DateUtil;
import com.hzw.du.common.isempty.EmptyUtils;
import com.hzw.du.web.controller.base.BaseController;
import com.hzw.du.web.entity.BaseRequest;
import com.hzw.du.web.entity.BaseResponse;
import com.hzw.du.web.entity.SessionUser;
import com.hzw.du.web.entity.WebPager;
import com.hzw.du.web.entity.request.supplier.ProjectRequest;
import com.hzw.du.web.entity.response.supplier.ProjectBean;

/**
 * 
 * 正在执行项目查询
 * @author 王继洋
 * @version V1.0[产品/模块版本]
 */
@Controller
@RequestMapping("/supplier")
public class BiddingController extends BaseController
{
    /**
     * 
     * 正在执行项目
     * @param model
     * @return
     */
    @RequestMapping("/BiddingProject")
    public String myBiddingProject(Model model) {
        BaseRequest req = new BaseRequest();
        req.setTitle("正在执行项目");
        model.addAttribute("req", req);
        return "supplier/BiddingProject";
    }
    
    /**
     * 
     * 函数功能描述：正在执行项目查询
     * @return
     */
    
    @RequestMapping("/queryBidding")
    @ResponseBody
    public BaseResponse queryBidding(ProjectRequest req) {
        BaseResponse res = new BaseResponse();
        String tipMsg = null;
        try {
            //1、传参
            C017QuerySupplierProInput input=new C017QuerySupplierProInput();
            
            //招标项目名称条件
            if(!EmptyUtils.isEmpty(req.getTenderProjectName())){
                input.setTenderProjectNameLike(req.getTenderProjectName());
            }
            
            //招标项目编号条件
            if(!EmptyUtils.isEmpty(req.getTenderProjectNum())){
                input.setTenderProjectNumLike(req.getTenderProjectNum());
            }      
            
            //开标日期条件
            List<String> openTimeList = new ArrayList<String>();
            if(!EmptyUtils.isEmpty(req.getStartTime())){//非空验证
                openTimeList.add(SysConstants.EXPRESSION_TYPE.GTE_SYMBOL + ","+req.getStartTime());
            }
            if(!EmptyUtils.isEmpty(req.getEndTime())){//非空验证
                openTimeList.add(SysConstants.EXPRESSION_TYPE.LTE_SYMBOL + ","+req.getEndTime());
            }
            if(!EmptyUtils.isEmpty(openTimeList)){//非空验证
                input.setOpenTimeList(openTimeList);
            }
            
            SessionUser sessionUser = getWebSessionUser();//session中的用户对象
            //供应商用户条件
            input.setSupplierUserIdList("001");
            
            //分页条件
            input.setCurrentPage(req.getCurrentPage());
            input.setPageSize(WebPager.SHOW_PER_PAGE_ROWS);
            
            //2.从接口获取数据
            C017QuerySupplierProOutput output=baseBiz.querySupplierPro(input);
            
            //3.处理返回的output，校验返回是否成功
            checkOutput(output);
            
            //4.创建分页对象
            WebPager webPager = WebPager.factoryBuilderPager(1, req.getCurrentPage());
            
            //5.处理返回detail，组成自己的bean返回
            List<C017TenderProjectDetail> list =output.getDetailList();
            List<ProjectBean> biddingList = new ArrayList<ProjectBean>();
            if(list != null){
                for(C017TenderProjectDetail item : list){
                    if(item == null){
                        continue;
                    }
                    ProjectBean bean = new ProjectBean();
                    bean.setTenderProjectName(item.getTenderProjectName());//项目名称
                    bean.setTenderProjectNum(item.getTenderProjectNum());//项目编号
                    if(item.getHaveSubFlag()!=null){//是否有包号
                        for(C017SubDetail subItem :output.getSubDetailList()){
                            bean.setOpenBidTime(DateUtil.dateToString(subItem.getOpenTime()));//开标时间
                        }
                    }
                    bean.setUnfinished("5");//接口缺少待完成操作数字段
                    biddingList.add(bean);
                }
            }
            //存放查询结果
            res.getData().put("webPager", webPager);
            res.getData().put("biddingList", biddingList);
        } catch (Exception e) {
            processException(res, "查询失败", e);
        }
            
        processAjaxResult(res, tipMsg);
        return res;
    }
    
}
