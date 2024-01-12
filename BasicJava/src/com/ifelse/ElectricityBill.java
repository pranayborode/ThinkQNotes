package com.ifelse;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of units consumed:");
		int units = sc.nextInt();

		double billAmount;

		if (units <= 50) {
			billAmount = units * 2;
		} else if (units <= 80) {
			billAmount = (50 * 2) + (units - 50) * 3;
		} else if (units <= 100) {
			billAmount = (50 * 2) + (30 * 3) + (units - 80) * 4;
		} else {
			billAmount = (50 * 2) + (30 * 3) + (20 * 4) + (units - 100) * 7;
		}

		billAmount += 100;
		System.out.println("Toatal Bill is : " + billAmount);
		sc.close();

	}

}
