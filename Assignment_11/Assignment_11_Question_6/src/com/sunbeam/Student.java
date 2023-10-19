package com.sunbeam;

import java.util.Scanner;

public class Student {
	
	private int rollno;
	private String name;
	
	
	
	
	public Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
    Scanner sc = new Scanner(System.in);
    public void accept()
    {
    	System.out.println("Enter rollno: ");
    	rollno=sc.nextInt();
    	System.out.println("Enter name: ");
    	name=sc.next();   	
    }
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
	

}
