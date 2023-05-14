package com.demo.dp.singleton.demo;

import com.demo.dp.singleton.LazySingleton;

public class SingleDPDemo2 {

	public static void main(String[] args) {
		
		//requesting for the instance first time
		LazySingleton instance1 = LazySingleton.getInstance();
		
		System.out.println(instance1.hashCode());
		
		//requesting for the instance 2nd time
		
		LazySingleton instance2 = LazySingleton.getInstance();
		
		System.out.println(instance2.hashCode());

	}

}
