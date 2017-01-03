package com.hzw.du.test.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.hzw.du.model.dao.BaseDao;
import com.hzw.du.model.dao.BizDao;
import com.hzw.du.model.dao.ManageDao;
import com.hzw.du.model.dao.PortalDao;
import com.hzw.du.model.mapper.BaseBean;
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

import ch.qos.logback.classic.Logger;
import flexjson.JSONSerializer;
import flexjson.transformer.DateTransformer;

public class BaseDbMapperTest {
	
    protected Logger log = (Logger) LoggerFactory.getLogger(this.getClass());
    
	/**
     * 公共dao
     */
    @Autowired
    protected BaseDao baseDao;
    
    /**
     * 业务系统dao
     */
    @Autowired
    protected BizDao bizDao;
    
    /**
     * 后台管理dao
     */
    @Autowired
    protected ManageDao manageDao;
    
    /**
     * 门户网站dao
     */
    @Autowired
    protected PortalDao portalDao;

    
	//插入 评标专家信息表 kpBidExpert
    protected KpBidExpert insertKpBidExpert(){
	    KpBidExpert kpBidExpert= new KpBidExpert();
        kpBidExpert.setUserId(2L);
        kpBidExpert.setUserName("you拍拍");
        kpBidExpert.setSubId(3L);
        kpBidExpert.setNotification("哈哈哈");
        kpBidExpert.setNotifyTime(new Date());
        kpBidExpert.setExamRecord("专家记录");
        kpBidExpert.setStatus(5);
        
        commonInsert(kpBidExpert);
        
        int i = baseDao.insertKpBidExpert(kpBidExpert);
        
        log.info("KpBidExpert插入数据库成功，影响行数=["+ i + "]id=[" + kpBidExpert.getBidExpertId() +"]");
        
        return kpBidExpert;
	}
	
	//插入 [开标记录] KP_BID_RECORD
	protected KpBidRecord insertKpBidRecord(){
	    KpBidRecord kpBidRecord= new KpBidRecord();
	    kpBidRecord.setSubId(1L);
	    kpBidRecord.setTenderProjectId(2L);
	    kpBidRecord.setStandardId(3L);
	    kpBidRecord.setTenderFileId(4L);
	    kpBidRecord.setOpenFileId(5L);
	    kpBidRecord.setPrice(new BigDecimal("3.22"));
	    kpBidRecord.setDuration(6);
	    kpBidRecord.setCurrencyCode("152");
	    kpBidRecord.setPriceUnit("1");
	    kpBidRecord.setInitreviewStatus(1);
	    kpBidRecord.setBidFileStatus(3);
	    kpBidRecord.setScore(3.33D);
	    kpBidRecord.setBidOpeningActor("这是我的，这是我的");
	    kpBidRecord.setBidOpeningTime(new Date());
	    kpBidRecord.setBidOpeningContend("这是我的，这是我的setBidOpeningContend");
	    kpBidRecord.setBidOpeningAddress("kpBidRecord  kpBidRecord address");
	    
	    commonInsert(kpBidRecord);
	    
	    kpBidRecord.setStatus(8);
	    
	    int i = baseDao.insertKpBidRecord(kpBidRecord);
	    
	    log.info("插入 [开标记录] KP_BID_RECORD，影响行数=["+ i + "]id=[" + kpBidRecord.getRecordId() +"]");
	    
	    return kpBidRecord;
	}
	
	//插入 [KP_BID_REPORT  评标报告表， 序列seq_reportid] 
	protected KpBidReport insertKpBidReport(){
	    KpBidReport kpBidReport= new KpBidReport();
	    kpBidReport.setSubId(1L);
	    kpBidReport.setTenderProjectId(2L);
	    kpBidReport.setSupplierId(3L);
	    kpBidReport.setTotalScore(3.22D);
	    kpBidReport.setAvgScore(1.22D);
	    kpBidReport.setRanking(1);
	    kpBidReport.setBidPrice(new BigDecimal("3322.22"));
	    kpBidReport.setWinBidPrice(new BigDecimal("3422.22"));
	    kpBidReport.setCurrencyCode("152");
	    kpBidReport.setPriceUnit("1");
	    kpBidReport.setStatus(4);
	    
	    commonInsert(kpBidReport);
	    
	    int i = baseDao.insertKpBidReport(kpBidReport);
	    
	    log.info("插入 [KP_BID_REPORT  评标报告表， 序列seq_reportid]，影响行数=["+ i + "]id=[" + kpBidReport.getReportId() +"]");
	    
	    return kpBidReport;
	}
	
