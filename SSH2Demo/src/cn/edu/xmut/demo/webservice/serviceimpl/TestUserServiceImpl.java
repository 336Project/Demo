package cn.edu.xmut.demo.webservice.serviceimpl;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;

import cn.edu.xmut.demo.base.BaseServiceImpl;
import cn.edu.xmut.demo.webservice.service.TestUserService;

public class TestUserServiceImpl extends BaseServiceImpl implements
		TestUserService {

	@Override
	public String findUser(String table,String params) {
		// TODO Auto-generated method stub
		Map<String, Object> whereParams= (Map<String, Object>) JSON.parseObject(params);
		System.out.print(whereParams.get("userName"));
		int count = baseDao.countByClassNameAndParams(table, whereParams);
		return "count:"+count;
	}

	@Override
	public String findMyUser(String table,String params) {
		// TODO Auto-generated method stub
		Map<String, Object> whereParams= (Map<String, Object>) JSON.parseObject(params);
		List<Object> myUser=baseDao.listByClassNameAndParams(table, whereParams);
		String strUser=JSON.toJSONString(myUser);
		return strUser;
	}

}
