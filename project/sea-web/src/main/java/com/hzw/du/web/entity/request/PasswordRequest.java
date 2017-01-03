/*
 * 公司名称：江苏华招网信息技术有限公司
 * 版权信息：江苏华招网信息技术有限公司版权所有
 * 描述：TODO
 * 文件名称：PasswordRequest.java
 * 修改时间：2016-7-27
 * 修改人：丁乙宁
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.web.entity.request;

import com.hzw.du.web.entity.BaseRequest;

/**
 * <一句话功能简述> 密码请求Bean
 * <功能详细描述>
 * @author 丁乙宁
 * @version V1.0[产品/模块版本]
 */
public class PasswordRequest extends BaseRequest{
    
    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getNewPassword()
    {
        return newPassword;
    }

    public void setNewPassword(String newPassword)
    {
        this.newPassword = newPassword;
    }

    public String getENnewpassWord()
    {
        return ENnewpassWord;
    }

    public void setENnewpassWord(String eNnewpassWord)
    {
        ENnewpassWord = eNnewpassWord;
    }

    //原密码
    private String password;
    
    //新密码
    private String newPassword;
    
    //二次输入新密码
    private String ENnewpassWord;
    
}
