package cn.edu.xmut.demo.serviceimpl;

import java.util.List;

import cn.edu.xmut.demo.base.BaseServiceImpl;
import cn.edu.xmut.demo.model.Role;
import cn.edu.xmut.demo.service.RoleService;


public class RoleServiceImpl extends BaseServiceImpl implements RoleService {

	@Override
	public List<Role> listByType(int type) {
		if(type==RoleService.TYPE_INCLUDE){//包括管理员,即所有角色
			return baseDao.listByClassName("Role");
		}else{
			String hql="from Role where code <> '"+Role.CODE_ADMIN+"'";
			return baseDao.listByHQL(hql);
		}
	}

}
