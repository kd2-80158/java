package com.sunbeam;

import java.util.Comparator;

  class Tester implements Comparator<Double>{
	
	static <T> void selectionSort(T[] arr, Comparator<T> c) {
	    for(int i=0; i<arr.length-1; i++) {
	        for(int j=i+1; j<arr.length; j++) {
	        	
	            if(c.compare(arr[i], arr[j]) > 0) {
	               T temp = arr[i];
	               arr[i] = arr[j];
	               arr[j] = temp;
	}
    }
	}
	}

	public static void main(String[] args) {
		
		Double[] arr = { 2.2, 5.5, 7.7, 1.1, 3.3 };
		
	    System.out.println("Before sort: ");
	    for(Double t:arr)
	    {
	    System.out.println(t);
	    }
	
		Tester cc = new Tester();
		
	    selectionSort(arr,cc);
	    System.out.println("After sort: ");
	    for(Double t:arr)
	    {
	    System.out.println(t);
	    }
	}

	@Override
	public int compare(Double o1, Double o2) {
		int diff = Double.compare(o1.doubleValue(),o2.doubleValue());
		return diff;
	}



}
