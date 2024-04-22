package com.lab4;

import java.util.Scanner;

public class DoWhileOperation {

	
	public static void addNum() {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		char ch;
		do {

			System.out.println("Enter First Number");
			num1 = sc.nextInt();
			System.out.println("Enter First Number");
			num2 = sc.nextInt();
			int sum = num1 + num2;

			System.out.println("Sum is " + sum);

			System.out.println("Do you want to do more operation again");

		    ch = sc.next().charAt(0);

		} while (ch == 'Y' || ch == 'y');
	}
	
	public static void main(String[] args) {
		
         addNum();
	}

}
