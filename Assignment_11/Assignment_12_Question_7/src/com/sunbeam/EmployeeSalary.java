package com.sunbeam;

interface Emp
{
	public double getSal();
	default public double calIncentives()
	{
		return 0.0;
	}
	static public double calTotalIncome(Emp arr[])
    {
		double totalSalary=0;
		for(Emp emp:arr)
		{
			totalSalary+=emp.getSal()+emp.calIncentives();
		}
		return totalSalary;	
	}
}

class Manager implements Emp
{
	private double basicSalary;
	private double dearanceAllowance;
	

	public Manager(double basicSalary, double dearanceAllowance) {
	
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public double getDearanceAllowance() {
		return dearanceAllowance;
	}
	public void setDearanceAllowance(double dearanceAllowance) {
		this.dearanceAllowance = dearanceAllowance;
	}
	@Override
	public double getSal() {
		double money = basicSalary + dearanceAllowance;
		return money;
}
	@Override
	public double calIncentives() {
		
		return 0.20*basicSalary;
	}
}
	class Labor implements Emp
	{
		private int hours,rate;

		public Labor(int hours, int rate) {
		
			this.hours = hours;
			this.rate = rate;
		}
		public int getHours() {
			return hours;
		}
		public void setHours(int hours) {
			this.hours = hours;
		}
		public int getRate() {
			return rate;
		}
		public void setRate(int rate) {
			this.rate = rate;
		}
		@Override
		public double getSal() {
			
			return this.hours*this.rate;
		}
		@Override
		public double calIncentives() {
			if(this.hours>300)
			return 0.05*this.getSal();
			else
				return 0.0;
		}
		
		
	}
	class Clerk implements Emp
	{
		private int salary;

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}

		public Clerk(int salary) {
			this.salary = salary;
		}

		@Override
		public double getSal() {
			return salary;
		}
		
	}

public class EmployeeSalary {

	public static void main(String[] args) {
		
		Emp[] emp = new Emp[3];
		emp[0] = new Manager(10000,1000);
		emp[1] = new Clerk(13000);
		emp[2] = new Labor(10,200);
		
		double totalIncome = Emp.calTotalIncome(emp);
		System.out.println("Total salary of employees: " +totalIncome);
		
		

	}

}

