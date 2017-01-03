package com.hzw.du.web.controller.file;

import java.io.File;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.hzw.du.biz.bean.constant.BizErrorCode;
import com.hzw.du.biz.bean.constant.SysConstants;
import com.hzw.du.biz.bean.param.common.C001FileInput;
import com.hzw.du.biz.bean.param.common.C001FileOutput;
import com.hzw.du.biz.bean.param.common.C002FileDetail;
import com.hzw.du.biz.bean.param.common.C002FileInput;
import com.hzw.du.biz.bean.param.common.C002FileOutput;
import com.hzw.du.common.date.DateUtil;
import com.hzw.du.common.utils.StringUtils;
import com.hzw.du.web.controller.base.BaseController;
import com.hzw.du.web.entity.BaseRequest;
import com.hzw.du.web.entity.BaseResponse;
import com.hzw.du.web.entity.request.FileRequest;

/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：上传文件公共控制层
 * 文件名称：UploadController.java
 * 修改时间：2016-7-18
 * 修改人：libb
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
@Controller
@RequestMapping("/upload")
public class UploadController extends BaseController
{
    /* ******************************************************************************************* */
    /*                                       序列化代码区域                                                                                               */
    /* ******************************************************************************************* */

    /* ******************************************************************************************* */
    /*                                       全局变量声明区域                                                                                           */
    /* ******************************************************************************************* */

    /* ******************************************************************************************* */
    /*                                       公共函数声明区域                                                                                           */
    /* ******************************************************************************************* */

    /**
     * 
     * 函数功能描述：TODO
     * @return
     */
    @RequestMapping("/toAddOne")
    public String toAddOne(Model model)
    {
        BaseRequest req = new BaseRequest();
        req.setTitle("新增招标人");
        model.addAttribute("req", req);
        return "/file/uploadFile";
    }
    
    /**
     * 函数功能描述：上传文件公共请求
     * @param request
     * @param response
     * @param file
     * @param fileRequest
     * @return
     */
    @RequestMapping("/uploadFile")
    @ResponseBody
    public BaseResponse uploadFile(HttpServletRequest request, HttpServletResponse response, MultipartFile uploadifyFile, FileRequest fileRequest) 
    {
        response.setContentType("text/json;charset=utf-8");
        BaseResponse res = new BaseResponse();
        
        // 验证文件是否存在
        if (uploadifyFile.isEmpty())
        {
            res.setTipMsg("文件不存在");
            return res;
        }
        
        fileRequest.setOldFileName(uploadifyFile.getOriginalFilename());     // 文件原名称
        // 文件存储路径
        String relativePath = File.separator + fileRequest.getFileDir() + File.separator + DateUtil.dateToString(new Date(), "yyyyMM");
        String path = request.getSession().getServletContext().getRealPath("upload") + relativePath; 
        // 文件后缀名
        String formart = uploadifyFile.getOriginalFilename().substring(uploadifyFile.getOriginalFilename().lastIndexOf(".") + 1);  
        String fileName = StringUtils.getKey() + "." + formart;  
        
        File targetFile = new File(path, fileName);  
        if(!targetFile.exists())
        {  
            targetFile.mkdirs();  
        }  
  
        try 
        {  
            // 文件保存到服务器中  
            uploadifyFile.transferTo(targetFile);  
            
            C001FileInput fileInput = new C001FileInput();
            fileInput.setOperateType(SysConstants.OPERATE_TYPE.OPERATE_ADD);
            fileInput.setFileName(fileName);
            fileInput.setOldFileName(fileRequest.getOldFileName());
            fileInput.setFileType(fileRequest.getFileDir());
            fileInput.setFileDir(relativePath);
            fileInput.setFormart(formart);
            fileInput.setSubId(fileRequest.getSubId());
            fileInput.setTenderProjectId(fileRequest.getTenderProjectId());
            fileInput.setUserId(this.getWebSessionUser().getUserId());
            // 调用新增文件信息接口
            C001FileOutput fileOutPut = baseBiz.insertSysFile(fileInput);
            // 返回消息
            fileRequest.setFileId(fileOutPut.getFileId());
            fileRequest.setFileName(fileName);
            fileRequest.setFileDir(relativePath);
            
            res.setTipMsg("success");
            res.getData().put("res", fileRequest);
        } 
        catch (Exception e) 
        {  
            e.printStackTrace();  
            res.setTipMsg("上传文件失败"); 
            return res;  
        }  
        
        try 
        {  
            ObjectMapper objectMapper = new ObjectMapper();  
            response.setContentType("text/html;charset=UTF-8");  
            JsonGenerator jsonGenerator = objectMapper.getJsonFactory().createJsonGenerator(response.getOutputStream(), JsonEncoding.UTF8);  
            objectMapper.writeValue(jsonGenerator, res);  
        } 
        catch(Exception e) 
        {  
            e.printStackTrace();
        }  
        return null;
    }
    
    /**
     * 函数功能描述：删除文件公共请求
     * @param request
     * @param response
     * @param file
     * @param fileRequest
     * @return
     */
    @RequestMapping("/deleteFile")
    @ResponseBody
    public BaseResponse deleteFile(HttpServletRequest request, HttpServletResponse response, FileRequest fileRequest) 
    {
        response.setContentType("text/json;charset=utf-8");
        BaseResponse res = new BaseResponse();
        
        // 通过接口获取文件信息
        C002FileInput c002FileInput = new C002FileInput();
        c002FileInput.setFileId(fileRequest.getFileId());
        C002FileOutput c002FileOutput = baseBiz.getSysFileById(c002FileInput);
        C002FileDetail fileC002Detail = c002FileOutput.getFileDetail();
        String filePath = request.getSession().getServletContext().getRealPath("upload") + fileC002Detail.getFileDir();
        File targetFile = new File(filePath, fileC002Detail.getFileName());  
        if(targetFile.exists())
        {  
            // 不执行删除服务器中文件，只做数据逻辑删除
            // targetFile.delete();  
        }
        C001FileInput c001FileInput = new C001FileInput();
        c001FileInput.setOperateType(SysConstants.OPERATE_TYPE.OPERATE_MODIFY);
        c001FileInput.setFileId(fileRequest.getFileId());
        c001FileInput.setUserId(this.getWebSessionUser().getUserId());
        C001FileOutput c001FileOutput = baseBiz.modifySysFile(c001FileInput);
        res.setTipMsg(BizErrorCode.SUCCESS_CODE.equals(c001FileOutput.getErrorCode()) ? "success" : "fail");
        
        try 
        {  
            ObjectMapper objectMapper = new ObjectMapper();  
            response.setContentType("text/html;charset=UTF-8");  
            JsonGenerator jsonGenerator = objectMapper.getJsonFactory().createJsonGenerator(response.getOutputStream(), JsonEncoding.UTF8);  
            objectMapper.writeValue(jsonGenerator, res);  
        } 
        catch(Exception e) 
        {  
            e.printStackTrace();
        }  
        return null;
        
    }
    
    /* ******************************************************************************************* */
    /*                                       私有函数声明区域                                                                                           */
    /* ******************************************************************************************* */
}
