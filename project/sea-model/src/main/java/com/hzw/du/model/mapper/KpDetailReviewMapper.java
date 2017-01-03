/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[KP_DETAIL_REVIEW  详细评审表， 序列seq_detailid] dao
 * 文件名称：KpDetailReviewMapper.java
 * 修改时间：2016年7月19日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
 	
package com.hzw.du.model.mapper;

import java.util.List;

/**
 * [KP_DETAIL_REVIEW  详细评审表， 序列seq_detailid] dao
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface KpDetailReviewMapper extends BaseMapper{
    
    /**
     * 
     * 函数功能描述：插入[KP_DETAIL_REVIEW  详细评审表， 序列seq_detailid]
     * @param kpDetailReview
     * @return
     */
    Integer insertKpDetailReview(KpDetailReview kpDetailReview);
   
    /**
     * 
     * 函数功能描述：根据条件查询[KP_DETAIL_REVIEW  详细评审表， 序列seq_detailid]
     * @param kpDetailReview 
     * @return
     */
    List<KpDetailReview> queryKpDetailReviewByPage(KpDetailReview kpDetailReview);
    
    
}
