package com.wordslogical;

import java.util.Arrays;

public class SplitMethod {
	
	public static void main(String[] args) {
		
		String s1="I love to\t learn Java";
		
		//String st[]=s1.split("\\s");
		//String st[]=s1.split(" ");
		String st[]=s1.split("\t");
		
		System.out.println(Arrays.toString(st));
		
		String s2="I love Java. I study in ThinkQuotient";
		
        String str[]=s2.split("\\.");
		
		System.out.println(Arrays.toString(str));
		
		
	}

}
