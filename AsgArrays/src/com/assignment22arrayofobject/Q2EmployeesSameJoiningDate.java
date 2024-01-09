package com.assignment22arrayofobject;



//2. WAP to print the employees from Employee[] array who has same joining date. 
//   You have Employee class which has 4 attributes id, name, salary, date 
//   (date is another object which has 3 attributes day, month, year) and 
//    add employee objects to your array

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

class Employee1 {

	private int eid;
	private String ename;
	private double salary;
	private Date date;

	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee1(int eid, String ename, double salary, Date date) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Employee1 : eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", " + date;
	}

}

public class Q2EmployeesSameJoiningDate {

	 private static void printEmpWithSameJoiningDate(Employee1 emp[], Date date[]) {
	        for (Date d : date) {
	            System.out.println(d);
	            for (Employee1 e : emp) {
	                if (e.getDate().getDay() == d.getDay() && 
	                    e.getDate().getMonth() == d.getMonth() &&
	                    e.getDate().getYear() == d.getYear()) {
	                    System.out.println(e.getEid() + " : " + e.getEname());
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Date date[] = new Date[3];
	        date[0] = new Date(5, 6, 2023);
	        date[1] = new Date(10, 9, 2023);
	        date[2] = new Date(15, 10, 2023);

	        Employee1 emp[] = new Employee1[8];

	        emp[0] = new Employee1(101, "Rahul", 25000, date[0]);
	        emp[1] = new Employee1(108, "Milind", 45000, date[1]);
	        emp[2] = new Employee1(102, "Amit", 66000, date[1]);
	        emp[3] = new Employee1(103, "Riya", 50000, date[0]);
	        emp[4] = new Employee1(104, "Samir", 25000, date[2]);
	        emp[5] = new Employee1(105, "Anuja", 77000, date[1]);
	        emp[6] = new Employee1(106, "Utkarsh", 45000, date[0]);
	        emp[7] = new Employee1(107, "Shreya", 35000, date[2]);
	       

	        printEmpWithSameJoiningDate(emp, date);
	    }

}
