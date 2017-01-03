package com.hzw.du.web.controller.file;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hzw.du.biz.bean.param.common.C002FileDetail;
import com.hzw.du.biz.bean.param.common.C002FileInput;
import com.hzw.du.biz.bean.param.common.C002FileOutput;
import com.hzw.du.biz.request.BaseBiz;
import com.hzw.du.common.utils.StringUtils;
import com.hzw.du.web.controller.base.BaseController;
import com.hzw.du.web.entity.request.FileRequest;


/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：下载文件公共控制层
 * 文件名称：DownloadController.java
 * 修改时间：2016-7-18
 * 修改人：libb
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
@Controller
@RequestMapping("/download")
public class DownloadController extends BaseController
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
     * 函数功能描述：下载文件公共请求
     * @param fileRequest
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value="/downloadFile")
    public ResponseEntity<byte[]> downFile(FileRequest fileRequest, HttpServletRequest request, HttpServletResponse response) 
    {
        try
        {
            download(request, response, fileRequest, baseBiz);
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    
    /**
     * 
     * 函数功能描述：下载文件
     * @param request
     * @param response
     * @param fileRequest
     * @param baseBiz
     * @throws IOException
     */
    private static void download(HttpServletRequest request, HttpServletResponse response, FileRequest fileRequest, BaseBiz baseBiz) throws IOException 
    {
        // 通过接口获取文件信息
        C002FileInput c002FileInput = new C002FileInput();
        c002FileInput.setFileId(fileRequest.getFileId());
        C002FileOutput c002FileOutput = baseBiz.getSysFileById(c002FileInput);
        C002FileDetail c002FileDetail = c002FileOutput.getFileDetail();
        
        String filePath = request.getSession().getServletContext().getRealPath("upload") + c002FileDetail.getFileDir();
        File file = new File(filePath, c002FileDetail.getFileName()); 

        if(StringUtils.isEmpty(c002FileDetail.getOldFileName())) {
            c002FileDetail.setOldFileName(file.getName());
        }

        if (!file.exists() || !file.canRead()) {
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write("您下载的文件不存在！");
            return;
        }

        String userAgent = request.getHeader("User-Agent");
        boolean isIE = (userAgent != null) && (userAgent.toLowerCase().indexOf("msie") != -1);

        response.reset();
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "must-revalidate, no-transform");
        response.setDateHeader("Expires", 0L);

        response.setContentType("application/x-download");
        response.setContentLength((int) file.length());

        String displayFilename = c002FileDetail.getOldFileName().substring(c002FileDetail.getOldFileName().lastIndexOf("_") + 1);
        displayFilename = displayFilename.replace(" ", "_");
        if (isIE) {
            displayFilename = URLEncoder.encode(displayFilename, "UTF-8");
            response.setHeader("Content-Disposition", "attachment;filename=\"" + displayFilename + "\"");
        } else {
            displayFilename = new String(displayFilename.getBytes("UTF-8"), "ISO8859-1");
            response.setHeader("Content-Disposition", "attachment;filename=" + displayFilename);
        }
        BufferedInputStream is = null;
        OutputStream os = null;
        try {

            os = response.getOutputStream();
            is = new BufferedInputStream(new FileInputStream(file));
            IOUtils.copy(is, os);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(is);
        }
    }

    /* ******************************************************************************************* */
    /*                                       私有函数声明区域                                                                                           */
    /* ******************************************************************************************* */
}
