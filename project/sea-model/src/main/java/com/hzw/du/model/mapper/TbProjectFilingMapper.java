/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[TB_PROJECT_FILING 项目归档表， 序列seq_filingid] dao
 * 文件名称：TbProjectFilingMapper.java
 * 修改时间：2016年7月21日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.List;

/**
 * [TB_PROJECT_FILING 项目归档表， 序列seq_filingid] dao
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface TbProjectFilingMapper extends BaseMapper {

    /**
     * 
     * 函数功能描述：插入[TB_PROJECT_FILING 项目归档表， 序列seq_filingid]
     * @param tbProjectFiling
     * @return
     */
    Integer insertTbProjectFiling(TbProjectFiling tbProjectFiling);

    /**
     * 
     * 函数功能描述：根据条件查询[TB_PROJECT_FILING 项目归档表， 序列seq_filingid]
     * @param tbProjectFiling 
     * @return
     */
    List<TbProjectFiling> queryTbProjectFilingByPage(TbProjectFiling tbProjectFiling);

}
