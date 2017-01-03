/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：开标记录表 KP_BID_RECORD dao
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
 * <一句话功能简述> 开标记录表 KP_BID_RECORD  dao ，序列seq_recordid 
 * <功能详细描述>
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface KpBidRecordMapper extends BaseMapper{
    
    /**
     * 
     * 函数功能描述：插入开标记录
     * @param kpBidRecord
     * @return
     */
    Integer insertKpBidRecord(KpBidRecord kpBidRecord);
   
    /**
     * 
     * 函数功能描述：根据条件查询开标记录
     * @param kpBidRecord 
     * @return
     */
    List<KpBidRecord> queryKpBidRecordByPage(KpBidRecord kpBidRecord);
    
    
}
