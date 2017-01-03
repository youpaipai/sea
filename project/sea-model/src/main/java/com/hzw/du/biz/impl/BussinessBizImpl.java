/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 文件名称：BussinessBizImpl.java
 * 修改时间：2016年7月14日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
 	
package com.hzw.du.biz.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hzw.du.biz.BussinessBiz;
import com.hzw.du.biz.bean.constant.BizErrorCode;
import com.hzw.du.biz.bean.constant.SysConstants;
import com.hzw.du.biz.bean.param.bean.SupplierTendFeeBean;
import com.hzw.du.biz.bean.param.bean.SysFileBean;
import com.hzw.du.biz.bean.param.bussiness.B001SupplierDownTendFileInput;
import com.hzw.du.biz.bean.param.bussiness.B001SupplierDownTendFileOutput;
import com.hzw.du.biz.bean.param.bussiness.B002SupplierTendFeeInput;
import com.hzw.du.biz.bean.param.bussiness.B002SupplierTendFeeOutput;
import com.hzw.du.biz.check.BussinessInputCheck;
import com.hzw.du.biz.exception.BizException;
import com.hzw.du.model.mapper.SysFile;
import com.hzw.du.model.mapper.SysUser;
import com.hzw.du.model.mapper.TbPurchaseFile;
import com.hzw.du.model.mapper.TbStandardSupplier;

