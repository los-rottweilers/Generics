package com.cervantes.andres;

import java.util.Arrays;

public class ComparatorTest2 {

	public static void main(String[] args) {
		
		Student []students = {
				new Student("cs021", "Andres", 3.8),
				new Student("cs021", "Mikey", 4.0),
				new Student("cs021", "Janis", 3.0)
		};

		System.out.println( "Before sorting by student ID" );
		System.out.println( "Student-ID \t Name \t CGPA (for 4.0) " );
		System.out.println( Arrays.toString(students) );
		
		Arrays.sort(students, new CGPAComparator());
		
		System.out.println( "After sorting by student ID" );
		System.out.println( "Student-ID \t Name \t CGPA (for 4.0) " );
		System.out.println( Arrays.toString(students) );
	}

}
