package com.collectionmethods;
import java.util.*;

public class StackMethod {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		s.push("A"); // to insert an object into the stack
		s.push("B");
		s.push("C");
		s.push(999);
		
		
	    System.out.println(s);
	    
	    s.pop();    // to remove and return top of the stack
	    
	    System.out.println(s);
	    
	    
	    System.out.println(s.peek());  // to return top of the stack without removal.
	    
	    
	    System.out.println(s.empty()); // returns true if stack is empty
	    
	    System.out.println(s.search("A")); //3
	    
	    System.out.println(s.search(5)); //-1

	}

}
