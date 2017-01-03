/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[TB_QUESTION 澄清答疑表， 序列seq_questionid] dao
 * 文件名称：TbQuestionMapper.java
 * 修改时间：2016年7月21日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.List;

/**
 * [TB_QUESTION 澄清答疑表， 序列seq_questionid] dao
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface TbQuestionMapper extends BaseMapper {

    /**
     * 
     * 函数功能描述：插入[TB_QUESTION 澄清答疑表， 序列seq_questionid]
     * @param tbQuestion
     * @return
     */
    Integer insertTbQuestion(TbQuestion tbQuestion);

    /**
     * 
     * 函数功能描述：根据条件查询[TB_QUESTION 澄清答疑表， 序列seq_questionid]
     * @param tbQuestion 
     * @return
     */
    List<TbQuestion> queryTbQuestionByPage(TbQuestion tbQuestion);

}
