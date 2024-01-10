package com.asg2comparator;

import java.util.Comparator;

public class NameAgeComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.getName() == s2.getName()) {

			return Integer.compare(s1.getAge(), s2.getAge());

		} else if (s1.getName().compareTo(s2.getName()) > 0) {
			return -1;
		}
		return 0;
	}

}
