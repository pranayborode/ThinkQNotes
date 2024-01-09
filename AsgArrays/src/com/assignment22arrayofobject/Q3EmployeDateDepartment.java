package com.assignment22arrayofobject;



class Department {

	private int did;
	private String dname;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Department : did=" + did + ", dname=" + dname;
	}

}

class MyDate {

	private int day;
	private int month;
	private int year;

	public MyDate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyDate(int day, int month, int year) {
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

class Employee2 {

	private int eid;
	private String name;
	private double salary;
	private MyDate date;
	private Department department;

	public Employee2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee2(int eid, String name, double salary, MyDate date, Department department) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.date = date;
		this.department = department;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public MyDate getDate() {
		return date;
	}

	public void setDate(MyDate date) {
		this.date = date;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee2 : eid=" + eid + ", name=" + name + ", salary=" + salary + ", " + date + ", " + department;
	}

}
public class Q3EmployeDateDepartment {
public static void empWithDepNameSame(Employee2 emp[], Department dep[]) {
		
		for(Department d : dep) {
			
			System.out.println(d);
			for(Employee2 e : emp) {
				
				if(e.getDepartment().equals(d)) {
					System.out.println(e.getEid()+" : "+e.getName());
				}
			}
			
		}
		
	}

	public static void main(String[] args) {

		MyDate date[] = new MyDate[3];
		date[0] = new MyDate(5, 6, 2023);
		date[1] = new MyDate(10, 9, 2023);
		date[2] = new MyDate(15, 10, 2023);

		Department dep[] = new Department[3];
		dep[0] = new Department(1, "IT");
		dep[1] = new Department(2, "Sales");
		dep[2] = new Department(3, "HR");

		Employee2 emp[] = new Employee2[8];

		emp[0] = new Employee2(101, "Rahul", 25000, date[0], dep[1]);
		emp[1] = new Employee2(102, "Amit", 89000, date[1], dep[0]);
		emp[2] = new Employee2(103, "Riya", 50000, date[0], dep[0]);
		emp[3] = new Employee2(104, "Samir", 25000, date[2], dep[1]);
		emp[4] = new Employee2(105, "Anuja", 77000, date[1], dep[2]);
		emp[5] = new Employee2(106, "Utkarsh", 45000, date[0], dep[1]);
		emp[6] = new Employee2(107, "Shreya", 35000, date[2], dep[0]);
		emp[7] = new Employee2(108, "Milind", 45000, date[1], dep[0]);

		for (Employee2 e : emp) {
			System.out.println(e);
		}

		System.out.println("=============================");

		empWithDepNameSame(emp, dep);
	}
}
