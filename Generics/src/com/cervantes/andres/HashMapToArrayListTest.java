package com.cervantes.andres;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class HashMapToArrayListTest {

	public static void main(String[] args) {
		String key = "";
		
		HashMap<String, Integer> map = new HashMap<>();
		
		key = "t";
		if ( !map.containsKey(key)) {
			map.put("a",2);
		}
		
		
		key = "t";
		if ( !map.containsKey(key)) {
		map.put("b",3);
		}
		
		key = "a";
		if ( !map.containsKey(key)) {
			map.put("a",3);
		}
		else {
			map.put(key, map.get(key)+19);
			System.out.println(map.get(key));
		}
		
		key = "t";
		if ( !map.containsKey(key)) {
			map.put("d",5);
		}
		
		Collection<Integer> values = map.values();
		
		ArrayList<Integer> listofkeys = new ArrayList<>(values);
		
		for( int val : listofkeys ) {
			System.out.println(val);
		}
		
	}

	public List add(Integer num) {
		return null;
		
		
	}
}
