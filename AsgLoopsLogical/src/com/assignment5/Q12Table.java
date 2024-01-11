package com.assignment5;

import java.util.Scanner;


//12 WAP to print table of given no
public class Q12Table {

	public static void printTable(int num) {

		for (int i = 1; i <= 10; i++) {

			System.out.println(num + " x " + i + " = " + (num * i));
		}
	}

	public static void main(String[] args) {

		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		printTable(n);

		sc.close();
	}

}
