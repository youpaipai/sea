/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述： 公共dao接口
 * 文件名称：BaseDao.java
 * 修改时间：2016年7月14日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.dao;

import java.util.List;

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
 * 公共dao接口
 * <功能详细描述>
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface BaseDao {
    
    /**
     * 
     * 函数功能描述：插入 评标专家信息表 kpBidExpert
     * @param kpBidExpert
     * @return
     */
    Integer insertKpBidExpert(KpBidExpert kpBidExpert);
    
    /**
     * 
     * 函数功能描述：根据id查询 评标专家信息
     * @param bidExpertId
     * @return
     */
    KpBidExpert queryKpBidExpertById(Long bidExpertId);
    
    /**
     * 
     * 函数功能描述：查询所有 评标专家信息表
     * @param kpBidExpert
     * @return
     */
    List<KpBidExpert> queryKpBidExpertList(KpBidExpert kpBidExpert);
    
    /**
     * 
     * 函数功能描述：插入 [开标记录] KP_BID_RECORD
     * @param kpBidRecord
     * @return
     */
    Integer insertKpBidRecord(KpBidRecord kpBidRecord);
    
    /**
     * 
     * 函数功能描述：根据id查询 [开标记录] KP_BID_RECORD
     * @param recordId
     * @return
     */
    KpBidRecord queryKpBidRecordById(Long recordId);
    
    /**
     * 
     * 函数功能描述：查询所有 [开标记录] KP_BID_RECORD
     * @param kpBidRecord
     * @return
     */
    List<KpBidRecord> queryKpBidRecordList(KpBidRecord kpBidRecord);
    
    /**
     * 
     * 函数功能描述：插入 [KP_BID_REPORT  评标报告表， 序列seq_reportid]
     * @param kpBidReport
     * @return
     */
    Integer insertKpBidReport(KpBidReport kpBidReport);
    
    /**
     * 
     * 函数功能描述：根据id查询 [KP_BID_REPORT  评标报告表， 序列seq_reportid]
     * @param reportId
     * @return
     */
    KpBidReport queryKpBidReportById(Long reportId);
    
    /**
     * 
     * 函数功能描述：查询所有 [KP_BID_REPORT  评标报告表， 序列seq_reportid]
     * @param kpBidReport
     * @return
     */
    List<KpBidReport> queryKpBidReportList(KpBidReport kpBidReport);
    
    /**
     * 
     * 函数功能描述：插入 [KP_BID_RULES  评标规则模板表， 序列seq_bidid]
     * @param kpBidReport
     * @return
     */
    Integer insertKpBidRules(KpBidRules kpBidRules);
    
    /**
     * 
     * 函数功能描述：根据id查询 [KP_BID_RULES  评标规则模板表， 序列seq_bidid]
     * @param bidId
     * @return
     */
    KpBidRules queryKpBidRulesById(Long bidId);
    
    /**
     * 
     * 函数功能描述：查询所有 [KP_BID_RULES  评标规则模板表， 序列seq_bidid]
     * @param KpBidRules
     * @return
     */
    List<KpBidRules> queryKpBidRulesList(KpBidRules kpBidRules);
    
    /**
     * 
     * 函数功能描述：插入 [KP_CAST_RECORD  投标记录表， 序列seq_castrecordid]
     * @param kpCastRecord
     * @return
     */
    Integer insertKpCastRecord(KpCastRecord kpCastRecord);
    
    /**
     * 
     * 函数功能描述：根据id查询 [KP_CAST_RECORD  投标记录表， 序列seq_castrecordid]
     * @param castRecordId
     * @return
     */
    KpCastRecord queryKpCastRecordById(Long castRecordId);
    
    /**
     * 
     * 函数功能描述：查询所有 [KP_CAST_RECORD  投标记录表， 序列seq_castrecordid]
     * @param kpCastRecord
     * @return
     */
    List<KpCastRecord> queryKpCastRecordList(KpCastRecord kpCastRecord);
    
    /**
     * 
     * 函数功能描述：插入[KP_DETAIL_REVIEW  详细评审表， 序列seq_detailid]
     * @param kpDetailReview
     * @return
     */
    Integer insertKpDetailReview(KpDetailReview kpDetailReview);
    
    /**
     * 
     * 函数功能描述：根据id查询 [KP_DETAIL_REVIEW  详细评审表， 序列seq_detailid]
     * @param detailId
     * @return
     */
    KpDetailReview queryKpDetailReviewById(Long detailId);
    
    /**
     * 
     * 函数功能描述：查询所有 [KP_DETAIL_REVIEW  详细评审表， 序列seq_detailid]
     * @param kpDetailReview
     * @return
     */
    List<KpDetailReview> queryKpDetailReviewList(KpDetailReview kpDetailReview);
    
    
    /**
     * 
     * 函数功能描述：插入[KP_INIT_REVIEW  初步评审表， 序列seq_initid]
     * @param kpInitReview
     * @return
     */
    Integer insertKpInitReview(KpInitReview kpInitReview);
    
    /**
     * 
     * 函数功能描述：根据id查询 [KP_INIT_REVIEW  初步评审表， 序列seq_initid]
     * @param initId
     * @return
     */
    KpInitReview queryKpInitReviewById(Long initId);
    
    /**
     * 
     * 函数功能描述：查询所有 [KP_INIT_REVIEW  初步评审表， 序列seq_initid]
     * @param KpInitReview
     * @return
     */
    List<KpInitReview> queryKpInitReviewList(KpInitReview kpInitReview);
    
    /**
     * 
     * 函数功能描述：插入[KP_INIT_REVIEW_RESULT  初步评审结果表， 序列seq_resultid]
     * @param KpInitReviewResult
     * @return
     */
    Integer insertKpInitReviewResult(KpInitReviewResult kpInitReviewResult);
    
    /**
     * 
     * 函数功能描述：根据id查询 [KP_INIT_REVIEW_RESULT  初步评审结果表， 序列seq_resultid]
     * @param initId
     * @return
     */
    KpInitReviewResult queryKpInitReviewResultById(Long resultId);
    
    /**
     * 
     * 函数功能描述：查询所有 [KP_INIT_REVIEW_RESULT  初步评审结果表， 序列seq_resultid]
     * @param KpInitReviewResult
     * @return
     */
    List<KpInitReviewResult> queryKpInitReviewResultList(KpInitReviewResult kpInitReviewResult);
    
    /**
     * 
     * 函数功能描述：插入[KP_OPEN_PROJECT  开标项目配置表， 序列seq_openid]
     * @param kpOpenProject
     * @return
     */
    Integer insertKpOpenProject(KpOpenProject kpOpenProject);
    
    /**
     * 
     * 函数功能描述：根据id查询 [KP_OPEN_PROJECT  开标项目配置表， 序列seq_openid]
     * @param openId
     * @return
     */
    KpOpenProject queryKpOpenProjectById(Long openId);
    
    /**
     * 
     * 函数功能描述：查询所有 [KP_OPEN_PROJECT  开标项目配置表， 序列seq_openid]
     * @param KpOpenProject
     * @return
     */
    List<KpOpenProject> queryKpOpenProjectList(KpOpenProject kpOpenProject);
    
    /**
     * 
     * 函数功能描述：插入[KP_PROJECT_RULES  项目评标规则表， 序列seq_rulesid]
     * @param kpProjectRules
     * @return
     */
    Integer insertKpProjectRules(KpProjectRules kpProjectRules);
    
    /**
     * 
     * 函数功能描述：根据id查询 [KP_PROJECT_RULES  项目评标规则表， 序列seq_rulesid]
     * @param rulesId
     * @return
     */
    KpProjectRules queryKpProjectRulesById(Long rulesId);
    
    /**
     * 
     * 函数功能描述：查询所有 [KP_PROJECT_RULES  项目评标规则表， 序列seq_rulesid]
     * @param kpProjectRules
     * @return
     */
    List<KpProjectRules> queryKpProjectRulesList(KpProjectRules kpProjectRules);
    
    /**
     * 
     * 函数功能描述：插入[KP_REVIEW_INFO  详细评审明细表， 序列seq_infoid]
     * @param kpReviewInfo
     * @return
     */
    Integer insertKpReviewInfo(KpReviewInfo kpReviewInfo);
    
    /**
     * 
     * 函数功能描述：根据id查询 [KP_REVIEW_INFO  详细评审明细表， 序列seq_infoid]
     * @param infoId
     * @return
     */
    KpReviewInfo queryKpReviewInfoById(Long infoId);
    
    /**
     * 
     * 函数功能描述：查询所有 [KP_REVIEW_INFO  详细评审明细表， 序列seq_infoid]
     * @param KpReviewInfo
     * @return
     */
    List<KpReviewInfo> queryKpReviewInfoList(KpReviewInfo kpReviewInfo);
    
    /**
     * 
     * 函数功能描述：插入[MH_FILE_IMAGES  动态图片展示表， 序列seq_imageid]
     * @param mhFileImages
     * @return
     */
    Integer insertMHFileImages(MHFileImages mhFileImages);
    
    /**
     * 
     * 函数功能描述：根据id查询 [MH_FILE_IMAGES  动态图片展示表， 序列seq_imageid]
     * @param imageId
     * @return
     */
    MHFileImages queryMHFileImagesById(Long imageId);
    
    /**
     * 
     * 函数功能描述：查询所有 [MH_FILE_IMAGES  动态图片展示表， 序列seq_imageid]
     * @param MHFileImages
     * @return
     */
    List<MHFileImages> queryMHFileImagesList(MHFileImages mhFileImages);
    
    /**
     * 
     * 函数功能描述：插入[MH_HELP  系统帮助表， 序列seq_helpid]
     * @param mhHelp
     * @return
     */
    Integer insertMHHelp(MHHelp mhHelp);
    
    /**
     * 
     * 函数功能描述：更新帮助信息
     * @param mhHelp
     * @return
     */
    Integer modifyMHHelp(MHHelp mhHelp);
    
    /**
     * 
     * 函数功能描述：根据id查询 [MH_HELP  系统帮助表， 序列seq_helpid]
     * @param helpId
     * @return
     */
    MHHelp getMHHelpById(Long helpId);
    
    /**
     * 
     * 函数功能描述：查询所有 [MH_HELP  系统帮助表， 序列seq_helpid]
     * @param mhHelp
     * @return
     */
    List<MHHelp> queryMHHelpList(MHHelp mhHelp);
    
    /**
     * 
     * 函数功能描述：插入[SYS_AGENCY  代理机构信息表， 序列seq_agencyid]
     * @param sysAgency
     * @return
     */
    Integer insertSysAgency(SysAgency sysAgency);
    
    /**
     * 
     * 函数功能描述：根据id查询 [SYS_AGENCY  代理机构信息表， 序列seq_agencyid]
     * @param agencyId
     * @return
     */
    SysAgency querySysAgencyById(Long agencyId);
    
    /**
     * 
     * 函数功能描述：查询所有 [SYS_AGENCY  代理机构信息表， 序列seq_agencyid]
     * @param sysAgency
     * @return
     */
    List<SysAgency> querySysAgencyList(SysAgency sysAgency);
    
    /**
     * 
     * 函数功能描述：插入[SYS_AREA  地区表， 序列seq_areaid]
     * @param sysArea
     * @return
     */
    Integer insertSysArea(SysArea sysArea);
    
    /**
     * 
     * 函数功能描述：根据id查询 [SYS_AREA  地区表， 序列seq_areaid]
     * @param areaId
     * @return
     */
    SysArea querySysAreaById(Long areaId);
    
    /**
     * 
     * 函数功能描述：查询所有 [SYS_AREA  地区表， 序列seq_areaid]
     * @param sysArea
     * @return
     */
    List<SysArea> querySysAreaList(SysArea SysArea);
    
    /**
     * 
     * 函数功能描述：插入[SYS_BUTTON  按钮初始表， 序列seq_buttonid]
     * @param sysButton
     * @return
     */
    Integer insertSysButton(SysButton sysButton);
    
    /**
     * 
     * 函数功能描述：根据id查询 [SYS_BUTTON  按钮初始表， 序列seq_buttonid]
     * @param buttonId
     * @return
     */
    SysButton querySysButtonById(Long buttonId);
    
    /**
     * 
     * 函数功能描述：查询所有 [SYS_BUTTON  按钮初始表， 序列seq_buttonid]
     * @param sysButton
     * @return
     */
    List<SysButton> querySysButtonList(SysButton sysButton);
    
    /**
     * 
     * 函数功能描述：插入[SYS_CERTIFICATE  证书管理信息表， 序列seq_certificateid]
     * @param sysCertificate
     * @return
     */
    Integer insertSysCertificate(SysCertificate sysCertificate);
    
    /**
     * 
     * 函数功能描述：根据id查询 [SYS_CERTIFICATE  证书管理信息表， 序列seq_certificateid]
     * @param certificateId
     * @return
     */
    SysCertificate querySysCertificateById(Long certificateId);
    
    /**
     * 
     * 函数功能描述：查询所有 [SYS_CERTIFICATE  证书管理信息表， 序列seq_certificateid]
     * @param sysCertificate
     * @return
     */
    List<SysCertificate> querySysCertificateList(SysCertificate sysCertificate);
    
    /**
     * 
     * 函数功能描述：插入[SYS_CONFIG  系统配置项表， 序列seq_configid]
     * @param sysConfig
     * @return
     */
    Integer insertSysConfig(SysConfig sysConfig);
    
    /**
     * 
     * 函数功能描述：根据id查询 [SYS_CONFIG  系统配置项表， 序列seq_configid]
     * @param configId
     * @return
     */
    SysConfig querySysConfigById(Long configId);
    
    /**
     * 
     * 函数功能描述：查询所有 [SYS_CONFIG  系统配置项表， 序列seq_configid]
     * @param sysConfig
     * @return
     */
    List<SysConfig> querySysConfigList(SysConfig sysConfig);
    
    /**
     * 
     * 函数功能描述：插入[SYS_CONSTANT  数据字典表， 序列seq_constantid]
     * @param sysConstant
     * @return
     */
    Integer insertSysConstant(SysConstant sysConstant);
    
    /**
     * 
     * 函数功能描述：更新数据字典信息
     * @param sysConstant
     * @return
     */
    Integer modifySysConstant(SysConstant sysConstant);
    
    /**
     * 
     * 函数功能描述：根据id查询 [SYS_CONSTANT  数据字典表， 序列seq_constantid]
     * @param constantId
     * @return
     */
    SysConstant querySysConstantById(Long constantId);
    
    /**
     * 
     * 函数功能描述：查询所有 [SYS_CONSTANT  数据字典表， 序列seq_constantid]
     * @param sysConstant
     * @return
     */
    List<SysConstant> querySysConstantList(SysConstant sysConstant);
    
    /**
     * 
     * 函数功能描述：插入[SYS_DEPARTMENT  部门表， 序列seq_departmentid]
     * @param sysDepartment
     * @return
     */
    Integer insertSysDepartment(SysDepartment sysDepartment);
    
    /**
     * 
     * 函数功能描述：根据id查询 [SYS_DEPARTMENT  部门表， 序列seq_departmentid]
     * @param departmentId
     * @return
     */
    SysDepartment querySysDepartmentById(Long departmentId);
    
    /**
     * 
     * 函数功能描述：查询所有 [SYS_DEPARTMENT  部门表， 序列seq_departmentid]
     * @param sysDepartment
     * @return
     */
    List<SysDepartment> querySysDepartmentList(SysDepartment sysDepartment);
    
    /**
     * 
     * 函数功能描述：插入[SYS_ENTRUST_PERSON  招标人表， 序列seq_personid]
     * @param sysEntrustPerson
     * @return
     */
    Integer insertSysEntrustPerson(SysEntrustPerson sysEntrustPerson);
    
    /**
     * 
     * 函数功能描述：根据id查询 [SYS_ENTRUST_PERSON  招标人表， 序列seq_personid]
     * @param personId
     * @return
     */
    SysEntrustPerson querySysEntrustPersonById(Long personId);
    
    /**
     * 
     * 函数功能描述：查询所有 [SYS_ENTRUST_PERSON  招标人表， 序列seq_personid]
     * @param sysEntrustPerson
     * @return
     */
    List<SysEntrustPerson> querySysEntrustPersonList(SysEntrustPerson sysEntrustPerson);
    
    /**
     * 
     * 函数功能描述：插入[SYS_FILE  文件表， 序列seq_fileid]
     * @param SysFile
     * @return
     */
    Integer insertSysFile(SysFile sysFile);
    
    /**
     * 
     * 函数功能描述：根据id查询 [SYS_FILE  文件表， 序列seq_fileid]
     * @param fileId
     * @return
     */
    SysFile querySysFileById(Long fileId);
    
    /**
     * 
     * 函数功能描述：更新[SYS_FILE  文件表]
     * @param sysFile
     * @return
     */
    Integer modifySysFile(SysFile sysFile);
    
    /**
     * 
     * 函数功能描述：查询所有 [SYS_FILE  文件表， 序列seq_fileid]
     * @param SysFile
     * @return
     */
    List<SysFile> querySysFileList(SysFile sysFile);
    
    /**
     * 
     * 函数功能描述：插入[SYS_FILE_DOWN  文件下载表， 序列seq_downid]
     * @param sysFileDown
     * @return
     */
    Integer insertSysFileDown(SysFileDown sysFileDown);
    
    /**
     * 
     * 函数功能描述：根据id查询 [SYS_FILE_DOWN  文件下载表， 序列seq_downid]
     * @param downId
     * @return
     */
    SysFileDown querySysFileDownById(Long downId);
    
    /**
     * 
     * 函数功能描述：查询所有 [SYS_FILE_DOWN  文件下载表， 序列seq_downid]
     * @param sysFileDown
     * @return
     */
    List<SysFileDown> querySysFileDownList(SysFileDown sysFileDown);
    
    /**
     * 
     * 函数功能描述：插入[SYS_LOG  日志信息表， 序列seq_logid]
     * @param sysLog
     * @return
     */
    Integer insertSysLog(SysLog sysLog);
    
    /**
     * 
     * 函数功能描述：根据id查询 [SYS_LOG  日志信息表， 序列seq_logid]
     * @param logId
     * @return
     */
    SysLog getSysLogById(Long logId);
    
    /**
     * 
     * 函数功能描述：查询所有 [SYS_LOG  日志信息表， 序列seq_logid]
     * @param sysLog
     * @return
     */
    List<SysLog> querySysLogList(SysLog sysLog);
    
    /**
     * 
     * 函数功能描述：插入[SYS_LOGIN_SOURCE  登录来源表， 序列seq_loginid]
     * @param sysLoginSource
     * @return
     */
    Integer insertSysLoginSource(SysLoginSource sysLoginSource);
    
    /**
     * 
     * 函数功能描述：根据id查询 [SYS_LOGIN_SOURCE  登录来源表， 序列seq_loginid]
     * @param loginId
     * @return
     */
    SysLoginSource querySysLoginSourceById(Long loginId);
    
    /**
     * 
     * 函数功能描述：查询所有 [SYS_LOGIN_SOURCE  登录来源表， 序列seq_loginid]
     * @param sysLoginSource
     * @return
     */
    List<SysLoginSource> querySysLoginSourceList(SysLoginSource sysLoginSource);
    
    /**
     * 
     * 函数功能描述：插入[SYS_MENU  菜单表， 序列seq_menuid]
     * @param sysMenu
     * @return
     */
    Integer insertSysMenu(SysMenu sysMenu);
    
    /**
     * 
     * 函数功能描述：根据id查询 [SYS_MENU  菜单表， 序列seq_menuid]
     * @param menuId
     * @return
     */
    SysMenu querySysMenuById(Long menuId);
    
    /**
     * 
     * 函数功能描述：查询所有 [SYS_MENU  菜单表， 序列seq_menuid]
     * @param sysMenu
     * @return
     */
    List<SysMenu> querySysMenuList(SysMenu sysMenu);
    
    /**
     * 
     * 函数功能描述：插入[SYS_MENU_BUTTON  菜单按钮关系表]
     * @param sysMenuButton
     * @return
     */
    Integer insertSysMenuButton(SysMenuButton sysMenuButton);
    
    /**
     * 
     * 函数功能描述：查询所有 [SYS_MENU_BUTTON  菜单按钮关系表]
     * @param sysMenuButton
     * @return
     */
    List<SysMenuButton> querySysMenuButtonList(SysMenuButton sysMenuButton);
    
    /**
     * 
     * 函数功能描述：插入[SYS_MESSAGE  系统消息表， 序列seq_smid]
     * @param sysMessage
     * @return
     */
    Integer insertSysMessage(SysMessage sysMessage);
    
    /**
     * 
     * 函数功能描述：根据id查询 [SYS_MESSAGE  系统消息表， 序列seq_smid]
     * @param smId
     * @return
     */
    SysMessage querySysMessageById(Long smId);
    
    /**
     * 
     * 函数功能描述：查询所有 [SYS_MESSAGE  系统消息表， 序列seq_smid]
     * @param sysMessage
     * @return
     */
    List<SysMessage> querySysMessageList(SysMessage sysMessage);
    
    /**
     * 
     * 函数功能描述：插入[SYS_ORGANIZATION  组织机构表， 序列seq_organizationid]
     * @param sysOrganizatioin
     * @return
     */
    Integer insertSysOrganizatioin(SysOrganizatioin sysOrganizatioin);
    
    /**
     * 
     * 函数功能描述：根据id查询 [SYS_ORGANIZATION  组织机构表， 序列seq_organizationid]
     * @param organizationId
     * @return
     */
    SysOrganizatioin querySysOrganizatioinById(Long organizationId);
    
    /**
     * 
     * 函数功能描述：查询所有 [SYS_ORGANIZATION  组织机构表， 序列seq_organizationid]
     * @param sysOrganizatioin
     * @return
     */
    List<SysOrganizatioin> querySysOrganizatioinList(SysOrganizatioin sysOrganizatioin);
    
    /**
     * 
     * 函数功能描述：查询组织机构个数
     * @param sysOrganizatioin
     * @return
     */
    Integer getOrgCount(SysOrganizatioin sysOrganizatioin);
    
    /**
     * 
     * 函数功能描述：插入[SYS_PERSON_USER  招标人用户表， 序列seq_personuserid]
     * @param sysPersonUser
     * @return
     */
    Integer insertSysPersonUser(SysPersonUser sysPersonUser);
    
    /**
     * 
     * 函数功能描述：修改招标人用户信息
     * @param sysPersonUser
     * @return
     */
    Integer modifySysPersonUser(SysPersonUser sysPersonUser);
    
    /**
     * 
     * 函数功能描述：根据id查询 [SYS_PERSON_USER  招标人用户表， 序列seq_personuserid]
     * @param userId
     * @return
     */
    SysPersonUser querySysPersonUserById(Long userId);
    
    /**
     * 
     * 函数功能描述：查询所有 [SYS_PERSON_USER  招标人用户表， 序列seq_personuserid]
     * @param sysPersonUser
     * @return
     */
    List<SysPersonUser> querySysPersonUserList(SysPersonUser sysPersonUser);
    
    /**
     * 
     * 函数功能描述：插入[SYS_PHONE_MODIFY  手机号码变更记录表， 序列seq_phonemodifyid]
     * @param sysPhoneModify
     * @return
     */
    Integer insertSysPhoneModify(SysPhoneModify sysPhoneModify);
    
    /**
     * 
     * 函数功能描述：根据id查询 [SYS_PHONE_MODIFY  手机号码变更记录表， 序列seq_phonemodifyid]
     * @param phoneModifyId
     * @return
     */
    SysPhoneModify querySysPhoneModifyById(Long phoneModifyId);
    
    /**
     * 
     * 函数功能描述：查询所有 [SYS_PHONE_MODIFY  手机号码变更记录表， 序列seq_phonemodifyid]
     * @param sysPhoneModify
     * @return
     */
    List<SysPhoneModify> querySysPhoneModifyList(SysPhoneModify sysPhoneModify);
    
    /**
     * 
     * 函数功能描述：插入[SYS_ROLE  角色表， 序列seq_roleid]
     * @param SysRole
     * @return
     */
    Integer insertSysRole(SysRole sysRole);
    
    /**
     * 
     * 函数功能描述：根据id查询 [SYS_ROLE  角色表， 序列seq_roleid]
     * @param roleId
     * @return
     */
    SysRole querySysRoleById(Long roleId);
    
    /**
     * 
     * 函数功能描述：查询所有 [SYS_ROLE  角色表， 序列seq_roleid]
     * @param sysRole
     * @return
     */
    List<SysRole> querySysRoleList(SysRole sysRole);
    
    /**
     * 
     * 函数功能描述：插入[SYS_ROLE_MENU_BUTTON  角色菜单按钮权限表]
     * @param sysRoleMenuButton
     * @return
     */
    Integer insertSysRoleMenuButton(SysRoleMenuButton sysRoleMenuButton);
    
    /**
     * 
     * 函数功能描述：查询所有 [SYS_ROLE_MENU_BUTTON  角色菜单按钮权限表]
     * @param sysRoleMenuButton
     * @return
     */
    List<SysRoleMenuButton> querySysRoleMenuButtonList(SysRoleMenuButton sysRoleMenuButton);
    
    /**
     * 
     * 函数功能描述：插入[SYS_SUPPLIER  供应商信息表， 序列seq_supplierid]
     * @param sysSupplier
     * @return
     */
    Integer insertSysSupplier(SysSupplier sysSupplier);
    
    /**
     * 
     * 函数功能描述：根据id查询 [SYS_SUPPLIER  供应商信息表， 序列seq_supplierid]
     * @param supplierId
     * @return
     */
    SysSupplier querySysSupplierById(Long supplierId);
    
    /**
     * 
     * 函数功能描述：查询所有 [SYS_SUPPLIER  供应商信息表， 序列seq_supplierid]
     * @param sysSupplier
     * @return
     */
    List<SysSupplier> querySysSupplierList(SysSupplier sysSupplier);    
    
    /**
     * 
     * 函数功能描述：插入[SYS_SUPPLIER_USER  供应商用户表， 序列seq_supplieruserid]
     * @param sysSupplierUser
     * @return
     */
    Integer insertSysSupplierUser(SysSupplierUser sysSupplierUser);
    
    /**
     * 
     * 函数功能描述：修改供应商用户信息
     * @param sysSupplierUser
     * @return
     */
    Integer modifySysSupplierUser(SysSupplierUser sysSupplierUser);
    
    /**
     * 
     * 函数功能描述：根据id查询 [SYS_SUPPLIER_USER  供应商用户表， 序列seq_supplieruserid]
     * @param userId
     * @return
     */
    SysSupplierUser querySysSupplierUserById(Long userId);
    
    /**
     * 
     * 函数功能描述：插入[SYS_USER  供应商用户表， 序列seq_supplieruserid]
     * @param sysUser
     * @return
     */
    Integer insertSysUser(SysUser sysUser);
    
    /**
     * 
     * 函数功能描述：修改用户信息
     * @param sysUser
     * @return
     */
    Integer modifySysUser(SysUser sysUser);
    
    /**
     * 
     * 函数功能描述：根据ID查询[SYS_USER  供应商用户表]
     * @param sysUser
     * @return
     */
    SysUser getSysUserById(Long userId);
    
    /**
     * 
     * 函数功能描述：查询所有[SYS_USER  供应商用户表]
     * @param sysUser
     * @return
     */
    List<SysUser> querySysUserByPage(SysUser sysUser);
    
    /**
     * 
     * 函数功能描述：查询所有[SYS_USER  供应商用户表] 用户信息以及组织机构列表（分页）
     * @param sysUser
     * @return
     */
    List<SysUser> querySysUserAndOrgInfoByPage(SysUser sysUser);
    
    /**
     * 
     * 函数功能描述：根据登录号、手机号码验证是否唯一
     * @param sysUser
     * @return
     */
    Integer queryUserCount(SysUser sysUser);
    
    /**
     * 
     * 函数功能描述：查询所有 [SYS_SUPPLIER_USER  供应商用户表， 序列seq_supplieruserid]
     * @param sysSupplierUser
     * @return
     */
    List<SysSupplierUser> querySysSupplierUserList(SysSupplierUser sysSupplierUser);    
    
    /**
     * 
     * 函数功能描述：插入[SYS_USER_ROLE 用户与角色关系表]
     * @param sysUserRole
     * @return
     */
    Integer insertSysUserRole(SysUserRole sysUserRole);
    
    /**
     * 
     * 函数功能描述：查询所有 [SYS_USER_ROLE 用户与角色关系表]
     * @param sysUserRole
     * @return
     */
    List<SysUserRole> querySysUserRoleList(SysUserRole sysUserRole);    
    
    /**
     * 
     * 函数功能描述：插入[TB_ABNORMAL_PROJECT  异常项目表， 序列seq_abnormalid]
     * @param tbAbnormalProject
     * @return
     */
    Integer insertTbAbnormalProject(TbAbnormalProject tbAbnormalProject);
    
    /**
     * 
     * 函数功能描述：根据id查询 [TB_ABNORMAL_PROJECT  异常项目表， 序列seq_abnormalid]
     * @param abnormalId
     * @return
     */
    TbAbnormalProject queryTbAbnormalProjectById(Long abnormalId);
    
    /**
     * 
     * 函数功能描述：查询所有 [TB_ABNORMAL_PROJECT  异常项目表， 序列seq_abnormalid]
     * @param tbAbnormalProject
     * @return
     */
    List<TbAbnormalProject> queryTbAbnormalProjectList(TbAbnormalProject tbAbnormalProject);    
    
    /**
     * 
     * 函数功能描述：插入[TB_ADVANCE 质疑投诉进度情况表， 序列seq_advanceid]
     * @param tbAdvance
     * @return
     */
    Integer insertTbAdvance(TbAdvance tbAdvance);
    
    /**
     * 
     * 函数功能描述：根据id查询 [TB_ADVANCE 质疑投诉进度情况表， 序列seq_advanceid]
     * @param advanceId
     * @return
     */
    TbAdvance queryTbAdvanceById(Long advanceId);
    
    /**
     * 
     * 函数功能描述：查询所有 [TB_ADVANCE 质疑投诉进度情况表， 序列seq_advanceid]
     * @param tbAdvance
     * @return
     */
    List<TbAdvance> queryTbAdvanceList(TbAdvance tbAdvance);    
    
    /**
     * 
     * 函数功能描述：插入[TB_BAIL_CERTIFICATES 供应商保证金表， 序列seq_bailid]
     * @param tbBailCertificates
     * @return
     */
    Integer insertTbBailCertificates(TbBailCertificates tbBailCertificates);
    
    /**
     * 
     * 函数功能描述：根据id查询 [TB_BAIL_CERTIFICATES 供应商保证金表， 序列seq_bailid]
     * @param bailId
     * @return
     */
    TbBailCertificates queryTbBailCertificatesById(Long bailId);
    
    /**
     * 
     * 函数功能描述：查询所有 [TB_BAIL_CERTIFICATES 供应商保证金表， 序列seq_bailid]
     * @param tbBailCertificates
     * @return
     */
    List<TbBailCertificates> queryTbBailCertificatesList(TbBailCertificates tbBailCertificates);    
    
    /**
     * 
     * 函数功能描述：插入[TB_BID_INVITATION 投标邀请书， 序列seq_invitationid]
     * @param tbBidInvitation
     * @return
     */
    Integer insertTbBidInvitation(TbBidInvitation tbBidInvitation);
    
    /**
     * 
     * 函数功能描述：根据id查询 [TB_BID_INVITATION 投标邀请书， 序列seq_invitationid]
     * @param invitationId
     * @return
     */
    TbBidInvitation queryTbBidInvitationById(Long invitationId);
    
    /**
     * 
     * 函数功能描述：查询所有 [TB_BID_INVITATION 投标邀请书， 序列seq_invitationid]
     * @param tbBidInvitation
     * @return
     */
    List<TbBidInvitation> queryTbBidInvitationList(TbBidInvitation tbBidInvitation);    
    
    /**
     * 
     * 函数功能描述：插入[TB_BID_SUPPLIER 中标供应商， 序列seq_bidsupplierid]
     * @param tbBidSupplier
     * @return
     */
    Integer insertTbBidSupplier(TbBidSupplier tbBidSupplier);
    
    /**
     * 
     * 函数功能描述：根据id查询 [TB_BID_SUPPLIER 中标供应商， 序列seq_bidsupplierid]
     * @param bidSupplierId
     * @return
     */
    TbBidSupplier queryTbBidSupplierById(Long bidSupplierId);
    
    /**
     * 
     * 函数功能描述：查询所有 [TB_BID_SUPPLIER 中标供应商， 序列seq_bidsupplierid]
     * @param tbBidSupplier
     * @return
     */
    List<TbBidSupplier> queryTbBidSupplierList(TbBidSupplier tbBidSupplier);    
    
    /**
     * 
     * 函数功能描述：插入[TB_COMPLAIN 质疑投诉表， 序列seq_complainid]
     * @param tbComplain
     * @return
     */
    Integer insertTbComplain(TbComplain tbComplain);
    
    /**
     * 
     * 函数功能描述：根据id查询 [TB_COMPLAIN 质疑投诉表， 序列seq_complainid]
     * @param complainId
     * @return
     */
    TbComplain queryTbComplainById(Long complainId);
    
    /**
     * 
     * 函数功能描述：查询所有 [TB_COMPLAIN 质疑投诉表， 序列seq_complainid]
     * @param tbComplain
     * @return
     */
    List<TbComplain> queryTbComplainList(TbComplain tbComplain);    
    
    /**
     * 
     * 函数功能描述：插入[TB_CONNECT_NOTICE 公告表， 序列seq_noticeid]
     * @param tbConnectNotice
     * @return
     */
    Integer insertTbConnectNotice(TbConnectNotice tbConnectNotice);
    
    /**
     * 
     * 函数功能描述：根据id查询 [TB_CONNECT_NOTICE 公告表， 序列seq_noticeid]
     * @param noticeId
     * @return
     */
    TbConnectNotice queryTbConnectNoticeById(Long noticeId);
    
    /**
     * 
     * 函数功能描述：查询所有 [TB_CONNECT_NOTICE 公告表， 序列seq_noticeid]
     * @param tbConnectNotice
     * @return
     */
    List<TbConnectNotice> queryTbConnectNoticeList(TbConnectNotice tbConnectNotice);    
    
    /**
     * 
     * 函数功能描述：插入[TB_ENTRUST_PERSON_REL 招标人关系表]
     * @param tbEntrustPersonRel
     * @return
     */
    Integer insertTbEntrustPersonRel(TbEntrustPersonRel tbEntrustPersonRel);
    
    /**
     * 
     * 函数功能描述：查询所有 [TB_ENTRUST_PERSON_REL 招标人关系表]
     * @param TbEntrustPersonRel
     * @return
     */
    List<TbEntrustPersonRel> queryTbEntrustPersonRelList(TbEntrustPersonRel tbEntrustPersonRel);    
    
    /**
     * 
     * 函数功能描述：插入[TB_FILING_DATA 项目归档配置表， 序列seq_filingdataid]
     * @param tbFilingData
     * @return
     */
    Integer insertTbFilingData(TbFilingData tbFilingData);
    
    /**
     * 
     * 函数功能描述：根据id查询 [TB_FILING_DATA 项目归档配置表， 序列seq_filingdataid]
     * @param filingDataId
     * @return
     */
    TbFilingData queryTbFilingDataById(Long filingDataId);
    
    /**
     * 
     * 函数功能描述：查询所有 [TB_FILING_DATA 项目归档配置表， 序列seq_filingdataid]
     * @param tbFilingData
     * @return
     */
    List<TbFilingData> queryTbFilingDataList(TbFilingData tbFilingData);    
    
    /**
     * 
     * 函数功能描述：插入[TB_INVITATION_SUPPLIER 投标邀请书关系表]
     * @param tbInvitationSupplier
     * @return
     */
    Integer insertTbInvitationSupplier(TbInvitationSupplier tbInvitationSupplier);
    
    /**
     * 
     * 函数功能描述：查询所有 [TB_INVITATION_SUPPLIER 投标邀请书关系表]
     * @param tbInvitationSupplier
     * @return
     */
    List<TbInvitationSupplier> queryTbInvitationSupplierList(TbInvitationSupplier tbInvitationSupplier);    
    
    /**
     * 
     * 函数功能描述：插入[TB_PROJECT 项目表， 序列seq_projectid]
     * @param tbProject
     * @return
     */
    Integer insertTbProject(TbProject tbProject);
    
    /**
     * 
     * 函数功能描述：根据id查询 [TB_PROJECT 项目表， 序列seq_projectid]
     * @param projectId
     * @return
     */
    TbProject queryTbProjectById(Long projectId);
    
    /**
     * 
     * 函数功能描述：查询所有 [TB_PROJECT 项目表， 序列seq_projectid]
     * @param tbProject
     * @return
     */
    List<TbProject> queryTbProjectList(TbProject tbProject);    
    
    /**
     * 
     * 函数功能描述：插入[TB_PROJECT_FILING 项目归档表， 序列seq_filingid]
     * @param tbProjectFiling
     * @return
     */
    Integer insertTbProjectFiling(TbProjectFiling tbProjectFiling);
    
    /**
     * 
     * 函数功能描述：根据id查询 [TB_PROJECT_FILING 项目归档表， 序列seq_filingid]
     * @param filingId
     * @return
     */
    TbProjectFiling queryTbProjectFilingById(Long filingId);
    
    /**
     * 
     * 函数功能描述：查询所有 [TB_PROJECT_FILING 项目归档表， 序列seq_filingid]
     * @param tbProjectFiling
     * @return
     */
    List<TbProjectFiling> queryTbProjectFilingList(TbProjectFiling tbProjectFiling);    
    
    /**
     * 
     * 函数功能描述：插入[TB_PURCHASE_FILE 招标文件表， 序列seq_purchaseid]
     * @param tbPurchaseFile
     * @return
     */
    Integer insertTbPurchaseFile(TbPurchaseFile tbPurchaseFile);
    
    /**
     * 
     * 函数功能描述：根据id查询 [TB_PURCHASE_FILE 招标文件表， 序列seq_purchaseid]
     * @param purchaseId
     * @return
     */
    TbPurchaseFile queryTbPurchaseFileById(Long purchaseId);
    
    /**
     * 
     * 函数功能描述：查询所有 [TB_PURCHASE_FILE 招标文件表， 序列seq_purchaseid]
     * @param tbPurchaseFile
     * @return
     */
    List<TbPurchaseFile> queryTbPurchaseFileList(TbPurchaseFile tbPurchaseFile);    
    
    /**
     * 
     * 函数功能描述：插入[TB_QUESTION 澄清答疑表， 序列seq_questionid]
     * @param TbQuestion
     * @return
     */
    Integer insertTbQuestion(TbQuestion tbQuestion);
    
    /**
     * 
     * 函数功能描述：根据id查询 [TB_QUESTION 澄清答疑表， 序列seq_questionid]
     * @param questionId
     * @return
     */
    TbQuestion queryTbQuestionById(Long questionId);
    
    /**
     * 
     * 函数功能描述：查询所有 [TB_QUESTION 澄清答疑表， 序列seq_questionid]
     * @param TbQuestion
     * @return
     */
    List<TbQuestion> queryTbQuestionList(TbQuestion tbQuestion);    
    
    /**
     * 
     * 函数功能描述：插入[TB_QUESTION_PROBLEM 澄清答疑问题表， 序列seq_problemid]
     * @param tbQuestionProblem
     * @return
     */
    Integer insertTbQuestionProblem(TbQuestionProblem tbQuestionProblem);
    
    /**
     * 
     * 函数功能描述：根据id查询 [TB_QUESTION_PROBLEM 澄清答疑问题表， 序列seq_problemid]
     * @param problemId
     * @return
     */
    TbQuestionProblem queryTbQuestionProblemById(Long problemId);
    
    /**
     * 
     * 函数功能描述：查询所有 [TB_QUESTION_PROBLEM 澄清答疑问题表， 序列seq_problemid]
     * @param tbQuestionProblem
     * @return
     */
    List<TbQuestionProblem> queryTbQuestionProblemList(TbQuestionProblem tbQuestionProblem);    
    
    /**
     * 
     * 函数功能描述：获取[TB_STANDARD_SUPPLIER 参标供应商表， 序列seq_standardid]的下一个序列ID
     * @return
     */
    Long queryNextSeqStandardId();
    
    /**
     * 
     * 函数功能描述：插入[TB_STANDARD_SUPPLIER 参标供应商表， 序列seq_standardid]
     * @param tbStandardSupplier
     * @return
     */
    Integer insertTbStandardSupplier(TbStandardSupplier tbStandardSupplier);
    
    /**
     * 
     * 函数功能描述：插入[TB_STANDARD_SUPPLIER 参标供应商表， 序列seq_standardid]， 批量插入数据，
     *  循环conditonMap.tbStandardSupplierList为key
     * @param tbStandardSupplier
     * @return
     */
    Integer insertTbStandardSupplierBatch(TbStandardSupplier tbStandardSupplier);
    
    /**
     * 
     * 函数功能描述：更新[TB_STANDARD_SUPPLIER 参标供应商表， 序列seq_standardid]
     * @param tbStandardSupplier
     * @return
     */
    Integer updateTbStandardSupplier(TbStandardSupplier tbStandardSupplier);
    
    /**
     * 
     * 函数功能描述：更新[TB_STANDARD_SUPPLIER 参标供应商表， 序列seq_standardid]
     * @param tbStandardSupplier
     * @return
     */
    Integer updateTbStandardSupplierById(List<TbStandardSupplier> tbStandardSupplierList);
    
    /**
     * 
     * 函数功能描述：根据id查询 [TB_STANDARD_SUPPLIER 参标供应商表， 序列seq_standardid]
     * @param standardId
     * @return
     */
    TbStandardSupplier queryTbStandardSupplierById(Long standardId);
    
    /**
     * 
     * 函数功能描述：查询所有 [TB_STANDARD_SUPPLIER 参标供应商表， 序列seq_standardid]
     * @param tbStandardSupplier
     * @return
     */
    List<TbStandardSupplier> queryTbStandardSupplierList(TbStandardSupplier tbStandardSupplier);    
    
    /**
     * 
     * 函数功能描述：查询供应商所有 参标项目 信息  [TB_STANDARD_SUPPLIER 参标供应商表， 序列seq_standardid]
     * @param tbStandardSupplier
     * @return
     */
    List<TbStandardSupplier> querySupplierProjectByPage(TbStandardSupplier tbStandardSupplier);    
    
    /**
     * 
     * 函数功能描述：查询供应商所有 参标项目和标段信息   [TB_STANDARD_SUPPLIER 参标供应商表， 序列seq_standardid]
     * @param tbStandardSupplier
     * @return
     */
    List<TbStandardSupplier> querySupplierSubDetailByPage(TbStandardSupplier tbStandardSupplier);    
    
    /**
     * 
     * 函数功能描述：插入[TB_SUB 标段表， 序列seq_subid]
     * @param tbSub
     * @return
     */
    Integer insertTbSub(TbSub tbSub);
    
    /**
     * 
     * 函数功能描述：根据id查询 [TB_SUB 标段表， 序列seq_subid]
     * @param subId
     * @return
     */
    TbSub queryTbSubById(Long subId);
    
    /**
     * 
     * 函数功能描述：查询所有 [TB_SUB 标段表， 序列seq_subid]
     * @param tbSub
     * @return
     */
    List<TbSub> queryTbSubList(TbSub tbSub);    
    
    /**
     * 
     * 函数功能描述：插入[TB_TENDER_PROJECT 招标项目表， 序列seq_tenderprojectid]
     * @param tbTenderProject
     * @return
     */
    Integer insertTbTenderProject(TbTenderProject tbTenderProject);
    
    /**
     * 
     * 函数功能描述：根据id查询 [TB_TENDER_PROJECT 招标项目表， 序列seq_tenderprojectid]
     * @param tenderProjectId
     * @return
     */
    TbTenderProject queryTbTenderProjectById(Long tenderProjectId);
    
    /**
     * 
     * 函数功能描述：查询所有 [TB_TENDER_PROJECT 招标项目表， 序列seq_tenderprojectid]
     * @param tbTenderProject
     * @return
     */
    List<TbTenderProject> queryTbTenderProjectList(TbTenderProject tbTenderProject);

	void updateSysOrganizatioin(SysOrganizatioin sysOrganizatioin);
    
	/**
     * 
     * 函数功能描述：修改用户密码
     * @param sysUser
     * @return
     */
    Integer modifyPassword(SysUser sysUser);
    /**
     * 
     * 函数功能描述：更新用户信息
     * @param sysUser
     * @return
     */
    void upDateSysUser(SysUser currUser);
    
    /**
     * 
     * 函数功能描述：修改用户状态（启用 停用 删除）
     * @param sysUser
     * @return
     */
    Integer modifyUserStatus(SysUser sysUser);
}
