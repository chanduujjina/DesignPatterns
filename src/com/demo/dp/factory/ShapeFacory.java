package com.demo.dp.factory;

public class ShapeFacory {
	
	public static Shape getInstance(String type) {
		
		if(type.equals("square")) {
			return new Square();
		}
		else if(type.equals("rectangle")) {
			return new Rectangle();
		}
		
		return null;
	}

}
