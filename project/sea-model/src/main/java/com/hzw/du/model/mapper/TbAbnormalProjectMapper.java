/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[TB_ABNORMAL_PROJECT  异常项目表， 序列seq_abnormalid] dao
 * 文件名称：TbAbnormalProjectMapper.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.List;

/**
 * [TB_ABNORMAL_PROJECT  异常项目表， 序列seq_abnormalid] dao
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface TbAbnormalProjectMapper extends BaseMapper {

    /**
     * 
     * 函数功能描述：插入[TB_ABNORMAL_PROJECT  异常项目表， 序列seq_abnormalid]
     * @param tbAbnormalProject
     * @return
     */
    Integer insertTbAbnormalProject(TbAbnormalProject tbAbnormalProject);

    /**
     * 
     * 函数功能描述：根据条件查询[TB_ABNORMAL_PROJECT  异常项目表， 序列seq_abnormalid]
     * @param tbAbnormalProject 
     * @return
     */
    List<TbAbnormalProject> queryTbAbnormalProjectByPage(TbAbnormalProject tbAbnormalProject);

}
