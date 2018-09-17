package com.cervantes.andres;

import java.util.ArrayList;
import java.util.List;

public class WildCardUse {

	static void printList( List<?> list ) {
		for ( Object element : list ) {
			System.out.println("["+element+"]");
		}
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		printList(list);
		
		List<String> strList = new ArrayList<>();
		strList.add("10");
		strList.add("20");
		printList(strList);
		
	}

}
