/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[TB_INVITATION_SUPPLIER 投标邀请书关系表] dao
 * 文件名称：TbInvitationSupplierMapper.java
 * 修改时间：2016年7月21日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.List;

/**
 * [TB_INVITATION_SUPPLIER 投标邀请书关系表] dao
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface TbInvitationSupplierMapper extends BaseMapper {

    /**
     * 
     * 函数功能描述：插入[TB_INVITATION_SUPPLIER 投标邀请书关系表]
     * @param tbInvitationSupplier
     * @return
     */
    Integer insertTbInvitationSupplier(TbInvitationSupplier tbInvitationSupplier);

    /**
     * 
     * 函数功能描述：根据条件查询[TB_INVITATION_SUPPLIER 投标邀请书关系表]
     * @param tbInvitationSupplier 
     * @return
     */
    List<TbInvitationSupplier> queryTbInvitationSupplierByPage(TbInvitationSupplier tbInvitationSupplier);

}
