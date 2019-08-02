package com.creational.singleton;

public class EagerServiceLocatorTest {

	public static void main(String[] args) {
		EagerServiceLocator serviceLocator =  EagerServiceLocator.getInstance();
		System.out.println(serviceLocator);

		EagerServiceLocator serviceLocator1 =  EagerServiceLocator.getInstance();
		System.out.println(serviceLocator1);
	}

}
