/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：招标项目查询 controller
 * 文件名称：BidController.java
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
import com.hzw.du.biz.bean.param.bean.SubProSupplierUser;
import com.hzw.du.biz.bean.param.common.C005ConnectNoticeDetail;
import com.hzw.du.biz.bean.param.common.C005ConnectNoticeInput;
import com.hzw.du.biz.bean.param.common.C005ConnectNoticeOutput;
import com.hzw.du.biz.bean.param.common.C022StandardSupplierAddInput;
import com.hzw.du.biz.bean.param.common.C022StandardSupplierAddOutput;
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
 * 招标项目查询 controller
 * @author wjy
 * @version V1.0[产品/模块版本]
 */
@Controller
@RequestMapping("/supplier")
public class BidController extends BaseController {

    /**
     * 
     * 我要投标（招标项目查询）
     * @param model
     * @return
     */
    @RequestMapping("/bidProject")
    public String bidProject(Model model) {
        BaseRequest req = new BaseRequest();
        req.setTitle("我要投标");
        model.addAttribute("req", req);
        return "supplier/bidProject";
    }

    /**
     * 
     * 招标项目（条件）查询
     * @param request
     * @return
     */
    @RequestMapping("/ajaxBidProject")
    @ResponseBody
    public BaseResponse ajaxBidProject(ProjectRequest req) {
        BaseResponse res = new BaseResponse();
        String tipMsg = null;
        try {
            //1、传参
            C005ConnectNoticeInput input=new C005ConnectNoticeInput();
            //公告条件
            input.setNoticeTypeList("1");//公告类型 1:招标公告 2:更正公告 3:中标公告 4.中标候选人公示

            //发布时间条件
            List<String> listStartTime = new ArrayList<String>();
            if(!EmptyUtils.isEmpty(req.getOpenBIdStratTime())){//非空验证
                listStartTime.add(SysConstants.EXPRESSION_TYPE.GTE_SYMBOL + ","+req.getOpenBIdStratTime());
            }
            if(!EmptyUtils.isEmpty(req.getOpenBidEndTime())){//非空验证
                listStartTime.add(SysConstants.EXPRESSION_TYPE.LTE_SYMBOL + ","+req.getOpenBidEndTime());
            }
            if(!EmptyUtils.isEmpty(listStartTime)){//非空验证
                input.setStartTimeList(listStartTime);
            }

            //截止时间条件
            List<String> listEndTime = new ArrayList<String>();
            if(!EmptyUtils.isEmpty(req.getCloseStart())){//非空验证
                listEndTime.add(SysConstants.EXPRESSION_TYPE.GTE_SYMBOL + ","+req.getCloseStart());
            }
            if(!EmptyUtils.isEmpty(req.getCloseEnd())){//非空验证
                listEndTime.add(SysConstants.EXPRESSION_TYPE.LTE_SYMBOL + ","+req.getCloseEnd());
            }
            if(!EmptyUtils.isEmpty(listEndTime)){//非空验证
                input.setEndTimeList(listEndTime);
            }
            
            //分页条件
            input.setCurrentPage(req.getCurrentPage());
            input.setPageSize(WebPager.SHOW_PER_PAGE_ROWS);
            
            //2.从接口获取数据
            C005ConnectNoticeOutput output = baseBiz.queryConnectNotice(input);
            //3.处理返回的output，校验返回是否成功
            checkOutput(output);
            
            //4、创建分页对象
            WebPager webPager = WebPager.factoryBuilderPager(output.getTotalRows(), req.getCurrentPage());
            
            //5、处理返回detail，组成自己的bean返回
            List<C005ConnectNoticeDetail> list =output.getDetail();
            List<ProjectBean> noticeList = new ArrayList<ProjectBean>();
            if(list != null){
                for(C005ConnectNoticeDetail item : list){
                    if(item == null){
                        continue;
                    }
                    ProjectBean bean = new ProjectBean();
                    bean.setTenderProjectId(item.getTenderProjectId());
                    bean.setTitle(item.getTitle());
                    bean.setContent(item.getContent());
//                  bean.setProjectType(item.getprj)
//                  bean.setProjectTypeDesc(rtnProjectTypeDesc(item.get));
                    if(item.getEndTime() != null){
                        bean.setOpenBidTime(DateUtil.dateToString(item.getEndTime(), DATE_FORMAT_TIME));
                    }
                    bean.setRemainTime(item.getRemainBidTime());
                    noticeList.add(bean);
                }
            }
            //存放查询结果
            res.getData().put("webPager", webPager);
            res.getData().put("noticeList", noticeList);
        } catch (Exception e) {
            processException(res, "查询失败", e);
        }
            
        processAjaxResult(res, tipMsg);
        return res;
    }

    /**
     * 我要投标
     * 函数功能描述：页面跳转
     * @param model
     * @return
     */
    @RequestMapping("/bidProjectInfo")
    public String bidProjectInfo(Model model){
        BaseRequest req = new BaseRequest();
        req.setTitle("我要投标");
        model.addAttribute("req", req);
        return "supplier/bidProjectInfo";
    }
    
    /**
     * 我要投标
     * 函数功能描述: 新增投标项目
     * @param request
     * @return
     */
    @RequestMapping("/addBidProject")
    @ResponseBody
    public BaseResponse addBidProject(ProjectRequest req) {
        BaseResponse res = new BaseResponse();
        String tipMsg = null;
        try {
            //1、传参
            C022StandardSupplierAddInput input = new C022StandardSupplierAddInput();
            
            //招标项目编号
            if(!EmptyUtils.isEmpty(req.getTenderProjectId())){
                input.setTenderProjectId(req.getTenderProjectId());
            }
            
            //是否是邀请供应商（此处是供应商主动参标，值未否）
            input.setIsInvite(SysConstants.IS_INVITE.FALSE);
          
            
            //项目标段对应的参标供应商关系列表 list
            List<SubProSupplierUser> subProSupplierList = new ArrayList<SubProSupplierUser>();
            
            //项目标段对应的参标供应商对象
            SubProSupplierUser item = new SubProSupplierUser();
            item.setSubId(req.getSubId());//1.将分包编号存入对象
            
            //供应商用户list
            SessionUser sessionUser = getWebSessionUser();//session中的用户对象
            List<Long> supplierUserIdList = new ArrayList<Long>();
            supplierUserIdList.add(sessionUser.getUserId());
            item.setSupplierUserIdList(supplierUserIdList);//2.将供应商list存入对象
            
            //添加项目标段对应的供应商关系
            subProSupplierList.add(item);
            
            //存储标段对应供应商关系条件
            input.setSubProSupplierList(subProSupplierList);
            
            
            //2.从接口获取数据
            C022StandardSupplierAddOutput output = baseBiz.standardSupplierAdd(input);

            //3.处理返回的output，校验返回是否成功
            checkOutput(output);
            //4.返回结果
            res.getData().put("addResult", "0000");
        } catch (Exception e) {
            processException(res, "新增投标项目失败", e);
        }
            
        processAjaxResult(res, tipMsg);
        return res;
    }
    
    /**
     * 项目信息
     * 函数功能描述：详情展示
     * @param req
     * @return
     */
    public BaseResponse showProjectInfo(ProjectRequest req){
        
        
        
        return null;
        
    }
    

}
