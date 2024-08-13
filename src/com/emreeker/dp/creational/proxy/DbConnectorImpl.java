package com.emreeker.dp.creational.proxy;

public class DbConnectorImpl implements DbConnector {

	@Override
	public String executeSql(String sql) {
		System.out.println("Executed sql: "+sql);
		return "Result Query of "+sql;
	}

}
