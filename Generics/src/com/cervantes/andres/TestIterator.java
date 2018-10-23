package com.cervantes.andres;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		for ( int x = 0; x < 10; x++ ) {
			nums.add(x);
		}
		
		System.out.println( "Original list " + nums );
		
		Iterator<Integer> numsIter = nums.iterator();
		while( numsIter.hasNext() ) {
			numsIter.next();
			numsIter.remove();
		}
		
		System.out.println( "List after removing all elements " + nums );
	
		nums.forEach(num -> System.out.println(num));
	}

}
