package com.demo.dp.builder.demo;

import com.demo.dp.builder.Activity;

public class BuilderDpDemo {

	public static void main(String[] args) {
		
		Activity activity1 = new Activity.ActivityBulder().actirivtyType("testType").activityName("test activity").id(1).build();
		System.out.println(activity1);
		
		
		Activity activity2 = new Activity.ActivityBulder().actirivtyType("testType1").activityName("test activity1").id(2).build();
		System.out.println(activity2);
		

	}

}
