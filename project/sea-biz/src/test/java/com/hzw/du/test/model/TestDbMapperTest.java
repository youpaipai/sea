package com.hzw.du.test.model;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
import com.hzw.du.model.page.MybatisPager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext_test.xml" })
public class TestDbMapperTest extends BaseDbMapperTest{

	@BeforeClass
	public static void beforeClass() throws Exception {
		
	}

	/**
     * 函数功能描述：插入kpBidExpert
     */
	@Test
	public void testBaseDao_insertKpBidExpert() {
	    insertKpBidExpert();
	}
	
	/**
     * 函数功能描述：根据id查询评标专家信息
     */
	@Test
    public void testBaseDao_queryKpBidExpertById() {
	    KpBidExpert kpBidExpert = insertKpBidExpert();
	    kpBidExpert = baseDao.queryKpBidExpertById(kpBidExpert.getBidExpertId());
	    assert kpBidExpert == null : "queryKpBidExpertById查询失败";
	    log.info("testBaseDao_queryKpBidExpertById成功");
	    debug(kpBidExpert);
	}
	/**
	 * 函数功能描述：根据id查询评标专家信息
	 */
	@Test
	public void testBaseDao_queryKpBidExpertList() {
	    KpBidExpert kpBidExpert = new KpBidExpert();
	    MybatisPager page = MybatisPager.factoryPageByPageSize(2, 3);
	    kpBidExpert.setPager(page);
	    List<KpBidExpert> list = baseDao.queryKpBidExpertList(kpBidExpert);
	    
	    debug(list);
	}
	
	/**
     * 函数功能描述：插入kpBidExpert
     */
    @Test
    public void testBaseDao_insertKpBidRecord() {
        insertKpBidRecord();
    }
    
    /**
     * 函数功能描述：根据id查询评标专家信息
     */
    @Test
    public void testBaseDao_queryKpBidRecordById() {
        KpBidRecord kpBidRecord = insertKpBidRecord();
        kpBidRecord = baseDao.queryKpBidRecordById(kpBidRecord.getRecordId());
        assert kpBidRecord == null : "根据id查询评标专家信息queryKpBidRecordById查询失败";
        log.info("testBaseDao_queryKpBidExpertById成功");
        debug(kpBidRecord);
    }
    /**
     * 函数功能描述：根据id查询评标专家信息
     */
    @Test
    public void testBaseDao_queryKpBidRecordList() {
        KpBidRecord kpBidRecord = new KpBidRecord();
        MybatisPager page = MybatisPager.factoryPageByPageSize(1, 3);
        kpBidRecord.setPager(page);
        List<KpBidRecord> list = baseDao.queryKpBidRecordList(kpBidRecord);
        debug(list);
    }
    /**
     * 函数功能描述：插入 [KP_BID_REPORT  评标报告表， 序列seq_reportid]
     */
    @Test
    public void testBaseDao_insertKpBidReport() {
        insertKpBidReport();
    }
    
    /**
     * 函数功能描述：根据id查询 [KP_BID_REPORT  评标报告表， 序列seq_reportid]
     */
    @Test
    public void testBaseDao_queryKpBidReportById() {
        KpBidReport kpBidReport = insertKpBidReport();
        kpBidReport = baseDao.queryKpBidReportById(kpBidReport.getReportId());
        assert kpBidReport == null : "根据id查询 [KP_BID_REPORT  评标报告表， 序列seq_reportid]查询失败";
        log.info("testBaseDao_queryKpBidReportById成功");
        debug(kpBidReport);
    }
    
    /**
     * 函数功能描述：查询所有 [KP_BID_REPORT  评标报告表， 序列seq_reportid]
     */
    @Test
    public void testBaseDao_queryKpBidReportList() {
        KpBidReport kpBidReport = new KpBidReport();
        MybatisPager page = MybatisPager.factoryPageByPageSize(1, 3);
        kpBidReport.setPager(page);
        List<KpBidReport> list = baseDao.queryKpBidReportList(kpBidReport);
        debug(list);
    }
    
    /**
     * 函数功能描述：插入 [KP_BID_RULES  评标规则模板表， 序列seq_bidid]
     */
    @Test
    public void testBaseDao_insertKpBidRules() {
        insertKpBidRules();
    }
    
