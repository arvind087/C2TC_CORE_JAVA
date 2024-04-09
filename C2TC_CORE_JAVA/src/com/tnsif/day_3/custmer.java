package com.tnsif.day_3;

public class custmer {
	private int customerId;
	private String customerName;
	private String customerCity;
	
	
	
	//Default Constructor
	
	
	public customer() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Hello friends I am Default Constructor");
	}
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "[customerId=" + customerId + ", customerName=" + customerName + ", customerCity="
				+ customerCity + "]";
	}



	//Parameterized Constructors

	public customer(int customerId, String customerName, String customerCity) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerCity = customerCity;
		System.out.println("Hello friends I am Parameterized Constructor");
	}





	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
}
