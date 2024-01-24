package com.factorymethodpattern;

public abstract class Developer {

	String name;
	float salary;
	int noOfHours;

	public Developer() {

	}

	public Developer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void salaryPaid();
	public abstract void skillSet();
	
	public void workingHours() {
		noOfHours = 8;
	}
}
