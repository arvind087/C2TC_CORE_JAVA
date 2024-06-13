package com.tnsif.day_eight;

public class ExceptionDemo {
	public static void main(String [] args) {
		
		int arr[];
		
	try //Risky code
		{
			arr = new int[] {10,20,30,40,50};
			System.out.println(arr[16]);
		}
		catch(ArrayIndexOutOfBoundsException a) //Handling code	{		System.err.println(a.getMessage());		System.err.println("array index out of bound please check");		}
	
	finally
	{
		System.out.println("hey i will definitely execute..");
	}
	}
}
