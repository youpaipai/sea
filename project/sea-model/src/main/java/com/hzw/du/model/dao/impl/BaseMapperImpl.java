/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：包含所有dao操作的mapper
 * 文件名称：MapperImpl.java
 * 修改时间：2016年7月18日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.hzw.du.model.mapper.KpBidExpertMapper;
import com.hzw.du.model.mapper.KpBidRecordMapper;
import com.hzw.du.model.mapper.KpBidReportMapper;
import com.hzw.du.model.mapper.KpBidRulesMapper;
import com.hzw.du.model.mapper.KpCastRecordMapper;
import com.hzw.du.model.mapper.KpDetailReviewMapper;
import com.hzw.du.model.mapper.KpInitReviewMapper;
import com.hzw.du.model.mapper.KpInitReviewResultMapper;
import com.hzw.du.model.mapper.KpOpenProjectMapper;
import com.hzw.du.model.mapper.KpProjectRulesMapper;
import com.hzw.du.model.mapper.KpReviewInfoMapper;
import com.hzw.du.model.mapper.MHFileImagesMapper;
import com.hzw.du.model.mapper.MHHelpMapper;
import com.hzw.du.model.mapper.SysAgencyMapper;
import com.hzw.du.model.mapper.SysAreaMapper;
import com.hzw.du.model.mapper.SysButtonMapper;
import com.hzw.du.model.mapper.SysCertificateMapper;
import com.hzw.du.model.mapper.SysConfigMapper;
import com.hzw.du.model.mapper.SysConstantMapper;
import com.hzw.du.model.mapper.SysDepartmentMapper;
import com.hzw.du.model.mapper.SysEntrustPersonMapper;
import com.hzw.du.model.mapper.SysFileDownMapper;
import com.hzw.du.model.mapper.SysFileMapper;
import com.hzw.du.model.mapper.SysLogMapper;
import com.hzw.du.model.mapper.SysLoginSourceMapper;
import com.hzw.du.model.mapper.SysMenuButtonMapper;
import com.hzw.du.model.mapper.SysMenuMapper;
import com.hzw.du.model.mapper.SysMessageMapper;
import com.hzw.du.model.mapper.SysOrganizatioinMapper;
import com.hzw.du.model.mapper.SysPersonUserMapper;
import com.hzw.du.model.mapper.SysPhoneModifyMapper;
import com.hzw.du.model.mapper.SysRoleMapper;
import com.hzw.du.model.mapper.SysRoleMenuButtonMapper;
import com.hzw.du.model.mapper.SysSupplierMapper;
import com.hzw.du.model.mapper.SysSupplierUserMapper;
import com.hzw.du.model.mapper.SysUserMapper;
import com.hzw.du.model.mapper.SysUserRoleMapper;
import com.hzw.du.model.mapper.TbAbnormalProjectMapper;
import com.hzw.du.model.mapper.TbAdvanceMapper;
import com.hzw.du.model.mapper.TbBailCertificatesMapper;
import com.hzw.du.model.mapper.TbBidInvitationMapper;
import com.hzw.du.model.mapper.TbBidSupplierMapper;
import com.hzw.du.model.mapper.TbComplainMapper;
import com.hzw.du.model.mapper.TbConnectNoticeMapper;
import com.hzw.du.model.mapper.TbEntrustPersonRelMapper;
import com.hzw.du.model.mapper.TbFilingDataMapper;
import com.hzw.du.model.mapper.TbInvitationSupplierMapper;
import com.hzw.du.model.mapper.TbProjectFilingMapper;
import com.hzw.du.model.mapper.TbProjectMapper;
import com.hzw.du.model.mapper.TbPurchaseFileMapper;
import com.hzw.du.model.mapper.TbQuestionMapper;
import com.hzw.du.model.mapper.TbQuestionProblemMapper;
import com.hzw.du.model.mapper.TbStandardSupplierMapper;
import com.hzw.du.model.mapper.TbSubMapper;
import com.hzw.du.model.mapper.TbTenderProjectMapper;

