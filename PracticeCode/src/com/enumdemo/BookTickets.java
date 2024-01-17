package com.enumdemo;

import java.util.Scanner;

public class BookTickets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose ticket type: ");
		System.out.println("1. Standard: " + MovieSeates.STANDARD.price);
		System.out.println("2. Premium : " + MovieSeates.PREMIUM.price);
		System.out.println("3. REcliner: " + MovieSeates.RECLINER.price);

		int seatType = sc.nextInt();

		System.out.println("Enter number of seates: ");

		int n = sc.nextInt();

		MovieSeates ms = null;

		switch (seatType) {

		case 1:
			ms = MovieSeates.STANDARD;
			break;
		case 2:
			ms = MovieSeates.PREMIUM;
			break;
		case 3:
			ms = MovieSeates.RECLINER;
			break;
		default:
			System.out.println("Error...");
			System.exit(0);

		}

		System.out.println("--------------------------------------");
		System.out.println("Ticket type:"+ms);
		//System.out.println("Price of one ticket:"+ms.price);
		System.out.println("Total tickets:"+n);		
		System.out.println("Total price:"+(n*(ms.price)));
		
		sc.close();

	}

}
