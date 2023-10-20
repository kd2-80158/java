package com.sunbeam;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class FindFactorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to find the factorial: ");
		int num = sc.nextInt();
		

		Stream<Integer> strm = Stream.iterate(1, i -> i+1).limit(num);
		int result =strm.reduce(1, (x,y) -> x*y);
		System.out.println("Factorial is: " +result);
	}

}