    /**
     * 函数功能描述：根据id查询 [KP_BID_RULES  评标规则模板表， 序列seq_bidid]
     */
    @Test
    public void testBaseDao_queryKpBidRulesById() {
        KpBidRules kpBidRules = insertKpBidRules();
        kpBidRules = baseDao.queryKpBidRulesById(kpBidRules.getBidId());
        assert kpBidRules == null : "根据id查询 [KP_BID_RULES  评标规则模板表， 序列seq_bidid] 查询失败";
        log.info("testBaseDao_queryKpBidReportById成功");
        debug(kpBidRules);
    }
    
    /**
     * 函数功能描述：查询所有 [KP_BID_RULES  评标规则模板表， 序列seq_bidid]
     */
    @Test
    public void testBaseDao_queryKpBidRulesList() {
        KpBidRules kpBidRules = new KpBidRules();
        MybatisPager page = MybatisPager.factoryPageByPageSize(1, 3);
        kpBidRules.setPager(page);
        List<KpBidRules> list = baseDao.queryKpBidRulesList(kpBidRules);
        debug(list);
    }
   
    /**
     * 函数功能描述：插入 [KP_CAST_RECORD  投标记录表， 序列seq_castrecordid]
     */
    @Test
    public void testBaseDao_insertKpCastRecord() {
        insertKpCastRecord();
    }
    
    /**
     * 函数功能描述：根据id查询 [KP_CAST_RECORD  投标记录表， 序列seq_castrecordid]
     */
    @Test
    public void testBaseDao_queryKpCastRecordById() {
        KpCastRecord kpCastRecord = insertKpCastRecord();
        kpCastRecord = baseDao.queryKpCastRecordById(kpCastRecord.getCastRecordId());
        assert kpCastRecord == null : "根据id查询 [KP_CAST_RECORD  投标记录表， 序列seq_castrecordid] 查询失败";
        log.info("testBaseDao_queryKpCastRecordById成功");
        debug(kpCastRecord);
    }
    
    /**
     * 函数功能描述：查询所有 [KP_CAST_RECORD  投标记录表， 序列seq_castrecordid]
     */
    @Test
    public void testBaseDao_queryKpCastRecordList() {
        KpCastRecord kpCastRecord = new KpCastRecord();
        MybatisPager page = MybatisPager.factoryPageByPageSize(1, 3);
        kpCastRecord.setPager(page);
        List<KpCastRecord> list = baseDao.queryKpCastRecordList(kpCastRecord);
        debug(list);
    }
    
    /**
     * 函数功能描述：插入 [KP_DETAIL_REVIEW  详细评审表， 序列seq_detailid]
     */
    @Test
    public void testBaseDao_insertKpDetailReview() {
        insertKpDetailReview();
    }
    
    /**
     * 函数功能描述：根据id查询 [KP_DETAIL_REVIEW  详细评审表， 序列seq_detailid]
     */
    @Test
    public void testBaseDao_queryKpDetailReviewById() {
        KpDetailReview kpDetailReview = insertKpDetailReview();
        kpDetailReview = baseDao.queryKpDetailReviewById(kpDetailReview.getDetailId());
        assert kpDetailReview == null : "根据id查询 [KP_DETAIL_REVIEW  详细评审表， 序列seq_detailid] 查询失败";
        log.info("testBaseDao_queryKpDetailReviewById成功");
        debug(kpDetailReview);
    }
    
    /**
     * 函数功能描述：查询所有 [KP_DETAIL_REVIEW  详细评审表， 序列seq_detailid]
     */
    @Test
    public void testBaseDao_queryKpDetailReviewList() {
        KpDetailReview kpDetailReview = new KpDetailReview();
        MybatisPager page = MybatisPager.factoryPageByPageSize(1, 3);
        kpDetailReview.setPager(page);
        List<KpDetailReview> list = baseDao.queryKpDetailReviewList(kpDetailReview);
        debug(list);
    }
    
    /**
     * 函数功能描述：插入 [KP_INIT_REVIEW  初步评审表， 序列seq_initid]
     */
    @Test
    public void testBaseDao_insertKpInitReview() {
        insertKpInitReview();
    }
    
