package com.creational.singleton;

public class DoubleCheckServiceLocator {
	
	private static  DoubleCheckServiceLocator locator=null;
	
	private DoubleCheckServiceLocator() {
		
	}
	
	public static DoubleCheckServiceLocator getInstance() {
		if(locator==null) {
			synchronized (DoubleCheckServiceLocator.class) {
                if (locator == null) {        // Double checked
                    locator= new DoubleCheckServiceLocator();
                }
            }
		}
		return locator;
	}
}