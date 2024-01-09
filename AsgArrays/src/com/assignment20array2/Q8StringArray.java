package com.assignment20array2;



//8. WAJP2 add elements to a string array  
//9. WAJP2 print elements of array. 

public class Q8StringArray {

	public static void printElements(String name[]) {
		
		for(String n : name) {
			System.out.print(n +"  ");
		}
		
	}
	
	public static void main(String[] args) {
		
		String name[] = new String[5];
		
		name[0] ="Pranay";
		name[1] = "Rahul";
		name[2] = "Tanmay";
		name[3] = "Shraddha";
		name[4] = "Sahil";
		
		printElements(name);
		
		

	}

}
