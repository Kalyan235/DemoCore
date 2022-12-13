package com.java8;

import java.util.ArrayList;

import java.util.List;


import java.util.stream.Collectors;

public class GetSalary {

	public static void main(String[] args) {

		List<Employee> emp = new ArrayList<>();

		emp.add(new Employee(1, "Kalyan", 35000));
		emp.add(new Employee(2, "Mickyy", 35000));
		emp.add(new Employee(3, "Aman", 95000));
		emp.add(new Employee(4, "Raaji", 45000));

		// ----> Print the employees who's salary is less than 95000;
		 emp.stream().filter(e -> e.getSalary() < 5000).forEach(System.out::println);

		// ----> Print Only Id's.
		List<Integer> list = emp.stream().map(Employee::getId).collect(Collectors.toList());
		System.out.println(list);

		// ----> Print Only Names's.
		List<String> names = emp.stream().map(Employee::getName).collect(Collectors.toList());

		System.out.println(names);

		List<Double> salary = emp.stream().map(Employee::getSalary).collect(Collectors.toList());

		System.out.println(salary);
		
        System.out.println("This line is for testing git");
		// ----> Print Only Salary's.
	
	}

}
