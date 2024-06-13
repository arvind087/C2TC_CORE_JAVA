package com.tnsif.day_eight;

import java.util.Scanner;

public class UserDefineException {
	
	public static void main(String[] args) 
	{
		int age;
		System.out.println("Enter the age");
		
		Scanner s = new Scanner (System.in);
		age = s.nextInt();
		
		if(age<18)
		{
			throw new CantVote("You can not vote");
		}
		else 
		{
			System.out.println("You can vote");
		}
	}
}

class CantVote extends RuntimeException
{

	public CantVote(String s) {
		super(s);  //printStackTrace()
	}

	
}