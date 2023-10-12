package com.sunbeam;

import java.util.Scanner;

public class Commission_Employee extends Employee {
	
	double grossSales;
	double commissionRate;
	
	Scanner sc = new Scanner(System.in);
	@Override
	public void accept() {
		super.accept();
		System.out.println("Enter gross sales: ");
		grossSales=sc.nextDouble();
		System.out.println("Enter commission rate: ");
		grossSales=sc.nextDouble();	
	}
	@Override
	public void calculateTotalSalary() {
		System.out.println("Total Salary earned: "+commissionRate*grossSales);
	}
	@Override
	public String toString() {
		return "Commission_Employee [grossSales=" + grossSales + ", commissionRate=" + commissionRate + ", firstName="
				+ firstName + ", lastName=" + lastName + ", SSN=" + SSN + "]";
	}
	
	
	

}
