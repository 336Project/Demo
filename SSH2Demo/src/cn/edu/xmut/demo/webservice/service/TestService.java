package cn.edu.xmut.demo.webservice.service;

import javax.jws.WebService;

@WebService
public interface TestService{
	public boolean login(String name,String password);
	public String sayHello();
	public String getAccount(String params);
}
