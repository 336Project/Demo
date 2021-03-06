package cn.edu.xmut.demo.serviceimpl;

import cn.edu.xmut.demo.base.BaseServiceImpl;
import cn.edu.xmut.demo.model.Account;
import cn.edu.xmut.demo.model.Role;
import cn.edu.xmut.demo.service.AccountService;
import cn.edu.xmut.demo.util.SysUtils;
import cn.edu.xmut.demo.util.WebUtil;




public class AccountServiceImpl extends BaseServiceImpl implements AccountService{

	@Override
	public boolean login(String username, String password,String roleName) {
		String hql="from Account where (userName='"+username+"' or email='"+username+"') and password ='"+SysUtils.encrypt(password)+"' and roleName ='"+roleName+"'";
		Account account=baseDao.getByHQL(hql);
		if(account!=null){
			WebUtil.add2Session(WebUtil.KEY_LOGIN_USER_SESSION, account);
			return true;
		}
		return false;
	}

	@Override
	public long add(Account account) {
		Role role=baseDao.getByClassAndId(Role.class, account.getRoleId());
		if(role==null){
			return -1;
		}
		account.setRoleId(role.getId());
		account.setRoleName(role.getName());
		account.setPassword(SysUtils.encrypt(account.getPassword()));
		return baseDao.save(account);
	}

}
