package com.sunbeam;

import java.util.Scanner;

@FunctionalInterface
interface Check<T>
{
	boolean compare(T x, T y);

}
public class CountNoOfElements {
	
	public static <T> int countIf(T[] arr, T key, Check<T> c)
	{
		int cnt=0;
		for(T ele: arr)
		{
		if(c.compare(ele,key))
           cnt++;
	    
			    
		}
		return cnt;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Double [] arr = {44.0, 7.5, 9.9, 2.2, 5.5, 6.6, 2.2, 2.2};
		
		System.out.print("Enter the key to find: ");
		Double key = sc.nextDouble();
		int cnt = countIf(arr, key, (r,s) -> r.equals(s));
		System.out.println("Count = " +cnt); 
		// 4 (because 4 elements in array are greater than given key i.e. 50)

	}

}
