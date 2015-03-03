package com.grifftech.helloworld;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String Functions");
		
		String mystring = "Russell Paul Griffiths";
		
		int a = mystring.length();
		System.out.println("Length is "+a);
		
		int b = mystring.charAt(6);
		//System.out.println("Char 7 is "+asc(b));
		
		String suba = mystring.substring(8, 12);
		System.out.println("Substr "+suba);
		
		
	}

}
