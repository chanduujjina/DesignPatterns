package com.demo.dp.factory;

public class FormFactory {
	
	public static BaseForm getInstance(String type) {
		if(type.equals("PEX")) {
			return new PEXForm();
		}
		else if(type.equals("ADE")) {
			return new ADEForm();
		}
		return null;
	}

}
