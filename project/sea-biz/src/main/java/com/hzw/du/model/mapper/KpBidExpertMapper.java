/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：评标专家信息表 KP_BID_EXPERT,序列 seq_bidexpertid, dao
 * 文件名称：KpBidExpertMapper.java
 * 修改时间：2016年7月13日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
 	
package com.hzw.du.model.mapper;

import java.util.List;

/**
 * <一句话功能简述> [评标专家信息表] KP_BID_EXPERT,序列 seq_bidexpertid, dao
 * <功能详细描述>
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface KpBidExpertMapper extends BaseMapper{
    
    /**
     * 
     * 函数功能描述：插入kpBidExpert专家信息
     * @param kpBidExpert
     * @return
     */
    Integer insertKpBidExpert(KpBidExpert kpBidExpert);
   
    /**
     * 
     * 函数功能描述：根据条件查询专家信息
     * @param kpBidExpert 
     * @return
     */
    List<KpBidExpert> queryKpBidExpertByPage(KpBidExpert kpBidExpert);
    
    
}
