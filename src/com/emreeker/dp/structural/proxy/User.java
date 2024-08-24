package com.emreeker.dp.structural.proxy;

class User {
	private String username;
	private boolean hasAccess;

	public User(String username, boolean hasAccess) {
		this.username = username;
		this.hasAccess = hasAccess;
	}

	public String getUsername() {
		return username;
	}

	public boolean hasAccess() {
		return hasAccess;
	}
}
