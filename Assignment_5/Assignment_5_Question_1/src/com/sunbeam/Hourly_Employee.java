package com.sunbeam;

import java.util.Scanner;

public class Hourly_Employee extends Employee {
	
	double wage;
	int hour;
	
	Scanner sc = new Scanner(System.in);
    @Override
    public void accept() {
    	super.accept();
    	System.out.println("Enter hourly wage: ");
    	wage=sc.nextDouble();
    	System.out.println("Enter hour worked: ");
    	hour=sc.nextInt();	
    	
    	
    }

	@Override
	public void calculateTotalSalary() {
		
		if(this.hour<=40)
		{
			System.out.println("Hourly Employee Salary: "+this.hour*this.wage);
		}
		else if(this.hour>40)
		{
			System.out.println("Total Salary earned: "+(40*this.wage+(this.hour-40)*this.wage*1.5));
		}
		
	}

	@Override
	public String toString() {
		return "Hourly_Employee [wage=" + this.wage + ", hour=" + this.hour + ", firstName=" + firstName + ", lastName="
				+ lastName + ", SSN=" + SSN + "]";
	}
	
	
	

}
