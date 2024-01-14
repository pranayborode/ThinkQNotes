package com.string1;

//6.	Write a Java program to compare two strings.
public class Q6CompareTwoStrings {

	public static void main(String[] args) {
		
		String s1 = "India";
		String s2 = "India";
		
		String s3 = new String("India");
        String s4 = new String("India");
        
        System.out.println(s1==s2);       //true  //id is same
        System.out.println(s1.equals(s2));//true  //value is same
        
        System.out.println("----------------------------------------");
        
        System.out.println(s3==s4);       //false  //id is not same
        System.out.println(s3.equals(s4));//true   //value is same
        
        System.out.println("----------------------------------------");
        
        System.out.println(s1==s3);          //false  //id is not same
        System.out.println(s1.equals(s3));   //true   //value is same
        
        
        
	}

}
