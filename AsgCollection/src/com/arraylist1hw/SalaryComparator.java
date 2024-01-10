package com.arraylist1hw;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Q1Employee> {

	@Override
	public int compare(Q1Employee e1, Q1Employee e2) {

		if (e1.getSalary() == e2.getSalary()) {
			return 0;
		} else if (e1.getSalary() > e2.getSalary()) {
			return -1;
		} else {
			return 1;
		}

	}

}
