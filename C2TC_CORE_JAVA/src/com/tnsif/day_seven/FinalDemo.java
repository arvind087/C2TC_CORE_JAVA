package com.tnsif.day_seven;

public class FinalDemo {
	public static void main (String [] args) {
		final float pi= 3.14f; // constant value
	}
}

//Inheritance 

//final demonstration on method
class parent{
	void property() {
		System.out.println("nothing!!!");
	}
	
	final void marry() {
		System.out.println("xyz");
	}
}

class child extends parent{
	
	void marry() {
		System.out.println("abc");
	}
	
}


//final demonstration on class
final class Parent{
	void property() {
		System.out.println("nothing!!!");
	}
	
	void marry() {
		System.out.println("xyz");
	}
}

class Child extends parent{
	
	void marry() {
		System.out.println("abc");
	}
	
}