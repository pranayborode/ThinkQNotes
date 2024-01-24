package com.factorymethodloan;

public class HomeLoan extends Loan {
	
	public HomeLoan() {
		// TODO Auto-generated constructor stub
	}
	
	public HomeLoan(String name) {
		super(name);
	}

	@Override
	public void loanType() {
		
		loanType = "HomeLoan";
	}

	@Override
	public void interestRate() {
		irate = 9.5f;
		
	}
	


	
}
