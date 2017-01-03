/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：请求biz
 * 文件名称：BizServiceRequest.java
 * 修改时间：2016年7月15日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
 	
package com.hzw.gateway.servlet.service;

import java.util.ArrayList;
import java.util.List;

import com.hzw.du.biz.bean.BaseRequestInput;
import com.hzw.du.biz.bean.BaseResponseOutput;
import com.hzw.du.biz.bean.constant.BizErrorCode;
import com.hzw.du.biz.bean.param.BaseCommonInput;
import com.hzw.du.biz.bean.param.BaseCommonOutput;
import com.hzw.du.biz.util.BaseInputObjectFactory;

import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import flexjson.transformer.DateTransformer;

/**
 * 请求biz
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class BizRequestService extends BaseBizRequestService{

    /**
     * 
     * 函数功能描述：根据请求json参数，转换成调用不同的biz业务功能，并返回结果json字符串
     * @param inputParam 请求参数json字符串
     * @return 返回请求结果json文
     */
    @Override
    public String excuteRequest(String inputParam) {
        BaseResponseOutput output = new BaseResponseOutput();
        BaseRequestInput requestInput = new JSONDeserializer<BaseRequestInput>().use(null, BaseRequestInput.class).use(java.util.Date.class, new DateTransformer("yyyyMMddHHmmss")).use(new BaseInputObjectFactory(), "list.values").deserialize(inputParam);
        if(requestInput.getList() != null && requestInput.getList().size()>0){
            List<BaseCommonOutput> outList = new ArrayList<BaseCommonOutput>();
            for(BaseCommonInput itemInput : requestInput.getList()){
                copyInput(requestInput, itemInput);
                BaseCommonOutput itemOutput = excute(itemInput);
                outList.add(itemOutput);
            }
            output.setList(outList);
            output.setErrorCode(BizErrorCode.SUCCESS_CODE);
            output.setErrorMsg("ok");
        }else{
            output.setErrorCode(BizErrorCode.ERROR_CODE_9998);
            output.setErrorMsg(BizErrorCode.ERROR_Msg_9998);
        }
        
        return new JSONSerializer().exclude("*.class","*.hashKey").transform(new DateTransformer("yyyyMMddHHmmss"), java.util.Date.class).deepSerialize(output);
    }

    /**
     * 该处不实现参数校验处理，在CheckReqInputParamService中进行处理，这样就把参数校验和业务处理逻辑分开了，以便
     * 函数功能描述：校验输入参数是否合法等
     * @param input 请求input对象，
     * @return 返回校验结果，如果结果为null或者“”空字符，那么表示参数校验通过，否则失败
     */
    @Override
    public String checkInputParam(BaseCommonInput input) {
        return null;
    }
    
    private void copyInput(BaseRequestInput src, BaseCommonInput des){
        des.setBizVersion(src.getBizVersion());
        des.setClientType(src.getClientType());
        des.setTimeStamp(src.getTimeStamp());
    }
}
