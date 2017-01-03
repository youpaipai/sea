/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[MH_HELP  系统帮助表， 序列seq_helpid] dao
 * 文件名称：MHHelpMapper.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
 	
package com.hzw.du.model.mapper;

import java.util.List;

/**
 * [MH_HELP  系统帮助表， 序列seq_helpid] dao
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface MHHelpMapper extends BaseMapper{
    
    /**
     * 
     * 函数功能描述：插入[MH_HELP  系统帮助表， 序列seq_helpid]
     * @param mhHelp
     * @return
     */
    Integer insertMHHelp(MHHelp mhHelp);
    
    /**
     * 
     * 函数功能描述：更新帮助信息
     * @param mhHelp
     * @return
     */
    Integer modifyMHHelp(MHHelp mhHelp);
   
    /**
     * 
     * 函数功能描述：根据条件查询[MH_HELP  系统帮助表， 序列seq_helpid]
     * @param mhHelp 
     * @return
     */
    List<MHHelp> queryMHHelpByPage(MHHelp mhHelp);
    
    /**
     * 
     * 函数功能描述：获取用户信息
     * @param helpId
     * @return
     */
    MHHelp getMHHelpById(Long helpId);
}
