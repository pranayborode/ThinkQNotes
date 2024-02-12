package com.innerdemo;


class Bank{
	
	private static String bname = "SBI Bank";
	static String bankLoc;
	static String ifscCode;
	String aname;
	int accNo;
	double balance;
	
	static {
		bankLoc = "Pune";
		ifscCode = "SBIN0012";
		
	}
	
	Bank(){
		
	}

	public Bank(String aname, int accNo, double balance) {
		super();
		this.aname = aname;
		this.accNo = accNo;
		this.balance = balance;
	}
	
	void displayBankDetails() {
		System.out.println(bname+" "+bankLoc);
		System.out.println("IFSC Code: "+ifscCode);
	}
	
	class Locker{
		
		int lockerId;
		String pass; 
		static double lockerRent = 2000;
		
		public Locker() {
			// TODO Auto-generated constructor stub
		}

		public Locker(int lockerId, String pass) {
			super();
			this.lockerId = lockerId;
			this.pass = pass;
		}
		
		void displayLockerDetails() {
			displayBankDetails();
			System.out.println("This Locker belongs to: "+aname+" with account no: "+accNo);
			System.out.println("Locker Id: "+lockerId);
			System.out.println("Rent: "+lockerRent);
		}
		
	}
	
}
public class MemberInnerClass {

	public static void main(String[] args) {
		
		// Bank$Locker
		// 1st Way
		Bank cust1 = new Bank("Pranay", 121212, 10000);
		cust1.displayBankDetails();
		System.out.println("------------------------------------");
		
		Bank.Locker locker1 = cust1.new Locker(101, "Pass1234");
		locker1.displayLockerDetails();
		System.out.println("------------------------------------");
		
		Bank.Locker locker2 = new Bank("Reetu",12324, 50000).new Locker(30, "Rani1234");
		locker2.displayLockerDetails();
	}

}
