package com.sunbeam;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class Program {
	
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
		System.out.println("7. Save books in file");
		System.out.println("8. Load books from file");
		System.out.println("****************************************************");
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {

		List<Book> bd = new ArrayList<Book>();
		
		Book b=null;
		Scanner sc = new Scanner(System.in);
		int ch;
		while((ch=menu())!=0)
				{
			switch(ch)
			{
			case 1:
			if(b==null)
			{
				b = new Book();
				b.accept();
				bd.add(b);
			}
			else
			{
				System.out.println("Enter isbn to check whether the book is present or not: ");
				String isbn1 = sc.nextLine();
				Book key1 = new Book();
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
				b = new Book();
				b.accept();
				bd.add(b);
				}
			}
			break;
			case 2:
				 Iterator<Book> itr=bd.iterator();
				 while(itr.hasNext())
				 {
					 Book e= itr.next();
					 System.out.println(e.toString());
				 }
			case 3:
				System.out.println("Enter ISBN to search: ");  
				String isbn3=sc.next();
				Book key3 = new Book();
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
				Book key2 = new Book();
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
				for(Book ls:bd)	
			        ls.display();
				break;
			case 7:
				try(FileOutputStream fout = new FileOutputStream("bookDBB1.txt"))
				{
					try(ObjectOutputStream oout = new ObjectOutputStream(fout))
					{
						oout.writeObject(bd);
					}
				}
				catch(IOException ef)
				{	
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				System.out.println("Books saved");
				break;
			case 8:
				
				try(FileInputStream fin = new FileInputStream("bookDBB1.txt"))
				{
					try(ObjectInputStream oin = new ObjectInputStream(fin))
					{
	                   Book bk = (Book) oin.readObject();
                       System.out.println(bk);
	                   
					}
				}
				catch(IOException ex)
				{
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
			default:
				System.out.println("Invalid input.........");
			}
				}
		System.out.println("Thanks for using the app!!!!!!!!!!!");
	}
	

}
