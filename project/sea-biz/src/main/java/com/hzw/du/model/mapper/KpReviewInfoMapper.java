/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[KP_REVIEW_INFO  详细评审明细表， 序列seq_infoid] dao
 * 文件名称：KpReviewInfoMapper.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
 	
package com.hzw.du.model.mapper;

import java.util.List;

/**
 * [KP_REVIEW_INFO  详细评审明细表， 序列seq_infoid] dao
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface KpReviewInfoMapper extends BaseMapper{
    
    /**
     * 
     * 函数功能描述：插入[KP_REVIEW_INFO  详细评审明细表， 序列seq_infoid]
     * @param kpReviewInfo
     * @return
     */
    Integer insertKpReviewInfo(KpReviewInfo kpReviewInfo);
   
    /**
     * 
     * 函数功能描述：根据条件查询[KP_REVIEW_INFO  详细评审明细表， 序列seq_infoid]
     * @param kpReviewInfo 
     * @return
     */
    List<KpReviewInfo> queryKpReviewInfoByPage(KpReviewInfo kpReviewInfo);
    
    
}
