package com.asg9constructor;

// 1. Create a class Account with member Variable: long accountNo, String customerName. Make them public.

// 2. In main, create a new object of the Account class and print the member variables value.
//    Note – Default constructor is provided by Java to facilitate the creation of a new object.
//    Here variables are assigned default values
// 3. Create default constructor assign new value to all variables. Write SOP I am in default constructor
// 4. In main, create another object of the Account class and print the member variables value. 
//    Note – Since you have defined a (default) constructor, Java does not provide another one.
// 5. Define a constructor which takes all arguments and assigns those values to the member variables. 
//    SOP I am in parameterized constructor
// 6. In main, to create another object of the Account class using the constructor with all arguments and 
//    print the member variable values.
// 7. In main method, create 2 Account objects with different account numbers and names.
//    Then print the values of all the member variables of both the accounts.
// 8. From Account class, comment the default constructor with no arguments and try to
//    create an Account object by calling the default constructor. 
//    Note – If a non-default (non-parameterized) constructor is present in the source code, 
//    Java will not provide a default one. Hence you cannot do Account a = new Account();


public class Account1 {

	public long accountNo;
	public String customerName;

	public Account1() {
		System.out.println("I am in default constructor");
		accountNo = 356189;
		customerName = "Pranay";
	}

	public Account1(long accountNo, String customerName) {
		System.out.println("I am in parameterized constructor");
		this.accountNo = accountNo;
		this.customerName = customerName;
	}

	public static void main(String[] args) {

		Account1 a1 = new Account1();
		System.out.println(a1.accountNo + " : " + a1.customerName); // 0 : null -default values

		System.out.println("----------------");

		Account1 a2 = new Account1();
		System.out.println(a2.accountNo + " : " + a2.customerName);

		System.out.println("----------------");

		Account1 a3 = new Account1(998866, "Vedant");
		System.out.println(a3.accountNo + " : " + a3.customerName);
		
		System.out.println("----------------");

		Account1 a4 = new Account1(112233, "Ram");
		Account1 a5 = new Account1(998877, "Sham");
		System.out.println(a4.accountNo + " : " + a4.customerName);
		System.out.println(a5.accountNo + " : " + a5.customerName);
		

	}

}
