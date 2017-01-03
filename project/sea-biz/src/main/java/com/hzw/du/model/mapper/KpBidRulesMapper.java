/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[KP_BID_RULES  评标规则模板表， 序列seq_bidid] dao
 * 文件名称：KpBidRulesMapper.java
 * 修改时间：2016年7月19日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
 	
package com.hzw.du.model.mapper;

import java.util.List;

/**
 * <一句话功能简述> [KP_BID_RULES  评标规则模板表， 序列seq_bidid] dao
 * <功能详细描述>
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface KpBidRulesMapper extends BaseMapper{
    
    /**
     * 
     * 函数功能描述：插入[KP_BID_RULES  评标规则模板表， 序列seq_bidid]
     * @param kpBidRecord
     * @return
     */
    Integer insertKpBidRules(KpBidRules kpBidRules);
   
    /**
     * 
     * 函数功能描述：根据条件查询[KP_BID_RULES  评标规则模板表， 序列seq_bidid]
     * @param kpBidRecord 
     * @return
     */
    List<KpBidRules> queryKpBidRulesByPage(KpBidRules kpBidRules);
    
    
}
