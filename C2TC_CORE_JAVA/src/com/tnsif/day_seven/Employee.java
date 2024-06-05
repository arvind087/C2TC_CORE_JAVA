package com.tnsif.day_seven;

public class Employee {
		private String name;
		private int id;
		static private String company_name = "TNSIF";
		
		
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", CompanyName=" + company_name + "]";
	}
	
}
