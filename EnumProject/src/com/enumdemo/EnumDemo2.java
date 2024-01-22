package com.enumdemo;

enum Season {
	WINTER, SUMMER, SPRING, MONSOON
};

public class EnumDemo2 {

	public static void main(String[] args) {

		Season s = Season.SUMMER;

		switch (s) {

		case WINTER:
			System.out.println("woolen cloths");
			break;
		case SPRING:
			System.out.println("Full sleeves cloths");
			break;
		case SUMMER:
			System.out.println("Cotton cloths");
			break;
		case MONSOON:
			System.out.println("Carry umberalla");
			break;
		default:
			System.out.println("error...");
		}

	}

}
