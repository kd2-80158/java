package com.sunbeam;

import java.util.Scanner;

public class Person {
	
	private String name;
	
	public Person()
	{
		this("");
	}

	public Person(String name) {
		this.name = name;
	}
	Scanner sc = new Scanner(System.in);
	
	public void accept()
	{
		System.out.println("Enter name: ");
		name=sc.nextLine();
	}
	public void display()
	{
		System.out.println("Name: "+this.name);
	}
 
}
