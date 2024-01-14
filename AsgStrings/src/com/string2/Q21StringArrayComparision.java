package com.string2;

//21. String str1={"mamta@gmail.com", "pratik@gmail.com","vivek@gmail.com"}
//
//String str2={"pratik@gmail.com","vivek@gmail.com","priya@gmail.com","bhushan@gmail.com"}
//result: unique elements of str2 duplicate elements


public class Q21StringArrayComparision {
	
	static void uniqueString(String s1[], String s2[]) {
		
		boolean found;
		
		for(String s : s2) {
			
			found = false;
			for(String st : s1) {
				
				if(s.equals(st)) {
					found = true;
					break;
				}
			}
			if(!found)
			{
				System.out.println(s);
			}
		}
	}

	public static void main(String[] args) {
		
		String str1[] = {"mamta@gmail.com", "pratik@gmail.com","vivek@gmail.com"};
		String str2[] = {"pratik@gmail.com","vivek@gmail.com","priya@gmail.com","bhushan@gmail.com"};
		
		uniqueString(str1, str2);

	}

}
	