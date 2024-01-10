package com.assignment1;

// 15. Write a Java program to enter marks of five subjects and calculate total, average and percentage.

public class ProgressReport {

	public static void main(String[] args) {

		double sub1, sub2, sub3, sub4, sub5;

		sub1 = 87;
		sub2 = 58;
		sub3 = 89;
		sub4 = 97;
		sub5 = 77;

		double total = sub1 + sub2 + sub3 + sub4 + sub5;

		double average = total / 5;

		double perc = (total * 100) / 500;

		System.out.println("Total marks : " + total);
		System.out.println("Average marks : " + average);
		System.out.println("Percentage : " + perc + " %");

	}

}
