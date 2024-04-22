package com.lab18collection;

public class Employee implements Comparable<Employee> {

	private int eId;
	private String eName;
	private double eSal;
	private Department edept;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eId, String eName, double eSal, Department edept) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSal = eSal;
		this.edept = edept;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public double geteSal() {
		return eSal;
	}

	public void seteSal(double eSal) {
		this.eSal = eSal;
	}

	public Department getEdept() {
		return edept;
	}

	public void setEdept(Department edept) {
		this.edept = edept;
	}

	@Override
	public String toString() {
		return "Employee : eId=" + eId + ", eName=" + eName + ", eSal=" + eSal + ", " + edept;
	}

//	@Override
//	public int compareTo(Employee e) {
//		if (this.geteId() == e.geteId()) {
//			return 0;
//		} else if (this.geteId() < e.geteId()) {
//
//			return -1;
//
//		} else {
//			return 1;
//		}
//	}

//	@Override
//	public int compareTo(Employee e) {
//		if (this.geteSal() == e.geteSal()) {
//			return 0;
//		} else if (this.geteSal() < e.geteSal()) {
//
//			return -1;
//
//		} else {
//			return 1;
//		}
//	}

//	@Override
//	public int compareTo(Employee e) {
//		if (this.geteName().equals(e.geteName())) {
//			return 0;
//		} else if (this.geteName().compareTo(e.geteName())<0) {
//
//			return -1;
//
//		} else {
//			return 1;
//		}
//	}
	
	@Override
	public int compareTo(Employee e) {
		if (this.getEdept().getDepName().equals(e.getEdept().getDepName())) {
			
			if(this.geteSal() == e.geteSal()) {
				return 0;
			}else if (this.geteSal() > e.geteSal()) {
				return 1;
			}else {
				return-1;
			}
			
		} else if (this.getEdept().getDepName().compareTo(e.getEdept().getDepName())<0) {

			return -1;

		} else {
			return 1;
		}
		
		
	}
	
}
