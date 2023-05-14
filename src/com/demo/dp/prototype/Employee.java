package com.demo.dp.prototype;

public class Employee implements Prototype{

	@Override
	public Prototype getClone() {
		
		return new Employee();
	}

}
