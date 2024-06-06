package com.tnsif.day_seven;

public abstract class Shape {
	
	float area;
	
	abstract void CalcArea(); //no body
	
	void display() {
		System.out.println("Area of this shape-" +area);
	}
}
