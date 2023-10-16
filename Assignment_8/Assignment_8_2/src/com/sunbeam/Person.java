package com.sunbeam;

import java.util.Scanner;

public class Person implements Displayable {
	
	String name;
	int age;
	
	Scanner sc = new Scanner(System.in);
	
	public Person() {
		this("",0);
	}
	
    
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}



	public void accept()
	{
		
		System.out.println("Enter name: ");
		name=sc.nextLine();
		System.out.println("Enter age: ");
		age=sc.nextInt();
		
	}



	@Override
	public void show() {
         System.out.println("Name: "+this.name);
         System.out.println("Age: "+this.age);
		
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	

}
