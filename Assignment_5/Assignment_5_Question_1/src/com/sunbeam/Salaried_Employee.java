package com.sunbeam;

import java.util.Scanner;

public class Salaried_Employee extends Employee {

	Scanner sc = new Scanner(System.in);
	double weeklySalary;
	@Override
	public void calculateTotalSalary() {
		double salary = weeklySalary;
		System.out.println("Total Salary earned: "+salary);
	}
	@Override
	public void accept() {
		super.accept();
		System.out.println("Enter weekly salary: ");
		weeklySalary = sc.nextDouble();
	}
	
	@Override
	public String toString() {
		return "Salaried Employee ["+weeklySalary+","+super.toString();
	}
	
	

}