    /**
     * 函数功能描述：根据id查询 [KP_INIT_REVIEW  初步评审表， 序列seq_initid]
     */
    @Test
    public void testBaseDao_queryKpInitReviewById() {
        KpInitReview kpInitReview = insertKpInitReview();
        kpInitReview = baseDao.queryKpInitReviewById(kpInitReview.getInitId());
        assert kpInitReview == null : "根据id查询 [KP_INIT_REVIEW  初步评审表， 序列seq_initid] 查询失败";
        log.info("testBaseDao_queryKpInitReviewById成功");
        debug(kpInitReview);
    }
    
    /**
     * 函数功能描述：查询所有 [KP_INIT_REVIEW  初步评审表， 序列seq_initid]
     */
    @Test
    public void testBaseDao_queryKpInitReviewList() {
        KpInitReview kpInitReview = new KpInitReview();
        MybatisPager page = MybatisPager.factoryPageByPageSize(1, 3);
        kpInitReview.setPager(page);
        List<KpInitReview> list = baseDao.queryKpInitReviewList(kpInitReview);
        debug(list);
    }
    
    /**
     * 函数功能描述：插入 [KP_INIT_REVIEW_RESULT  初步评审结果表， 序列seq_resultid]
     */
    @Test
    public void testBaseDao_insertKpInitReviewResult() {
        insertKpInitReviewResult();
    }
    
    /**
     * 函数功能描述：根据id查询[KP_INIT_REVIEW_RESULT  初步评审结果表， 序列seq_resultid]
     */
    @Test
    public void testBaseDao_queryKpInitReviewResultById() {
        KpInitReviewResult kpInitReviewResult = insertKpInitReviewResult();
        kpInitReviewResult = baseDao.queryKpInitReviewResultById(kpInitReviewResult.getResultId());
        assert kpInitReviewResult == null : "根据id查询 [KP_INIT_REVIEW_RESULT  初步评审结果表， 序列seq_resultid] 查询失败";
        log.info("testBaseDao_queryKpInitReviewResultById成功");
        debug(kpInitReviewResult);
    }
    
    /**
     * 函数功能描述：查询所有 [KP_INIT_REVIEW_RESULT  初步评审结果表， 序列seq_resultid]
     */
    @Test
    public void testBaseDao_queryKpInitReviewResultList() {
        KpInitReviewResult kpInitReviewResult = new KpInitReviewResult();
        MybatisPager page = MybatisPager.factoryPageByPageSize(1, 3);
        kpInitReviewResult.setPager(page);
        List<KpInitReviewResult> list = baseDao.queryKpInitReviewResultList(kpInitReviewResult);
        debug(list);
    }
    
    /**
     * 函数功能描述：插入 [KP_OPEN_PROJECT  开标项目配置表， 序列seq_openid]
     */
    @Test
    public void testBaseDao_insertKpOpenProject() {
        insertKpOpenProject();
    }
    
    /**
     * 函数功能描述：根据id查询[KP_OPEN_PROJECT  开标项目配置表， 序列seq_openid]
     */
    @Test
    public void testBaseDao_queryKpOpenProjectById() {
        KpOpenProject kpOpenProject = insertKpOpenProject();
        kpOpenProject = baseDao.queryKpOpenProjectById(kpOpenProject.getOpenId());
        assert kpOpenProject == null : "根据id查询 [KP_OPEN_PROJECT  开标项目配置表， 序列seq_openid] 查询失败";
        log.info("testBaseDao_queryKpOpenProjectById成功");
        debug(kpOpenProject);
    }
    
    /**
     * 函数功能描述：查询所有 [KP_OPEN_PROJECT  开标项目配置表， 序列seq_openid]
     */
    @Test
    public void testBaseDao_queryKpOpenProjectList() {
        KpOpenProject kpOpenProject = new KpOpenProject();
        MybatisPager page = MybatisPager.factoryPageByPageSize(1, 3);
        kpOpenProject.setPager(page);
        List<KpOpenProject> list = baseDao.queryKpOpenProjectList(kpOpenProject);
        debug(list);
    }
    
    /**
     * 函数功能描述：插入 [KP_PROJECT_RULES  项目评标规则表， 序列seq_rulesid]
     */
    @Test
    public void testBaseDao_insertKpProjectRules() {
        insertKpProjectRules();
    }
    
