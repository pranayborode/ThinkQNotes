package com.basic2;

public class ConvertDays {

	public static void main(String[] args) {

		int days = 465;

		int year = days / 365;

		int remDays = days % 365;
		
		int weeks = days / 7;
		
		System.out.println(year+" Year "+remDays+" Days");
		System.out.println(weeks+" Weeks");

	}

}
