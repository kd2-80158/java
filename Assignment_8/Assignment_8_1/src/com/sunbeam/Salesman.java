package com.sunbeam;

import java.util.Scanner;

public class Salesman extends Employee {
	
	float comm;
	
	public Salesman() {
		this(0);
	}

	public float getComm() {
		return comm;
	}

	public void setComm(float comm) {
		this.comm = comm;
	}

	public Salesman(float comm) {
		super();
		this.comm = comm;
	}
	
	@Override
	public void accept()
	{
		super.accept();;
		System.out.println("Enter comm: ");
		comm=sc.nextFloat();

	}
	@Override
	public void display()
	{
		super.display();
		System.out.println("Enter comm: "+this.comm);
	}
	@Override
	public float calculateTotalSalary() {
		return (this.getSal()+this.comm);
	}

}
