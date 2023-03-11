package com.mcqs;

public class CentralizeClass {
	public CalculateMark getClass(String cal) {
		if(cal==null) {
			return null;
		}
		if(cal=="marks") {
			return new Maximum();
		}
		
		return null;
	}
}
