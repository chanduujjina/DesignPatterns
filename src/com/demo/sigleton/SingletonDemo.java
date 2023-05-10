package com.demo.sigleton;

public class SingletonDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		//requesting first time for the object
		Activity instance = Singleton.getInstance();
		
		System.out.println(instance.hashCode());
		
		Activity instance2 = Singleton.getInstance();
		
		System.out.println(instance2.hashCode());
		
		System.out.println(instance2);
		
		
		Activity instance3 = Singleton.getInstance();
		
		System.out.println("requesting 3r time::"+instance3.hashCode());
		
		
		Activity instance4 = (Activity)instance3.clone();
		
		System.out.println("hash code after cloning::"+instance4.hashCode());
	}

}
