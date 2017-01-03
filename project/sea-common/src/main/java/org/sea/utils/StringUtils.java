/*
 * 描述：字符时间等工具类
 * 文件名称：StringUtils.java
 * 修改时间：2016年4月15日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package org.sea.utils;

import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 时间、字符串、数字处理 util
 * 
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class StringUtils {

	/**
	 * 函数功能描述：检查字符串是否为空或者null
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isEmptyOrNull(String str) {
		return str == null || "".equals(str);
	}

	/**
	 * 函数功能描述：检查字符串是否为空或者null，并检查trim后是否为空或者null
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isEmptyAfterTrim(String str) {
		boolean flag = isEmptyOrNull(str);
		if (flag) {
			return flag;
		}
		return "".equals(str.trim());
	}

	/**
	 * 验证是不是数字
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNum(String val) {
		if (null == val || val.isEmpty() || "-".equals(val) || "+".equals(val)) {
			return false;
		}
		return val.matches("^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$");
	}

	/**
	 * 去除字符串中的空格、回车、换行符、制表符 \n 回车(\u000a) \t 水平制表符(\u0009) \s 空格(\u0008) \r
	 * 换行(\u000d)
	 * 
	 * @param str
	 * @return
	 */
	public static String replaceBlank(String str) {
		String dest = "";
		if (str != null) {
			Pattern p = Pattern.compile("\\s*|\t|\r|\n");
			Matcher m = p.matcher(str);
			dest = m.replaceAll("");
		}
		return dest;
	}

	/**
	 * 函数功能描述：GUID是一个128位长的数字，一般用16进制表示。 算法的核心思想是结合机器的网卡、当地时间、一个随机数来生成GUID。
	 * 从理论上讲，如果一台机器每秒产生10000000个GUID，则可以保证（概率意义上）3240年不重复。
	 * 
	 * @return
	 */
	public static String getUUID() {
		UUID uuId = UUID.randomUUID();
		return uuId.toString();
	}
	
}
