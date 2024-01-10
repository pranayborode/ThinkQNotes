package com.asg2comparator;

import java.util.Comparator;

public class RollNoComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getRollNo() == s2.getRollNo()) {
			return 0;
		}else if (s1.getRollNo() > s2.getRollNo()) {
			return 1;
		}
		return -1;
	}

}
