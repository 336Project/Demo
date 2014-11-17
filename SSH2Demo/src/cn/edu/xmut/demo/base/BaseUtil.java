package cn.edu.xmut.demo.base;

import java.util.Map;
import java.util.Set;

public class BaseUtil {
	
	public static String getHqlString(String entityName,Map<String, Object> params){
		StringBuffer sb=new StringBuffer();
		sb.append("from "+entityName);
		if(params!=null){
			sb.append(" where 1=1");
			Set<String> keys=params.keySet();
			for (String key : keys) {
				final Object obj=params.get(key);
				if(obj instanceof String){
					sb.append(" and "+key+"='"+obj+"'");
				}else {
					sb.append(" and "+key+"="+obj);
				}
			}
		}
		return sb.toString();
	}
}
