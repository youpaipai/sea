/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[KP_CAST_RECORD  投标记录表， 序列seq_castrecordid] dao
 * 文件名称：KpCastRecordMapper.java
 * 修改时间：2016年7月19日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
 	
package com.hzw.du.model.mapper;

import java.util.List;

/**
 * [KP_CAST_RECORD  投标记录表， 序列seq_castrecordid] dao
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface KpCastRecordMapper extends BaseMapper{
    
    /**
     * 
     * 函数功能描述：插入[KP_CAST_RECORD  投标记录表， 序列seq_castrecordid]
     * @param kpCastRecord
     * @return
     */
    Integer insertKpCastRecord(KpCastRecord kpCastRecord);
   
    /**
     * 
     * 函数功能描述：根据条件查询[KP_CAST_RECORD  投标记录表， 序列seq_castrecordid]
     * @param kpCastRecord 
     * @return
     */
    List<KpCastRecord> queryKpCastRecordByPage(KpCastRecord kpCastRecord);
    
    
}
