package com.emreeker.dp.creational.singleton;

public class SingletonApplication {
	public static void main(String[] args) {
		ProductService productService = new ProductService();
		UserService userService = new UserService();
		productService.addProduct("iphone", 5);
		userService.addUser("Emre");
	}
}

class ProductService {
	Logger logger = Logger.getInstance();

	public void addProduct(String productName, int quantity) {
		logger.log("Adding product: " + productName + " with quantity: " + quantity);
		logger.log("Product added successfully: " + productName);
	}
}

class UserService {
	Logger logger = Logger.getInstance();

	public void addUser(String username) {
		logger.log("Registering user: " + username);
		logger.log("User registered successfully: " + username);
	}
}