	//插入  [KP_BID_RULES  评标规则模板表， 序列seq_bidid]
	protected KpBidRules insertKpBidRules(){
	    KpBidRules kpBidRules= new KpBidRules();
	    kpBidRules.setBidName(" 评标规则模板表");
	    kpBidRules.setFileId(2L);
	    kpBidRules.setStatus(1);
	    
	    int i = baseDao.insertKpBidRules(kpBidRules);
	    
	    log.info("插入  [KP_BID_RULES  评标规则模板表， 序列seq_bidid]，影响行数=["+ i + "]id=[" + kpBidRules.getBidId() +"]");
	    
	    return kpBidRules;
	}
	
	//插入 [KP_CAST_RECORD  投标记录表， 序列seq_castrecordid]
	protected KpCastRecord insertKpCastRecord(){
	    KpCastRecord kpBidRules= new KpCastRecord();
	    kpBidRules.setSubId(1L);
	    kpBidRules.setTenderProjectId(2L);
	    kpBidRules.setStandardId(3L);
	    kpBidRules.setCastFileTime(new Date());
	    kpBidRules.setStatus(4);
	    
	    commonInsert(kpBidRules);
	    
	    int i = baseDao.insertKpCastRecord(kpBidRules);
	    
	    log.info("插入 [KP_CAST_RECORD  投标记录表， 序列seq_castrecordid]，影响行数=["+ i + "]id=[" + kpBidRules.getCastRecordId() +"]");
	    
	    return kpBidRules;
	}
	
	//插入 [KP_DETAIL_REVIEW  详细评审表， 序列seq_detailid]
	protected KpDetailReview insertKpDetailReview(){
	    KpDetailReview kpDetailReview= new KpDetailReview();
	    kpDetailReview.setSubId(1L);
	    kpDetailReview.setTenderProjectId(2L);
	    kpDetailReview.setExpertId(3L);
	    kpDetailReview.setIsMarks(4);
	    kpDetailReview.setStatus(4);
	    
	    commonInsert(kpDetailReview);
	    
	    int i = baseDao.insertKpDetailReview(kpDetailReview);
	    
	    log.info("插入 [KP_DETAIL_REVIEW  详细评审表， 序列seq_detailid]，影响行数=["+ i + "]id=[" + kpDetailReview.getDetailId() +"]");
	    
	    return kpDetailReview;
	}
	
	//插入  [KP_INIT_REVIEW  初步评审表， 序列seq_initid]
	protected KpInitReview insertKpInitReview(){
	    KpInitReview kpInitReview= new KpInitReview();
	    kpInitReview.setSubId(1L);
	    kpInitReview.setTenderProjectId(2L);
	    kpInitReview.setSupplierId(5L);
	    kpInitReview.setExpertId(3L);
	    kpInitReview.setIsBarely(6);
	    kpInitReview.setResult("插入  [KP_INIT_REVIEW  初步评审表， 序列seq_initid]RESULT  VARCHAR2(100)   Y           初步评审结果");
	    kpInitReview.setStatus(7);
	    
	    commonInsert(kpInitReview);
	    
	    int i = baseDao.insertKpInitReview(kpInitReview);
	    
	    log.info("插入 [KP_INIT_REVIEW  初步评审表， 序列seq_initid]，影响行数=["+ i + "]id=[" + kpInitReview.getInitId() +"]");
	    
	    return kpInitReview;
	}
	
