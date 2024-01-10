package com.asg5CollectionArraylist;

import java.util.Comparator;

public class DepartmentComparator implements Comparator<Q14Employee>{

	@Override
	public int compare(Q14Employee e1, Q14Employee e2) {
		// TODO Auto-generated method stub
		return e1.getDep().getdName().compareTo(e2.getDep().getdName());
	}

	

}
