package com.demo.dp.singleton;

public class LazySingleton {
	
	private static LazySingleton lazySingleton;
	
	public static LazySingleton getInstance() {
		if(lazySingleton == null) {
			lazySingleton = new LazySingleton();
		}
		return lazySingleton;
	}

}
