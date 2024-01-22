package com.logical;

public class RemoveDuplicate {

	public static String removeDip(String s) {
		
		String str = "";
		boolean found;
		
		for(int i = 0; i<str.length(); i++) {
			found = false;
			for(int j = i+1; j<str.length(); j++) {
				
				if(s.charAt(i)==str.charAt(j)) {
					found = true;
					break; // no need to iterate further
				}
			}
			if(found == false) {
				str = str+s.charAt(i);
			}
		}
		
		return str;
		
	}
	
	public static void main(String[] args) {
		
		String st = "Book";
		
		System.out.println("Original : "+st);
		
		System.out.println("New : "+removeDip(st));

	}

}