    /**
     * 函数功能描述：根据id查询[KP_PROJECT_RULES  项目评标规则表， 序列seq_rulesid]
     */
    @Test
    public void testBaseDao_queryKpProjectRulesById() {
        KpProjectRules kpProjectRules = insertKpProjectRules();
        kpProjectRules = baseDao.queryKpProjectRulesById(kpProjectRules.getRulesId());
        assert kpProjectRules == null : "根据id查询 [KP_PROJECT_RULES  项目评标规则表， 序列seq_rulesid] 查询失败";
        log.info("testBaseDao_queryKpOpenProjectById成功");
        debug(kpProjectRules);
    }
    
    /**
     * 函数功能描述：查询所有 [KP_PROJECT_RULES  项目评标规则表， 序列seq_rulesid]
     */
    @Test
    public void testBaseDao_queryKpProjectRulesList() {
        KpProjectRules kpProjectRules = new KpProjectRules();
        MybatisPager page = MybatisPager.factoryPageByPageSize(1, 3);
        kpProjectRules.setPager(page);
        List<KpProjectRules> list = baseDao.queryKpProjectRulesList(kpProjectRules);
        debug(list);
    }
    
    /**
     * 函数功能描述：插入 [KP_REVIEW_INFO  详细评审明细表， 序列seq_infoid]
     */
    @Test
    public void testBaseDao_insertKpReviewInfo() {
        insertKpReviewInfo();
    }
    
    /**
     * 函数功能描述：根据id查询[KP_REVIEW_INFO  详细评审明细表， 序列seq_infoid]
     */
    @Test
    public void testBaseDao_queryKpReviewInfoById() {
        KpReviewInfo kpReviewInfo = insertKpReviewInfo();
        kpReviewInfo = baseDao.queryKpReviewInfoById(kpReviewInfo.getInfoId());
        assert kpReviewInfo == null : "根据id查询 [KP_REVIEW_INFO  详细评审明细表， 序列seq_infoid] 查询失败";
        log.info("testBaseDao_queryKpReviewInfoById成功");
        debug(kpReviewInfo);
    }
    
    /**
     * 函数功能描述：查询所有 [KP_REVIEW_INFO  详细评审明细表， 序列seq_infoid]
     */
    @Test
    public void testBaseDao_queryKpReviewInfoList() {
        KpReviewInfo kpReviewInfo = new KpReviewInfo();
        MybatisPager page = MybatisPager.factoryPageByPageSize(1, 3);
        kpReviewInfo.setPager(page);
        List<KpReviewInfo> list = baseDao.queryKpReviewInfoList(kpReviewInfo);
        debug(list);
    }
    
    /*================MH_FILE_IMAGES 操作====*/
    /**
     * 函数功能描述：插入 [MH_FILE_IMAGES  动态图片展示表， 序列seq_imageid]
     */
    @Test
    public void testBaseDao_insertMHFileImages() {
        insertMHFileImages();
    }
    
    /**
     * 函数功能描述：根据id查询[MH_FILE_IMAGES  动态图片展示表， 序列seq_imageid]
     */
    @Test
    public void testBaseDao_queryMHFileImagesById() {
        MHFileImages mhFileImages = insertMHFileImages();
        mhFileImages = baseDao.queryMHFileImagesById(mhFileImages.getImageId());
        assert mhFileImages == null : "根据id查询 [MH_FILE_IMAGES  动态图片展示表， 序列seq_imageid] 查询失败";
        log.info("testBaseDao_queryKpReviewInfoById成功");
        debug(mhFileImages);
    }
    
    /**
     * 函数功能描述：查询所有 [MH_FILE_IMAGES  动态图片展示表， 序列seq_imageid]
     */
    @Test
    public void testBaseDao_queryMHFileImagesList() {
        MHFileImages mhFileImages = new MHFileImages();
        MybatisPager page = MybatisPager.factoryPageByPageSize(1, 3);
        mhFileImages.setPager(page);
        List<MHFileImages> list = baseDao.queryMHFileImagesList(mhFileImages);
        debug(list);
    }
    
    
    /*================MH_HELP 操作====*/
    /**
     * 函数功能描述：插入 [MH_HELP  系统帮助表， 序列seq_helpid]
     */
    @Test
    public void testBaseDao_insertMHHelp() {
        insertMHHelp();
    }
    
