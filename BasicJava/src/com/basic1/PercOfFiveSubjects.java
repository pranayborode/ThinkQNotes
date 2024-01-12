package com.basic1;

public class PercOfFiveSubjects {

	public static void main(String[] args) {

		int sub1 = 86;
		int sub2 = 67;
		int sub3 = 88;
		int sub4 = 98;
		int sub5 = 76;

		int sum = sub1 + sub2 + sub3 + sub4 + sub5;
		int totalMarks = 500;
		int perc = ((sum * 100) / totalMarks);
		

		System.out.println(perc + "%");

	}

}
