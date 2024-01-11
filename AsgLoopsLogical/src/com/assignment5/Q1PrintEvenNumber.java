package com.assignment5;

//1. WAP to print even numbers from 121 to 229 using for loop. 

public class Q1PrintEvenNumber {

	public static void main(String[] args) {

		for (int i = 121; i <= 229; i++) {

			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

}