/**
 * 业务系统独有接口
 * <功能详细描述>
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class BussinessBizImpl extends BaseBizImpl implements BussinessBiz{
    
    /**
     * 函数功能描述：供应招标文件下载地址获取
     * @param input
     * @return
     */    
    @Override
    public B001SupplierDownTendFileOutput supplierDownTendFile(B001SupplierDownTendFileInput input) {
        B001SupplierDownTendFileOutput output = new B001SupplierDownTendFileOutput();
        try{
            //1、校验参数
            BussinessInputCheck.check_B001TendFile(input);
            
            //2-1、查询供应商组织机构
            SysUser sysUser = baseDao.getSysUserById(input.getSupplierUserId());
            if(sysUser == null){
                throw new BizException(BizErrorCode.ERROR_CODE_0004, "供应商信息不存在");
            }
            if(sysUser.getOrganizationId() == null){
                throw new BizException(BizErrorCode.ERROR_CODE_0004, "供应商组织机构不存在");
            }
            
            //2-2、查询供应商是否应经参标
            TbStandardSupplier querCon1 = new TbStandardSupplier();
            querCon1.setStatus(SysConstants.STATUS.STATUS_NORMAL);
            querCon1.setSupplierOrgId(sysUser.getOrganizationId());
            querCon1.setTenderProjectId(input.getTenderProjectId());
            
            List<TbStandardSupplier> tbStandardSupplierList = baseDao.queryTbStandardSupplierList(querCon1);
            if(tbStandardSupplierList == null || tbStandardSupplierList.size() <= 0){
                throw new BizException(BizErrorCode.ERROR_CODE_0014, BizErrorCode.ERROR_Msg_0014);
            }
            
            //2-2、查询招标文件是否存在
            List<Long> tenderProjectIdList = new ArrayList<Long>();
            List<Long> subIdList = new ArrayList<Long>();
            Map<String, TbPurchaseFile> tbPurchaseFileMap = queryTbPurchaseFile(input.getTenderProjectId());
            StringBuffer sb = new StringBuffer();
            for( TbStandardSupplier item : tbStandardSupplierList){
                TbPurchaseFile tbPurchaseFile = tbPurchaseFileMap.get(item.getTenderProjectId().longValue() + "_" + item.getSubId().longValue());
                if(tbPurchaseFile == null){
                    sb.append("招标项目ID["+ item.getProjectId() +"]").append("标段ID["+ item.getSubId() +"]未上传招标文件");
                    continue;
                }
                tenderProjectIdList.add(item.getTenderProjectId());
                subIdList.add(item.getSubId());
            }
            
            //3、查询下载的招标文件地址
            if(tenderProjectIdList.size() > 0){
                SysFile sysFileCon = new SysFile();
                sysFileCon.setStatus(SysConstants.STATUS.STATUS_NORMAL);
                
                Map<String, Object> conditonMap = new HashMap<String, Object>();
                conditonMap.put("tenderProjectIdList", tenderProjectIdList);
                conditonMap.put("subIdList", subIdList);
                sysFileCon.setConditonMap(conditonMap);
                List<SysFile> sysFileList = baseDao.querySysFileList(sysFileCon);
                if(sysFileList == null || sysFileList.size() <= 0){
                    throw new BizException(BizErrorCode.ERROR_CODE_0012, "无法下载招标文件");
                }
                
                //处理结果
                for(SysFile item : sysFileList){
                    SysFileBean detail = new SysFileBean();
                    detail.setFileId(item.getFileId());
                    detail.setIdeNumber(item.getIdeNumber());
                    detail.setOldFileName(item.getOldFileName());
                    detail.setFileName(item.getFileName());
                    detail.setFileDir(item.getFileDir());
                    detail.setSubId(item.getSubId());
                    detail.setTenderProjectId(item.getTenderProjectId());
                    
                    output.getDetail().add(detail);
                }
            }else{
                output.setRemark(sb.toString());
            }
            
            //最后，输入正确码进行返回
            successProcess(output);
        }catch(Exception e){
            exProcess(e, output, "供应招标文件下载地址获取");
        }
        return output;
    }
    
    
    /**
     * 函数功能描述：供应商本人上传标书费，标书费付费凭证上传状态修改
     * @param input
     * @return
     */    
    @Override
    public B002SupplierTendFeeOutput standardSupplierUpdate(B002SupplierTendFeeInput input) {
        B002SupplierTendFeeOutput output = new B002SupplierTendFeeOutput();
        try{
            //1、校验参数
            BussinessInputCheck.check_B002Update(input);
            
            //2-1、检查供应商参标的项目是否存在
            TbStandardSupplier queryCon = new TbStandardSupplier();
            //多余条件添加
            Map<String, Object> conditonMap = new HashMap<String, Object>();
            List<Long> standardIdList = new ArrayList<Long>();
            List<Long> ttFileIdList = new ArrayList<Long>();
            for(SupplierTendFeeBean item : input.getTendFeeList()){
                standardIdList.add(item.getStandardId());
                ttFileIdList.add(item.getTtFileId());
            }
            conditonMap.put("standardIdList", standardIdList);
            queryCon.setConditonMap(conditonMap);
            
            List<TbStandardSupplier> list = baseDao.queryTbStandardSupplierList(queryCon);
            if(list == null || list.size() != input.getTendFeeList().size()){
                throw new BizException(BizErrorCode.ERROR_CODE_0010, BizErrorCode.ERROR_Msg_0010);
            }
            
            //2-2、检查付费凭证是否已经上传
            conditonMap.clear();
            SysFile sysFile = new SysFile();
            conditonMap.put("fileIdList", ttFileIdList);
            sysFile.setConditonMap(conditonMap);
            List<SysFile> sysFileList = baseDao.querySysFileList(sysFile);
            if(sysFileList == null || sysFileList.size() != input.getTendFeeList().size()){
                throw new BizException(BizErrorCode.ERROR_CODE_0011, BizErrorCode.ERROR_Msg_0011);
            }
            
            List<TbStandardSupplier> tbStandardSupplierList = new ArrayList<TbStandardSupplier>();
            for(SupplierTendFeeBean item : input.getTendFeeList()){
                Map<String, Object> conditonMap2 = new HashMap<String, Object>();
                conditonMap2.put("standardId", item.getStandardId());
                
                TbStandardSupplier tbStandardSupplier = new TbStandardSupplier();
                tbStandardSupplier.setStandardId(item.getStandardId());
                tbStandardSupplier.setPaymentType(SysConstants.PAYMENT_TYPE.WIRE_TRANSFER);
                tbStandardSupplier.setTtFileId(item.getTtFileId());
                setUpdateUserAnddDate(tbStandardSupplier, input.getSupplierUserId());
                tbStandardSupplier.setConditonMap(conditonMap2);
                
                tbStandardSupplierList.add(tbStandardSupplier);
            }
            
            Integer rows = baseDao.updateTbStandardSupplierById(tbStandardSupplierList);
            checkUpdate(rows, "标书费付费凭证上传状态修改失败");
            
            //最后，输入正确码进行返回
            successProcess(output);
        }catch(Exception e){
            exProcess(e, output, "标书费付费凭证上传状态修改失败");
        }
        return output;
    }
    
    
    
}
