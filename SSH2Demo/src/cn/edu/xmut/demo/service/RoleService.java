package cn.edu.xmut.demo.service;

import java.util.List;

import cn.edu.xmut.demo.base.BaseService;
import cn.edu.xmut.demo.model.Role;



public interface RoleService extends BaseService{
	/*
	 * 不包括管理员（其他角色）
	 */
	public static final int TYPE_NOT_INCLUDE=1;
	/*
	 * 包括管理员
	 */
	public static final int TYPE_INCLUDE=1;
	public List<Role> listByType(int type);
}
