package com.lab11;

import java.util.Scanner;

public class OnlineTypePayment {



	public void payment() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Payment Option : 1.Card or 2.Cash");

		int opt = sc.nextInt();

	
		if (opt == 1) {
			
			System.out.println("Card Payment Option is Selected");
			System.out.println("Enter Option : 1.DebitCard or 2.CreditCard");
			int  subOpt = sc.nextInt();

			if (subOpt == 1) {
				System.out.println("DbitCard option is selected");
				System.out.println("Enter your DebitCard Card number");
				int dcardNum = sc.nextInt();

				System.out.println("Enter your DebitCard Card CVV");
				int dcvv = sc.nextInt();

				System.out.println("Congratulations..Your Payment Done Successfuly");
			} else if (subOpt == 2) {

				System.out.println("CreditCard option is selected");
				System.out.println("Enter your CreditCard PIN");
				int dcardPin = sc.nextInt();

				System.out.println("Congratulations..Your Payment Done Successfuly");
				
			} else {
				System.out.println("Enter valid input");
			}

		} else if (opt == 2) {
			System.out.println("Thanks for doing the Payment");
		} else {
			System.out.println("Enter Valid Input");
		}

	}

	public static void main(String[] args) {

		OnlineTypePayment otp = new OnlineTypePayment();

		otp.payment();
		
		
		//payment();
		
	}

}
