package com.string1;

//3.	Compare string using new operator when new is present see different reference is there
public class Q3CompareString {

	public static void main(String[] args) {
		
		String s1 = new String("India");
        String s2 = new String("India");
        
        System.out.println(s1==s2); //false
	}

}
