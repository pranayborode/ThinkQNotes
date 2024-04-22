package com.lab2;

import java.util.Scanner;

public class ATMMachine {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double avlBalence = 10000;
		double amt;

		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.view Balence");

		System.out.println("Enter your option");

		int opt = sc.nextInt();

		switch (opt) {

		case 1:
			System.out.println("Enter amount to Deposit");
			amt = sc.nextDouble();
			avlBalence += amt;
			System.out.println("Your balence is " + avlBalence);
			break;

		case 2:
			System.out.println("Enter amount to Withdraw");
			amt = sc.nextDouble();
			
			if(amt <= avlBalence) {
				avlBalence -= amt;
				System.out.println("Your balence is " + avlBalence);
			}else {
				System.out.println("Enter amount between : "+avlBalence);
			}
			break;
		case 3:
			System.out.println("Your balence is " + avlBalence);
			break;
		default: System.out.println("Enter corect option");	

		}
	

	}

}
