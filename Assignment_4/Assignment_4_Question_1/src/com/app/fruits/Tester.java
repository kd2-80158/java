package com.app.fruits;

import java.util.Scanner;

public class Tester {
	
	
	public static int menu()
	{
		int choice;
		Scanner sc =new Scanner(System.in);
	 
//		Scanner sc = new Scanner(System.in);
		System.out.println("0. Exit");
		System.out.println("1. Add Mango");
		System.out.println("2. Add Orange");
		System.out.println("3. Add Apple");
		System.out.println("4. Display names of all fruits in the basket");
		System.out.println("5. Display name, color, weight, taste of all fresh fruits");
		System.out.println("6. Display tastes of all stale(not fresh) fruits, in the basket");
		System.out.println("7. Mark a fruit as stale");
		System.out.println("8. Mark all sour fruits stale (optional)");
		System.out.println("Enter your choice: ");
		return choice=sc.nextInt();
		
	}

	public static void main(String[] args) {
		int ch;
		//int basketSize=0;
		int index=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the basket size: ");
		int basketSize = sc.nextInt();
		Fruit[] basket = new Fruit[basketSize];

		while((ch=menu())!=0)
		{
			switch(ch)
			{
			case 1:
				if(index>=0 && index<basket.length)
			{   
				basket[index] = new Mango();
				basket[index].acceptData();
				index++;
			}
			else
				{
					System.out.println("Array is Full,can't update!!!");
				}
				break;
			case 2:
				if(index>=0 && index<basket.length)
			{   
				basket[index] = new Orange();
				basket[index].acceptData();
				index++;
			}
			else
				{
					System.out.println("Array is Full,can't update!!!");
				}	
				break;
			case 3:
				if(index>=0 && index<basket.length)
			{   
				basket[index] = new Apple();
				basket[index].acceptData();
				index++;
			}
			else
				{
					System.out.println("Array is Full,can't update!!!");
				}
				break;
			case 4:
				for(Fruit fb:basket)
				{
					if(fb!=null)
					{
						System.out.println("Name of the fruit: "+fb.getName());
					}
				}
				
				break;
			case 5:
				for(Fruit fb:basket)
				{
					if(fb!=null)
					{
					if(fb.getIsFresh())	
					{
						fb.displayData();
						System.out.println("Taste is: "+fb.taste());
						System.out.println("Is fruit fresh: "+fb.getIsFresh());
					}
					
				}
				}
				break;
			case 6:
				for(Fruit fb:basket)
				{
					if(fb!=null)
					{
					if(!fb.getIsFresh())
					{
						System.out.println("Taste is: "+fb.taste());
					}
					else
					{
						System.out.println("All fruits are fresh");
						break;
					}
				}
				}
				break;
			case 7:
				int index1;
				System.out.println("Enter the index: ");
				index1=sc.nextInt();
				if(index1>=0 && index1<basket.length)
				{
					basket[index1].setFresh(false);
					System.out.println("Fruit successfully marked as stale....");
				}
				else
				{
				  System.out.println("Invalid Index....");	
				}
				
				break;
			case 8:
				for(Fruit fb:basket)
				{
				if(fb!=null)
				{
				if(fb.taste()=="sour")
				{
					fb.setFresh(false);
					System.out.println("All sour fruits are marked as stale");
				}
				}
				}
				break;
			default:
				System.out.println("Invalid choice.....");
				break;
			
			}
		}
		
		System.out.println("Thanks for using this app!!!!");

	}

}
