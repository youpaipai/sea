/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[KP_PROJECT_RULES  项目评标规则表， 序列seq_rulesid] dao
 * 文件名称：KpProjectRulesMapper.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
 	
package com.hzw.du.model.mapper;

import java.util.List;

/**
 * [KP_PROJECT_RULES  项目评标规则表， 序列seq_rulesid] dao
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface KpProjectRulesMapper extends BaseMapper{
    
    /**
     * 
     * 函数功能描述：插入[KP_PROJECT_RULES  项目评标规则表， 序列seq_rulesid]
     * @param kpProjectRules
     * @return
     */
    Integer insertKpProjectRules(KpProjectRules kpProjectRules);
   
    /**
     * 
     * 函数功能描述：根据条件查询[KP_PROJECT_RULES  项目评标规则表， 序列seq_rulesid]
     * @param kpProjectRules 
     * @return
     */
    List<KpProjectRules> queryKpProjectRulesByPage(KpProjectRules kpProjectRules);
    
    
}
