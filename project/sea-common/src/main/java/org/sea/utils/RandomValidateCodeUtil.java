/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：验证码生产器
 * 文件名称：RandomValidateCode.java
 * 修改时间：2016年4月15日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package org.sea.utils;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

import org.sea.log.Logger;
import org.sea.log.LoggerUtil;

public class RandomValidateCodeUtil {

	private static Logger log = LoggerUtil.getLogger(RandomValidateCodeUtil.class);

	private static Random random = new Random();
	private static int width = 100;// 图片宽
	private static int height = 30;// 图片高
	private static int lineSize = 25;// 干扰线数量
	private static int stringNum = 4;// 随机产生字符数量 /* * 获得字体 */
	private static String[] codeArr = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
			"q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
			"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5",
			"6", "7", "8", "9" };

	private static Font getFont() {
		return new Font("Fixedsys", Font.CENTER_BASELINE, 25);
	}

	/* * 获得颜色 */
	private static Color getRandColor(int fc, int bc) {
		if (fc > 255)
			fc = 255;
		if (bc > 255)
			bc = 255;
		int r = fc + random.nextInt(bc - fc - 16);
		int g = fc + random.nextInt(bc - fc - 14);
		int b = fc + random.nextInt(bc - fc - 18);
		return new Color(r, g, b);
	}

	public static String getRandomNumCode() {
		int rand = new Random().nextInt(8999) + 1000;
		return "" + rand;
	}

	public static String getRandomNumCode(int codeLength) {
		if (codeLength < stringNum) {
			codeLength = stringNum;
		}
		String randomStr = "1";
		for (int i = 0; i < codeLength; i++) {
			randomStr += "0";
		}
		String randomStr2 = randomStr.substring(0, codeLength);
		int rand = new Random().nextInt(Integer.parseInt(randomStr) - Integer.parseInt(randomStr2) - 1)
				+ Integer.parseInt(randomStr2);
		log.debug(rand + "");
		return "" + rand;
	}

	public static String getRandomStrCode(int codeLength) {
		if (codeLength < stringNum) {
			codeLength = stringNum;
		}

		String rand = "";
		for (int i = 0; i < codeLength; i++) {
			int m = random.nextInt(codeArr.length);
			rand += codeArr[m];
		}
		log.debug(rand);
		return "" + rand;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10000000; i++) {
			RandomValidateCodeUtil.getRandomStrCode(6);
		}
	}

	/*** 生成随机图片 */
	public static BufferedImage getImage(String randCode) {
		// BufferedImage类是具有缓冲区的Image类,Image类是用于描述图像信息的类
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR);
		// 产生Image对象的Graphics对象,改对象可以在图像上进行各种绘制操作
		Graphics g = image.getGraphics();
		g.fillRect(0, 0, width, height);
		g.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 18));
		g.setColor(getRandColor(110, 133));
		// 绘制随机字符
		for (int i = 0; i < randCode.length(); i++) {
			drowString(g, randCode, i);
		}
		// 绘制干扰线
		for (int i = 0; i <= lineSize; i++) {
			drowLine(g);
		}
		g.dispose();
		return image;
	}

	/** 绘制字符串 */
	private static void drowString(Graphics g, String randCode, int i) {
		g.setFont(getFont());
		g.setColor(new Color(random.nextInt(101), random.nextInt(111), random.nextInt(121)));
		g.translate(random.nextInt(3), random.nextInt(3));
		g.drawString(randCode.substring(i, i + 1), 17 * (i + 1), 20);
	}

	/** 绘制干扰线 */
	private static void drowLine(Graphics g) {
		int x = random.nextInt(width);
		int y = random.nextInt(height);
		int xl = random.nextInt(13);
		int yl = random.nextInt(15);
		g.drawLine(x, y, x + xl, y + yl);
	}

}
