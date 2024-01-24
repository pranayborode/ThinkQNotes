package com.factorymethodloan;

public abstract class Loan {

	String bname;
	String loanType;
	float irate;
	
	
	public Loan() {
		// TODO Auto-generated constructor stub
	}
	
	public Loan(String bname) {
		this.bname = bname;
	}
	

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public abstract void loanType();
	public abstract void interestRate();
	
	
	
}