/**
 * <一句话功能简述> 包含所有dao操作的mapper
 * <功能详细描述>
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class BaseMapperImpl {
    /**
     * [评标专家信息表] KP_BID_EXPERT mapper
     */
    @Autowired
    protected KpBidExpertMapper kpBidExpertMapper;
    
    /**
     * [开标记录表] KP_BID_RECORD  mapper
     */
    @Autowired
    protected KpBidRecordMapper kpBidRecordMapper;
    
    /**
     * [KP_BID_REPORT  评标报告表， 序列seq_reportid] mapper
     */
    @Autowired
    protected KpBidReportMapper kpBidReportMapper;
    
    /**
     * [KP_BID_RULES  评标规则模板表， 序列seq_bidid]  mapper
     */
    @Autowired
    protected KpBidRulesMapper kpBidRulesMapper;
   
    /**
     * [KP_CAST_RECORD  投标记录表， 序列seq_castrecordid]  mapper
     */
    @Autowired
    protected KpCastRecordMapper kpCastRecordMapper;

    /**
     * [KP_DETAIL_REVIEW  详细评审表， 序列seq_detailid]  mapper
     */
    @Autowired
    protected KpDetailReviewMapper kpDetailReviewMapper;
    
    /**
     * [KP_INIT_REVIEW  初步评审表， 序列seq_initid]   mapper
     */
    @Autowired
    protected KpInitReviewMapper kpInitReviewMapper;
    
    /**
     * [KP_INIT_REVIEW_RESULT  初步评审结果表， 序列seq_resultid] mapper
     */
    @Autowired
    protected KpInitReviewResultMapper kpInitReviewResultMapper;
    
    /**
     * [KP_OPEN_PROJECT  开标项目配置表， 序列seq_openid] mapper
     */
    @Autowired
    protected KpOpenProjectMapper kpOpenProjectMapper;
    
    /**
     * [KP_PROJECT_RULES  项目评标规则表， 序列seq_rulesid] mapper
     */
    @Autowired
    protected KpProjectRulesMapper kpProjectRulesMapper;
    
    /**
     * [KP_REVIEW_INFO  详细评审明细表， 序列seq_infoid] mapper
     */
    @Autowired
    protected KpReviewInfoMapper kpReviewInfoMapper;
    
    /**
     * [MH_FILE_IMAGES  动态图片展示表， 序列seq_imageid] mapper
     */
    @Autowired
    protected MHFileImagesMapper mhFileImagesMapper;
    
    /**
     * [MH_HELP  系统帮助表， 序列seq_helpid] mapper
     */
    @Autowired
    protected MHHelpMapper mhHelpMapper;
    
    /**
     * [SYS_AGENCY  代理机构信息表， 序列seq_agencyid] mapper
     */
    @Autowired
    protected SysAgencyMapper sysAgencyMapper;
    
    /**
     * [SYS_AREA  地区表， 序列seq_areaid] mapper
     */
    @Autowired
    protected SysAreaMapper sysAreaMapper;
    
    /**
     * [SYS_BUTTON  按钮初始表， 序列seq_buttonid] mapper
     */
    @Autowired
    protected SysButtonMapper sysButtonMapper;
    
    /**
     * [SYS_CERTIFICATE  证书管理信息表， 序列seq_certificateid] mapper
     */
    @Autowired
    protected SysCertificateMapper sysCertificateMapper;
    
    /**
     * [SYS_CONFIG  系统配置项表， 序列seq_configid] mapper
     */
    @Autowired
    protected SysConfigMapper sysConfigMapper;
    
    /**
     * [SYS_CONSTANT  数据字典表， 序列seq_constantid] mapper
     */
    @Autowired
    protected SysConstantMapper sysConstantMapper;
    
    /**
     * [SYS_DEPARTMENT  部门表， 序列seq_departmentid] mapper
     */
    @Autowired
    protected SysDepartmentMapper sysDepartmentMapper;
    
    /**
     * [SYS_ENTRUST_PERSON  招标人表， 序列seq_personid] mapper
     */
    @Autowired
    protected SysEntrustPersonMapper sysEntrustPersonMapper;
    
    /**
     * [SYS_FILE  文件表， 序列seq_fileid] mapper
     */
    @Autowired
    protected SysFileMapper sysFileMapper;
    
    /**
     * [SYS_FILE_DOWN  文件下载表， 序列seq_downid] mapper
     */
    @Autowired
    protected SysFileDownMapper sysFileDownMapper;
    
    /**
     * [SYS_LOG  日志信息表， 序列seq_logid] mapper
     */
    @Autowired
    protected SysLogMapper sysLogMapper;
    
    /**
     * [SYS_LOGIN_SOURCE  登录来源表， 序列seq_loginid] mapper
     */
    @Autowired
    protected SysLoginSourceMapper sysLoginSourceMapper;
    
    /**
     * [SYS_MENU  菜单表， 序列seq_menuid] mapper
     */
    @Autowired
    protected SysMenuMapper sysMenuMapper;
    
    /**
     * [SYS_MENU_BUTTON  菜单按钮关系表] mapper
     */
    @Autowired
    protected SysMenuButtonMapper sysMenuButtonMapper;
    
    /**
     * [SYS_MESSAGE  系统消息表， 序列seq_smid] mapper
     */
    @Autowired
    protected SysMessageMapper sysMessageMapper;
    
    /**
     * [SYS_ORGANIZATION  组织机构表， 序列seq_organizationid] mapper
     */
    @Autowired
    protected SysOrganizatioinMapper sysOrganizatioinMapper;
    
    /**
     * [SYS_PERSON_USER  招标人用户表， 序列seq_personuserid] mapper
     */
    @Autowired
    protected SysPersonUserMapper sysPersonUserMapper;
    
    /**
     * [SYS_PHONE_MODIFY  手机号码变更记录表， 序列seq_phonemodifyid] mapper
     */
    @Autowired
    protected SysPhoneModifyMapper sysPhoneModifyMapper;
    
    /**
     * [SYS_ROLE  角色表， 序列seq_roleid] mapper
     */
    @Autowired
    protected SysRoleMapper sysRoleMapper;
    
    /**
     * [SYS_ROLE_MENU_BUTTON  角色菜单按钮权限表] mapper
     */
    @Autowired
    protected SysRoleMenuButtonMapper sysRoleMenuButtonMapper;
    
    /**
     * [SYS_SUPPLIER  供应商信息表， 序列seq_supplierid] mapper
     */
    @Autowired
    protected SysSupplierMapper sysSupplierMapper;
    
    /**
     * [SYS_SUPPLIER_USER  供应商用户表， 序列seq_supplieruserid] mapper
     */
    @Autowired
    protected SysSupplierUserMapper sysSupplierUserMapper;
    
    /**
     * [SYS_ROLE 用户表] mapper
     */
    @Autowired
    protected SysUserMapper sysUserMapper;
    
    /**
     * [SYS_USER_ROLE 用户与角色关系表] mapper
     */
    @Autowired
    protected SysUserRoleMapper sysUserRoleMapper;
    
    /**
     * [TB_ABNORMAL_PROJECT  异常项目表， 序列seq_abnormalid] mapper
     */
    @Autowired
    protected TbAbnormalProjectMapper tbAbnormalProjectMapper;
    
    /**
     * [TB_ADVANCE 质疑投诉进度情况表， 序列seq_advanceid] mapper
     */
    @Autowired
    protected TbAdvanceMapper tbAdvanceMapper;
    
    /**
     * [TB_BAIL_CERTIFICATES 供应商保证金表， 序列seq_bailid] mapper
     */
    @Autowired
    protected TbBailCertificatesMapper tbBailCertificatesMapper;
    
    /**
     * [TB_BID_INVITATION 投标邀请书， 序列seq_invitationid] mapper
     */
    @Autowired
    protected TbBidInvitationMapper tbBidInvitationMapper;
    
    /**
     * [TB_BID_SUPPLIER 中标供应商， 序列seq_bidsupplierid] mapper
     */
    @Autowired
    protected TbBidSupplierMapper tbBidSupplierMapper;
    
    /**
     * [TB_COMPLAIN 质疑投诉表， 序列seq_complainid] mapper
     */
    @Autowired
    protected TbComplainMapper tbComplainMapper;
    
    /**
     * [TB_CONNECT_NOTICE 公告表， 序列seq_noticeid] mapper
     */
    @Autowired
    protected TbConnectNoticeMapper tbConnectNoticeMapper;
    
    /**
     * [TB_ENTRUST_PERSON_REL 招标人关系表] mapper
     */
    @Autowired
    protected TbEntrustPersonRelMapper tbEntrustPersonRelMapper;
    
    /**
     * [TB_FILING_DATA 项目归档配置表， 序列seq_filingdataid] mapper
     */
    @Autowired
    protected TbFilingDataMapper tbFilingDataMapper;
    
    /**
     * [TB_INVITATION_SUPPLIER 投标邀请书关系表] mapper
     */
    @Autowired
    protected TbInvitationSupplierMapper tbInvitationSupplierMapper;
    
    /**
     * [TB_PROJECT 项目表， 序列seq_projectid] mapper
     */
    @Autowired
    protected TbProjectMapper tbProjectMapper;
    
    /**
     * [TB_PROJECT_FILING 项目归档表， 序列seq_filingid] mapper
     */
    @Autowired
    protected TbProjectFilingMapper tbProjectFilingMapper;
    
    /**
     * [TB_PURCHASE_FILE 招标文件表， 序列seq_purchaseid] mapper
     */
    @Autowired
    protected TbPurchaseFileMapper tbPurchaseFileMapper;
    
    /**
     * [TB_QUESTION 澄清答疑表， 序列seq_questionid] mapper
     */
    @Autowired
    protected TbQuestionMapper tbQuestionMapper;
    
    /**
     * [TB_QUESTION_PROBLEM 澄清答疑问题表， 序列seq_problemid] mapper
     */
    @Autowired
    protected TbQuestionProblemMapper tbQuestionProblemMapper;
    
    /**
     * [TB_STANDARD_SUPPLIER 参标供应商表， 序列seq_standardid] mapper
     */
    @Autowired
    protected TbStandardSupplierMapper tbStandardSupplierMapper;
    
    /**
     * [TB_SUB 标段表， 序列seq_subid] mapper
     */
    @Autowired
    protected TbSubMapper tbSubMapper;
    
    /**
     * [TB_TENDER_PROJECT 招标项目表， 序列seq_tenderprojectid] mapper
     */
    @Autowired
    protected TbTenderProjectMapper tbTenderProjectMapper;
    
}
