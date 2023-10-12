package com.sunbeam;

import java.util.Scanner;

public class BasePlus_Commission_Employee extends Employee{

	double grossSales;
	double commissionRate;
	double baseSalary;
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void calculateTotalSalary() {

		System.out.println("Total Salary earned: "+((commissionRate*grossSales)+baseSalary+baseSalary*0.10));
		
	}

	@Override
	public void accept() {
		super.accept();
		System.out.println("Enter gross sales: ");
		grossSales=sc.nextDouble();
		System.out.println("Enter Commission rate: ");
		commissionRate=sc.nextDouble();
		System.out.println("Enter Base Salary: ");
		baseSalary=sc.nextDouble();	
	}

	@Override
	public String toString() {
		return "BasePlus_Commission_Employee [grossSales=" + grossSales + ", commissionRate=" + commissionRate
				+ ", baseSalary=" + baseSalary + ", firstName=" + firstName + ", lastName=" + lastName + ", SSN=" + SSN
				+ "]";
	}
	
	
	
}
