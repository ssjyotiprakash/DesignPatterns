package com.creational.singleton;

public class LazyServiceLocator {

	private static LazyServiceLocator locator;

	private LazyServiceLocator() {
	}

	public synchronized static LazyServiceLocator getInstance() {
		if (locator == null) {
			locator = new LazyServiceLocator();
			return locator;
		} else {
			return locator;
		}
	}
	
	
	/**
	 * Lazy singleton
	 * Eager singleton
	 * Enum singleton
	 * Double check locking
	 * Holder Singleton pattern
	 */
}
