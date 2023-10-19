
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
		private void accept() {
			System.out.println("Enter ISBN: ");
			isbn=sc.next();
			System.out.println("Enter Price: ");
			price=sc.nextDouble();
			System.out.println("Enter Author Name: ");
			authorName=sc.next();
			System.out.println("Enter Quantity: ");
			quantity=sc.nextInt();
			

		}
		Scanner sc = new Scanner(System.in);
		
		@Override
		public String toString() {
			return "BookDetails [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity="
					+ quantity + "]";
		}
		@Override
		public int compareTo(BookDetails o) {
			int diff = this.isbn.compareTo(o.isbn);
			
			return diff;
		}
		

	}


