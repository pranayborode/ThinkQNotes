package com.asg5CollectionArraylist;

import java.util.Comparator;

public class SalaryNameComparator implements Comparator<Q28Employee>{

	@Override
	public int compare(Q28Employee e1, Q28Employee e2) {
		
		if(e1.getSalary() == e2.getSalary()) {
			return e2.getName().compareTo(e1.getName());
		}else if (e1.getSalary()>e2.getSalary()) {
			return 1;
		}
		
		return -1;
	}

	

}
