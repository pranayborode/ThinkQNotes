package com.asg5CollectionSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

//55. Create linked hashset of employee objects. Iterate through it 
//    using foreach loop and iterator. Observe the order.
public class Q55Employee {

	private int id;
	private String name;

	public Q55Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Q55Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Q55Employee [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {

		LinkedHashSet<Q55Employee> empList = new LinkedHashSet<>();
		
		empList.add(new Q55Employee(101, "Praful"));
		empList.add(new Q55Employee(102, "Rohit"));
		empList.add(new Q55Employee(103, "Sahil"));
		empList.add(new Q55Employee(104, "Anup"));
		
		System.out.println("ForEach Loop");
		
		for(Q55Employee e : empList) {
			System.out.println(e);
		}
		
		System.out.println("===============================");

		System.out.println("Iterator");
		
		Iterator<Q55Employee> itr = empList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
