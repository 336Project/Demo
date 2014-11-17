package cn.edu.xmut.demo.webservice.serviceimpl;

import cn.edu.xmut.demo.base.BaseServiceImpl;
import cn.edu.xmut.demo.model.Account;
import cn.edu.xmut.demo.webservice.service.TestService;



public class TestServiceImpl extends BaseServiceImpl implements TestService{
	public boolean login(String name, String password) {
		Account account=(Account) baseDao.getByHQL("from Account a where a.name='"+name+"' and a.password='"+password+"'");
		if(account!=null) return true;
		return false;
	}
	@Override
	public String sayHello() {
		return "Hello";
	}
}
