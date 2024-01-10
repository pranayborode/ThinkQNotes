package com.asg5CollectionMap;

import java.util.HashMap;

//70. Show use of putifabsent method of map. 
public class Q70ShowUseOFPutIfAbsent {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		hm.put("Pranay", 79);
		hm.put("Rahul", 68);
		hm.put("Gaurav", 77);
		hm.put("Ankita", 89);
		
	    System.out.println(hm);
	    
	    hm.putIfAbsent("Arpit", 88);
	    
	    System.out.println(hm);
	    
	    hm.putIfAbsent("Gaurav", 99);
	    
	    System.out.println(hm);
	    
	    hm.putIfAbsent("Riya", null);
	    
	    System.out.println(hm);
	    
		

	}

}
