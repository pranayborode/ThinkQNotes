package com.assignment1;

//9. Write a Java program to convert days into years, weeks and days.

public class ConvertDays {

	public static void main(String[] args) {

		int days = 456;

		int years = (days / 365);
		int remainingDays = (days % 365);

		int weeks = (days / 7);

		System.out.println(years + " Year " + remainingDays + " Days");
		System.out.println(weeks + " Weeks");

	}

}
