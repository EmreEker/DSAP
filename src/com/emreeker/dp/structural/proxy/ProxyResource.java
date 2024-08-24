package com.emreeker.dp.structural.proxy;

public class ProxyResource implements Resource {
	private RealResource realResource;
	private User user;

	public ProxyResource(String resourceName, User user) {
		this.realResource = new RealResource(resourceName);
		this.user = user;
	}

	@Override
	public void access(User user) {
		if (user.hasAccess()) {
			realResource.access(user);
		} else {
			System.out.println(user.getUsername() + " isimli kullanıcının kaynağa erişim izni bulunmuyor.");
		}
	}
}