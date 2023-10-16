package com.sunbeam;

import java.util.Scanner;

public class Manager extends Employee {
	
	private float bonus;
	
	public Manager()
	{
		this.bonus = 0;
	}

	public Manager(float bonus) {
		super();
		this.bonus = bonus;
	}

	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	@Override
	public void accept()
	{
		super.accept();;
		System.out.println("Enter bonus: ");
		bonus=sc.nextFloat();

	}
	@Override
	public void display()
	{
		super.display();
		System.out.println("Enter bonus: "+this.bonus);
	}
	@Override
	public float calculateTotalSalary() {
		float total = this.getSal()+this.bonus;
		return total;
	}
}
