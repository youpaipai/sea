package org.sea.log;

/**
 * 
 * <一句话功能简述> TODO <功能详细描述>
 * 
 * @author 尤拍拍
 * @version V1.0[产品/模块版本]
 */
public class LoggerUtil implements Logger {

	// 日志开关
	private boolean logSwitch = true;

	private org.apache.log4j.Logger log;

	private LoggerUtil() {

	}

	/**
	 * 
	 * 函数功能描述：创建日志对象
	 * 
	 * @param clazz
	 *            字节码对象
	 * @return
	 */
	public static Logger getLogger(Class<?> clazz) {
		LoggerUtil logUtil = new LoggerUtil();
		org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(clazz);
		logUtil.log = log;
		return logUtil;
	}

	/**
	 * 
	 * 函数功能描述：创建日志对象
	 * 
	 * @param tag
	 *            日志标志
	 * @return
	 */
	public static LoggerUtil getLogger(String tag) {
		LoggerUtil logUtil = new LoggerUtil();
		org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(tag);
		logUtil.log = log;
		return logUtil;
	}

	public void debug(String msg) {
		if (logSwitch) {
			log.debug(msg);
		}
	}

	public void debug(String msg, Throwable e) {
		if (logSwitch) {
			log.debug(msg, e);
		}
	}

	public void info(String msg) {
		if (logSwitch) {
			log.info(msg);
		}
	}

	public void info(String msg, Throwable e) {
		if (logSwitch) {
			log.info(msg, e);
		}
	}

	public void warn(String msg) {
		if (logSwitch) {
			log.warn(msg);
		}
	}

	public void warn(String msg, Throwable e) {
		if (logSwitch) {
			log.warn(msg, e);
		}
	}

	public void error(String msg) {
		if (logSwitch) {
			log.error(msg);
		}
	}

	public void error(String msg, Throwable e) {
		if (logSwitch) {
			log.error(msg, e);
		}
	}

}
