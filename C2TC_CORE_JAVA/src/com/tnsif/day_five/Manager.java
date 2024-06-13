package com.tnsif.day_five;

public class Manager extends Employee {
	private int teamsize;

	public int getTeamsize() {
		return teamsize;
	}


	public Manager(String emp_name, int emp_id, int teamsize) {
		super(emp_name, emp_id);
		this.teamsize = teamsize;
	}

	public Manager(String emp_name, int emp_id) {
		super(emp_name, emp_id);
		// TODO Auto-generated constructor stub
	}


	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}


	@Override
	public String toString() {
		return "Manager [Employee_name= " + getEmp_name() + ", Employee_id= " + getEmp_id()
				+", Team_size= " + teamsize + "]";
	}
	
}