    /**
     * 函数功能描述：根据id查询[MH_HELP  系统帮助表， 序列seq_helpid]
     */
    @Test
    public void testBaseDao_queryMHHelpById() {
        MHHelp mhHelp = insertMHHelp();
        mhHelp = baseDao.getMHHelpById(mhHelp.getHelpId());
        assert mhHelp == null : "根据id查询 [MH_HELP  系统帮助表， 序列seq_helpid] 查询失败";
        log.info("testBaseDao_queryMHHelpById成功");
        debug(mhHelp);
    }
    
    /**
     * 函数功能描述：查询所有 [MH_HELP  系统帮助表， 序列seq_helpid]
     */
    @Test
    public void testBaseDao_queryMHHelpList() {
        MHHelp mhHelp = new MHHelp();
        MybatisPager page = MybatisPager.factoryPageByPageSize(1, 3);
        mhHelp.setPager(page);
        List<MHHelp> list = baseDao.queryMHHelpList(mhHelp);
        debug(list);
    }
    
    /*================SYS_AGENCY 操作====*/
    /**
     * 函数功能描述：插入 [SYS_AGENCY  代理机构信息表， 序列seq_agencyid]
     */
    @Test
    public void testBaseDao_insertSysAgency() {
        insertSysAgency();
    }
    
    /**
     * 函数功能描述：根据id查询[SYS_AGENCY  代理机构信息表， 序列seq_agencyid]
     */
    @Test
    public void testBaseDao_querySysAgencyById() {
        SysAgency sysAgency = insertSysAgency();
        sysAgency = baseDao.querySysAgencyById(sysAgency.getAgencyId());
        assert sysAgency == null : "根据id查询 [SYS_AGENCY  代理机构信息表， 序列seq_agencyid] 查询失败";
        log.info("testBaseDao_querySysAgencyById成功");
        debug(sysAgency);
    }
    
    /**
     * 函数功能描述：查询所有 [SYS_AGENCY  代理机构信息表， 序列seq_agencyid]
     */
    @Test
    public void testBaseDao_querySysAgencyList() {
        SysAgency sysAgency = new SysAgency();
        MybatisPager page = MybatisPager.factoryPageByPageSize(1, 3);
        sysAgency.setPager(page);
        List<SysAgency> list = baseDao.querySysAgencyList(sysAgency);
        debug(list);
    }
    
    /*================SYS_AREA 操作====*/
    /**
     * 函数功能描述：插入 [SYS_AREA  地区表， 序列seq_areaid]
     */
    @Test
    public void testBaseDao_insertSysArea() {
//        insertSysArea();
    }
    
    /**
     * 函数功能描述：根据id查询[SYS_AREA  地区表， 序列seq_areaid]
     */
    @Test
    public void testBaseDao_querySysAreaById() {
//        SysArea sysArea = insertSysArea();
//        sysArea = baseDao.querySysAreaById(sysArea.getAreaId());
//        assert sysArea == null : "根据id查询 [SYS_AREA  地区表， 序列seq_areaid] 查询失败";
//        log.info("testBaseDao_querySysAreaById成功");
//        debug(sysArea);
    }
    
    /**
     * 函数功能描述：查询所有 [SYS_AREA  地区表， 序列seq_areaid]
     */
    @Test
    public void testBaseDao_querySysAreaList() {
        SysArea sysArea = new SysArea();
        MybatisPager page = MybatisPager.factoryPageByPageSize(1, 3);
        sysArea.setPager(page);
        List<SysArea> list = baseDao.querySysAreaList(sysArea);
        debug(list);
    }
    
    /*================SYS_BUTTON 操作====*/
    /**
     * 函数功能描述：插入 [SYS_BUTTON  按钮初始表， 序列seq_buttonid]
     */
    @Test
    public void testBaseDao_insertSysButton() {
        insertSysButton();
    }
    
    /**
     * 函数功能描述：根据id查询[SYS_BUTTON  按钮初始表， 序列seq_buttonid]
     */
    @Test
    public void testBaseDao_querySysButtonById() {
        SysButton sysButton = insertSysButton();
        sysButton = baseDao.querySysButtonById(sysButton.getButtonId());
        assert sysButton == null : "根据id查询 [SYS_BUTTON  按钮初始表， 序列seq_buttonid] 查询失败";
        log.info("testBaseDao_querySysButtonById成功");
        debug(sysButton);
    }
    
