package com.cervantes.andres;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> languageList = new ArrayList<>();
		languageList.add("C");
		languageList.add("C++");
		languageList.add("Java");
		
		for( String lang : languageList ) {
			System.out.println(lang);
		}
		
		
		for (Iterator<String> langIter = languageList.iterator(); langIter.hasNext(); ) {
			String language = langIter.next();
			System.out.println(language);
		}
	}

}
