package com.sunbeam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TesterSet {

	public static void main(String[] args) {
		//Multiple nulls are allowed in ArrayList
		//[B, D, A, C, null, null, null]
//		Collection<String> c = new ArrayList<>();
		
		//Duplicate null is not allowed in HashSet
        //[null, A, B, C, D]
//		Collection<String> c = new HashSet<>();
		//Duplicate null is not allowed in LinkedHashSet		
//		[B, D, A, C, null]
//		Collection<String> c = new LinkedHashSet<>();
		//Null is not allowed in TreeSet --gives NullPointerException
		Collection<String> c = new TreeSet<>();
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("C");
		c.add(null);
		c.add(null);
		c.add(null);
		System.out.println(c.toString());

	}

}
