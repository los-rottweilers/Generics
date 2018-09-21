package com.cervantes.andres;

import java.util.Arrays;
import java.util.List;

public class InternalIteration {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("eeny","meeny","miny","mo");

		/*for ( String string : strings ) {
			System.out.println(string);
		}*/
		
		strings.forEach(string -> System.out.println(string));
		
		strings.forEach(System.out::println);
		
	}

}
