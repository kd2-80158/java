package com.sunbeam;

import java.util.Arrays;

public class Tester {
	
	public static void main(String[] args)
	{
	Student[] student = new Student[5];
	
	student[0] = new Student(3,"Mukesh","Mumbai",80);
	student[1] = new Student(2,"Ritesh","Mumbai",80);
	student[2] = new Student(1,"Saurabh","Delhi",100);
	student[3] = new Student(5,"Sam","London",70);
	student[4] = new Student(4,"Akshay","Nagpur",40);
	
	StudentComparision sc = new StudentComparision();
	Arrays.sort(student,sc);
	for(Student s:student)
	{
		System.out.println(s);
	}
	
	}
}
