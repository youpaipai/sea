/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[KP_INIT_REVIEW  初步评审表， 序列seq_initid] dao
 * 文件名称：KpInitReviewMapper.java
 * 修改时间：2016年7月19日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
 	
package com.hzw.du.model.mapper;

import java.util.List;

/**
 * [KP_INIT_REVIEW  初步评审表， 序列seq_initid] dao
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface KpInitReviewMapper extends BaseMapper{
    
    /**
     * 
     * 函数功能描述：插入[KP_INIT_REVIEW  初步评审表， 序列seq_initid]
     * @param kpInitReview
     * @return
     */
    Integer insertKpInitReview(KpInitReview kpInitReview);
   
    /**
     * 
     * 函数功能描述：根据条件查询[KP_INIT_REVIEW  初步评审表， 序列seq_initid]
     * @param kpInitReview 
     * @return
     */
    List<KpInitReview> queryKpInitReviewByPage(KpInitReview kpInitReview);
    
    
}
