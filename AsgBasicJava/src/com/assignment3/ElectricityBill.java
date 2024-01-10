package com.assignment3;

import java.util.Scanner;

//11. Write a Java program to input electricity consumption unit and calculate totalelectricity billaccording to the given 
//condition: For first 50 units Rs. 0.50/unit For next 100 units Rs. 0.75/unit For next 100 units Rs. 1.20/unit For unit 
//above 250 Rs. 1.50/unit An additional surcharge of 20% is added to the bill 

public class ElectricityBill {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the electricity consumption unit :");

		int units = sc.nextInt();

		double totalBill = 0;

		if (units <= 50) {
			totalBill = units * 0.50;
		} else if (units <= 150) {
			totalBill = (50 * 0.50) + ((units - 50) * 0.75);
		} else if (units <= 250) {
			totalBill = (50 * 0.50) + (100 * 0.75) + ((units - 150) * 1.20);
		} else {
			totalBill = (50 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((units - 250) * 1.50);
		}

		double surcharge = 0.20 * totalBill;

		totalBill += surcharge;

		System.out.println("Total Electricity Bill : " + totalBill);
		sc.close();
	}

}