	//插入  [KP_INIT_REVIEW_RESULT  初步评审结果表， 序列seq_resultid]
	protected KpInitReviewResult insertKpInitReviewResult(){
	    KpInitReviewResult kpInitReviewResult= new KpInitReviewResult();
	    kpInitReviewResult.setSubId(1L);
	    kpInitReviewResult.setTenderProjectId(2L);
	    kpInitReviewResult.setSupplierId(5L);
	    kpInitReviewResult.setIsBarely(6);
	    kpInitReviewResult.setInitResult("插入  [KP_INIT_REVIEW_RESULT  初步评审结果表， 序列seq_resultid] RESULT  VARCHAR2(100)   Y           初步评审结果");
	    kpInitReviewResult.setStatus(7);
	    
	    commonInsert(kpInitReviewResult);
	    
	    int i = baseDao.insertKpInitReviewResult(kpInitReviewResult);
	    
	    log.info("插入  [KP_INIT_REVIEW_RESULT  初步评审结果表， 序列seq_resultid]，影响行数=["+ i + "]id=[" + kpInitReviewResult.getResultId() +"]");
	    
	    return kpInitReviewResult;
	}
	
	//插入 [KP_OPEN_PROJECT  开标项目配置表， 序列seq_openid]
	protected KpOpenProject insertKpOpenProject(){
	    KpOpenProject kpOpenProject= new KpOpenProject();
	    kpOpenProject.setSubMeterId(1L);
	    kpOpenProject.setReviewType(2);
	    kpOpenProject.setAggreGate(3);
	    kpOpenProject.setOrderCalc(4);
	    kpOpenProject.setStatus(7);
	    
	    commonInsert(kpOpenProject);
	    
	    int i = baseDao.insertKpOpenProject(kpOpenProject);
	    
	    log.info("插入  [KP_OPEN_PROJECT  开标项目配置表， 序列seq_openid]，影响行数=["+ i + "]id=[" + kpOpenProject.getOpenId() +"]");
	    
	    return kpOpenProject;
	}
	
	//插入 [KP_PROJECT_RULES  项目评标规则表， 序列seq_rulesid]
	protected KpProjectRules insertKpProjectRules(){
	    KpProjectRules kpProjectRules= new KpProjectRules();
	    
	    kpProjectRules.setStatus(7);
	    
	    commonInsert(kpProjectRules);
	    
	    int i = baseDao.insertKpProjectRules(kpProjectRules);
	    
	    log.info("插入  [KP_PROJECT_RULES  项目评标规则表， 序列seq_rulesid]，影响行数=["+ i + "]id=[" + kpProjectRules.getRulesId() +"]");
	    
	    return kpProjectRules;
	}
	
	
	//插入[KP_REVIEW_INFO  详细评审明细表， 序列seq_infoid]
	protected KpReviewInfo insertKpReviewInfo(){
	    KpReviewInfo kpReviewInfo= new KpReviewInfo();
	    kpReviewInfo.setSupplierId(1L);
	    kpReviewInfo.setStatus(7);
	    
	    commonInsert(kpReviewInfo);
	    
	    int i = baseDao.insertKpReviewInfo(kpReviewInfo);
	    
	    log.info("插入  [KP_REVIEW_INFO  详细评审明细表， 序列seq_infoid]，影响行数=["+ i + "]id=[" + kpReviewInfo.getInfoId() +"]");
	    
	    return kpReviewInfo;
	}
	//插入[MH_FILE_IMAGES  动态图片展示表， 序列seq_imageid]
    protected MHFileImages insertMHFileImages(){
        MHFileImages mhFileImages= new MHFileImages();
        mhFileImages.setHoverDesc("[MH_FILE_IMAGES  动态图片展示表， 序列seq_imageid]");
        mhFileImages.setStatus(7);
        
        commonInsert(mhFileImages);
        
        int i = baseDao.insertMHFileImages(mhFileImages);
        
        log.info("插入  [MH_FILE_IMAGES  动态图片展示表， 序列seq_imageid]，影响行数=["+ i + "]id=[" + mhFileImages.getImageId() +"]");
        
        return mhFileImages;
    }
    //插入 [MH_HELP  系统帮助表， 序列seq_helpid]
    protected MHHelp insertMHHelp(){
        MHHelp mhHelp = new MHHelp();
        mhHelp.setContent(" [MH_HELP  系统帮助表， 序列seq_helpid]");
        mhHelp.setStatus(7);
        
        commonInsert(mhHelp);
        
        int i = baseDao.insertMHHelp(mhHelp);
        
        log.info("插入  [MH_HELP  系统帮助表， 序列seq_helpid]，影响行数=["+ i + "]id=[" + mhHelp.getHelpId() +"]");
        
        return mhHelp;
    }
    //插入[SYS_AGENCY  代理机构信息表， 序列seq_agencyid]
    protected SysAgency insertSysAgency(){
        SysAgency sysAgency = new SysAgency();
        sysAgency.setBusinessRange("[SYS_AGENCY  代理机构信息表， 序列seq_agencyid]");
        sysAgency.setOrganizationId(1L);
        sysAgency.setStatus(7);
        
        commonInsert(sysAgency);
        
        int i = baseDao.insertSysAgency(sysAgency);
        
        log.info("插入  [SYS_AGENCY  代理机构信息表， 序列seq_agencyid]，影响行数=["+ i + "]id=[" + sysAgency.getAgencyId() +"]");
        
        return sysAgency;
    }
    //插入[SYS_AREA  地区表， 序列seq_areaid]
    protected SysArea insertSysArea(){
        SysArea sysArea = new SysArea();
        sysArea.setAreaNum("320000");
        sysArea.setStatus(7);
        
        commonInsert(sysArea);
        
        int i = baseDao.insertSysArea(sysArea);
        
        log.info("插入  [SYS_AREA  地区表， 序列seq_areaid]，影响行数=["+ i + "]id=[" + sysArea.getAreaId() +"]");
        
        return sysArea;
    }
    //插入[SYS_BUTTON  按钮初始表， 序列seq_buttonid]
    protected SysButton insertSysButton(){
        SysButton sysButton = new SysButton();
        sysButton.setButtonName("新增");
        
        commonInsert(sysButton);
        
        int i = baseDao.insertSysButton(sysButton);
        
        log.info("插入 [SYS_BUTTON  按钮初始表， 序列seq_buttonid]，影响行数=["+ i + "]id=[" + sysButton.getButtonId() +"]");
        
        return sysButton;
    }
    //插入[SYS_CERTIFICATE  证书管理信息表， 序列seq_certificateid]
    protected SysCertificate insertSysCertificate(){
        SysCertificate sysCertificate = new SysCertificate();
        sysCertificate.setCertificateKey("asdfasdfasdf哈哈哈家家酒");
        
        commonInsert(sysCertificate);
        
        int i = baseDao.insertSysCertificate(sysCertificate);
        
        log.info("插入 [SYS_CERTIFICATE  证书管理信息表， 序列seq_certificateid]，影响行数=["+ i + "]id=[" + sysCertificate.getCertificateId() +"]");
        
        return sysCertificate;
    }
    
