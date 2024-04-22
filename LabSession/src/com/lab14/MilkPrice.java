package com.lab14;

import java.util.Scanner;

//The price of milk is increasing because of a strike. 
//Every day of the strike the price increases by the number of days of the strike. 
//For e.g. if the price of the milk is 40 rs.
//Day 1: 40 + 1 = 41
//Day 2: 41 + 2 = 43
//Day 3: 43 + 3 = 46
//The price of milk is 47 rs. today. 
//Write a program that prints the price of milk on every weekend (7th day) for 4 weeks

public class MilkPrice {

	public static void printPrice() {

		int originalPrice = 40;
		int noOfWeeks = 4;
		int days = 1;

		for (int i = 1; i <= noOfWeeks; i++) {

			for (int j = 1; j <= 7; j++) {

				originalPrice += j;
				days = 7 * i;

				if (j == 7) {
					System.out.println("Week " + i + ", Day " + days + ", : Price of Mik = " + originalPrice + "Rs");

				}

			}

		}

	}

	public static void main(String[] args) {

		printPrice();

	}

}
