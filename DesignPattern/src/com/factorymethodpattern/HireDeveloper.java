package com.factorymethodpattern;

import java.util.Scanner;

public class HireDeveloper {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the developer to higher: (Java, Python, FullStack)");

		String dtype = sc.next();
		
		GetDeveloperType gd = new GetDeveloperType();
		
		Developer d = gd.getDeveloper(dtype);
		
		if(d==null) {
			System.out.println("No such developer exists....");
		}else {
			System.out.println("Enter the employee name: ");
			d.setName(sc.next());
			
			System.out.println("--------------------------------------");
			
			System.out.println("Welcome to Company "+d.getName());
			d.salaryPaid();
			System.out.println("Salary: "+d.salary);
			d.workingHours();
			System.out.println("Working Hours: "+d.noOfHours);
			
			System.out.println("Skill Set");
			d.skillSet();
			System.out.println("--------------------------------------");
			
		}
	}

}
