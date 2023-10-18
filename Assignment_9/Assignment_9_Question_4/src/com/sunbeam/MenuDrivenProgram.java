package com.sunbeam;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class MenuDrivenProgram {
	
	static int menu()
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("****************************************************");
		System.out.println("0. Exit");
		System.out.println("1. Add New Book");
		System.out.println("2. Display all books in Asc Order");
		System.out.println("3. Delete at book given index");
		System.out.println("4. Check if book with given isbn is in list or not");
		System.out.println("5. Delete all books in list");
		System.out.println("6. Display number of books in list");
		System.out.println("7. Sort all books by price in desc order");
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
				
				b = new BookDetails();
				b.accept();
				bd.add(b);
				break;

			case 2:
			for(BookDetails ls:bd)	
		        ls.display();
				break;
			case 3:
				int index=0;
				System.out.println("Enter index: ");
				index=sc.nextInt();
				bd.remove(index);	
				break;
			case 4:
				System.out.println("Enter isbn: ");
				String isbn = sc.nextLine();
				BookDetails key = new BookDetails();
				key.setIsbn(isbn);
				if(bd.contains(key))
				  System.out.println(key.getIsbn()+" is Found");
				else
				  System.out.println(key.getIsbn()+" is not Found");
				break;
			case 5:
				bd.clear();
				break;
			case 6:
				System.out.println("Number of books: "+bd.size());
				break;
			case 7:
				class BookPriceComparator implements Comparator<BookDetails>
				{
				public int compare(BookDetails b1, BookDetails b2)
				{
					int diff = -Double.compare(b1.getPrice(),b2.getPrice());
					return diff;
				}
				}
				BookPriceComparator bc = new BookPriceComparator();
				bd.sort(bc);
				for(BookDetails bda:bd)
				{
					System.out.println(bda.getPrice());
				}
				break;
			default:
				System.out.println("Invalid input.........");
			}
				}
		System.out.println("Thanks for using the app!!!!!!!!!!!");
	}
	

}