    /**
     * 函数功能描述：查询所有 [SYS_BUTTON  按钮初始表， 序列seq_buttonid]
     */
    @Test
    public void testBaseDao_querySysButtonList() {
        SysButton sysButton = new SysButton();
        MybatisPager page = MybatisPager.factoryPageByPageSize(1, 3);
        sysButton.setPager(page);
        List<SysButton> list = baseDao.querySysButtonList(sysButton);
        debug(list);
    }
    
    /*================SYS_CERTIFICATE 操作====*/
    /**
     * 函数功能描述：插入 [SYS_CERTIFICATE  证书管理信息表， 序列seq_certificateid]
     */
    @Test
    public void testBaseDao_insertSysCertificate() {
        insertSysCertificate();
    }
    
    /**
     * 函数功能描述：根据id查询[SYS_CERTIFICATE  证书管理信息表， 序列seq_certificateid]
     */
    @Test
    public void testBaseDao_querySysCertificateById() {
        SysCertificate sysCertificate = insertSysCertificate();
        sysCertificate = baseDao.querySysCertificateById(sysCertificate.getCertificateId());
        assert sysCertificate == null : "根据id查询 [SYS_CERTIFICATE  证书管理信息表， 序列seq_certificateid] 查询失败";
        log.info("testBaseDao_querySysCertificateById成功");
        debug(sysCertificate);
    }
    
    /**
     * 函数功能描述：查询所有 [SYS_CERTIFICATE  证书管理信息表， 序列seq_certificateid]
     */
    @Test
    public void testBaseDao_querySysCertificateList() {
        SysCertificate sysCertificate = new SysCertificate();
        MybatisPager page = MybatisPager.factoryPageByPageSize(1, 3);
        sysCertificate.setPager(page);
        List<SysCertificate> list = baseDao.querySysCertificateList(sysCertificate);
        debug(list);
    }
    
    /*================SYS_CONFIG 操作====*/
    /**
     * 函数功能描述：插入 [SYS_CONFIG  系统配置项表， 序列seq_configid]
     */
    @Test
    public void testBaseDao_insertSysConfig() {
        insertSysConfig();
    }
    
    /**
     * 函数功能描述：根据id查询[SYS_CONFIG  系统配置项表， 序列seq_configid]
     */
    @Test
    public void testBaseDao_querySysConfigById() {
        SysConfig sysConfig = insertSysConfig();
        sysConfig = baseDao.querySysConfigById(sysConfig.getConfigId());
        assert sysConfig == null : "根据id查询 [SYS_CONFIG  系统配置项表， 序列seq_configid] 查询失败";
        log.info("testBaseDao_querySysConfigById成功");
        debug(sysConfig);
    }
    
    /**
     * 函数功能描述：查询所有 [SYS_CONFIG  系统配置项表， 序列seq_configid]
     */
    @Test
    public void testBaseDao_querySysConfigList() {
        SysConfig sysConfig  = new SysConfig();
        MybatisPager page = MybatisPager.factoryPageByPageSize(1, 3);
        sysConfig.setPager(page);
        List<SysConfig> list = baseDao.querySysConfigList(sysConfig);
        debug(list);
    }
	
    /*================SYS_CONSTANT 操作====*/
    /**
     * 函数功能描述：插入 [SYS_CONSTANT  数据字典表， 序列seq_constantid]
     */
    @Test
    public void testBaseDao_insertSysConstant() {
        //insertSysConstant();
    }
    
    /**
     * 函数功能描述：根据id查询[SYS_CONSTANT  数据字典表， 序列seq_constantid]
     */
    @Test
    public void testBaseDao_querySysConstantById() {
//        SysConstant sysConstant = insertSysConstant();
//        sysConstant = baseDao.querySysConstantById(sysConstant.getConstantId());
//        assert sysConstant == null : "根据id查询 [SYS_CONSTANT  数据字典表， 序列seq_constantid] 查询失败";
//        log.info("testBaseDao_querySysConstantById成功");
//        debug(sysConstant);
    }
    
    /**
     * 函数功能描述：查询所有 [SYS_CONSTANT  数据字典表， 序列seq_constantid]
     */
    @Test
    public void testBaseDao_querySysConstantList() {
        SysConstant sysConstant = new SysConstant();
        MybatisPager page = MybatisPager.factoryPageByPageSize(1, 3);
        sysConstant.setPager(page);
        List<SysConstant> list = baseDao.querySysConstantList(sysConstant);
        debug(list);
    }
    
