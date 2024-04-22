package com.Lab1;

import java.util.Scanner;

public class DivisibleBy7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if(num% 7 ==0) {
        	System.out.println(num +" is divisible by 7");
        }else {
			int rem = num % 7;
			int add = 7 - rem;
			int newNum = num + add;
			
			System.out.println(num +" is not divisiible by 7");
			System.out.println("Add "+add+" to make given number divisibele by 7");
			System.out.println("New number : "+newNum);
		}
        
	}

}