    //插入[SYS_CONFIG  系统配置项表， 序列seq_configid]
    protected SysConfig insertSysConfig(){
        SysConfig sysConfig = new SysConfig();
        sysConfig.setConfigName("[SYS_CONFIG  系统配置项表， 序列seq_configid]");
        sysConfig.setStatus(7);
        commonInsert(sysConfig);
        
        int i = baseDao.insertSysConfig(sysConfig);
        
        log.info("插入 [SYS_CONFIG  系统配置项表， 序列seq_configid]，影响行数=["+ i + "]id=[" + sysConfig.getConfigId() +"]");
        
        return sysConfig;
    }
    //插入[SYS_CONSTANT  数据字典表， 序列seq_constantid]
    protected SysConstant insertSysConstant(){
        SysConstant sysConstant = new SysConstant();
        sysConstant.setCodeName("[SYS_CONFIG  系统配置项表， 序列seq_configid]");
        sysConstant.setStatus(7);
        commonInsert(sysConstant);
        
        int i = baseDao.insertSysConstant(sysConstant);
        
        log.info("插入 [SYS_CONSTANT  数据字典表， 序列seq_constantid]，影响行数=["+ i + "]id=[" + sysConstant.getConstantId() +"]");
        
        return sysConstant;
    }
    
    //插入[SYS_DEPARTMENT  部门表， 序列seq_departmentid]
    protected SysDepartment insertSysDepartment(){
        SysDepartment sysDepartment = new SysDepartment();
        sysDepartment.setDepartmentName("政府部门");
        sysDepartment.setStatus(7);
        commonInsert(sysDepartment);
        
        int i = baseDao.insertSysDepartment(sysDepartment);
        
        log.info("插入[SYS_DEPARTMENT  部门表， 序列seq_departmentid]，影响行数=["+ i + "]id=[" + sysDepartment.getDepartmentId() +"]");
        
        return sysDepartment;
    }
    
