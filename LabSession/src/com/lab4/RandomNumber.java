package com.lab4;

import java.util.Scanner;

public class RandomNumber {

	
	public static void checkRandomNum() {
		
		Scanner sc = new Scanner(System.in);
		
		int rdmNum = (int) Math.random();
		int num;
		char ch;
		
		do {

			System.out.println("Enter a number");
		     num = sc.nextInt();
			
			if(num == rdmNum) {
				System.out.println("You Guess is correct"+rdmNum);
			}else if(num > rdmNum) {
				System.out.println("Num is Large ");
			}else {
				System.out.println("Num is small");
			}
		    ch = 'y';
		}while(ch == 'y');
		
	}
	
	public static void main(String[] args) {
		checkRandomNum();

	}

}
