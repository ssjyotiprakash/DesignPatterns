package com.creational.singleton;

public class EagerServiceLocator {

	private static final EagerServiceLocator locator = new EagerServiceLocator();

	private EagerServiceLocator() {
	}

	public synchronized static EagerServiceLocator getInstance() {
		return locator;
	}
	
	
	/**
	 * Lazy singleton
	 * Eager singleton
	 * Enum singleton 
	 * Double check locking
	 * Holder pattern
	 */
}
