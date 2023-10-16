package com.sunbeam;

import java.util.Scanner;

public class Date implements Displayable {
	
	int day;
	int month;
	int year;
	
	Scanner sc = new Scanner(System.in);
	
	
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void accept()
	{
		System.out.println("Enter day: ");
		day=sc.nextInt();
		System.out.println("Enter month: ");
		month=sc.nextInt();
		System.out.println("Enter year: ");
		year=sc.nextInt();
		
	}
	@Override
	public void show() {
	   System.out.println("Date: "+this.day+"/"+this.month+"/"+this.year);
		
	}
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
}
