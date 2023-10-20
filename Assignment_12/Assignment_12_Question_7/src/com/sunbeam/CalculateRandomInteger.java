package com.sunbeam;

import java.util.Random;
import java.util.stream.Stream;

public class CalculateRandomInteger {

	public static void main(String[] args) {
		
		
		Random rand = new Random();
		Stream<Integer> strm = Stream.generate(() -> rand.nextInt(10)).limit(10);
		int result = strm.reduce(0, (x,y) -> x+y);
		System.out.println("Sum of 10 random integers is: "+result);

	}

}
