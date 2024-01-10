package com.arraylist1additional;

import java.util.Comparator;

public class DepartmentComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		
		
		return e1.getDep().getdName().compareTo(e2.getDep().getdName());
	}

}
