/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 文件名称：BaseDaoImpl.java
 * 修改时间：2016年7月14日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
 	
package com.hzw.du.model.dao.impl;

import java.util.List;

import com.hzw.du.model.constant.DaoErrorCode;
import com.hzw.du.model.dao.BaseDao;
import com.hzw.du.model.exception.DaoException;
import com.hzw.du.model.mapper.KpBidExpert;
import com.hzw.du.model.mapper.KpBidRecord;
import com.hzw.du.model.mapper.KpBidReport;
import com.hzw.du.model.mapper.KpBidRules;
import com.hzw.du.model.mapper.KpCastRecord;
import com.hzw.du.model.mapper.KpDetailReview;
import com.hzw.du.model.mapper.KpInitReview;
import com.hzw.du.model.mapper.KpInitReviewResult;
import com.hzw.du.model.mapper.KpOpenProject;
import com.hzw.du.model.mapper.KpProjectRules;
import com.hzw.du.model.mapper.KpReviewInfo;
import com.hzw.du.model.mapper.MHFileImages;
import com.hzw.du.model.mapper.MHHelp;
import com.hzw.du.model.mapper.SysAgency;
import com.hzw.du.model.mapper.SysArea;
import com.hzw.du.model.mapper.SysButton;
import com.hzw.du.model.mapper.SysCertificate;
import com.hzw.du.model.mapper.SysConfig;
import com.hzw.du.model.mapper.SysConstant;
import com.hzw.du.model.mapper.SysDepartment;
import com.hzw.du.model.mapper.SysEntrustPerson;
import com.hzw.du.model.mapper.SysFile;
import com.hzw.du.model.mapper.SysFileDown;
import com.hzw.du.model.mapper.SysLog;
import com.hzw.du.model.mapper.SysLoginSource;
import com.hzw.du.model.mapper.SysMenu;
import com.hzw.du.model.mapper.SysMenuButton;
import com.hzw.du.model.mapper.SysMessage;
import com.hzw.du.model.mapper.SysOrganizatioin;
import com.hzw.du.model.mapper.SysPersonUser;
import com.hzw.du.model.mapper.SysPhoneModify;
import com.hzw.du.model.mapper.SysRole;
import com.hzw.du.model.mapper.SysRoleMenuButton;
import com.hzw.du.model.mapper.SysSupplier;
import com.hzw.du.model.mapper.SysSupplierUser;
import com.hzw.du.model.mapper.SysUser;
import com.hzw.du.model.mapper.SysUserRole;
import com.hzw.du.model.mapper.TbAbnormalProject;
import com.hzw.du.model.mapper.TbAdvance;
import com.hzw.du.model.mapper.TbBailCertificates;
import com.hzw.du.model.mapper.TbBidInvitation;
import com.hzw.du.model.mapper.TbBidSupplier;
import com.hzw.du.model.mapper.TbComplain;
import com.hzw.du.model.mapper.TbConnectNotice;
import com.hzw.du.model.mapper.TbEntrustPersonRel;
import com.hzw.du.model.mapper.TbFilingData;
import com.hzw.du.model.mapper.TbInvitationSupplier;
import com.hzw.du.model.mapper.TbProject;
import com.hzw.du.model.mapper.TbProjectFiling;
import com.hzw.du.model.mapper.TbPurchaseFile;
import com.hzw.du.model.mapper.TbQuestion;
import com.hzw.du.model.mapper.TbQuestionProblem;
import com.hzw.du.model.mapper.TbStandardSupplier;
import com.hzw.du.model.mapper.TbSub;
import com.hzw.du.model.mapper.TbTenderProject;

