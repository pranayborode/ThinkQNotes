package com.ternaryy;

public class TernaryDemo {

	public static void main(String[] args) {
		
		int age = 13;
		
		if(age >=18) {
			System.out.println("Vote");
		}else {
			System.out.println("Can't Vote");
		}
		
		boolean status   = (age >=18?"can vote" != null: "Can't vote" != null);
		System.out.println(status);
		
		int num = 34;
		System.out.println(num%2==0? "Even": "Odd");

	}

}
