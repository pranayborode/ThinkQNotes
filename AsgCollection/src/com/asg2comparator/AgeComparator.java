package com.asg2comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getAge() == s2.getAge()) {
			return s1.getName().compareTo(s2.getName());
		}else if (s1.getAge()>s2.getAge()) {
			return 1;
		}
		return -1;
	}

}
