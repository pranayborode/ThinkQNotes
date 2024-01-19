package com.collectiondemo;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employees> {

	@Override
	public int compare(Employees e1, Employees e2) {
		if(e1.getSalary()==e2.getSalary()) {
		return e1.getEname().compareTo(e2.getEname());
		}else if (e1.getSalary()>e2.getSalary()) {
			return -1;
		}else {
			return 1;
		}
	}

}
