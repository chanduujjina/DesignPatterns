package com.demo.dp.singleton.demo;

import com.demo.dp.singleton.EarlySingleton;

public class SingleDPDemo {

	public static void main(String[] args) {
		
		//requesting for the instance first time
		EarlySingleton instance1 = EarlySingleton.getInstance();
		
		System.out.println(instance1.hashCode());
		
		//requesting for the instance 2nd time
		
		EarlySingleton instance2 = EarlySingleton.getInstance();
		
		System.out.println(instance2.hashCode());

	}

}
