package com.asg6CollectionMasterAssignment;

import java.util.HashSet;

public class Q7Employee {

	public String name;

	@Override
	public int hashCode() {
		return 31;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}

	public static void main(String args[]) {
		Q7Employee employeeOne = new Q7Employee();
		Q7Employee employeeTwo = new Q7Employee();

		employeeOne.name = "John";
		employeeTwo.name = "Martin";

		HashSet employeeSet = new HashSet();

		employeeSet.add(employeeOne);
		employeeSet.add(employeeTwo);

		System.out.println(employeeSet.size());
		// If size is 2 justify and if size is 1 justify
	}
}
