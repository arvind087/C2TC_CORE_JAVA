package com.tnsif.DayNine;

public class Employee implements Comparable <Employee>{
	private String name;
	private int eid;
	private double salary;
	
	public Employee (String name, int eid, double salary) {
		super();
		this.name =name;
		this.eid= eid;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", eid=" + eid + ", salary=" + salary + "]";
	}
	
	public int compareTo(Employee otherObject) {
		return Integer.compare(this.eid, otherObject.eid);
	}
	
}
