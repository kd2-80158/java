package com.sunbeam;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Tester {

	public static void main(String[] args) {
       
		Set<BookDetails> book = new LinkedHashSet<>();
		book.add(new BookDetails("110",250.50,"Javed khan",2));
		book.add(new BookDetails("120",350.50,"Sameer Dehadrai",1));
		book.add(new BookDetails("130",170.70,"Saurabh Chandra",30));
		book.add(new BookDetails("140",223.00,"Chetan",12));
		book.add(new BookDetails("150",600.40,"King",9));
		//adding duplicate value --isbn
		//it will add the duplicate value as there is no hashcode() method written in the program (user-defined class)
		//to solve this we need to write the hashcode() and equals() method in the class
        book.add(new BookDetails("150",600.40,"Kings",9));  
		
		//will print element on their order of insertion
		System.out.println("Traverse in forward order");
		Iterator<BookDetails> itr=book.iterator();
		while(itr.hasNext())
		{
			BookDetails d = itr.next();
			System.out.println(d.toString());
		}
	}

}
