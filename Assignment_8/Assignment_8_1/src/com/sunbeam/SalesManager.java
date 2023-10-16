package com.sunbeam;

public class SalesManager extends Employee{
	
	float comm;
	float bonus;
	
	public SalesManager() {
		this(0,0);
	}
	
	public SalesManager(float comm, float bonus) {
		super();
		this.comm = comm;
		this.bonus = bonus;
	}


	public float getComm() {
		return comm;
	}


	public void setComm(float comm) {
		this.comm = comm;
	}


	public float getBonus() {
		return bonus;
	}


	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public void accept() {
		super.accept();
		System.out.println("Enter comm: ");
		comm=sc.nextFloat();
		System.out.println("Enter bonus: ");
		bonus=sc.nextFloat();
	}
	@Override
	public void display() {
		super.display();
		System.out.println("Comm: "+this.comm);
		System.out.println("Bonus: "+this.bonus);
	}
	@Override
	public float calculateTotalSalary() {
		return (this.getSal()+this.comm+this.bonus);
	}
	
	

}
