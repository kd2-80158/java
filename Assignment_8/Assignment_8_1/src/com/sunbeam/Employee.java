package com.sunbeam;

import java.util.Scanner;

abstract public class Employee extends Person {
	
	private int id;
	private float sal;
	
	public Employee()
	{
		this.id=0;
		this.sal=0;
	}

	public Employee(int id, String name, float sal) {
		super();
		this.id = id;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}
	Scanner sc = new Scanner(System.in);
	
	public void accept()
	{
		super.accept();
		System.out.println("Enter id: ");
		id=sc.nextInt();
		System.out.println("Enter salary: ");
		sal=sc.nextFloat();	
	}
	public void display()
	{
		super.display();
		System.out.println("Enter id: "+this.id);
		System.out.println("Enter salary: "+this.sal);
	}
	
	public abstract float calculateTotalSalary();
}
