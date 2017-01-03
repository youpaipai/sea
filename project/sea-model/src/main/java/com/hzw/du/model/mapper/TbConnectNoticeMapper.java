/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[TB_CONNECT_NOTICE 公告表， 序列seq_noticeid] dao
 * 文件名称：TbConnectNoticeMapper.java
 * 修改时间：2016年7月21日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.List;

/**
 * [TB_CONNECT_NOTICE 公告表， 序列seq_noticeid] dao
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface TbConnectNoticeMapper extends BaseMapper {

    /**
     * 
     * 函数功能描述：插入[TB_CONNECT_NOTICE 公告表， 序列seq_noticeid]
     * @param tbConnectNotice
     * @return
     */
    Integer insertTbConnectNotice(TbConnectNotice tbConnectNotice);

    /**
     * 
     * 函数功能描述：根据条件查询[TB_CONNECT_NOTICE 公告表， 序列seq_noticeid]
     * @param tbConnectNotice 
     * @return
     */
    List<TbConnectNotice> queryTbConnectNoticeByPage(TbConnectNotice tbConnectNotice);

}
