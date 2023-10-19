
package com.sunbeam;
import java.util.Scanner;

public class BookDetails implements Comparable<BookDetails> {
		
		private String isbn;
		private double price;
		private String authorName;
		private int quantity;
		
		public String getIsbn() {
			return isbn;
		}
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getAuthorName() {
			return authorName;
		}
		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public BookDetails() {
			this("",0,"",0);
		}
		public BookDetails(String isbn, double price, String authorName, int quantity) {
			this.isbn = isbn;
			this.price = price;
			this.authorName = authorName;
			this.quantity = quantity;
		}
		Scanner sc = new Scanner(System.in);
		
		@Override
		public String toString() {
			return "BookDetails [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity="
					+ quantity + "]";
		}
		
//		@Override
//		public int hashCode() {
//		   int hash = Objects.hash(isbn);
//		   return hash;
//		}
//		public boolean equals(Object obj)
//		{
//			if(obj==null)
//				return false;
//			if(this==obj)
//				return true;
//			if(obj instanceof BookDetails)
//			{
//			BookDetails other = (BookDetails) obj;
//			if(this.isbn.equals(other.isbn))
//			   return true;
//		    }
//			return false;
//			
//		}
		@Override
		public int compareTo(BookDetails o) {
			int diff = this.isbn.compareTo(o.isbn);
			
			return diff;
		}
		

	}


