package com.asg2comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getName()== s2.getName()) {
			return 0;
		}else if (s1.getName().compareTo(s2.getName())>0) {
			return 1;
		}
		return -1;
	}

	

}
