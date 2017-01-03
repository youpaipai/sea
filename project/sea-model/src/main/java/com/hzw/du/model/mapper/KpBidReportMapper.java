/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[KP_BID_REPORT  评标报告表， 序列seq_reportid] dao
 * 文件名称：KpBidRecordMapper.java
 * 修改时间：2016年7月13日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
 	
package com.hzw.du.model.mapper;

import java.util.List;

/**
 * <一句话功能简述> [KP_BID_REPORT  评标报告表， 序列seq_reportid] dao
 * <功能详细描述>
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface KpBidReportMapper extends BaseMapper{
    
    /**
     * 
     * 函数功能描述：插入[KP_BID_REPORT  评标报告表]
     * @param kpBidRecord
     * @return
     */
    Integer insertKpBidReport(KpBidReport kpBidReport);
   
    /**
     * 
     * 函数功能描述：根据条件查询[KP_BID_REPORT  评标报告表]
     * @param kpBidRecord 
     * @return
     */
    List<KpBidReport> queryKpBidReportByPage(KpBidReport kpBidReport);
    
    
}
