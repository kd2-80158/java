package com.sunbeam;

import java.util.Scanner;

public abstract class Employee {
	String firstName;
	String lastName;
	protected int SSN;
	
	abstract public void calculateTotalSalary();
	
	Scanner sc = new Scanner(System.in);
	
	public void accept()
	{
	  System.out.println("Enter first name: ");
	  firstName = sc.next();
	  System.out.println("Enter last name: ");
	  lastName = sc.next();
	  System.out.println("Enter SSN number: ");
	  SSN = sc.nextInt();
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", SSN=" + SSN + "]";
	}

}
