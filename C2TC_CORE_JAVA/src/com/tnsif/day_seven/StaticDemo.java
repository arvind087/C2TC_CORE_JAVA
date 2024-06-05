package com.tnsif.day_seven;

public class StaticDemo {
	static int serialNO;
	int section;
	
	static {
		System.out.println("i am static block");
		serialNO = 1000;
	}

	public StaticDemo() {
		System.out.println("i am default constructor block");
		section++;
		serialNO++;
	}

	@Override
	public String toString() {
		return "StaticDemo [section=" + section + " serialNO=" +serialNO+ "]";
	}
	
	static void display() {
		System.out.println("Serial no= "+serialNO);
	}
	
}
