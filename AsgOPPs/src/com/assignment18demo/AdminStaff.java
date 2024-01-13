package com.assignment18demo;

import com.assignment18abstractinterface.Employees;
import com.assignment18abstractinterface.Wify;

public class AdminStaff {

	private int adminId;
	private String adminName;
	private Wify wify;

	public AdminStaff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdminStaff(int adminId, String adminName, Wify wify) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.wify = wify;
	}

	
	@Override
	public String toString() {
		return "AdminStaff : adminId=" + adminId + ", adminName=" + adminName + ", \n" + wify;
	}

	public static void main(String[] args) {
		
		Wify w2 = new Wify("Jio fiber", "Admin@1234");
		AdminStaff as1 = new AdminStaff(201, "Nitin",w2 );
		System.out.println(as1);

	}

}
