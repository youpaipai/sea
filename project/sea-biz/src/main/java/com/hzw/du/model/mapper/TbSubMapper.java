/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[TB_SUB 标段表， 序列seq_subid] dao
 * 文件名称：TbSubMapper.java
 * 修改时间：2016年7月21日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.List;

/**
 * [TB_SUB 标段表， 序列seq_subid] dao
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface TbSubMapper extends BaseMapper {

    /**
     * 
     * 函数功能描述：插入[TB_SUB 标段表， 序列seq_subid]
     * @param tbSub
     * @return
     */
    Integer insertTbSub(TbSub tbSub);

    /**
     * 
     * 函数功能描述：根据条件查询[TB_SUB 标段表， 序列seq_subid]
     * @param tbSub 
     * @return
     */
    List<TbSub> queryTbSubByPage(TbSub tbSub);

}
