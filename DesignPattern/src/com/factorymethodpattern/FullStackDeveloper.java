package com.factorymethodpattern;

import java.util.Arrays;

public class FullStackDeveloper extends Developer{
	
	
	public FullStackDeveloper() {
		// TODO Auto-generated constructor stub
	}
	
	public FullStackDeveloper(String name) {
		super(name);
	}

	
	
	@Override
	public void salaryPaid() {
		salary = 125000;
		
	}

	@Override
	public void skillSet() {
		
		String skills[] = {"Java","Angular","AWS", "SQL", "Hibernate","JDBC"};
		System.out.println(Arrays.toString(skills));
		
	}

	
}
