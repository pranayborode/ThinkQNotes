package com.asg8MapAdditional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

//1.a.	Create class Student (contains rollNo and Name)
class Student {

	private int rollNo;
	private String name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}

}

class Department {

	private int id;
	private String name;
	private List<Student> listOfStudents;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int id, String name, List<Student> listOfStudents) {
		super();
		this.id = id;
		this.name = name;
		this.listOfStudents = listOfStudents;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getListOfStudents() {
		return listOfStudents;
	}

	public void setListOfStudents(List<Student> listOfStudents) {
		this.listOfStudents = listOfStudents;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", listOfStudents=" + listOfStudents + "]";
	}

	
	//3.a.Over-ride hashcode method from Object class in the Department class
	@Override
	public int hashCode() {
		return Objects.hash(id, listOfStudents, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return id == other.id && Objects.equals(listOfStudents, other.listOfStudents)
				&& Objects.equals(name, other.name);
	}
	
	

}

public class Q1DepartmentMapExample {

	// 1.d.Now iterate through each of the dept, print its id and name and the
	// Students withinit (ie the rollNo and name).
	public static void iterateThroughEachDep(Map<Integer, Department> depMap) {

		for (Map.Entry<Integer, Department> entry : depMap.entrySet()) {

			Department dep = entry.getValue();
			System.out.println("Department Id: " + dep.getId());
			System.out.println("Department Name: " + dep.getName());

			System.out.println("Stuents: ");
			for (Student std : dep.getListOfStudents()) {
				System.out.println("RollNo: " + std.getRollNo() + ", Name: " + std.getName());
			}

			System.out.println();
		}

	}

	public static void main(String[] args) {

		List<Student> list1 = new ArrayList<>();

		list1.add(new Student(1, "Amit"));
		list1.add(new Student(2, "Rahul"));
		list1.add(new Student(3, "Shital"));
		list1.add(new Student(4, "Govind"));

		List<Student> list2 = new ArrayList<>();

		list2.add(new Student(5, "Yogesh"));
		list2.add(new Student(6, "Saurabh"));
		list2.add(new Student(7, "Riya"));
		list2.add(new Student(8, "Umesh"));

		List<Student> list3 = new ArrayList<>();

		list3.add(new Student(9, "Pratik"));
		list3.add(new Student(10, "Shraddha"));
		list3.add(new Student(11, "Anuj"));
		list3.add(new Student(12, "Praful"));

		List<Student> list4 = new ArrayList<>();

		list4.add(new Student(13, "Ganesh"));
		list4.add(new Student(14, "Abhilash"));
		list4.add(new Student(15, "Gauri"));
		list4.add(new Student(16, "Anand"));

		// 1.b. Create 4 Departments objects with different ids and add n number
		// (atleast 4) of Students to each of the dept.
		Department dep1 = new Department(101, "Computer Science", list1);
		Department dep2 = new Department(102, "Electronics Engineering", list2);
		Department dep3 = new Department(103, "Civil Engineering", list3);
		Department dep4 = new Department(104, "Mechanical Engineering", list4);

		// 1.c.Create a Map to add all the 4 Department objects with Dept id as key and
		// Deptobjas
		Map<Integer, Department> depMap = new HashMap<>();

		depMap.put(dep1.getId(), dep1);
		depMap.put(dep2.getId(), dep2);
		depMap.put(dep3.getId(), dep3);
		depMap.put(dep4.getId(), dep4);

		iterateThroughEachDep(depMap);

		// ------------------------------------------------------------------------
		System.out.println("*******************************************************");

		List<Student> list5 = new ArrayList<>();
		list5.add(new Student(17, "Heran"));
		list5.add(new Student(18, "Gopi"));
		list5.add(new Student(19, "Aradhya"));
		list5.add(new Student(20, "Purva"));

		// 2.a. Create 1 Department object with already used id and add Students to the
		// dept.
		Department dep5 = new Department(101, "Chemical Engineering", list5);

		// 2.b. Add the Department object with Dept id as key and Dept obj as value
		depMap.put(dep5.getId(), dep5);

		// 2.c. Observe how many elements are present in the Map

		System.out.println("No of Elements Present in Map: " + depMap.size());

		// 2.c Iterate through the elements in the Map

		iterateThroughEachDep(depMap);
		
		System.out.println("*********************************************************");


		List<Student> list6 = new ArrayList<>();
		
		list6.add(new Student(21, "Raju"));
		list6.add(new Student(22, "Sunil"));
		list6.add(new Student(23, "Aparna"));
		list6.add(new Student(24, "Monika"));
		
		//3.b.Create 1 Department object with already used id and add Students to the dept.
		Department dep6 = new Department(101, "Sound Engineering", list6);
		
		//3.c.Add the Department object with Dept id as key and Deptobj as value.
		depMap.put(dep6.getId(), dep6);
		
		//3.d.Observe how many elements are present in the Map
		System.out.println("No of Elements Present in Map: " + depMap.size());
		
		//3.d Iterate through the elements in the Map.
		iterateThroughEachDep(depMap);
		
		//6.	What do you conclude from exercise 
		//The program illustrates how a HashMap handles duplicate keys. 
		//When a new department is added with an existing ID, it overrides the previous entry.
		
	}

}