/**
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class BaseDaoImpl extends BaseMapperImpl implements BaseDao{
    
    /**
     * 
     * 函数功能描述：插入kpBidExpert
     * @param kpBidExpert
     * @return
     */
    @Override
    public Integer insertKpBidExpert(KpBidExpert kpBidExpert) {
        return kpBidExpertMapper.insertKpBidExpert(kpBidExpert);
    }

    /**
     * 
     * 函数功能描述：根据id查询评标专家信息
     * @param kpBidExpert
     * @return
     */
    @Override
    public KpBidExpert queryKpBidExpertById(Long bidExpertId) {
        if(bidExpertId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        KpBidExpert kpBidExpert = new KpBidExpert();
        kpBidExpert.setBidExpertId(bidExpertId);
        List<KpBidExpert> list = kpBidExpertMapper.queryKpBidExpertByPage(kpBidExpert);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有专家信息
     * @param kpBidExpert
     * @return
     */
    @Override
    public List<KpBidExpert> queryKpBidExpertList(KpBidExpert kpBidExpert) {
        return kpBidExpertMapper.queryKpBidExpertByPage(kpBidExpert);
    }

    /**
     * 
     * 函数功能描述：插入 [开标记录] KP_BID_RECORD
     * @param kpBidExpert
     * @return
     */
    @Override
    public Integer insertKpBidRecord(KpBidRecord kpBidRecord) {
        return kpBidRecordMapper.insertKpBidRecord(kpBidRecord);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [开标记录] KP_BID_RECORD
     * @param kpBidExpert
     * @return
     */
    @Override
    public KpBidRecord queryKpBidRecordById(Long recordId) {
        if(recordId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        KpBidRecord kpBidRecord = new KpBidRecord();
        kpBidRecord.setRecordId(recordId);
        List<KpBidRecord> list = kpBidRecordMapper.queryKpBidRecordByPage(kpBidRecord);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [开标记录] KP_BID_RECORD
     * @param kpBidExpert
     * @return
     */
    @Override
    public List<KpBidRecord> queryKpBidRecordList(KpBidRecord kpBidRecord) {
        return kpBidRecordMapper.queryKpBidRecordByPage(kpBidRecord);
    }

    /**
     * 
     * 函数功能描述：插入 [KP_BID_REPORT  评标报告表， 序列seq_reportid]
     * @param kpBidReport
     * @return
     */
    @Override
    public Integer insertKpBidReport(KpBidReport kpBidReport) {
        return kpBidReportMapper.insertKpBidReport(kpBidReport);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [KP_BID_REPORT  评标报告表， 序列seq_reportid]
     * @param kpBidReport
     * @return
     */
    @Override
    public KpBidReport queryKpBidReportById(Long reportId) {
        if(reportId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        KpBidReport kpBidReport = new KpBidReport();
        kpBidReport.setReportId(reportId);
        List<KpBidReport> list = kpBidReportMapper.queryKpBidReportByPage(kpBidReport);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [KP_BID_REPORT  评标报告表， 序列seq_reportid]
     * @param kpBidReport
     * @return
     */
    @Override
    public List<KpBidReport> queryKpBidReportList(KpBidReport kpBidReport) {
        return kpBidReportMapper.queryKpBidReportByPage(kpBidReport);
    }
    
    /**
     * 
     * 函数功能描述：插入 [KP_BID_RULES  评标规则模板表， 序列seq_bidid]
     * @param kpBidRules
     * @return
     */
    @Override
    public Integer insertKpBidRules(KpBidRules kpBidRules){
        return kpBidRulesMapper.insertKpBidRules(kpBidRules);
    }
    
    /**
     * 
     * 函数功能描述：根据id查询 [KP_BID_RULES  评标规则模板表， 序列seq_bidid]
     * @param bidId
     * @return
     */
    @Override
    public KpBidRules queryKpBidRulesById(Long bidId){
        if(bidId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        KpBidRules kpBidRules = new KpBidRules();
        kpBidRules.setBidId(bidId);
        List<KpBidRules> list = kpBidRulesMapper.queryKpBidRulesByPage(kpBidRules);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    
    }
    
    /**
     * 
     * 函数功能描述：查询所有 [KP_BID_RULES  评标规则模板表， 序列seq_bidid]
     * @param KpBidRules
     * @return
     */
    @Override
    public List<KpBidRules> queryKpBidRulesList(KpBidRules kpBidRules){
        return kpBidRulesMapper.queryKpBidRulesByPage(kpBidRules);
    }

    /**
     * 
     * 函数功能描述：插入 [KP_CAST_RECORD  投标记录表， 序列seq_castrecordid]
     * @param kpCastRecord
     * @return
     */
    @Override
    public Integer insertKpCastRecord(KpCastRecord kpCastRecord) {
        return kpCastRecordMapper.insertKpCastRecord(kpCastRecord);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [KP_CAST_RECORD  投标记录表， 序列seq_castrecordid]
     * @param castRecordId
     * @return
     */
    @Override
    public KpCastRecord queryKpCastRecordById(Long castRecordId) {
        if(castRecordId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        KpCastRecord kpCastRecord = new KpCastRecord();
        kpCastRecord.setCastRecordId(castRecordId);
        List<KpCastRecord> list = kpCastRecordMapper.queryKpCastRecordByPage(kpCastRecord);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [KP_CAST_RECORD  投标记录表， 序列seq_castrecordid]
     * @param kpCastRecord
     * @return
     */
    @Override
    public List<KpCastRecord> queryKpCastRecordList(KpCastRecord kpCastRecord) {
        return kpCastRecordMapper.queryKpCastRecordByPage(kpCastRecord);
    }

    /**
     * 
     * 函数功能描述：插入[KP_DETAIL_REVIEW  详细评审表， 序列seq_detailid]
     * @param kpDetailReview
     * @return
     */
    @Override
    public Integer insertKpDetailReview(KpDetailReview kpDetailReview) {
        return kpDetailReviewMapper.insertKpDetailReview(kpDetailReview);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [KP_DETAIL_REVIEW  详细评审表， 序列seq_detailid]
     * @param detailId
     * @return
     */
    @Override
    public KpDetailReview queryKpDetailReviewById(Long detailId) {
        if(detailId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        KpDetailReview kpDetailReview = new KpDetailReview();
        kpDetailReview.setDetailId(detailId);
        List<KpDetailReview> list = kpDetailReviewMapper.queryKpDetailReviewByPage(kpDetailReview);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [KP_DETAIL_REVIEW  详细评审表， 序列seq_detailid]
     * @param kpDetailReview
     * @return
     */
    @Override
    public List<KpDetailReview> queryKpDetailReviewList(KpDetailReview kpDetailReview) {
        return kpDetailReviewMapper.queryKpDetailReviewByPage(kpDetailReview);
    }

    /**
     * 
     * 函数功能描述：插入[KP_INIT_REVIEW  初步评审表， 序列seq_initid]
     * @param kpInitReview
     * @return
     */
    @Override
    public Integer insertKpInitReview(KpInitReview kpInitReview) {
        return kpInitReviewMapper.insertKpInitReview(kpInitReview);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [KP_INIT_REVIEW  初步评审表， 序列seq_initid]
     * @param detailId
     * @return
     */
    @Override
    public KpInitReview queryKpInitReviewById(Long initId) {
        if(initId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        KpInitReview kpInitReview = new KpInitReview();
        kpInitReview.setInitId(initId);
        List<KpInitReview> list = kpInitReviewMapper.queryKpInitReviewByPage(kpInitReview);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [KP_INIT_REVIEW  初步评审表， 序列seq_initid]
     * @param KpInitReview
     * @return
     */
    @Override
    public List<KpInitReview> queryKpInitReviewList(KpInitReview kpInitReview) {
        return kpInitReviewMapper.queryKpInitReviewByPage(kpInitReview);
    }

    /**
     * 
     * 函数功能描述：插入[KP_INIT_REVIEW_RESULT  初步评审结果表， 序列seq_resultid]
     * @param KpInitReviewResult
     * @return
     */
    @Override
    public Integer insertKpInitReviewResult(KpInitReviewResult kpInitReviewResult) {
        return kpInitReviewResultMapper.insertKpInitReviewResult(kpInitReviewResult);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [KP_INIT_REVIEW_RESULT  初步评审结果表， 序列seq_resultid]
     * @param initId
     * @return
     */
    @Override
    public KpInitReviewResult queryKpInitReviewResultById(Long resultId) {
        if(resultId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        KpInitReviewResult kpInitReviewResult = new KpInitReviewResult();
        kpInitReviewResult.setResultId(resultId);
        List<KpInitReviewResult> list = kpInitReviewResultMapper.queryKpInitReviewResultByPage(kpInitReviewResult);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [KP_INIT_REVIEW_RESULT  初步评审结果表， 序列seq_resultid]
     * @param KpInitReviewResult
     * @return
     */
    @Override
    public List<KpInitReviewResult> queryKpInitReviewResultList(
            KpInitReviewResult kpInitReviewResult) {
        return kpInitReviewResultMapper.queryKpInitReviewResultByPage(kpInitReviewResult);
    }

    /**
     * 函数功能描述：插入[KP_OPEN_PROJECT  开标项目配置表， 序列seq_openid]
     * @param kpOpenProject
     * @return
     */
    @Override
    public Integer insertKpOpenProject(KpOpenProject kpOpenProject) {
        return kpOpenProjectMapper.insertKpOpenProject(kpOpenProject);
    }

    /**
     * 函数功能描述：根据id查询 [KP_OPEN_PROJECT  开标项目配置表， 序列seq_openid]
     * @param initId
     * @return
     */
    @Override
    public KpOpenProject queryKpOpenProjectById(Long openId) {
        if(openId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        KpOpenProject kpOpenProject = new KpOpenProject();
        kpOpenProject.setOpenId(openId);
        List<KpOpenProject> list = kpOpenProjectMapper.queryKpOpenProjectByPage(kpOpenProject);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 函数功能描述：查询所有 [KP_OPEN_PROJECT  开标项目配置表， 序列seq_openid]
     * @param KpOpenProject
     * @return
     */
    @Override
    public List<KpOpenProject> queryKpOpenProjectList(KpOpenProject kpOpenProject) {
        return kpOpenProjectMapper.queryKpOpenProjectByPage(kpOpenProject);
    }

    /**
     * 
     * 函数功能描述：插入[KP_PROJECT_RULES  项目评标规则表， 序列seq_rulesid]
     * @param kpProjectRules
     * @return
     */
    @Override
    public Integer insertKpProjectRules(KpProjectRules kpProjectRules) {
        return kpProjectRulesMapper.insertKpProjectRules(kpProjectRules);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [KP_PROJECT_RULES  项目评标规则表， 序列seq_rulesid]
     * @param rulesId
     * @return
     */
    @Override
    public KpProjectRules queryKpProjectRulesById(Long rulesId) {
        if(rulesId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        KpProjectRules kpProjectRules = new KpProjectRules();
        kpProjectRules.setRulesId(rulesId);
        List<KpProjectRules> list = kpProjectRulesMapper.queryKpProjectRulesByPage(kpProjectRules);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [KP_PROJECT_RULES  项目评标规则表， 序列seq_rulesid]
     * @param kpProjectRules
     * @return
     */
    @Override
    public List<KpProjectRules> queryKpProjectRulesList(KpProjectRules kpProjectRules) {
        return kpProjectRulesMapper.queryKpProjectRulesByPage(kpProjectRules);
    }

    /**
     * 
     * 函数功能描述：插入[KP_REVIEW_INFO  详细评审明细表， 序列seq_infoid]
     * @param kpReviewInfo
     * @return
     */
    @Override
    public Integer insertKpReviewInfo(KpReviewInfo kpReviewInfo) {
        return kpReviewInfoMapper.insertKpReviewInfo(kpReviewInfo);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [KP_REVIEW_INFO  详细评审明细表， 序列seq_infoid]
     * @param infoId
     * @return
     */
    @Override
    public KpReviewInfo queryKpReviewInfoById(Long infoId) {
        if(infoId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        KpReviewInfo kpReviewInfo = new KpReviewInfo();
        kpReviewInfo.setInfoId(infoId);
        List<KpReviewInfo> list = kpReviewInfoMapper.queryKpReviewInfoByPage(kpReviewInfo);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [KP_REVIEW_INFO  详细评审明细表， 序列seq_infoid]
     * @param KpReviewInfo
     * @return
     */
    @Override
    public List<KpReviewInfo> queryKpReviewInfoList(KpReviewInfo kpReviewInfo) {
        return kpReviewInfoMapper.queryKpReviewInfoByPage(kpReviewInfo);
    }

    /**
     * 
     * 函数功能描述：插入[MH_FILE_IMAGES  动态图片展示表， 序列seq_imageid]
     * @param mhFileImages
     * @return
     */
    @Override
    public Integer insertMHFileImages(MHFileImages mhFileImages) {
        return mhFileImagesMapper.insertMHFileImages(mhFileImages);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [MH_FILE_IMAGES  动态图片展示表， 序列seq_imageid]
     * @param imageId
     * @return
     */
    @Override
    public MHFileImages queryMHFileImagesById(Long imageId) {
        if(imageId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        MHFileImages mhFileImages = new MHFileImages();
        mhFileImages.setImageId(imageId);
        List<MHFileImages> list = mhFileImagesMapper.queryMHFileImagesByPage(mhFileImages);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [MH_FILE_IMAGES  动态图片展示表， 序列seq_imageid]
     * @param MHFileImages
     * @return
     */
    @Override
    public List<MHFileImages> queryMHFileImagesList(MHFileImages mhFileImages) {
        return mhFileImagesMapper.queryMHFileImagesByPage(mhFileImages);
    }

    /**
     * 
     * 函数功能描述：插入[MH_HELP  系统帮助表， 序列seq_helpid]
     * @param mhHelp
     * @return
     */
    @Override
    public Integer insertMHHelp(MHHelp mhHelp) {
        return mhHelpMapper.insertMHHelp(mhHelp);
    }
    
    /**
     * 
     * 函数功能描述：更新帮助信息
     * @param mhHelp
     * @return
     */
    @Override
    public Integer modifyMHHelp(MHHelp mhHelp)
    {
        return mhHelpMapper.modifyMHHelp(mhHelp);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [MH_HELP  系统帮助表， 序列seq_helpid]
     * @param helpId
     * @return
     */
    @Override
    public MHHelp getMHHelpById(Long helpId) {
        if(helpId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        return mhHelpMapper.getMHHelpById(helpId);
    }

    /**
     * 
     * 函数功能描述：查询所有 [MH_HELP  系统帮助表， 序列seq_helpid]
     * @param mhHelp
     * @return
     */
    @Override
    public List<MHHelp> queryMHHelpList(MHHelp mhHelp) {
        return mhHelpMapper.queryMHHelpByPage(mhHelp);
    }

    /**
     * 
     * 函数功能描述：插入[SYS_AGENCY  代理机构信息表， 序列seq_agencyid]
     * @param sysAgency
     * @return
     */
    @Override
    public Integer insertSysAgency(SysAgency sysAgency) {
        return sysAgencyMapper.insertSysAgency(sysAgency);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [SYS_AGENCY  代理机构信息表， 序列seq_agencyid]
     * @param agencyId
     * @return
     */
    @Override
    public SysAgency querySysAgencyById(Long agencyId) {
        if(agencyId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        SysAgency sysAgency = new SysAgency();
        sysAgency.setAgencyId(agencyId);
        List<SysAgency> list = sysAgencyMapper.querySysAgencyByPage(sysAgency);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [SYS_AGENCY  代理机构信息表， 序列seq_agencyid]
     * @param sysAgency
     * @return
     */
    @Override
    public List<SysAgency> querySysAgencyList(SysAgency sysAgency) {
        return sysAgencyMapper.querySysAgencyByPage(sysAgency);
    }

    /**
     * 
     * 函数功能描述：插入[SYS_AREA  地区表， 序列seq_areaid]
     * @param sysArea
     * @return
     */
    @Override
    public Integer insertSysArea(SysArea sysArea) {
        return sysAreaMapper.insertSysArea(sysArea);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [SYS_AREA  地区表， 序列seq_areaid]
     * @param areaId
     * @return
     */
    @Override
    public SysArea querySysAreaById(Long areaId) {
        if(areaId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        SysArea sysArea = new SysArea();
        sysArea.setAreaId(areaId);
        List<SysArea> list = sysAreaMapper.querySysAreaByPage(sysArea);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [SYS_AREA  地区表， 序列seq_areaid]
     * @param sysArea
     * @return
     */
    @Override
    public List<SysArea> querySysAreaList(SysArea SysArea) {
        return sysAreaMapper.querySysAreaByPage(SysArea);
    }

    /**
     * 
     * 函数功能描述：插入[SYS_BUTTON  按钮初始表， 序列seq_buttonid]
     * @param sysButton
     * @return
     */
    @Override
    public Integer insertSysButton(SysButton sysButton) {
        return sysButtonMapper.insertSysButton(sysButton);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [SYS_BUTTON  按钮初始表， 序列seq_buttonid]
     * @param buttonId
     * @return
     */
    @Override
    public SysButton querySysButtonById(Long buttonId) {
        if(buttonId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        SysButton sysButton = new SysButton();
        sysButton.setButtonId(buttonId);
        List<SysButton> list = sysButtonMapper.querySysButtonByPage(sysButton);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [SYS_BUTTON  按钮初始表， 序列seq_buttonid]
     * @param sysButton
     * @return
     */
    @Override
    public List<SysButton> querySysButtonList(SysButton sysButton) {
        return sysButtonMapper.querySysButtonByPage(sysButton);
    }

    /**
     * 
     * 函数功能描述：插入[SYS_CERTIFICATE  证书管理信息表， 序列seq_certificateid]
     * @param sysCertificate
     * @return
     */
    @Override
    public Integer insertSysCertificate(SysCertificate sysCertificate) {
        return sysCertificateMapper.insertSysCertificate(sysCertificate);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [SYS_CERTIFICATE  证书管理信息表， 序列seq_certificateid]
     * @param certificateId
     * @return
     */
    @Override
    public SysCertificate querySysCertificateById(Long certificateId) {
        if(certificateId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        SysCertificate sysCertificate = new SysCertificate();
        sysCertificate.setCertificateId(certificateId);
        List<SysCertificate> list = sysCertificateMapper.querySysCertificateByPage(sysCertificate);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [SYS_CERTIFICATE  证书管理信息表， 序列seq_certificateid]
     * @param sysCertificate
     * @return
     */
    @Override
    public List<SysCertificate> querySysCertificateList(SysCertificate sysCertificate) {
        return sysCertificateMapper.querySysCertificateByPage(sysCertificate);
    }

    /**
     * 
     * 函数功能描述：插入[SYS_CONFIG  系统配置项表， 序列seq_configid]
     * @param sysConfig
     * @return
     */
    @Override
    public Integer insertSysConfig(SysConfig sysConfig) {
        return sysConfigMapper.insertSysConfig(sysConfig);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [SYS_CONFIG  系统配置项表， 序列seq_configid]
     * @param configId
     * @return
     */
    @Override
    public SysConfig querySysConfigById(Long configId) {
        if(configId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        SysConfig sysConfig = new SysConfig();
        sysConfig.setConfigId(configId);
        List<SysConfig> list = sysConfigMapper.querySysConfigByPage(sysConfig);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [SYS_CONFIG  系统配置项表， 序列seq_configid]
     * @param sysConfig
     * @return
     */
    @Override
    public List<SysConfig> querySysConfigList(SysConfig sysConfig) {
        return sysConfigMapper.querySysConfigByPage(sysConfig);
    }

    /**
     * 
     * 函数功能描述：插入[SYS_CONSTANT  数据字典表， 序列seq_constantid]
     * @param sysConstant
     * @return
     */
    @Override
    public Integer insertSysConstant(SysConstant sysConstant) {
        return sysConstantMapper.insertSysConstant(sysConstant);
    }
    
    /**
     * 
     * 函数功能描述：更新数据字典信息
     * @param sysConstant
     * @return
     */
    @Override
    public Integer modifySysConstant(SysConstant sysConstant)
    {
        return sysConstantMapper.modifySysConstant(sysConstant);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [SYS_CONSTANT  数据字典表， 序列seq_constantid]
     * @param constantId
     * @return
     */
    @Override
    public SysConstant querySysConstantById(Long constantId) {
        if(constantId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        SysConstant sysConstant = new SysConstant();
        sysConstant.setConstantId(constantId);
        List<SysConstant> list = sysConstantMapper.querySysConstantByPage(sysConstant);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [SYS_CONSTANT  数据字典表， 序列seq_constantid]
     * @param sysConstant
     * @return
     */
    @Override
    public List<SysConstant> querySysConstantList(SysConstant sysConstant) {
        return sysConstantMapper.querySysConstantByPage(sysConstant);
    }

    /**
     * 
     * 函数功能描述：插入[SYS_DEPARTMENT  部门表， 序列seq_departmentid]
     * @param sysDepartment
     * @return
     */
    @Override
    public Integer insertSysDepartment(SysDepartment sysDepartment) {
        return sysDepartmentMapper.insertSysDepartment(sysDepartment);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [SYS_DEPARTMENT  部门表， 序列seq_departmentid]
     * @param departmentId
     * @return
     */
    @Override
    public SysDepartment querySysDepartmentById(Long departmentId) {
        if(departmentId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        SysDepartment sysDepartment = new SysDepartment();
        sysDepartment.setDepartmentId(departmentId);
        List<SysDepartment> list = sysDepartmentMapper.querySysDepartmentByPage(sysDepartment);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [SYS_DEPARTMENT  部门表， 序列seq_departmentid]
     * @param sysDepartment
     * @return
     */
    @Override
    public List<SysDepartment> querySysDepartmentList(SysDepartment sysDepartment) {
        return sysDepartmentMapper.querySysDepartmentByPage(sysDepartment);
    }

    /**
     * 
     * 函数功能描述：插入[SYS_ENTRUST_PERSON  招标人表， 序列seq_personid]
     * @param sysEntrustPerson
     * @return
     */
    @Override
    public Integer insertSysEntrustPerson(SysEntrustPerson sysEntrustPerson) {
        return sysEntrustPersonMapper.insertSysEntrustPerson(sysEntrustPerson);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [SYS_ENTRUST_PERSON  招标人表， 序列seq_personid]
     * @param personId
     * @return
     */
    @Override
    public SysEntrustPerson querySysEntrustPersonById(Long personId) {
        if(personId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        SysEntrustPerson sysEntrustPerson = new SysEntrustPerson();
        sysEntrustPerson.setPersonId(personId);
        List<SysEntrustPerson> list = sysEntrustPersonMapper.querySysEntrustPersonByPage(sysEntrustPerson);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [SYS_ENTRUST_PERSON  招标人表， 序列seq_personid]
     * @param sysEntrustPerson
     * @return
     */
    @Override
    public List<SysEntrustPerson> querySysEntrustPersonList(SysEntrustPerson sysEntrustPerson) {
        return sysEntrustPersonMapper.querySysEntrustPersonByPage(sysEntrustPerson);
    }

    /**
     * 
     * 函数功能描述：插入[SYS_FILE  文件表， 序列seq_fileid]
     * @param SysFile
     * @return
     */
    @Override
    public Integer insertSysFile(SysFile sysFile) {
        return sysFileMapper.insertSysFile(sysFile);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [SYS_FILE  文件表， 序列seq_fileid]
     * @param fileId
     * @return
     */
    @Override
    public SysFile querySysFileById(Long fileId) 
    {
        if(fileId == null)
        {
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        return sysFileMapper.getSysFileById(fileId);
    }
    
    /**
     * 
     * 函数功能描述：更新[SYS_FILE  文件表]
     * @param sysFile
     * @return
     */
    @Override
    public Integer modifySysFile(SysFile sysFile)
    {
        return sysFileMapper.modifySysFile(sysFile);
    }

    /**
     * 
     * 函数功能描述：查询所有 [SYS_FILE  文件表， 序列seq_fileid]
     * @param SysFile
     * @return
     */
    @Override
    public List<SysFile> querySysFileList(SysFile sysFile) {
        return sysFileMapper.querySysFileByPage(sysFile);
    }

    /**
     * 
     * 函数功能描述：插入[SYS_FILE_DOWN  文件下载表， 序列seq_downid]
     * @param sysFileDown
     * @return
     */
    @Override
    public Integer insertSysFileDown(SysFileDown sysFileDown) {
        return sysFileDownMapper.insertSysFileDown(sysFileDown);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [SYS_FILE_DOWN  文件下载表， 序列seq_downid]
     * @param downId
     * @return
     */
    @Override
    public SysFileDown querySysFileDownById(Long downId) {
        if(downId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        SysFileDown sysFileDown = new SysFileDown();
        sysFileDown.setDownId(downId);
        List<SysFileDown> list = sysFileDownMapper.querySysFileDownByPage(sysFileDown);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [SYS_FILE_DOWN  文件下载表， 序列seq_downid]
     * @param sysFileDown
     * @return
     */
    @Override
    public List<SysFileDown> querySysFileDownList(SysFileDown sysFileDown) {
        return sysFileDownMapper.querySysFileDownByPage(sysFileDown);
    }

    /**
     * 
     * 函数功能描述：插入[SYS_LOG  日志信息表， 序列seq_logid]
     * @param sysLog
     * @return
     */
    @Override
    public Integer insertSysLog(SysLog sysLog) {
        return sysLogMapper.insertSysLog(sysLog);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [SYS_LOG  日志信息表， 序列seq_logid]
     * @param logId
     * @return
     */
    @Override
    public SysLog getSysLogById(Long logId) 
    {
        if(logId == null)
        {
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        return sysLogMapper.getSysLogById(logId);
    }

    /**
     * 
     * 函数功能描述：查询所有 [SYS_LOG  日志信息表， 序列seq_logid]
     * @param sysLog
     * @return
     */
    @Override
    public List<SysLog> querySysLogList(SysLog sysLog) {
        return sysLogMapper.querySysLogByPage(sysLog);
    }

    /**
     * 
     * 函数功能描述：插入[SYS_LOGIN_SOURCE  登录来源表， 序列seq_loginid]
     * @param sysLoginSource
     * @return
     */
    @Override
    public Integer insertSysLoginSource(SysLoginSource sysLoginSource) {
        return sysLoginSourceMapper.insertSysLoginSource(sysLoginSource);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [SYS_LOGIN_SOURCE  登录来源表， 序列seq_loginid]
     * @param loginId
     * @return
     */
    @Override
    public SysLoginSource querySysLoginSourceById(Long loginId) {
        if(loginId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        SysLoginSource sysLoginSource = new SysLoginSource();
        sysLoginSource.setLoginId(loginId);
        List<SysLoginSource> list = sysLoginSourceMapper.querySysLoginSourceByPage(sysLoginSource);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }
    
    /**
     * 
     * 函数功能描述：查询所有 [SYS_LOGIN_SOURCE  登录来源表， 序列seq_loginid]
     * @param sysLoginSource
     * @return
     */
    @Override
    public List<SysLoginSource> querySysLoginSourceList(SysLoginSource sysLoginSource) {
        return sysLoginSourceMapper.querySysLoginSourceByPage(sysLoginSource);
    }

    /**
     * 
     * 函数功能描述：插入[SYS_MENU  菜单表， 序列seq_menuid]
     * @param sysMenu
     * @return
     */
    @Override
    public Integer insertSysMenu(SysMenu sysMenu) {
        return sysMenuMapper.insertSysMenu(sysMenu);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [SYS_MENU  菜单表， 序列seq_menuid]
     * @param menuId
     * @return
     */
    @Override
    public SysMenu querySysMenuById(Long menuId) {
        if(menuId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        SysMenu sysMenu = new SysMenu();
        sysMenu.setMenuId(menuId);
        List<SysMenu> list = sysMenuMapper.querySysMenuByPage(sysMenu);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [SYS_MENU  菜单表， 序列seq_menuid]
     * @param sysMenu
     * @return
     */
    @Override
    public List<SysMenu> querySysMenuList(SysMenu sysMenu) {
        return sysMenuMapper.querySysMenuByPage(sysMenu);
    }

    /**
     * 
     * 函数功能描述：插入[SYS_MENU_BUTTON  菜单按钮关系表]
     * @param sysMenuButton
     * @return
     */
    @Override
    public Integer insertSysMenuButton(SysMenuButton sysMenuButton) {
        return sysMenuButtonMapper.insertSysMenuButton(sysMenuButton);
    }

    /**
     * 
     * 函数功能描述：查询所有 [SYS_MENU_BUTTON  菜单按钮关系表]
     * @param sysMenuButton
     * @return
     */
    @Override
    public List<SysMenuButton> querySysMenuButtonList(SysMenuButton sysMenuButton) {
        return sysMenuButtonMapper.querySysMenuButtonByPage(sysMenuButton);
    }

    /**
     * 
     * 函数功能描述：插入[SYS_MESSAGE  系统消息表， 序列seq_smid]
     * @param sysMessage
     * @return
     */
    @Override
    public Integer insertSysMessage(SysMessage sysMessage) {
        return sysMessageMapper.insertSysMessage(sysMessage);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [SYS_MESSAGE  系统消息表， 序列seq_smid]
     * @param menuId
     * @return
     */
    @Override
    public SysMessage querySysMessageById(Long smId) {
        if(smId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        SysMessage sysMessage = new SysMessage();
        sysMessage.setSmId(smId);
        List<SysMessage> list = sysMessageMapper.querySysMessageByPage(sysMessage);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [SYS_MESSAGE  系统消息表， 序列seq_smid]
     * @param sysMessage
     * @return
     */
    @Override
    public List<SysMessage> querySysMessageList(SysMessage sysMessage) {
        return sysMessageMapper.querySysMessageByPage(sysMessage);
    }

    /**
     * 
     * 函数功能描述：插入[SYS_ORGANIZATION  组织机构表， 序列seq_organizationid]
     * @param sysOrganizatioin
     * @return
     */
    @Override
    public Integer insertSysOrganizatioin(SysOrganizatioin sysOrganizatioin) {
        return sysOrganizatioinMapper.insertSysOrganizatioin(sysOrganizatioin);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [SYS_ORGANIZATION  组织机构表， 序列seq_organizationid]
     * @param organizationId
     * @return
     */
    @Override
    public SysOrganizatioin querySysOrganizatioinById(Long organizationId) {
        if(organizationId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        SysOrganizatioin sysOrganizatioin = new SysOrganizatioin();
        sysOrganizatioin.setOrganizationId(organizationId);
        List<SysOrganizatioin> list = sysOrganizatioinMapper.querySysOrganizatioinByPage(sysOrganizatioin);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [SYS_ORGANIZATION  组织机构表， 序列seq_organizationid]
     * @param sysOrganizatioin
     * @return
     */
    @Override
    public List<SysOrganizatioin> querySysOrganizatioinList(SysOrganizatioin sysOrganizatioin) {
        return sysOrganizatioinMapper.querySysOrganizatioinByPage(sysOrganizatioin);
    }
    
    /**
     * 
     * 函数功能描述：查询组织机构个数
     * @param sysOrganizatioin
     * @return
     */
    @Override
    public Integer getOrgCount(SysOrganizatioin sysOrganizatioin)
    {
        return sysOrganizatioinMapper.getOrgCount(sysOrganizatioin);
    }
    
    /**
     * 
     * 函数功能描述：插入[SYS_PERSON_USER  招标人用户表， 序列seq_personuserid]
     * @param sysPersonUser
     * @return
     */
    @Override
    public Integer insertSysPersonUser(SysPersonUser sysPersonUser) {
        return sysPersonUserMapper.insertSysPersonUser(sysPersonUser);
    }
    
    /**
     * 
     * 函数功能描述：修改招标人用户信息
     * @param sysPersonUser
     * @return
     */
    @Override
    public Integer modifySysPersonUser(SysPersonUser sysPersonUser)
    {
        return sysPersonUserMapper.modifySysPersonUser(sysPersonUser);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [SYS_PERSON_USER  招标人用户表， 序列seq_personuserid]
     * @param userId
     * @return
     */
    @Override
    public SysPersonUser querySysPersonUserById(Long userId) {
        if(userId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        return sysPersonUserMapper.getSysPersonUserById(userId);
    }

    /**
     * 
     * 函数功能描述：查询所有 [SYS_PERSON_USER  招标人用户表， 序列seq_personuserid]
     * @param sysPersonUser
     * @return
     */
    @Override
    public List<SysPersonUser> querySysPersonUserList(SysPersonUser sysPersonUser) {
        return sysPersonUserMapper.querySysPersonUserByPage(sysPersonUser);
    }

    /**
     * 
     * 函数功能描述：插入[SYS_PHONE_MODIFY  手机号码变更记录表， 序列seq_phonemodifyid]
     * @param sysPhoneModify
     * @return
     */
    @Override
    public Integer insertSysPhoneModify(SysPhoneModify sysPhoneModify) {
        return sysPhoneModifyMapper.insertSysPhoneModify(sysPhoneModify);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [SYS_PHONE_MODIFY  手机号码变更记录表， 序列seq_phonemodifyid]
     * @param phoneModifyId
     * @return
     */
    @Override
    public SysPhoneModify querySysPhoneModifyById(Long phoneModifyId) {
        if(phoneModifyId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        SysPhoneModify sysPhoneModify = new SysPhoneModify();
        sysPhoneModify.setPhoneModifyId(phoneModifyId);
        List<SysPhoneModify> list = sysPhoneModifyMapper.querySysPhoneModifyByPage(sysPhoneModify);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [SYS_PHONE_MODIFY  手机号码变更记录表， 序列seq_phonemodifyid]
     * @param sysPhoneModify
     * @return
     */
    @Override
    public List<SysPhoneModify> querySysPhoneModifyList(SysPhoneModify sysPhoneModify) {
        return sysPhoneModifyMapper.querySysPhoneModifyByPage(sysPhoneModify);
    }

    /**
     * 
     * 函数功能描述：插入[SYS_ROLE  角色表， 序列seq_roleid]
     * @param SysRole
     * @return
     */
    @Override
    public Integer insertSysRole(SysRole sysRole) {
        return sysRoleMapper.insertSysRole(sysRole);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [SYS_ROLE  角色表， 序列seq_roleid]
     * @param roleId
     * @return
     */
    @Override
    public SysRole querySysRoleById(Long roleId) {
        if(roleId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        SysRole sysRole = new SysRole();
        sysRole.setRoleId(roleId);
        List<SysRole> list = sysRoleMapper.querySysRoleByPage(sysRole);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [SYS_ROLE  角色表， 序列seq_roleid]
     * @param sysRole
     * @return
     */
    @Override
    public List<SysRole> querySysRoleList(SysRole sysRole) {
        return sysRoleMapper.querySysRoleByPage(sysRole);
    }

    /**
     * 
     * 函数功能描述：插入[SYS_ROLE_MENU_BUTTON  角色菜单按钮权限表]
     * @param sysRoleMenuButton
     * @return
     */
    @Override
    public Integer insertSysRoleMenuButton(SysRoleMenuButton sysRoleMenuButton) {
        return sysRoleMenuButtonMapper.insertSysRoleMenuButton(sysRoleMenuButton);
    }

    /**
     * 
     * 函数功能描述：查询所有 [SYS_ROLE_MENU_BUTTON  角色菜单按钮权限表]
     * @param sysRoleMenuButton
     * @return
     */
    @Override
    public List<SysRoleMenuButton> querySysRoleMenuButtonList(SysRoleMenuButton sysRoleMenuButton) {
        return sysRoleMenuButtonMapper.querySysRoleMenuButtonByPage(sysRoleMenuButton);
    }

    /**
     * 
     * 函数功能描述：插入[SYS_SUPPLIER  供应商信息表， 序列seq_supplierid]
     * @param sysSupplier
     * @return
     */
    @Override
    public Integer insertSysSupplier(SysSupplier sysSupplier) {
        return sysSupplierMapper.insertSysSupplier(sysSupplier);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [SYS_SUPPLIER  供应商信息表， 序列seq_supplierid]
     * @param supplierId
     * @return
     */
    @Override
    public SysSupplier querySysSupplierById(Long supplierId) {
        if(supplierId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        SysSupplier sysSupplier = new SysSupplier();
        sysSupplier.setSupplierId(supplierId);
        List<SysSupplier> list = sysSupplierMapper.querySysSupplierByPage(sysSupplier);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [SYS_SUPPLIER  供应商信息表， 序列seq_supplierid]
     * @param sysSupplier
     * @return
     */
    @Override
    public List<SysSupplier> querySysSupplierList(SysSupplier sysSupplier) {
        return sysSupplierMapper.querySysSupplierByPage(sysSupplier);
    }

    /**
     * 
     * 函数功能描述：插入[SYS_SUPPLIER_USER  供应商用户表， 序列seq_supplieruserid]
     * @param sysSupplierUser
     * @return
     */
    @Override
    public Integer insertSysSupplierUser(SysSupplierUser sysSupplierUser) {
        return sysSupplierUserMapper.insertSysSupplierUser(sysSupplierUser);
    }
    
    /**
     * 
     * 函数功能描述：修改供应商用户信息
     * @param sysSupplierUser
     * @return
     */
    @Override
    public Integer modifySysSupplierUser(SysSupplierUser sysSupplierUser)
    {
        return sysSupplierUserMapper.modifySysSupplierUser(sysSupplierUser);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [SYS_SUPPLIER_USER  供应商用户表， 序列seq_supplieruserid]
     * @param userId
     * @return
     */
    @Override
    public SysSupplierUser querySysSupplierUserById(Long userId) {
        if(userId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        return sysSupplierUserMapper.getSysSupplierUserById(userId);
    }

    /**
     * 
     * 函数功能描述：查询所有 [SYS_SUPPLIER_USER  供应商用户表， 序列seq_supplieruserid]
     * @param sysSupplierUser
     * @return
     */
    @Override
    public List<SysSupplierUser> querySysSupplierUserList(SysSupplierUser sysSupplierUser) {
        return sysSupplierUserMapper.querySysSupplierUserByPage(sysSupplierUser);
    }
    
    /**
     * 
     * 函数功能描述：插入[SYS_USER  供应商用户表， 序列seq_supplieruserid]
     * @param sysUser
     * @return
     */
    @Override
    public Integer insertSysUser(SysUser sysUser)
    {
        return sysUserMapper.insertSysUser(sysUser);
    }
    
    /**
     * 
     * 函数功能描述：修改用户信息
     * @param sysUser
     * @return
     */
    @Override
    public Integer modifySysUser(SysUser sysUser)
    {
        return sysUserMapper.modifySysUser(sysUser);
    }
    
    /**
     * 
     * 函数功能描述：根据ID查询[SYS_USER  供应商用户表]
     * @param sysUser
     * @return
     */
    @Override
    public SysUser getSysUserById(Long userId)
    {
        if(userId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        return sysUserMapper.getSysUserById(userId);
    }
    
    /**
     * 
     * 函数功能描述：查询所有[SYS_USER  供应商用户表]
     * @param sysUser
     * @return
     */
    @Override
    public List<SysUser> querySysUserByPage(SysUser sysUser)
    {
        return sysUserMapper.querySysUserByPage(sysUser);
    }
    
    /**
     * 
     * 函数功能描述：根据登录号、手机号码验证是否唯一
     * @param sysUser
     * @return
     */
    @Override
    public Integer queryUserCount(SysUser sysUser)
    {
        return sysUserMapper.queryUserCount(sysUser);
    }
    
    /**
     * 
     * 函数功能描述：插入[SYS_USER_ROLE 用户与角色关系表]
     * @param sysUserRole
     * @return
     */
    @Override
    public Integer insertSysUserRole(SysUserRole sysUserRole) {
        return sysUserRoleMapper.insertSysUserRole(sysUserRole);
    }

    /**
     * 
     * 函数功能描述：查询所有 [SYS_USER_ROLE 用户与角色关系表]
     * @param sysUserRole
     * @return
     */
    @Override
    public List<SysUserRole> querySysUserRoleList(SysUserRole sysUserRole) {
        return sysUserRoleMapper.querySysUserRoleByPage(sysUserRole);
    }

    /**
     * 
     * 函数功能描述：插入[TB_ABNORMAL_PROJECT  异常项目表， 序列seq_abnormalid]
     * @param tbAbnormalProject
     * @return
     */
    @Override
    public Integer insertTbAbnormalProject(TbAbnormalProject tbAbnormalProject) {
        return tbAbnormalProjectMapper.insertTbAbnormalProject(tbAbnormalProject);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [TB_ABNORMAL_PROJECT  异常项目表， 序列seq_abnormalid]
     * @param abnormalId
     * @return
     */
    @Override
    public TbAbnormalProject queryTbAbnormalProjectById(Long abnormalId) {
        if(abnormalId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        TbAbnormalProject tbAbnormalProject = new TbAbnormalProject();
        tbAbnormalProject.setAbnormalId(abnormalId);
        List<TbAbnormalProject> list = tbAbnormalProjectMapper.queryTbAbnormalProjectByPage(tbAbnormalProject);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [TB_ABNORMAL_PROJECT  异常项目表， 序列seq_abnormalid]
     * @param tbAbnormalProject
     * @return
     */
    @Override
    public List<TbAbnormalProject> queryTbAbnormalProjectList(TbAbnormalProject tbAbnormalProject) {
        return tbAbnormalProjectMapper.queryTbAbnormalProjectByPage(tbAbnormalProject);
    }

    /**
     * 
     * 函数功能描述：插入[TB_ADVANCE 质疑投诉进度情况表， 序列seq_advanceid]
     * @param tbAdvance
     * @return
     */
    @Override
    public Integer insertTbAdvance(TbAdvance tbAdvance) {
        return tbAdvanceMapper.insertTbAdvance(tbAdvance);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [TB_ADVANCE 质疑投诉进度情况表， 序列seq_advanceid]
     * @param advanceId
     * @return
     */
    @Override
    public TbAdvance queryTbAdvanceById(Long advanceId) {
        if(advanceId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        TbAdvance tbAdvance = new TbAdvance();
        tbAdvance.setAdvanceId(advanceId);
        List<TbAdvance> list = tbAdvanceMapper.queryTbAdvanceByPage(tbAdvance);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [TB_ADVANCE 质疑投诉进度情况表， 序列seq_advanceid]
     * @param tbAdvance
     * @return
     */
    @Override
    public List<TbAdvance> queryTbAdvanceList(TbAdvance tbAdvance) {
        return tbAdvanceMapper.queryTbAdvanceByPage(tbAdvance);
    }

    /**
     * 
     * 函数功能描述：插入[TB_BAIL_CERTIFICATES 供应商保证金表， 序列seq_bailid]
     * @param tbBailCertificates
     * @return
     */
    @Override
    public Integer insertTbBailCertificates(TbBailCertificates tbBailCertificates) {
        return tbBailCertificatesMapper.insertTbBailCertificates(tbBailCertificates);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [TB_BAIL_CERTIFICATES 供应商保证金表， 序列seq_bailid]
     * @param bailId
     * @return
     */
    @Override
    public TbBailCertificates queryTbBailCertificatesById(Long bailId) {
        if(bailId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        TbBailCertificates tbBailCertificates = new TbBailCertificates();
        tbBailCertificates.setBailId(bailId);
        List<TbBailCertificates> list = tbBailCertificatesMapper.queryTbBailCertificatesByPage(tbBailCertificates);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [TB_BAIL_CERTIFICATES 供应商保证金表， 序列seq_bailid]
     * @param tbBailCertificates
     * @return
     */
    @Override
    public List<TbBailCertificates> queryTbBailCertificatesList(
            TbBailCertificates tbBailCertificates) {
        return tbBailCertificatesMapper.queryTbBailCertificatesByPage(tbBailCertificates);
    }

    /**
     * 
     * 函数功能描述：查询所有 [TB_BAIL_CERTIFICATES 供应商保证金表， 序列seq_bailid]
     * @param tbBailCertificates
     * @return
     */
    @Override
    public Integer insertTbBidInvitation(TbBidInvitation tbBidInvitation) {
        return tbBidInvitationMapper.insertTbBidInvitation(tbBidInvitation);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [TB_BID_INVITATION 投标邀请书， 序列seq_invitationid]
     * @param invitationId
     * @return
     */
    @Override
    public TbBidInvitation queryTbBidInvitationById(Long invitationId) {
        if(invitationId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        TbBidInvitation tbBidInvitation = new TbBidInvitation();
        tbBidInvitation.setInvitationId(invitationId);
        List<TbBidInvitation> list = tbBidInvitationMapper.queryTbBidInvitationByPage(tbBidInvitation);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [TB_BID_INVITATION 投标邀请书， 序列seq_invitationid]
     * @param tbBidInvitation
     * @return
     */
    @Override
    public List<TbBidInvitation> queryTbBidInvitationList(TbBidInvitation tbBidInvitation) {
        return tbBidInvitationMapper.queryTbBidInvitationByPage(tbBidInvitation);
    }

    /**
     * 
     * 函数功能描述：插入[TB_BID_SUPPLIER 中标供应商， 序列seq_bidsupplierid]
     * @param tbBidSupplier
     * @return
     */
    @Override
    public Integer insertTbBidSupplier(TbBidSupplier tbBidSupplier) {
        return tbBidSupplierMapper.insertTbBidSupplier(tbBidSupplier);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [TB_BID_SUPPLIER 中标供应商， 序列seq_bidsupplierid]
     * @param bidSupplierId
     * @return
     */
    @Override
    public TbBidSupplier queryTbBidSupplierById(Long bidSupplierId) {
        if(bidSupplierId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        TbBidSupplier tbBidSupplier = new TbBidSupplier();
        tbBidSupplier.setBidSupplierId(bidSupplierId);
        List<TbBidSupplier> list = tbBidSupplierMapper.queryTbBidSupplierByPage(tbBidSupplier);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [TB_BID_SUPPLIER 中标供应商， 序列seq_bidsupplierid]
     * @param tbBidSupplier
     * @return
     */
    @Override
    public List<TbBidSupplier> queryTbBidSupplierList(TbBidSupplier tbBidSupplier) {
        return tbBidSupplierMapper.queryTbBidSupplierByPage(tbBidSupplier);
    }

    /**
     * 
     * 函数功能描述：插入[TB_COMPLAIN 质疑投诉表， 序列seq_complainid]
     * @param tbComplain
     * @return
     */
    @Override
    public Integer insertTbComplain(TbComplain tbComplain) {
        return tbComplainMapper.insertTbComplain(tbComplain);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [TB_COMPLAIN 质疑投诉表， 序列seq_complainid]
     * @param complainId
     * @return
     */
    @Override
    public TbComplain queryTbComplainById(Long complainId) {
        if(complainId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        TbComplain tbComplain = new TbComplain();
        tbComplain.setComplainId(complainId);
        List<TbComplain> list = tbComplainMapper.queryTbComplainByPage(tbComplain);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [TB_COMPLAIN 质疑投诉表， 序列seq_complainid]
     * @param tbComplain
     * @return
     */
    @Override
    public List<TbComplain> queryTbComplainList(TbComplain tbComplain) {
        return tbComplainMapper.queryTbComplainByPage(tbComplain);
    }

    /**
     * 
     * 函数功能描述：插入[TB_CONNECT_NOTICE 公告表， 序列seq_noticeid]
     * @param tbConnectNotice
     * @return
     */
    @Override
    public Integer insertTbConnectNotice(TbConnectNotice tbConnectNotice) {
        return tbConnectNoticeMapper.insertTbConnectNotice(tbConnectNotice);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [TB_CONNECT_NOTICE 公告表， 序列seq_noticeid]
     * @param noticeId
     * @return
     */
    @Override
    public TbConnectNotice queryTbConnectNoticeById(Long noticeId) {
        if(noticeId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        TbConnectNotice tbConnectNotice = new TbConnectNotice();
        tbConnectNotice.setNoticeId(noticeId);
        List<TbConnectNotice> list = tbConnectNoticeMapper.queryTbConnectNoticeByPage(tbConnectNotice);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [TB_CONNECT_NOTICE 公告表， 序列seq_noticeid]
     * @param tbConnectNotice
     * @return
     */
    @Override
    public List<TbConnectNotice> queryTbConnectNoticeList(TbConnectNotice tbConnectNotice) {
        return tbConnectNoticeMapper.queryTbConnectNoticeByPage(tbConnectNotice);
    }

    /**
     * 
     * 函数功能描述：插入[TB_ENTRUST_PERSON_REL 招标人关系表]
     * @param tbEntrustPersonRel
     * @return
     */
    @Override
    public Integer insertTbEntrustPersonRel(TbEntrustPersonRel tbEntrustPersonRel) {
        return tbEntrustPersonRelMapper.insertTbEntrustPersonRel(tbEntrustPersonRel);
    }

    /**
     * 
     * 函数功能描述：查询所有 [TB_ENTRUST_PERSON_REL 招标人关系表]
     * @param TbEntrustPersonRel
     * @return
     */
    @Override
    public List<TbEntrustPersonRel> queryTbEntrustPersonRelList(
            TbEntrustPersonRel tbEntrustPersonRel) {
        return tbEntrustPersonRelMapper.queryTbEntrustPersonRelByPage(tbEntrustPersonRel);
    }

    /**
     * 
     * 函数功能描述：插入[TB_FILING_DATA 项目归档配置表， 序列seq_filingdataid]
     * @param tbFilingData
     * @return
     */
    @Override
    public Integer insertTbFilingData(TbFilingData tbFilingData) {
        return tbFilingDataMapper.insertTbFilingData(tbFilingData);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [TB_FILING_DATA 项目归档配置表， 序列seq_filingdataid]
     * @param filingDataId
     * @return
     */
    @Override
    public TbFilingData queryTbFilingDataById(Long filingDataId) {
        if(filingDataId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        TbFilingData tbFilingData = new TbFilingData();
        tbFilingData.setFilingDataId(filingDataId);
        List<TbFilingData> list = tbFilingDataMapper.queryTbFilingDataByPage(tbFilingData);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [TB_FILING_DATA 项目归档配置表， 序列seq_filingdataid]
     * @param tbFilingData
     * @return
     */
    @Override
    public List<TbFilingData> queryTbFilingDataList(TbFilingData tbFilingData) {
        return tbFilingDataMapper.queryTbFilingDataByPage(tbFilingData);
    }

    /**
     * 
     * 函数功能描述：插入[TB_INVITATION_SUPPLIER 投标邀请书关系表]
     * @param tbInvitationSupplier
     * @return
     */
    @Override
    public Integer insertTbInvitationSupplier(TbInvitationSupplier tbInvitationSupplier) {
        return tbInvitationSupplierMapper.insertTbInvitationSupplier(tbInvitationSupplier);
    }

    /**
     * 
     * 函数功能描述：查询所有 [TB_INVITATION_SUPPLIER 投标邀请书关系表]
     * @param tbInvitationSupplier
     * @return
     */
    @Override
    public List<TbInvitationSupplier> queryTbInvitationSupplierList(
            TbInvitationSupplier tbInvitationSupplier) {
        return tbInvitationSupplierMapper.queryTbInvitationSupplierByPage(tbInvitationSupplier);
    }

    /**
     * 
     * 函数功能描述：插入[TB_PROJECT 项目表， 序列seq_projectid]
     * @param tbProject
     * @return
     */
    @Override
    public Integer insertTbProject(TbProject tbProject) {
        return tbProjectMapper.insertTbProject(tbProject);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [TB_PROJECT 项目表， 序列seq_projectid]
     * @param projectId
     * @return
     */
    @Override
    public TbProject queryTbProjectById(Long projectId) {
        if(projectId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        TbProject tbProject = new TbProject();
        tbProject.setProjectId(projectId);
        List<TbProject> list = tbProjectMapper.queryTbProjectByPage(tbProject);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [TB_PROJECT 项目表， 序列seq_projectid]
     * @param tbProject
     * @return
     */
    @Override
    public List<TbProject> queryTbProjectList(TbProject tbProject) {
        return tbProjectMapper.queryTbProjectByPage(tbProject);
    }

    /**
     * 
     * 函数功能描述：插入[TB_PROJECT_FILING 项目归档表， 序列seq_filingid]
     * @param tbProjectFiling
     * @return
     */
    @Override
    public Integer insertTbProjectFiling(TbProjectFiling tbProjectFiling) {
        return tbProjectFilingMapper.insertTbProjectFiling(tbProjectFiling);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [TB_PROJECT_FILING 项目归档表， 序列seq_filingid]
     * @param filingId
     * @return
     */
    @Override
    public TbProjectFiling queryTbProjectFilingById(Long filingId) {
        if(filingId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        TbProjectFiling tbProjectFiling = new TbProjectFiling();
        tbProjectFiling.setFilingId(filingId);
        List<TbProjectFiling> list = tbProjectFilingMapper.queryTbProjectFilingByPage(tbProjectFiling);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [TB_PROJECT_FILING 项目归档表， 序列seq_filingid]
     * @param tbProjectFiling
     * @return
     */
    @Override
    public List<TbProjectFiling> queryTbProjectFilingList(TbProjectFiling tbProjectFiling) {
        return tbProjectFilingMapper.queryTbProjectFilingByPage(tbProjectFiling);
    }

    /**
     * 
     * 函数功能描述：插入[TB_PURCHASE_FILE 招标文件表， 序列seq_purchaseid]
     * @param tbPurchaseFile
     * @return
     */
    @Override
    public Integer insertTbPurchaseFile(TbPurchaseFile tbPurchaseFile) {
        return tbPurchaseFileMapper.insertTbPurchaseFile(tbPurchaseFile);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [TB_PURCHASE_FILE 招标文件表， 序列seq_purchaseid]
     * @param purchaseId
     * @return
     */
    @Override
    public TbPurchaseFile queryTbPurchaseFileById(Long purchaseId) {
        if(purchaseId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        TbPurchaseFile tbPurchaseFile = new TbPurchaseFile();
        tbPurchaseFile.setPurchaseId(purchaseId);
        List<TbPurchaseFile> list = tbPurchaseFileMapper.queryTbPurchaseFileByPage(tbPurchaseFile);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [TB_PURCHASE_FILE 招标文件表， 序列seq_purchaseid]
     * @param tbPurchaseFile
     * @return
     */
    @Override
    public List<TbPurchaseFile> queryTbPurchaseFileList(TbPurchaseFile tbPurchaseFile) {
        return tbPurchaseFileMapper.queryTbPurchaseFileByPage(tbPurchaseFile);
    }

    /**
     * 
     * 函数功能描述：插入[TB_QUESTION 澄清答疑表， 序列seq_questionid]
     * @param TbQuestion
     * @return
     */
    @Override
    public Integer insertTbQuestion(TbQuestion tbQuestion) {
        return tbQuestionMapper.insertTbQuestion(tbQuestion);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [TB_QUESTION 澄清答疑表， 序列seq_questionid]
     * @param questionId
     * @return
     */
    @Override
    public TbQuestion queryTbQuestionById(Long questionId) {
        if(questionId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        TbQuestion tbQuestion = new TbQuestion();
        tbQuestion.setQuestionId(questionId);
        List<TbQuestion> list = tbQuestionMapper.queryTbQuestionByPage(tbQuestion);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [TB_QUESTION 澄清答疑表， 序列seq_questionid]
     * @param TbQuestion
     * @return
     */
    @Override
    public List<TbQuestion> queryTbQuestionList(TbQuestion tbQuestion) {
        return tbQuestionMapper.queryTbQuestionByPage(tbQuestion);
    }

    /**
     * 
     * 函数功能描述：插入[TB_QUESTION_PROBLEM 澄清答疑问题表， 序列seq_problemid]
     * @param tbQuestionProblem
     * @return
     */
    @Override
    public Integer insertTbQuestionProblem(TbQuestionProblem tbQuestionProblem) {
        return tbQuestionProblemMapper.insertTbQuestionProblem(tbQuestionProblem);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [TB_QUESTION_PROBLEM 澄清答疑问题表， 序列seq_problemid]
     * @param problemId
     * @return
     */
    @Override
    public TbQuestionProblem queryTbQuestionProblemById(Long problemId) {
        if(problemId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        TbQuestionProblem tbQuestionProblem = new TbQuestionProblem();
        tbQuestionProblem.setProblemId(problemId);
        List<TbQuestionProblem> list = tbQuestionProblemMapper.queryTbQuestionProblemByPage(tbQuestionProblem);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }
    
    /**
     * 
     * 函数功能描述：查询所有 [TB_QUESTION_PROBLEM 澄清答疑问题表， 序列seq_problemid]
     * @param tbQuestionProblem
     * @return
     */
    @Override
    public List<TbQuestionProblem> queryTbQuestionProblemList(TbQuestionProblem tbQuestionProblem) {
        return tbQuestionProblemMapper.queryTbQuestionProblemByPage(tbQuestionProblem);
    }

    /**
     * 
     * 函数功能描述：插入[TB_STANDARD_SUPPLIER 参标供应商表， 序列seq_standardid]
     * @param tbStandardSupplier
     * @return
     */
    @Override
    public Integer insertTbStandardSupplier(TbStandardSupplier tbStandardSupplier) {
        return tbStandardSupplierMapper.insertTbStandardSupplier(tbStandardSupplier);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [TB_STANDARD_SUPPLIER 参标供应商表， 序列seq_standardid]
     * @param standardId
     * @return
     */
    @Override
    public TbStandardSupplier queryTbStandardSupplierById(Long standardId) {
        if(standardId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        TbStandardSupplier tbStandardSupplier = new TbStandardSupplier();
        tbStandardSupplier.setStandardId(standardId);
        List<TbStandardSupplier> list = tbStandardSupplierMapper.queryTbStandardSupplierByPage(tbStandardSupplier);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [TB_STANDARD_SUPPLIER 参标供应商表， 序列seq_standardid]
     * @param tbStandardSupplier
     * @return
     */
    @Override
    public List<TbStandardSupplier> queryTbStandardSupplierList(
            TbStandardSupplier tbStandardSupplier) {
        return tbStandardSupplierMapper.queryTbStandardSupplierByPage(tbStandardSupplier);
    }

    /**
     * 
     * 函数功能描述：插入[TB_SUB 标段表， 序列seq_subid]
     * @param tbSub
     * @return
     */
    @Override
    public Integer insertTbSub(TbSub tbSub) {
        return tbSubMapper.insertTbSub(tbSub);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [TB_SUB 标段表， 序列seq_subid]
     * @param subId
     * @return
     */
    @Override
    public TbSub queryTbSubById(Long subId) {
        if(subId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        TbSub tbSub = new TbSub();
        tbSub.setSubId(subId);
        List<TbSub> list = tbSubMapper.queryTbSubByPage(tbSub);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [TB_SUB 标段表， 序列seq_subid]
     * @param tbSub
     * @return
     */
    @Override
    public List<TbSub> queryTbSubList(TbSub tbSub) {
        return tbSubMapper.queryTbSubByPage(tbSub);
    }

    /**
     * 
     * 函数功能描述：插入[TB_TENDER_PROJECT 招标项目表， 序列seq_tenderprojectid]
     * @param tbTenderProject
     * @return
     */
    @Override
    public Integer insertTbTenderProject(TbTenderProject tbTenderProject) {
        return tbTenderProjectMapper.insertTbTenderProject(tbTenderProject);
    }

    /**
     * 
     * 函数功能描述：根据id查询 [TB_TENDER_PROJECT 招标项目表， 序列seq_tenderprojectid]
     * @param tenderProjectId
     * @return
     */
    @Override
    public TbTenderProject queryTbTenderProjectById(Long tenderProjectId) {
        if(tenderProjectId == null){
            throw new DaoException(DaoErrorCode.CODE_ID_0001, DaoErrorCode.Msg_ID_0001);
        }
        TbTenderProject tbTenderProject = new TbTenderProject();
        tbTenderProject.setTenderProjectId(tenderProjectId);
        List<TbTenderProject> list = tbTenderProjectMapper.queryTbTenderProjectByPage(tbTenderProject);
        //如果list为null或者为空，那么返回null；
        if(list == null || list.size() <= 0){
            return null;
        }
        //如果结果不唯一，那么抛出异常
        if(list.size() != 1 ){
            throw new DaoException(DaoErrorCode.CODE_UNIQUE_0002, DaoErrorCode.Msg_UNIQUE_0002);
        }
        return list.get(0);
    }

    /**
     * 
     * 函数功能描述：查询所有 [TB_TENDER_PROJECT 招标项目表， 序列seq_tenderprojectid]
     * @param tbTenderProject
     * @return
     */
    @Override
    public List<TbTenderProject> queryTbTenderProjectList(TbTenderProject tbTenderProject) {
        return tbTenderProjectMapper.queryTbTenderProjectByPage(tbTenderProject);
    }

    /**
     * 
     * 函数功能描述：查询供应商所有 参标项目   [TB_STANDARD_SUPPLIER 参标供应商表， 序列seq_standardid]
     * @param tbStandardSupplier
     * @return
     */
    @Override
    public List<TbStandardSupplier> querySupplierProjectByPage(
            TbStandardSupplier tbStandardSupplier) {
        return tbStandardSupplierMapper.querySupplierProjectByPage(tbStandardSupplier);
    }

    /**
     * 主要查询参标的标段信息，以及是否中标情况，等等
     * 函数功能描述：查询供应商所有 参标项目和标段信息   [TB_STANDARD_SUPPLIER 参标供应商表， 序列seq_standardid]
     * @param tbStandardSupplier
     * @return
     */
    @Override
    public List<TbStandardSupplier> querySupplierSubDetailByPage(
            TbStandardSupplier tbStandardSupplier) {
        return tbStandardSupplierMapper.querySupplierSubDetailByPage(tbStandardSupplier);
    }
    /**
     * 函数功能描述： 更新组织机构信息
     * @param 函数功能描述：查询所有 [TB_TENDER_PROJECT 招标项目表， 序列seq_tenderprojectid]
     * @return
     */
	@Override
	public void updateSysOrganizatioin(SysOrganizatioin sysOrganizatioin ) {
		
		sysOrganizatioinMapper.updateSysOrganizatioin(sysOrganizatioin);
		
	}

	 /**
     * 
     * 函数功能描述：查询所有[SYS_USER  供应商用户表] 用户信息以及组织机构列表（分页）
     * @param sysUser
     * @return
     */
    @Override
    public List<SysUser> querySysUserAndOrgInfoByPage(SysUser sysUser) {
        return sysUserMapper.querySysUserAndOrgInfoByPage(sysUser);
    }

    /**
     * 
     * 函数功能描述：获取[TB_STANDARD_SUPPLIER 参标供应商表， 序列seq_standardid]的下一个序列ID
     * @return
     */
    @Override
    public Long queryNextSeqStandardId() {
        return tbStandardSupplierMapper.queryNextSeqStandardId();
    }

    /**
     * 
     * 函数功能描述：插入[TB_STANDARD_SUPPLIER 参标供应商表， 序列seq_standardid]， 批量插入数据，
     *  循环conditonMap.tbStandardSupplierList为key
     * @param tbStandardSupplier
     * @return
     */
    @Override
    public Integer insertTbStandardSupplierBatch(TbStandardSupplier tbStandardSupplier) {
        return tbStandardSupplierMapper.insertTbStandardSupplierBatch(tbStandardSupplier);
    }
    
    /**
     * 
     * 函数功能描述：更新[TB_STANDARD_SUPPLIER 参标供应商表， 序列seq_standardid]
     * @param tbStandardSupplier
     * @return
     */
    @Override
    public Integer updateTbStandardSupplier(TbStandardSupplier tbStandardSupplier) {
        return tbStandardSupplierMapper.updateTbStandardSupplier(tbStandardSupplier);
    }
    
    /**
     * 
     * 函数功能描述：更新[TB_STANDARD_SUPPLIER 参标供应商表， 序列seq_standardid]
     * @param tbStandardSupplier
     * @return
     */
    @Override
    public Integer updateTbStandardSupplierById(List<TbStandardSupplier> tbStandardSupplierList) {
        Integer rows = 0;
        for(TbStandardSupplier item : tbStandardSupplierList){
            rows += tbStandardSupplierMapper.updateTbStandardSupplier(item);
        }
        if(rows != tbStandardSupplierList.size()){
            throw new DaoException(DaoErrorCode.Error_CODE_0005, "参标供应商修改付费凭证状态失败");
        }
        return rows;
    }
    
	/**
     * 
     * 函数功能描述：修改用户密码
     * @param sysUser
     * @return
     */
	@Override
    public Integer modifyPassword(SysUser sysUser)
    {
        return sysUserMapper.modifyPassword(sysUser);
    }

	/**
     * 
     * 函数功能描述：修改用户状态（启用 停用 删除）
     * @param sysUser
     * @return
     */
    @Override
    public Integer modifyUserStatus(SysUser sysUser)
    {
        return sysUserMapper.modifyUserStatus(sysUser);
    }

    @Override
    public void upDateSysUser(SysUser currUser)
    {
        sysUserMapper.upDateSysUser(currUser);
        
    }

}
