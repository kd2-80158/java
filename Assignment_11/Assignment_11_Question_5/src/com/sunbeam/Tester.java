package com.sunbeam;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Tester {
	
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
		//We don't need to write hashcode() and equals() method because the key is of String class that already defined the logic of
//		this
		Map<String, BookDetails> map = new HashMap<>();
		int ch;
		Scanner sc =new Scanner(System.in);
		while((ch=menu())!=0)
		{
			switch(ch)
			{
			case 1:
				BookDetails bd = new BookDetails("101",200.20,"saurabh",1);
				map.put(bd.getIsbn(),bd);
				BookDetails bd1=new BookDetails("102",300,"sameer",10);
				map.put(bd1.getIsbn(),bd1);
				BookDetails bd2 = new BookDetails("103",500,"prashant",15);
				map.put(bd2.getIsbn(),bd2);
				BookDetails bd3 = new BookDetails("104",290.50,"hanu",15);
				map.put(bd2.getIsbn(),bd3);
				BookDetails bd4 = new BookDetails("105",700,"bhaskar",15);
				map.put(bd2.getIsbn(),bd4);
				BookDetails bd5 = new BookDetails("106",190.90,"vishal",15);
				map.put(bd2.getIsbn(),bd5);
				
				System.out.println("Data inserted successfully");
				break;
			case 2:
				System.out.println("Enter the ISBN to search");
				String isbn = sc.next();
				BookDetails f = map.get(isbn);
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
				Set<Entry<String,BookDetails>>entries = map.entrySet();
				for(Entry<String,BookDetails> en:entries)
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
