/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网 版权所有
 * 描述：MD5加密算法工具类
 * 文件名称：MD5Util.java
 * 修改时间：2015-9-26
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package org.sea.security;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * <一句话功能简述> MD5加密算法
 * <功能详细描述>
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class MD5Util {

    /**
     * 获取多次加密后的结果，每次加密都以前一个加密结果为原加密字符串
     * @param signmsg 加密前的密码
     * @param times 加密次数
     * @param encoding 字符编码
     * @return 密码后的密码（32位）
     * @throws NoSuchAlgorithmException 
     * @throws UnsupportedEncodingException 
     */
    public static String getMd5AllTimes(String signmsg, int times, String encoding) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        
        for (int i = 0; i < times; i++) {
            //换加密方式，直接修改此处调用方法
            signmsg = getMd5(signmsg, encoding);
        }

        return signmsg;
    }
    
    /**
     * 获取多次加密后的结果，每次加密都以前一个加密结果为原加密字符串
     * @param signmsg 加密前的密码
     * @param times 加密次数
     * @return 密码后的密码（32位）
     * @throws NoSuchAlgorithmException 
     * @throws UnsupportedEncodingException 
     */
    public static String getMd5AllTimes(String signmsg, int times) throws NoSuchAlgorithmException {
        
        for (int i = 0; i < times; i++) {
            //换加密方式，直接修改此处调用方法
            signmsg = getMd5(signmsg);
        }
        
        return signmsg;
    }
    
    public static void main(String[] args) throws Exception{
        System.out.println(getMd5("326e6159bc07c9bb41e634904d4d0f727a{\"addTime\":null,\"cryptKey\":null,\"effectiveTime\":null,\"errorCode\":\"9999\",\"errorMsg\":\"未知错误\",\"operatorType\":null,\"signKey\":null,\"timeStamp\":null,\"token\":null,\"updateUrl\":null,\"userId\":null}", "utf-8"));
    }

    /**
     * 获取MD5加密后的MD5密码
     * @param signmsg 加密前的密码
     * @param encoding 字符编码
     * @return 密码后的密码（32位）
     * @throws NoSuchAlgorithmException 
     * @throws UnsupportedEncodingException 
     */
    public static String getMd5(String signmsg, String encoding) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        char hexChar[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd',
                'e', 'f' };

        //md5加密算法的加密对象为字符数组，这里是为了得到加密的对象  
        byte[] b = signmsg.getBytes(encoding);

        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(b);
        byte[] b2 = md.digest();// // 进行加密并返回字符数组  
        char ch[] = new char[b2.length << 1];
        int len = 0;

        //将字符数组转换成十六进制串，形成最终的密文  
        for (int i = 0; i < b2.length; i++) {
            byte val = b2[i];
            ch[len++] = hexChar[(val >>> 4) & 0xf];
            ch[len++] = hexChar[val & 0xf];
        }

        return new String(ch);
    }
    
    /**
     * 获取MD5加密后的MD5密码
     * @param s 加密前的密码
     * @return 密码后的密码（32位）
     * @throws NoSuchAlgorithmException 
     * @throws UnsupportedEncodingException 
     */
    public static String getMd5(String signmsg) throws NoSuchAlgorithmException {
        char hexChar[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd',
                'e', 'f' };
        
        //md5加密算法的加密对象为字符数组，这里是为了得到加密的对象  
        byte[] b = signmsg.getBytes();
        
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(b);
        byte[] b2 = md.digest();// // 进行加密并返回字符数组  
        char ch[] = new char[b2.length << 1];
        int len = 0;
        
        //将字符数组转换成十六进制串，形成最终的密文  
        for (int i = 0; i < b2.length; i++) {
            byte val = b2[i];
            ch[len++] = hexChar[(val >>> 4) & 0xf];
            ch[len++] = hexChar[val & 0xf];
        }
        
        return new String(ch);
    }
}
