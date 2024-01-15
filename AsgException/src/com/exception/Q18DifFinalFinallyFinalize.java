package com.exception;

//18.  WAP to show the difference between final, finally, finalize. 
public class Q18DifFinalFinallyFinalize {

	final int age = 18;

	void display() {
		// age = 55; //The final field Q18DifFinalFinallyFinalize.age cannot be assigned
	}

	public static void main(String[] args) {

		Q18DifFinalFinallyFinalize obj = new Q18DifFinalFinallyFinalize();

		obj.display();
		// Exception in thread "main" java.lang.Error: Unresolved compilation problem:
		// The final field Q18DifFinalFinallyFinalize.age cannot be assigned

		try {
			System.out.println("Inside try block");
			int result = 10 / 0;
			System.out.println(result);

		} catch (ArithmeticException e) {
			System.out.println(e);
		}

		finally {
			System.out.println("Finally Block");
		}

		System.out.println("Rest of code...");

		//////////////////////////////////////////////////////////////////////

		System.out.println(obj.hashCode());

		obj = null;

		System.gc();
		System.out.println("End of the garbage collection");

	}

	protected void finalize() {
		System.out.println("finalize() method");

	}
}
