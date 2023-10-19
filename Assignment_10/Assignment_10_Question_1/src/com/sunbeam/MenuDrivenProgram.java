package com.sunbeam;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
public class MenuDrivenProgram {
	
	static int menu()
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("****************************************************");
		System.out.println("0. Exit");
		System.out.println("1. Add new book in List");
		System.out.println("2. Display all books in forward order using random access");
		System.out.println("3. Search a book with given isbn");
		System.out.println("4. Delete a book at given index");
		System.out.println("5. Delete a book with given isbn");
		System.out.println("6. Reverse the list");
		System.out.println("****************************************************");
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {

		List<BookDetails> bd = new ArrayList<BookDetails>();
		
		BookDetails b=null;
		Scanner sc = new Scanner(System.in);
		int ch;
		while((ch=menu())!=0)
				{
			switch(ch)
			{
			case 1:
			if(b==null)
			{
				b = new BookDetails();
				b.accept();
				bd.add(b);
			}
			else
			{
				System.out.println("Enter isbn to check whether the book is present or not: ");
				String isbn1 = sc.nextLine();
				BookDetails key1 = new BookDetails();
				key1.setIsbn(isbn1);
				if(bd.contains(key1))
				{
					if(bd.contains(b))
					{
					int increment = b.getQuantity()+1;
					b.setQuantity(increment);
					System.out.println("Book Found!!!");
					}
				}
				else
				{
				System.out.println("Adding new Book:");
				b = new BookDetails();
				b.accept();
				bd.add(b);
				}
			}
			break;
			case 2:
//               Collections.shuffle(bd);
//               for(BookDetails book:bd)
//               {
//            	   book.display();
//               }
				 Iterator<BookDetails> itr=bd.iterator();
				 while(itr.hasNext())
				 {
					 BookDetails e= itr.next();
					 System.out.println(e.toString());
				 }
			case 3:
				System.out.println("Enter ISBN to search: ");  
				String isbn3=sc.next();
				BookDetails key3 = new BookDetails();
				key3.setIsbn(isbn3);
				int index1 = bd.indexOf(key3);
				if(index1==-1)
                {
                	System.out.println("Not found");
                }
				else
				{
					System.out.println("Book Found");
				}
				break;
			case 4:
				int index=0;
				System.out.println("Enter index: ");
				index=sc.nextInt();
				bd.remove(index);
				break;
			case 5:
				System.out.println("Enter isbn to delete: ");
				String isbn2 = sc.nextLine();
				BookDetails key2 = new BookDetails();
				key2.setIsbn(isbn2);
				if(bd.contains(key2))
				{
				  bd.remove(key2);
				  System.out.println("Remove successfully....");
				}
				else
				{
					System.out.println("No Book Found");
				}
				break;
			case 6:
			    Collections.reverse(bd);
				for(BookDetails ls:bd)	
			        ls.display();
				break;
			default:
				System.out.println("Invalid input.........");
			}
				}
		System.out.println("Thanks for using the app!!!!!!!!!!!");
	}
	

}
