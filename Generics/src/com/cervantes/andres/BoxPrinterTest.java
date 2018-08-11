package com.cervantes.andres;

public class BoxPrinterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BoxPrinter<Integer> value1 = new BoxPrinter<>(30);
		System.out.println(value1);
		
		BoxPrinter<String> value2 = new BoxPrinter<>("Hello World");
		System.out.println(value2);
		
		System.out.println("Version 3");
	}

}
