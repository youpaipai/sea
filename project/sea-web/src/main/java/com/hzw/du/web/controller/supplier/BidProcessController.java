/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：投标流程 controller
 * 文件名称：BidProcessController.java
 * 修改时间：2016年7月15日
 * 修改人：wjy
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.web.controller.supplier;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hzw.du.biz.bean.constant.SysConstants;
import com.hzw.du.biz.bean.param.bussiness.B001SupplierDownTendFileInput;
import com.hzw.du.common.isempty.EmptyUtils;
import com.hzw.du.web.controller.base.BaseController;
import com.hzw.du.web.entity.BaseRequest;
import com.hzw.du.web.entity.BaseResponse;
import com.hzw.du.web.entity.request.FileRequest;
import com.hzw.du.web.entity.request.supplier.BidReportDetailRequest;

/**
 * 投标流程
 * @author wjy
 * @version V1.0[产品/模块版本]
 */
@Controller
@RequestMapping("/BidProcess")
public class BidProcessController extends BaseController {
    
    
    /**
     * 上传付费凭证
     * 函数功能描述：页面跳转、初始化    
     * @param model
     * @return
     */
    @RequestMapping("uploadVoucher")
    public String uploadVoucher(Model model) {
        FileRequest req = new FileRequest();
//        req.setTitle("上传付费凭证");
//        req.getTenderProjectId();//获取招标项目编号
//        req.getSubId();//获取分包编号
        //从接口获取查询结果
        //如果有
//        req.setFileId(fileId);
//        req.setFileName(fileName);
        model.addAttribute("req", req);
        return "supplier/uploadVoucher";
    }

    
    /**
     * 上传付费凭证
     * 函数功能描述：上传
     * @param req
     * @return
     */
    @RequestMapping("/upVoucher")
    @ResponseBody
    public BaseResponse upVoucher(FileRequest req) {
        BaseResponse res = new BaseResponse();
        if(!EmptyUtils.isEmpty(req.getTenderProjectId())){//非空验证
            //存储参数
        }
        
        if(!EmptyUtils.isEmpty(req.getFileId())){//非空验证
            //存储参数
        }
        
        if(!EmptyUtils.isEmpty(req.getSubId())){//非空验证
            //存储参数
        }
        
        if(!EmptyUtils.isEmpty(req.getUserId())){//非空验证
            //存储参数
        }
        
        //从接口获取插入结果
        
        //对结果进行操作  
        
        //返回结果
        
        return res;
    }
    
    /**
     * 下载招标文件
     * 函数功能描述：页面跳转
     * @param model
     * @return
     */
    @RequestMapping("downTenderFile")
    public String downTenderFile(Model model) {
        BaseRequest req = new BaseRequest();
        req.setTitle("下载招标文件");
        model.addAttribute("req", req);
        return "supplier/downTenderFile";
    }

    /**
     * 
     * 上传投标文件（跳转页面）
     * @param model
     * @return
     */
    @RequestMapping("uploadBidFile")
    public String uploadBidFile(Model model) {
        BaseRequest req = new BaseRequest();
        req.setTitle("上传投标文件");
        model.addAttribute("req", req);
        return "supplier/uploadBidFile";
    }
    

    /**
     * 我的评估报告
     * 函数功能描述：页面跳转、页面初始化
     * @param model
     * @return
     */
    @RequestMapping("bidReport")
    public String bidReport(Model model) {
        BidReportDetailRequest req = new BidReportDetailRequest();
//        req.setSubNum(subNum);//设置分包编号
//        req.setSubNum(subNum);//招标项目包号
        //从接口获取数据
        req.setTitle("我的评估报告");
        model.addAttribute("req", req);
        return "supplier/bidReport";
    }
    
    /**
     * 我的评估报告
     * 函数功能描述：页面跳转
     * @param model
     * @return
     */
    @RequestMapping("bidResult")
    public String bidResult(Model model) {
        BaseRequest req = new BaseRequest();
        req.setTitle("中标结果");
        model.addAttribute("req", req);
        return "supplier/bidResult";
    }
    
    
    
    
     

}
