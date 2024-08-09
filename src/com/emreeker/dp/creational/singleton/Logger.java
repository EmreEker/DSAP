package com.emreeker.dp.creational.singleton;

public class Logger {
	private static Logger loggerInstance;
	private final String id;

	private Logger() {
		this.id = "logger id " + this.hashCode();
	}

	public static Logger getInstance() {
		if (loggerInstance == null) {
			synchronized (Logger.class) {
				// Double-checked locking to ensure thread-safe singleton instance creation
				if (loggerInstance == null) {
					loggerInstance = new Logger();
				}
			}
		}
		return loggerInstance;
	}

	public void log(String message) {
		System.out.println("[" + id + "] Log: " + message);
	}
}