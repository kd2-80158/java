package com.sunbeam;

public class Tester {

	public static void main(String[] args) {

		
//		Employee employee = new Salaried_Employee();
//		employee.accept();
//		System.out.println(employee);
//		employee.calculateTotalSalary();

//		Employee employee = new Hourly_Employee();
//		employee.accept();
//		System.out.println(employee);
//		employee.calculateTotalSalary();
//
//		Employee employee1 = new Commission_Employee();
//		employee1.accept();
//		System.out.println(employee1);
//		employee1.calculateTotalSalary();
		
		Employee employee2 = new BasePlus_Commission_Employee();
		employee2.accept();
		System.out.println(employee2);
		employee2.calculateTotalSalary();


	}

}
