/*
 * 公司名称：江苏华招网信息技术有限公司
 * 版权信息：江苏华招网信息技术有限公司版权所有
 * 描述：保证金上传、下载、退还、查看
 * 文件名称：DepositCotroller.java
 * 修改时间：2016-7-27
 * 修改人：王继洋
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.web.controller.supplier;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hzw.du.common.isempty.EmptyUtils;
import com.hzw.du.web.controller.base.BaseController;
import com.hzw.du.web.entity.BaseRequest;
import com.hzw.du.web.entity.BaseResponse;
import com.hzw.du.web.entity.request.supplier.DepositRequest;

/**
 * 供应商保证金操作
 * <功能详细描述>
 * @author 王继洋
 * @version V1.0[产品/模块版本]
 */
@Controller
@RequestMapping("/supplier")
public class DepositController extends BaseController
{
 
    /**
     * 保证金项目查询
     * 函数功能描述：页面跳转
     * @param model
     * @return
     */
    @RequestMapping("/depositView")
    public String depositView(Model model) {
        BaseRequest req = new BaseRequest();
        req.setTitle("保证金查询");
        model.addAttribute("req", req);
        return "supplier/depositView";
    }
    
    /**
     * 保证金上传
     * 函数功能描述：页面跳转
     * @param model
     * @return
     */
    @RequestMapping("/depositUpload")
    public String depositUpload(Model model) {
        BaseRequest req = new BaseRequest();
        req.setTitle("保证金上传");
        model.addAttribute("req", req);
        return "supplier/depositUpload";
    }
    
    /**
     * 提醒退还保证金
     * 函数功能描述：页面跳转
     * @param model
     * @return
     */
    @RequestMapping("/returnDeposit")
    public String returnDeposit(Model model) {
        BaseRequest req = new BaseRequest();
        req.setTitle("退还保证金");
        model.addAttribute("req", req);
        return "supplier/returnDeposit";
    }
    
    
    
    
    /**
     * 保证金项目查询
     * 函数功能描述：TODO
     * @param req
     * @return
     */
    @RequestMapping("/queryDeposit")
    @ResponseBody
    public BaseResponse queryDeposit(DepositRequest req) {
        BaseResponse res = new BaseResponse();
        String tipMsg = null;
        try {
            //1、传参
            //C005ConnectNoticeInput input=new C005ConnectNoticeInput();
            
            //项目名称条件
            if(EmptyUtils.isEmpty(req.getProjectName())){
                //存储参数
            }
            
            //项目编号条件
            if(EmptyUtils.isEmpty(req.getProjectNum())){
                //存储参数
            }
            
            //是完成退款
            if(EmptyUtils.isEmpty(req.getRefund())){
                //存储参数
            }
            
            
            //2.从接口获取数据
            //C005ConnectNoticeOutput output = baseBiz.queryConnectNotice(input);
            
            //3.处理返回的output，校验返回是否成功
            //checkOutput(output);
            
            //4.处理返回detail，组成自己的bean返回
//            List<C005ConnectNoticeDetail> list =output.getDetail();
//            List<BidBean> noticeList = new ArrayList<BidBean>();
//            if(list != null){
//                for(C005ConnectNoticeDetail item : list){
//                    if(item == null){
//                        continue;
//                    }
//                    BidBean bean = new BidBean();
//                    bean.setTitle(item.getTitle());
//                    bean.setContent(item.getContent());
////                  bean.setProjectType(item.getprj)
////                  bean.setProjectTypeDesc(rtnProjectTypeDesc(item.get));
//                    if(item.getEndTime() != null){
//                        bean.setOpenBidTimeStr(DateUtil.dateToString(item.getEndTime(), DATE_FORMAT_TIME));
//                    }
//                    bean.setRemainTime(item.getRemainBidTime());
//                    noticeList.add(bean);
//                }
//            }
//            //存放查询结果
//            res.getData().put("depositList", depositList);
        } catch (Exception e) {
            processException(res, "查询失败", e);
        }
            
        processAjaxResult(res, tipMsg);
        return res;
    }
    
    /**
     * 保证金上传查询 
     * 函数功能描述：TODO
     * @param req
     * @return
     */
   @RequestMapping("/queryDepositUpload")
   @ResponseBody
   public BaseResponse queryDepositUpload(DepositRequest req) {
       BaseResponse res = new BaseResponse();
       String tipMsg = null;
       try {
           //1、传参
           //C005ConnectNoticeInput input=new C005ConnectNoticeInput();
           
           //项目名称条件
           if(EmptyUtils.isEmpty(req.getProjectName())){
               //存储参数
           }
           
           //项目编号条件
           if(EmptyUtils.isEmpty(req.getProjectNum())){
               //存储参数
           }
           
           //是完成退款
           if(EmptyUtils.isEmpty(req.getRefund())){
               //存储参数
           }
           
           
           //2.从接口获取数据
           //C005ConnectNoticeOutput output = baseBiz.queryConnectNotice(input);
           
           //3.处理返回的output，校验返回是否成功
           //checkOutput(output);
           
           //4.处理返回detail，组成自己的bean返回
//           List<C005ConnectNoticeDetail> list =output.getDetail();
//           List<BidBean> noticeList = new ArrayList<BidBean>();
//           if(list != null){
//               for(C005ConnectNoticeDetail item : list){
//                   if(item == null){
//                       continue;
//                   }
//                   BidBean bean = new BidBean();
//                   bean.setTitle(item.getTitle());
//                   bean.setContent(item.getContent());
////                 bean.setProjectType(item.getprj)
////                 bean.setProjectTypeDesc(rtnProjectTypeDesc(item.get));
//                   if(item.getEndTime() != null){
//                       bean.setOpenBidTimeStr(DateUtil.dateToString(item.getEndTime(), DATE_FORMAT_TIME));
//                   }
//                   bean.setRemainTime(item.getRemainBidTime());
//                   noticeList.add(bean);
//               }
//           }
//           //存放查询结果
//           res.getData().put("depositList", depositList);
       } catch (Exception e) {
           processException(res, "查询失败", e);
       }
           
       processAjaxResult(res, tipMsg);
       return res;
   }
   
}