    //插入[SYS_ENTRUST_PERSON  招标人表， 序列seq_personid]
    protected SysEntrustPerson insertSysEntrustPerson(){
        SysEntrustPerson sysEntrustPerson = new SysEntrustPerson();
        sysEntrustPerson.setFex("这个是我的传九周年");
        sysEntrustPerson.setStatus(7);
        
        commonInsert(sysEntrustPerson);
        
        int i = baseDao.insertSysEntrustPerson(sysEntrustPerson);
        
        log.info("插入[SYS_ENTRUST_PERSON  招标人表， 序列seq_personid]，影响行数=["+ i + "]id=[" + sysEntrustPerson.getPersonId() +"]");
        
        return sysEntrustPerson;
    }
    
    //插入[SYS_FILE  文件表， 序列seq_fileid]
    protected SysFile insertSysFile(){
        SysFile sysFile = new SysFile();
        sysFile.setFileName("文件名称");
        sysFile.setStatus(7);
        
        commonInsert(sysFile);
        
        int i = baseDao.insertSysFile(sysFile);
        
        log.info("插入[SYS_FILE  文件表， 序列seq_fileid]，影响行数=["+ i + "]id=[" + sysFile.getFileId() +"]");
        
        return sysFile;
    }
    
    //插入 [SYS_FILE_DOWN  文件下载表， 序列seq_downid]
    protected SysFileDown insertSysFileDown(){
        SysFileDown sysFileDown = new SysFileDown();
        sysFileDown.setDownPerson(8L);
        sysFileDown.setStatus(7);
        
        commonInsert(sysFileDown);
        
        int i = baseDao.insertSysFileDown(sysFileDown);
        
        log.info("插入[SYS_FILE_DOWN  文件下载表， 序列seq_downid]，影响行数=["+ i + "]id=[" + sysFileDown.getDownId() +"]");
        
        return sysFileDown;
    }
    
    //插入 [SYS_LOG  日志信息表， 序列seq_logid]
    protected SysLog insertSysLog(){
        SysLog sysLog= new SysLog();
        sysLog.setIpAddr("www.baidu.com/hahahh/哈哈");
        sysLog.setOperator("操作人");
        sysLog.setOperatorId(1L);
        sysLog.setStatus(7);
        
        commonInsert(sysLog);
        
        int i = baseDao.insertSysLog(sysLog);
        
        log.info("插入[SYS_LOG  日志信息表， 序列seq_logid]，影响行数=["+ i + "]id=[" + sysLog.getLogId() +"]");
        
        return sysLog;
    }
    
    //插入 [SYS_LOGIN_SOURCE  登录来源表， 序列seq_loginid]
    protected SysLoginSource insertSysLoginSource(){
        SysLoginSource sysLoginSource = new SysLoginSource();
        sysLoginSource.setLoginIp("www.baidu.com");
        sysLoginSource.setUserId(1L);
        sysLoginSource.setStaffCode("yppppppppp");
        
        commonInsert(sysLoginSource);
        
        int i = baseDao.insertSysLoginSource(sysLoginSource);
        
        log.info("插入[SYS_LOGIN_SOURCE  登录来源表， 序列seq_loginid]，影响行数=["+ i + "]id=[" + sysLoginSource.getLoginId() +"]");
        
        return sysLoginSource;
    }
    
    
    
    
    
    
	protected void debug(BaseBean baseBean){
	    String data = new JSONSerializer().exclude("*.class","*.hashKey").transform(new DateTransformer("yyyyMMddHHmmss"), java.util.Date.class).deepSerialize(baseBean);
	    log.info(data);
	}
	
	protected void debug(List list){
	    String data = new JSONSerializer().exclude("*.class","*.hashKey").transform(new DateTransformer("yyyyMMddHHmmss"), java.util.Date.class).deepSerialize(list);
	    log.info("listSize=["+ list.size() +"]\ndata=["+ data +"]");
	}
	
	private void commonInsert(BaseBean baseBean){
	    Date date = new Date();
	    baseBean.setCreateUser(999L);
	    baseBean.setCreateTime(date);
	    baseBean.setUpdateUser(998L);
	    baseBean.setUpdateTime(date);
	}
	
}
