package com.ternaryy;

import java.util.Scanner;

public class ThreeNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int largNumber = (num1 > num2)?((num1 > num2)? num1:num2):((num2>num3)? num2 : num3);
		System.out.println(largNumber);
	

	}

}
