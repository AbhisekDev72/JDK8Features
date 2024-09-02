package com.JDK8Feature;

import java.util.*;
import java.util.function.Predicate;

class Employee{
	String name; 
	String designation;
	int salary;
	String city;
	public Employee(String name,String designation,int salary,String city) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", designation='" + designation + '\'' +
				", salary=" + salary +
				", city='" + city + '\'' +
				'}';
		
	}
}

public class PredicateQ3 {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		populate(list);
		Predicate<Employee> p1 = emp -> emp.designation.equals("manager");
		display(p1,list);
		
		Predicate<Employee> p2 = emp -> emp.city.equals("rcb");
		display(p2,list);
		
		Predicate<Employee> p3 = emp -> emp.designation.equals("manager") && (emp.salary<2000);
		display(p3,list);
		
		display(p1.negate(),list);
	}

	public static void display(Predicate<Employee> p, List<Employee> list) {
		for (Employee emp : list) {
			if (p.test(emp))
				System.out.println(emp);
		}
		System.out.println("\n*****************************\n");
	}

	private static void populate(List<Employee> list) {
		list.add(new Employee("sachin","manager",3000,"mi"));
		list.add(new Employee("rohit","developer",2000,"DC"));
		list.add(new Employee("yadav","manager",2000,"mi"));
		list.add(new Employee("kohli","manager",1000,"rcb"));
		list.add(new Employee("faf","developer",1000,"rcb"));
		list.add(new Employee("pandya","lead",1000,"GT"));
		list.add(new Employee("dhoni","manager",1000,"CSK"));
	}	
}
