package cn.edu.xmut.demo.base;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport{
	private static final long serialVersionUID = 2817071984746760965L;
	protected BaseService baseService;

	public void setBaseService(BaseService baseService) {
		this.baseService = baseService;
	}
}
