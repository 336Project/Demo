package cn.edu.xmut.demo.util;

public class SysUtils {
	
	/**
	 * 判断是否是数字
	 * @param isNumber
	 * @return
	 */
	public static Boolean isInt(String isNumber){
		try {
			Integer.parseInt(isNumber);
		} catch (NumberFormatException e) {
			// TODO: handle exception
			return false;
		}
		return true;
	}

}
