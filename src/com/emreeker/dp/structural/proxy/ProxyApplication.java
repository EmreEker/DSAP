package com.emreeker.dp.structural.proxy;

public class ProxyApplication {
	public static void main(String[] args) {
		User adminUser = new User("admin", true);
		User regularUser = new User("user", false);

		Resource proxyResource = new ProxyResource("confidential_data.txt", adminUser);
		proxyResource.access(adminUser);
		proxyResource.access(regularUser);
	}
}
