package com.lab18collection;

import java.util.Comparator;

public class SearchEmpNameByAscending implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {

		return e1.geteName().compareTo(e2.geteName());
	}

}
