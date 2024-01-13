package com.asg7opps;

// 12) Write a program to copy values of one object into another by assigning the values of one object into another.

public class Q12ObjectCopy {

	public static void main(String[] args) {

		Q11Student1 s1 = new Q11Student1();

		s1.setRollNo(101);
		s1.setStdName("Pranay");
		s1.setAge(18);

		Q11Student1 s2 = new Q11Student1();

		s2 = s1;

		System.out.println("Roll Number : " + s2.getRollNo());
		System.out.println("Name        : " + s2.getStdName());
		System.out.println("Age         : " + s2.getAge());

	}

}
