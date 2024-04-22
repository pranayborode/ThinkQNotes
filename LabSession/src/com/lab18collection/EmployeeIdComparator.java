package com.lab18collection;

import java.util.Comparator;

public class EmployeeIdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {

		if (e1.geteId() == e2.geteId()) {
			return 0;
		} else if (e1.geteId() < e2.geteId()) {
			return -1;
		} else {
			return 1;
		}

	}

}
