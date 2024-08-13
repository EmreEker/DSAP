package com.emreeker.dp.creational.proxy;

public class ProxyApplication {

	public static void main(String[] args) {
		DbConnector connector = new CacheProxy();

		System.out.println(connector.executeSql("SELECT * FROM employee WHERE id=1"));

		System.out.println(connector.executeSql("SELECT * FROM employee WHERE id=1"));

	}

}
