package cn.edu.xmut.demo.service;

import cn.edu.xmut.demo.base.BaseService;
import cn.edu.xmut.demo.model.Account;





public interface AccountService extends BaseService{
	public boolean login(String username,String password,String roleName);
	public long add(Account account);
}
