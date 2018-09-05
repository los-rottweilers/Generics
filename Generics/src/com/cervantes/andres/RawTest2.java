package com.cervantes.andres;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RawTest2 {

	public static void main(String[] args) {
		List list = new LinkedList();
		list.add("first");
		list.add("second");
		
		List<String> strList = list;
		// this wont compile. 
		//strList.add(10);
		
		for( Iterator<String> iter = strList.iterator(); iter.hasNext();) {
			System.out.println("Item: " + iter.next());
		}
		
		List<String> strList2 = new LinkedList<>();
		strList2.add("first");
		strList2.add("second");
		List list2 = strList2;
		
		// this will compile but cause a runtime exception
		list2.add(10);
		
		for( Iterator<String> iter = list2.iterator(); iter.hasNext();) {
			System.out.println("Item: " + iter.next());
		}
		
	}

}
