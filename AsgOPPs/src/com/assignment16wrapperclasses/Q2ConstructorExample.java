package com.assignment16wrapperclasses;


//2.	Make use of all constuctors of – Byte , Short, Integer , Long , Character , Float , Double , Boolean . 
//Create objects of all above classes using every constructor available in that class

public class Q2ConstructorExample {

	public static void main(String[] args) {

		Byte b1 = new Byte((byte) 42);
		Byte b2 = new Byte("42");

		System.out.println("b1 : " + b1);
		System.out.println("b2 : " + b2);

		Short s1 = new Short((short) 123);
		Short s2 = new Short("123");

		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);

		Integer i1 = new Integer(123);
		Integer i2 = new Integer("123");

		System.out.println("i1 : "+i1);
		System.out.println("i2 : "+i2);
		
		Long l1 = new Long(45454L);
		Long l2 = new Long("45454");

		System.out.println("l1 : "+l1);
		System.out.println("l2 : "+l2);
		
		Float f1 = new Float(55.55f);
		Float f2 = new Float("55.55");
		
		System.out.println("f1 : "+f1);
		System.out.println("f2 : "+f2);
		
		Double d1 = new Double(888.98);
		Double d2 = new Double("888.98");
		
		System.out.println("d1 : "+d1);
		System.out.println("d2 : "+d2);
		
		Character ch1 = new Character('C');
		
		System.out.println("ch1 : "+ch1);
		
		Boolean bul1 = new Boolean(true);
		Boolean bul2 = new Boolean("false");
		
		System.out.println("bul1 : "+bul1);
		System.out.println("bul2 : "+bul2);
		
	}

}
