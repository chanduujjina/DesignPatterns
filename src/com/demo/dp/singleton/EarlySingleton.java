package com.demo.dp.singleton;

import java.io.Serializable;

public class EarlySingleton implements Cloneable,Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static EarlySingleton singleton = new EarlySingleton();
	
	private EarlySingleton() {
		
	}
	
	public static EarlySingleton getInstance() {
		return singleton;
	}
	
	@Override
	 public  Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	 }
	
	
	public Object readResolve() {
		return singleton;
	}

}
