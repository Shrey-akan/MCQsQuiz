package com.mcqs;

public abstract class CalculateMark {
	protected double maximummarks;
	public abstract void marks();
	
	public double calculate(double mark) {
		return (mark/maximummarks)*100;
	}
}
