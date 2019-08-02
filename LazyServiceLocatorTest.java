package com.creational.singleton;

public class LazyServiceLocatorTest {

	public static void main(String[] args) {
		LazyServiceLocator serviceLocator =  LazyServiceLocator.getInstance();
		System.out.println(serviceLocator);

		LazyServiceLocator serviceLocator1 =  LazyServiceLocator.getInstance();
		System.out.println(serviceLocator1);
	}

}
