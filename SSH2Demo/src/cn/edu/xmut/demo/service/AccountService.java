package cn.edu.xmut.demo.service;


import java.util.List;

import cn.edu.xmut.demo.model.Account;

public interface AccountService {
	public int save(Account account);
	public Account getAccount(int id);
	public void delete(Account account);
	public void deleteById(int id);
	public void deleteByIds(String ids);
	public void update(Account account);
	public int count();
	public List<Account> list();
	public List<Account> list(int currentPage,int pageSize);
}
