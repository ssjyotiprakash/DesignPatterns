package com.creational.singleton;

public class DoubleCheckServiceLocatorTest {

	public static void main(String[] args) {
		
		DoubleCheckServiceLocator locator1=DoubleCheckServiceLocator.getInstance();
		DoubleCheckServiceLocator locator2=DoubleCheckServiceLocator.getInstance();
		
		System.out.println(locator1);
		System.out.println(locator2);

	}

}
