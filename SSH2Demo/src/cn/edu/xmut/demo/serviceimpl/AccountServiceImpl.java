package cn.edu.xmut.demo.serviceimpl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.edu.xmut.demo.base.BaseServiceImpl;
import cn.edu.xmut.demo.model.Account;
import cn.edu.xmut.demo.service.AccountService;

public class AccountServiceImpl extends BaseServiceImpl implements AccountService{

	@Override
	public int save(Account account) {
		baseDao.save(account);
		//save("Account", account);
		return 0;
	}

	@Override
	public Account getAccount(int id) {
		return (Account) getByClassNameAndId("Account", id);
	}

	@Override
	public void delete(Account entity) {
		//baseDao.delete(entity);
		baseDao.delete("Account", entity);
	}

	@Override
	public void deleteById(int id) {
		//baseDao.deleteByClassNameAndId("Account", id);
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("realname", "li");
		map.put("name", "admin");
		baseDao.deleteByClassNameAndParams("Account", map);
	}

	@Override
	public void deleteByIds(String ids) {
		Serializable[] id=ids.split(",");
		baseDao.deleteByClassNameAndIds("Account", id);
	}

	@Override
	public void update(Account entity) {
		//baseDao.update(entity);
		baseDao.update("Account",entity);
	}

	@Override
	public int count() {
		int count=0;
		//1、
		//baseDao.countByClassName("Account")
		//2、
		/*Map<String, Object> map=new HashMap<String, Object>();
		map.put("id", 2);
		map.put("name", "admin");
		count=baseDao.countByClassNameAndParams("Account", map);*/
		//3、
		count=baseDao.countBySQL("select count(*) from account");
		return count;
	}

	@Override
	public List<Account> list() {
		return baseDao.listByClassName("Account");
	}

	@Override
	public List<Account> list(int currentPage, int pageSize) {
		
		return listPageRowsByClassName("Account", currentPage, pageSize);
	}

}
