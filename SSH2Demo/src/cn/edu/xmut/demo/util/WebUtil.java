package cn.edu.xmut.demo.util;

import com.opensymphony.xwork2.ActionContext;


public class WebUtil {
	/*
	 * 登录session
	 */
	public static final String KEY_LOGIN_USER_SESSION="account";
	public static void add2Session(String key,Object value){
		ActionContext.getContext().getSession().put(key, value);
	}
	public static void remove4Session(String key){
		ActionContext.getContext().getSession().remove(key);
	}
	public static Object getSession(String key){
		return ActionContext.getContext().getSession().get(key);
	}
}
