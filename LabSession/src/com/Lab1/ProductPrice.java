package com.Lab1;

import java.util.Scanner;

public class ProductPrice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter quantity");
		int qty = sc.nextInt();

		int price;

		if (qty > 0) {

			if (qty >= 50) {
				price = qty * 100;
				System.out.println("Toatal cost :" + price);
			} else if (qty >= 30) {
				price = qty * 125;
				System.out.println("Toatal cost :" + price);
			} else {
				price = qty * 140;
				System.out.println("Toatal cost :" + price);
			}
		} else {
			System.out.println("Quantity should not be negative no.");
		}
		sc.close();

	}

}
