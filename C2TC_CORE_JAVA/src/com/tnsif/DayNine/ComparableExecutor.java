package com.tnsif.DayNine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExecutor {
		
	public static void main(String[] args){
		
		List<Employee> emps= new ArrayList<Employee>();
		
		emps.add(new Employee("Arvind", 25, 100000.0));
		
		emps.add(new Employee("Harshad", 1, 400000.0));
		
		emps.add(new Employee("Ranjan", 7, 800000.0));
		
		emps.add(new Employee("Epili", 14, 500000.0));
		
		// Unsorted 
		System.out.println("details in unorder form of eid");
		emps.forEach(System.out::println);
		
		//sorted order
			Collections.sort(emps);
			System.out.println("**********");
			System.out.println("details in order form of eid");
			emps.forEach(System.out::println);
			
			System.out.println("**********");
			Collections.sort(emps, new NameComparator());
			System.out.println("details in order form of Name");
			emps.forEach(System.out::println);
	}
}