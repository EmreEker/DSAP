package com.emreeker.dp.creational.proxy;

import java.util.HashMap;
import java.util.Map;

public class CacheProxy implements DbConnector {
	private DbConnectorImpl dbConnector=new DbConnectorImpl();
	Map<String,String> cache=new HashMap<>();

	@Override
	public String executeSql(String sql) {
		  if (cache.containsKey(sql)) {
	            System.out.println("Cached result for query: " + sql);
	            return cache.get(sql);
	        } else {
	            String result = dbConnector.executeSql(sql);
	            cache.put(sql, result);
	            return result;
	        }
	}

}
