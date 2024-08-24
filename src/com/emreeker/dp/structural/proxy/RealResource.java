package com.emreeker.dp.structural.proxy;

public class RealResource implements Resource {
	private String resourceName;

	public RealResource(String resourceName) {
		this.resourceName = resourceName;
	}

	@Override
	public void access(User user) {
		System.out.println(user.getUsername() + " isimli kullanıcı, " + resourceName + " kaynağına erişebilir.");
	}
}