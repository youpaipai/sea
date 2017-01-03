/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[TB_BAIL_CERTIFICATES 供应商保证金表， 序列seq_bailid] dao
 * 文件名称：TbBailCertificatesMapper.java
 * 修改时间：2016年7月21日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.List;

/**
 * [TB_BAIL_CERTIFICATES 供应商保证金表， 序列seq_bailid] dao
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface TbBailCertificatesMapper extends BaseMapper {

    /**
     * 
     * 函数功能描述：插入[TB_BAIL_CERTIFICATES 供应商保证金表， 序列seq_bailid]
     * @param tbBailCertificates
     * @return
     */
    Integer insertTbBailCertificates(TbBailCertificates tbBailCertificates);

    /**
     * 
     * 函数功能描述：根据条件查询[TB_BAIL_CERTIFICATES 供应商保证金表， 序列seq_bailid]
     * @param tbBailCertificates 
     * @return
     */
    List<TbBailCertificates> queryTbBailCertificatesByPage(TbBailCertificates tbBailCertificates);

}
