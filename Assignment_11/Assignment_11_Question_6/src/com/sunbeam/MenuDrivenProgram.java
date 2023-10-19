package com.sunbeam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;


public class MenuDrivenProgram {
	
	public static int menu()
	{
		Scanner sc =new Scanner(System.in);
		int choice;
		System.out.println("******************");		
		System.out.println("0. Exit");
		System.out.println("1. Insert in Map");
		System.out.println("2. Find in map");
		System.out.println("3. Display all key-value pairs");		
		System.out.println("******************");
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		
		Map<Integer,Student> map = new HashMap<>();
		
		int ch;
		Scanner sc =new Scanner(System.in);
		while((ch=menu())!=0)
		{
			switch(ch)
			{
			case 1:
				Student bd = new Student(1,"saurabh");
				map.put(bd.getRollno(),bd);
				Student bd1=new Student(3,"sameer");
				map.put(bd1.getRollno(),bd1);
				Student bd2 = new Student(4,"prashant");
				map.put(bd2.getRollno(),bd2);
				Student bd3 = new Student(2,"hanu");
				map.put(bd3.getRollno(),bd3);
				Student bd4 = new Student(6,"bhaskar");
				map.put(bd4.getRollno(),bd4);
				Student bd5 = new Student(5,"vishal");
				map.put(bd5.getRollno(),bd5);
				
				System.out.println("Data inserted successfully");
				break;
			case 2:
				System.out.println("Enter the rollno to search");
				Integer rollno = sc.nextInt();
				Student f = map.get(rollno);
				if(f==null)
				{
					System.out.println("not found in map");
				}
				else
				{
					System.out.println(f);
				}
				break;
			case 3:
				Set<Entry<Integer,Student>>entries=map.entrySet();
				for(Entry<Integer,Student> en:entries)
				{
					System.out.println(en.getKey()+"---"+en.getValue());
				}
				break;
			default:
				System.out.println("Wrong Choice");
			    break;
			}
		}
		System.out.println("Thanks for using this application..........");
	}
		
		

	}

