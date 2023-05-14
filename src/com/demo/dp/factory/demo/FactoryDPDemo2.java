package com.demo.dp.factory.demo;

import com.demo.dp.factory.Shape;
import com.demo.dp.factory.ShapeFacory;

public class FactoryDPDemo2 {

	public static void main(String[] args) {
		
		Shape instance1 = ShapeFacory.getInstance("square");
		instance1.drawShape();
		
		Shape instance2 = ShapeFacory.getInstance("rectangle");
		
		instance2.drawShape();

	}

}
