package com.asg6CollectionMasterAssignment;

import java.util.HashSet;

public class Q6Employee {

	public String name;

	public int hashCode() {
		return 31;
	}

	public boolean equals(Object obj) {
		Q6Employee e = (Q6Employee) obj;
		return this.name.equals(e.name);
	}

	public static void main(String args[]) {
		Q6Employee employeeOne = new Q6Employee();
		Q6Employee employeeTwo = new Q6Employee();

		employeeOne.name = "John";
		employeeTwo.name = "Martin";

		HashSet employeeSet = new HashSet();

		employeeSet.add(employeeOne);
		employeeSet.add(employeeTwo);

		System.out.println(employeeSet.size());
		// If size is 2 justify and if size is 1 justify
	}

}
