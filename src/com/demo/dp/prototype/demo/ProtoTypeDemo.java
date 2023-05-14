package com.demo.dp.prototype.demo;

import com.demo.dp.prototype.Employee;

public class ProtoTypeDemo {

	public static void main(String[] args) {
	
		Employee emp1 = new Employee();
		
		Employee emp2 = (Employee)emp1.getClone();
		
		System.out.println(emp1.hashCode());
		
		System.out.println(emp2.hashCode());

	}

}
