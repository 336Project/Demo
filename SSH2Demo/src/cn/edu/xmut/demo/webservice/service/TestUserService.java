package cn.edu.xmut.demo.webservice.service;


import javax.jws.WebService;

@WebService(  
	    name="testUserService",  
	    serviceName="testUserService",  
	    targetNamespace="http://webservice.demo.xmut.edu.cn/"  
	)
public interface TestUserService {

	public String findUser(String table,String params);
	public String findMyUser(String table,String params);
}
