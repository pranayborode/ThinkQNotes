package com.asg7opps;

import java.util.Scanner;

public class NationalGame {

	
	private String nationalGame;

	public void findNationalGame(String country) {

		String lowerCaseCountry = country.toLowerCase();

		switch (lowerCaseCountry) {

		case "india":
			nationalGame = "Hockey";
			break;
		case "china":
			nationalGame = "Table Tennis";
			break;
		case "bangladesh":
			nationalGame = "Kabaddi";
			break;
		case "italy":
			nationalGame = "Football";
			break;
		case "united states":
			nationalGame = "Baseball";
			break;
		default:
			nationalGame = "Information not available";
		}

		System.out.println("National Game of " + lowerCaseCountry + " is " + nationalGame);
	}

	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the name of a country: ");
		System.out.println("India, China, Bangladesh, Italy, United States");
		String country = sc.next();

		NationalGame obj = new NationalGame();

		obj.findNationalGame(country);

		sc.close();
	}

}
