package com.asg9SetHW;

import java.util.LinkedHashSet;

//7.	Do all above assignments inlinkedhashset.

public class Q7LinkedHashSetExample {

	public static void main(String[] args) {

		LinkedHashSet<Employees> lhs = new LinkedHashSet<>();

		lhs.add(new Employees(102, "Rahul"));
		lhs.add(new Employees(101, "Ganesh"));
		lhs.add(new Employees(103, "Shital"));

		System.out.println(lhs);

		lhs.add(new Employees(101, "Yogesh"));

	}

}
