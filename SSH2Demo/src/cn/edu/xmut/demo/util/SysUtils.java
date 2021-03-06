package cn.edu.xmut.demo.util;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import com.sun.org.apache.xml.internal.security.utils.Base64;

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
	/***
	 * base64加密
	 * 
	 * @param password
	 *            需要加密的密码
	 * @return 加密后的结果
	 */
	public static String encrypt(String password) {

		MessageDigest md;
		try {
			md = MessageDigest.getInstance("MD5");
			int size = password.length() / 2;
			md.update((password + (size != 0 ? password.substring(size - 1, size) : "")).getBytes());
			return Base64.encode(md.digest());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	/**
	 * 
	 * @author Helen
	 * 2014-12-23 下午5:28:25
	 * @param key
	 * @param path
	 * @return 
	 * TODO 从配置文件Properties读取key的值
	 */
	public static String readFromProperties(String key,String path){
		Resource resource = new ClassPathResource(path);
		Properties p;
		try {
			p = PropertiesLoaderUtils.loadProperties(resource);
			return p.getProperty(key,"");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
}
