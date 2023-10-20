package com.sunbeam;

import java.util.stream.IntStream;

public class Tester {

	public static void main(String[] args) {
		
		IntStream its = IntStream.range(1, 10);
		int snum = its.sum();
		System.out.println("Sum is: " +snum);
		
		IntStream its1 = IntStream.range(1, 10);
		System.out.println(its1.summaryStatistics());

	}

}
