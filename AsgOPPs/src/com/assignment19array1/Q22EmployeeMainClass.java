package com.assignment19array1;


//22. WAP to print the employees from Employee[] array who has same joining date. You 
//have Employee class which has 4 attributes id, name, salary, date (date is another 
//object which has 3 attributes day, month, year) and add employee objects to your array 


class Date {

	private int day;
	private int month;
	private int year;

	public Date() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Date : day=" + day + ", month=" + month + ", year=" + year;
	}

}

class Employee {

	private int eid;
	private String ename;
	private double esalary;
	private Date date;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, double esalary, Date date) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.date = date;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsalary() {
		return esalary;
	}

	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Employee : eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", " + date;
	}

	public static void main(String[] args) {

	}

}

public class Q22EmployeeMainClass {

	
	public static void findSameJoiningDate(Employee emp[], Date date[]) {
		
		
		for(Date d : date) { //d1[0] = new Date(5, 6, 2023);
			
			System.out.println(d);
			for(Employee e : emp) {
				
				if(e.getDate().equals(d)) {
					System.out.println(e.getEid()+" "+e.getEname());
				}
			}
			System.out.println("------------------------------------");
		}
		
	}
	

	public static void printSameDepartment(Employee emp[], Date date[]) {
	
	}
	public static void main(String[] args) {
		
		 Date d1[] = new Date[3];
		 d1[0] = new Date(5, 6, 2023);
		 d1[1] = new Date(10, 9, 2023);
		 d1[2] = new Date(15, 10, 2023);
		 
		 Employee e1[] = new Employee[8];
		 
		 e1[0] = new Employee(101, "Rahul", 25000, d1[0]);
		 e1[1] = new Employee(102, "Amit", 66000, d1[1]);
		 e1[2] = new Employee(103, "Riya", 50000, d1[0]);
		 e1[3] = new Employee(104, "Samir", 25000, d1[2]);
		 e1[4] = new Employee(105, "Anuja", 77000, d1[1]);
		 e1[5] = new Employee(106, "Utkarsh", 45000, d1[0]);
		 e1[6] = new Employee(107, "Shreya", 35000, d1[2]);
		 e1[7] = new Employee(108, "Milind", 45000, d1[1]);
		
		 for(Employee e : e1) {
			 System.out.println(e);
		 }
		System.out.println("============================================"); 
	     findSameJoiningDate(e1, d1);
	}
}
