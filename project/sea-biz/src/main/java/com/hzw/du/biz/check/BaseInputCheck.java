/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：校验公共接口输入参数，以及copy
 * 文件名称：BaseInputCheck.java
 * 修改时间：2016年7月22日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
 	
package com.hzw.du.biz.check;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import com.hzw.du.biz.bean.constant.BizErrorCode;
import com.hzw.du.biz.bean.constant.SysConstants;
import com.hzw.du.biz.bean.param.BaseCommonInput;
import com.hzw.du.biz.bean.param.bean.SubProSupplierUser;
import com.hzw.du.biz.bean.param.bean.SupplierTendFeeBean;
import com.hzw.du.biz.bean.param.bussiness.B002SupplierTendFeeInput;
import com.hzw.du.biz.bean.param.common.C003ProjectInput;
import com.hzw.du.biz.bean.param.common.C022StandardSupplierAddInput;
import com.hzw.du.biz.exception.BizException;
import com.hzw.du.model.mapper.BaseBean;

import ch.qos.logback.classic.Logger;

/**
 * 校验公共接口输入参数，以及copy
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class BaseInputCheck {
    
    protected final static Logger log = (Logger) LoggerFactory.getLogger(BaseInputCheck.class);
    
    private final static Object[] param = new Object[]{};
    
    /**
     * 
     * 函数功能描述：把输入参数转换成相对应的数据库对象
     * @param input 输入参数对象
     * @param clazz 数据库对象clazz
     * @return
     */
    public static <T> T copyInputToDb(BaseCommonInput input, Class<T> clazz){
        T t = null;
        try{
            t = clazz.newInstance();
            if(!( t instanceof BaseBean)){
                return null;
            }
            List<Field> list = getFields(clazz);
            for(Field field : list){
                log.debug(field.getName());
                try{
                    PropertyDescriptor writePd = new PropertyDescriptor(field.getName(), t.getClass());
                    Method write = writePd.getWriteMethod(); 
                    PropertyDescriptor readPd = new PropertyDescriptor(field.getName(), input.getClass());
                    Method read = readPd.getReadMethod();
                    write.invoke(t, read.invoke(input, param)); 
                }catch(Exception e){
                    log.error("反射赋值，找不到相关的method" + e.getMessage());
                }
            }
        }catch(Exception e){
            log.error("数据转换异常", e);
            throw new BizException(BizErrorCode.ERROR_CODE_9996, BizErrorCode.ERROR_Msg_9996);
        }
        return t;
    }
    private static List<Field> getFields(Class<?> clazz){
        List<Field> list = new ArrayList<Field>();
        if(clazz == null){
            return new ArrayList<Field>();
        }else{
            if(clazz == BaseBean.class){
                list.addAll(Arrays.asList(clazz.getDeclaredFields())); 
            }else{
                list.addAll(Arrays.asList(clazz.getDeclaredFields()));
                list.addAll(getFields(clazz.getSuperclass()));
            }
        }
        return list;
    }
    
    /**
     * 
     * 函数功能描述：项目立项（新增检查）
     * @param input
     * @return
     */
    public static void checkC002_Add(C003ProjectInput input){
        
        if(StringUtils.isEmpty(input.getProjectNum())){
            throw new BizException(BizErrorCode.ERROR_CODE_9997, "[项目编号]" + BizErrorCode.ERROR_Msg_9997);
        }
        
        if(StringUtils.isEmpty(input.getProjectName())){
            throw new BizException(BizErrorCode.ERROR_CODE_9997, "[项目名称]" + BizErrorCode.ERROR_Msg_9997);
        }
        
        if(StringUtils.isEmpty(input.getRegionCode())){
            throw new BizException(BizErrorCode.ERROR_CODE_9997, "[项目所在行政区域代码]" + BizErrorCode.ERROR_Msg_9997);
        }
        
        if(StringUtils.isEmpty(input.getAddress())){
            throw new BizException(BizErrorCode.ERROR_CODE_9997, "[项目地址]" + BizErrorCode.ERROR_Msg_9997);
        }
        
        if(input.getProjectType() == null){
            throw new BizException(BizErrorCode.ERROR_CODE_9997, "[项目类型]" + BizErrorCode.ERROR_Msg_9997);
        }
        
        if(input.getFundingSource() == null){
            throw new BizException(BizErrorCode.ERROR_CODE_9997, "[资金来源]" + BizErrorCode.ERROR_Msg_9997);
        }
        
    }
    
    /**
     * 
     * 函数功能描述：项目立项（新增检查）
     * @param input
     * @return
     */
    public static void checkC022_Add(C022StandardSupplierAddInput input){
        
        if(StringUtils.isEmpty(input.getTenderProjectId())){
            throw new BizException(BizErrorCode.ERROR_CODE_9997, "[招标项目ID]" + BizErrorCode.ERROR_Msg_9997);
        }
        
        if(input.getIsInvite() == null){
            throw new BizException(BizErrorCode.ERROR_CODE_9997, "[邀请标识]" + BizErrorCode.ERROR_Msg_9997);
        }else{
            if(input.getIsInvite() == SysConstants.IS_INVITE.TRUE){
                if(input.getPersonUserId() == null){
                    throw new BizException(BizErrorCode.ERROR_CODE_9997, "[招标人用户ID]" + BizErrorCode.ERROR_Msg_9997);
                }
            }
        }
        
        //检查项目标段供应商关系值是否正确
        if(input.getSubProSupplierList() == null || input.getSubProSupplierList().size() <= 0){
            throw new BizException(BizErrorCode.ERROR_CODE_9997, "[项目标段对应的参标供应商关系]" + BizErrorCode.ERROR_Msg_9997);
        }else{
            for(int i = input.getSubProSupplierList().size() - 1; i>= 0; i--){
                SubProSupplierUser item = input.getSubProSupplierList().get(i);
                if(item == null || item.getSupplierUserIdList() == null 
                        || item.getSupplierUserIdList().size() <= 0 
                        || item.getSubId() == null){
                    
                    input.getSubProSupplierList().remove(i);
                    log.warn("C022检查供应商关系警告1，招标项目为null、或者供应商列表为null");
                    continue;
                }
                for(int j = item.getSupplierUserIdList().size() - 1; j>=0; j--){
                    if(item.getSupplierUserIdList().get(j) == null){
                        item.getSupplierUserIdList().remove(j);
                        log.warn("C022检查供应商关系警告2，供应商列表存在null值");
                    }
                }
                if(item.getSupplierUserIdList().size() <= 0){
                    input.getSubProSupplierList().remove(i);
                    log.warn("C022检查供应商关系警告3，该项目没有参标供应商");
                }
            }
            if(input.getSubProSupplierList().size() <= 0){
                throw new BizException(BizErrorCode.ERROR_CODE_9997, "[项目标段对应的参标供应商关系参数无效]" + BizErrorCode.ERROR_Msg_9997);
            }
        }
    }
    
}
