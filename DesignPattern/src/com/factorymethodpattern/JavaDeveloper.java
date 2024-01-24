package com.factorymethodpattern;

import java.util.Arrays;

public class JavaDeveloper extends Developer{
	
	
	public JavaDeveloper() {
		// TODO Auto-generated constructor stub
	}
	
	public JavaDeveloper(String name) {
		super(name);
	}

	
	
	@Override
	public void salaryPaid() {
		salary = 75000f;
		
	}

	@Override
	public void skillSet() {
		
		String skills[] = {"Core Java", "SQL", "JDBC"};
		System.out.println(Arrays.toString(skills));
		
	}

	
}
