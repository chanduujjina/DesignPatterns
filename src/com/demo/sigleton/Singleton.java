package com.demo.sigleton;

public class Singleton {
	
	private static Activity activity = new Activity();
	
	//to restrict to create object from outside
	private Singleton() {
		
	}
	
	static {
		activity.setActivityId(1);
		activity.setActivityName("test");
		activity.setActivityType("testType");
	}

	public static Activity getInstance() {
		return activity;
	}
	
}
