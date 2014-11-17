package cn.edu.xmut.demo.action;

import java.util.List;

import com.alibaba.fastjson.JSON;

import cn.edu.xmut.demo.base.BaseAction;
import cn.edu.xmut.demo.model.Account;
import cn.edu.xmut.demo.service.AccountService;


public class AccountAction extends BaseAction{
	private AccountService accountService;
	private Account account;
	private List<Account> list;
	private String result;
	private int id;
	private String ids;
	private int currentPage;
	private int pageSize;
	public String add(){
		accountService.save(account);
		result="添加成功!";
		return SUCCESS;
	}
	
	public String delete(){
		//accountService.delete(account);
		accountService.deleteById(id);
		//accountService.deleteByIds(ids);
		result="删除成功!";
		return SUCCESS;
	}
	
	public String update() {
		accountService.update(account);
		result="更新成功!";
		return SUCCESS;
	}
	
	public String getRecord() {
		account=accountService.getAccount(id);
		result=JSON.toJSONString(account);
		return SUCCESS;
	}
	public String list(){
		list=accountService.list();
		//result=JSON.toJSONString(list);
		return "list";//SUCCESS
	}
	
	public String listByPage() {
		List<Account> list=accountService.list(currentPage,pageSize);
		result=JSON.toJSONString(list);
		return SUCCESS;
	}
	
	public String count(){
		long count=accountService.count();
		result=count+"";
		return SUCCESS;
	}
	
	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}


	public List<Account> getList() {
		return list;
	}

	public void setList(List<Account> list) {
		this.list = list;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
