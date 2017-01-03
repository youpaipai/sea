/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[TB_STANDARD_SUPPLIER 参标供应商表， 序列seq_standardid] dao
 * 文件名称：TbStandardSupplierMapper.java
 * 修改时间：2016年7月21日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.List;

/**
 * [TB_STANDARD_SUPPLIER 参标供应商表， 序列seq_standardid] dao
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface TbStandardSupplierMapper extends BaseMapper {
    
    /**
     * 
     * 函数功能描述：获取[TB_STANDARD_SUPPLIER 参标供应商表， 序列seq_standardid]的下一个序列ID
     * @return
     */
    Long queryNextSeqStandardId();

    /**
     * 
     * 函数功能描述：插入[TB_STANDARD_SUPPLIER 参标供应商表， 序列seq_standardid]
     * @param tbStandardSupplier
     * @return
     */
    Integer insertTbStandardSupplier(TbStandardSupplier tbStandardSupplier);
    
    /**
     * 
     * 函数功能描述：插入[TB_STANDARD_SUPPLIER 参标供应商表， 序列seq_standardid]， 批量插入数据，
     *  循环conditonMap.tbStandardSupplierList为key
     * @param tbStandardSupplier
     * @return
     */
    Integer insertTbStandardSupplierBatch(TbStandardSupplier tbStandardSupplier);

    /**
     * 
     * 函数功能描述：更新[TB_STANDARD_SUPPLIER 参标供应商表， 序列seq_standardid]
     * @param tbStandardSupplier
     * @return
     */
    Integer updateTbStandardSupplier(TbStandardSupplier tbStandardSupplier);
    
    
    /**
     * 
     * 函数功能描述：根据条件查询[TB_STANDARD_SUPPLIER 参标供应商表， 序列seq_standardid]
     * @param tbStandardSupplier 
     * @return
     */
    List<TbStandardSupplier> queryTbStandardSupplierByPage(TbStandardSupplier tbStandardSupplier);

    /**
     * 主要查询参标的项目信息
     * 函数功能描述：根据条件查询[TB_STANDARD_SUPPLIER 参标供应商表， 序列seq_standardid]
     * @param tbStandardSupplier 
     * @return
     */
    List<TbStandardSupplier> querySupplierProjectByPage(TbStandardSupplier tbStandardSupplier);
    
    /**
     * 主要查询参标的标段信息，以及是否中标情况，等等
     * 函数功能描述：根据条件查询[TB_STANDARD_SUPPLIER 参标供应商表， 序列seq_standardid]
     * @param tbStandardSupplier 
     * @return
     */
    List<TbStandardSupplier> querySupplierSubDetailByPage(TbStandardSupplier tbStandardSupplier);

}
