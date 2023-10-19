package com.sunbeam;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Tester {

	public static void main(String[] args) {
       

		//adding duplicate value --isbn
		//it will throw ClassCastException
	    //Natural ordering for the Book should be isbn so to make it descending order of price create a comparator class that
        //implements comparator interface and define compare() method accordingly
        
		class PriceComparator implements Comparator<BookDetails>
		{
			public int compare(BookDetails b1,BookDetails b2)
			{
				int diff = -Double.compare(b1.getPrice(), b2.getPrice());
				return diff;
			}
		}
		
		PriceComparator comparator = new PriceComparator();
		
		TreeSet<BookDetails> book = new TreeSet<>(comparator);
		book.add(new BookDetails("110",250.50,"Javed khan",2));
		book.add(new BookDetails("120",350.50,"Sameer Dehadrai",1));
		book.add(new BookDetails("130",170.70,"Saurabh Chandra",30));
		book.add(new BookDetails("140",223.00,"Chetan",12));
		book.add(new BookDetails("150",600.40,"King",9));
		
		
		
		
		//will print element on the basis of isbn
		System.out.println("Traverse in forward order");
		Iterator<BookDetails> itr=book.iterator();
		while(itr.hasNext())
		{
			BookDetails d = itr.next();
			System.out.println(d.toString());
		}
		System.out.println();
		
		System.out.println("Traverse using descending order");
		Iterator<BookDetails> itr1=book.descendingIterator();
		while(itr1.hasNext())
		{
			BookDetails d1 = itr1.next();
			System.out.println(d1.toString());
		}
	}

}
