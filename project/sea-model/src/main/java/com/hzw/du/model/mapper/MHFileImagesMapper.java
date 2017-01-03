/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[MH_FILE_IMAGES  动态图片展示表， 序列seq_imageid] dao
 * 文件名称：MHFileImagesMapper.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
 	
package com.hzw.du.model.mapper;

import java.util.List;

/**
 * [MH_FILE_IMAGES  动态图片展示表， 序列seq_imageid] dao
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface MHFileImagesMapper extends BaseMapper{
    
    /**
     * 
     * 函数功能描述：插入[MH_FILE_IMAGES  动态图片展示表， 序列seq_imageid]
     * @param mhFileImages
     * @return
     */
    Integer insertMHFileImages(MHFileImages mhFileImages);
   
    /**
     * 
     * 函数功能描述：根据条件查询[MH_FILE_IMAGES  动态图片展示表， 序列seq_imageid]
     * @param mhFileImages 
     * @return
     */
    List<MHFileImages> queryMHFileImagesByPage(MHFileImages mhFileImages);
    
    
}