    /*================SYS_DEPARTMENT 操作====*/
    /**
     * 函数功能描述：插入 [SYS_DEPARTMENT  部门表， 序列seq_departmentid]
     */
    @Test
    public void testBaseDao_insertSysDepartment() {
        insertSysDepartment();
    }
    
    /**
     * 函数功能描述：根据id查询[SYS_DEPARTMENT  部门表， 序列seq_departmentid]
     */
    @Test
    public void testBaseDao_querySysDepartmentById() {
        SysDepartment sysDepartment = insertSysDepartment();
        sysDepartment = baseDao.querySysDepartmentById(sysDepartment.getDepartmentId());
        assert sysDepartment == null : "根据id查询 [SYS_DEPARTMENT  部门表， 序列seq_departmentid] 查询失败";
        log.info("testBaseDao_querySysDepartmentById成功");
        debug(sysDepartment);
    }
    
    /**
     * 函数功能描述：查询所有 [SYS_DEPARTMENT  部门表， 序列seq_departmentid]
     */
    @Test
    public void testBaseDao_querySysDepartmentList() {
        SysDepartment sysDepartment = new SysDepartment();
        MybatisPager page = MybatisPager.factoryPageByPageSize(1, 3);
        sysDepartment.setPager(page);
        List<SysDepartment> list = baseDao.querySysDepartmentList(sysDepartment);
        debug(list);
    }
    
    /*================SYS_ENTRUST_PERSON 操作====*/
    /**
     * 函数功能描述：插入 [SYS_ENTRUST_PERSON  招标人表， 序列seq_personid]
     */
    @Test
    public void testBaseDao_insertSysEntrustPerson() {
        insertSysEntrustPerson();
    }
    
    /**
     * 函数功能描述：根据id查询[SYS_ENTRUST_PERSON  招标人表， 序列seq_personid]
     */
    @Test
    public void testBaseDao_querySysEntrustPersonById() {
        SysEntrustPerson sysEntrustPerson = insertSysEntrustPerson();
        sysEntrustPerson = baseDao.querySysEntrustPersonById(sysEntrustPerson.getPersonId());
        assert sysEntrustPerson == null : "根据id查询 [SYS_ENTRUST_PERSON  招标人表， 序列seq_personid] 查询失败";
        log.info("testBaseDao_querySysEntrustPersonById成功");
        debug(sysEntrustPerson);
    }
    
    /**
     * 函数功能描述：查询所有 [SYS_ENTRUST_PERSON  招标人表， 序列seq_personid]
     */
    @Test
    public void testBaseDao_querySysEntrustPersonList() {
        SysEntrustPerson sysEntrustPerson = new SysEntrustPerson();
        MybatisPager page = MybatisPager.factoryPageByPageSize(1, 3);
        sysEntrustPerson.setPager(page);
        List<SysEntrustPerson> list = baseDao.querySysEntrustPersonList(sysEntrustPerson);
        debug(list);
    }
    
    /*================SYS_FILE 操作====*/
    /**
     * 函数功能描述：插入 [SYS_FILE  文件表， 序列seq_fileid]
     */
    @Test
    public void testBaseDao_insertSysFile() {
        insertSysFile();
    }
    
    /**
     * 函数功能描述：根据id查询[SYS_FILE  文件表， 序列seq_fileid]
     */
    @Test
    public void testBaseDao_querySysFileById() {
        SysFile sysFile = insertSysFile();
        sysFile = baseDao.querySysFileById(sysFile.getFileId());
        assert sysFile == null : "根据id查询 [SYS_FILE  文件表， 序列seq_fileid] 查询失败";
        log.info("testBaseDao_querySysEntrustPersonById成功");
        debug(sysFile);
    }
    
    /**
     * 函数功能描述：查询所有 [SYS_FILE  文件表， 序列seq_fileid]
     */
    @Test
    public void testBaseDao_querySysFileList() {
        SysFile sysFile = new SysFile();
        sysFile.setFileName("文件名称");
        MybatisPager page = MybatisPager.factoryPageByPageSize(1, 3);
        sysFile.setPager(page);
        List<SysFile> list = baseDao.querySysFileList(sysFile);
        debug(list);
    }
    
