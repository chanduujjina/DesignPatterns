package com.demo.dp.singleton.demo;

public class EarlySingleton {
	
	private static EarlySingleton singleton = new EarlySingleton();
	
	private EarlySingleton() {
		
	}
	
	public static EarlySingleton getInstance() {
		return singleton;
	}

}
