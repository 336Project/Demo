package cn.edu.xmut.demo.action;

import java.util.List;

import cn.edu.xmut.demo.base.BaseAction;
import cn.edu.xmut.demo.model.Role;
import cn.edu.xmut.demo.service.RoleService;


public class RoleAction extends BaseAction {
	private RoleService roleService;
	private int type;
	private List<Role> roles;
	/**
	 * 
	 * 2014-12-24 下午5:01:11
	 * @return 
	 * TODO 获取角色列表
	 */
	public String listRole(){
		roles=roleService.listByType(type);
		return "list";
	}
	
	
	public RoleService getRoleService() {
		return roleService;
	}
	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
}