    /*================SYS_FILE 操作====*/
    /**
     * 函数功能描述：插入 [SYS_FILE_DOWN  文件下载表， 序列seq_downid]
     */
    @Test
    public void testBaseDao_insertSysFileDown() {
        insertSysFileDown();
    }
    
    /**
     * 函数功能描述：根据id查询[SYS_FILE_DOWN  文件下载表， 序列seq_downid]
     */
    @Test
    public void testBaseDao_querySysFileDownById() {
        SysFileDown sysFileDown = insertSysFileDown();
        sysFileDown = baseDao.querySysFileDownById(sysFileDown.getDownId());
        assert sysFileDown == null : "根据id查询 [SYS_FILE_DOWN  文件下载表， 序列seq_downid] 查询失败";
        log.info("testBaseDao_querySysFileDownById成功");
        debug(sysFileDown);
    }
    
    /**
     * 函数功能描述：查询所有 [SYS_FILE_DOWN  文件下载表， 序列seq_downid]
     */
    @Test
    public void testBaseDao_querySysFileDownList() {
        SysFileDown sysFileDown = new SysFileDown();
        MybatisPager page = MybatisPager.factoryPageByPageSize(1, 3);
        sysFileDown.setPager(page);
        List<SysFileDown> list = baseDao.querySysFileDownList(sysFileDown);
        debug(list);
    }
    
    /*================SYS_LOG 操作====*/
    /**
     * 函数功能描述：插入 [SYS_LOG  日志信息表， 序列seq_logid]
     */
    @Test
    public void testBaseDao_insertSysLog() {
        insertSysLog();
    }
    
    /**
     * 函数功能描述：根据id查询[SYS_LOG  日志信息表， 序列seq_logid]
     */
    @Test
    public void testBaseDao_querySysLogById() {
        SysLog sysLog = insertSysLog();
        sysLog = baseDao.getSysLogById(sysLog.getLogId());
        assert sysLog == null : "根据id查询 [SYS_LOG  日志信息表， 序列seq_logid] 查询失败";
        log.info("testBaseDao_querySysLogById成功");
        debug(sysLog);
    }
    
    /**
     * 函数功能描述：查询所有 [SYS_LOG  日志信息表， 序列seq_logid]
     */
    @Test
    public void testBaseDao_querySysLogList() {
        SysLog sysLog = new SysLog();
        MybatisPager page = MybatisPager.factoryPageByPageSize(1, 3);
        sysLog.setPager(page);
        //sysLog.setIpAddr("www.baidu.com/hahahh/哈哈");
        //sysLog.setOperator("操作人");
        //sysLog.setOperatorId(1L);
        List<SysLog> list = baseDao.querySysLogList(sysLog);
        debug(list);
    }
    
    /*================SYS_LOGIN_SOURCE 操作====*/
    /**
     * 函数功能描述：插入 [SYS_LOGIN_SOURCE  登录来源表， 序列seq_loginid]
     */
    @Test
    public void testBaseDao_insertSysLoginSource() {
        insertSysLoginSource();
    }
    
    /**
     * 函数功能描述：根据id查询[SYS_LOGIN_SOURCE  登录来源表， 序列seq_loginid]
     */
    @Test
    public void testBaseDao_querySysLoginSourceById() {
        SysLoginSource sysLoginSource = insertSysLoginSource();
        sysLoginSource = baseDao.querySysLoginSourceById(sysLoginSource.getLoginId());
        assert sysLoginSource == null : "根据id查询 [SYS_LOGIN_SOURCE  登录来源表， 序列seq_loginid] 查询失败";
        log.info("testBaseDao_querySysLoginSourceById成功");
        debug(sysLoginSource);
    }
    
    /**
     * 函数功能描述：查询所有 [SYS_LOGIN_SOURCE  登录来源表， 序列seq_loginid]
     */
    @Test
    public void testBaseDao_querySysLoginSourceList() {
        SysLoginSource sysLoginSource = new SysLoginSource();
        MybatisPager page = MybatisPager.factoryPageByPageSize(1, 3);
        sysLoginSource.setLoginIp("www.baidu.com");
        sysLoginSource.setUserId(1L);
        sysLoginSource.setStaffCode("yppppppppp");
        
        sysLoginSource.setPager(page);
        
        List<SysLoginSource> list = baseDao.querySysLoginSourceList(sysLoginSource);
        debug(list);
    }
    
    
    
    
    
    
    
    
    
    
}
