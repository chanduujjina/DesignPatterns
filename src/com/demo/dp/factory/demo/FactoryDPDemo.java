package com.demo.dp.factory.demo;


import com.demo.dp.factory.BaseForm;
import com.demo.dp.factory.FormFactory;

public class FactoryDPDemo {

	public static void main(String[] args) {
		
		BaseForm baseForm1 = FormFactory.getInstance("PEX");
		baseForm1.addForm();
		
		BaseForm baseForm2 = FormFactory.getInstance("ADE");
		baseForm2.addForm();

	}

}
