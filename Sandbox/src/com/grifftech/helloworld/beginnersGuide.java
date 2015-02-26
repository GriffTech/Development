package com.grifftech.helloworld;

public class beginnersGuide {

	public static void main(String[] args)
		throws java.io.IOException {
		// Basic Println
		System.out.println("Test1");
		// For Loops, initialise index, do while i<10; increment by 1
		int sum, i;
		sum=0;
		for (i = 0; i < 10; i++) {
			sum+=i;
			//sum=sum+i;
		}
		System.out.println("Sum:"+sum);
		// Reading input from the console
		// throws java.io.IOException is required for the IO
		char ch;
		System.out.println("Enter a character");
		ch = (char) System.in.read();
		
		if (ch == 'K') {
			System.out.println("Correct !");
		} else {
			System.out.println("Character is "+ch);
		}
		//
		switch (ch) {
		case 'K':
			System.out.println("Switch Correct !");
			break;
		case 'L':
			System.out.println("Switch Almost Correct !");
			break;
		default:
			System.out.println("Switch Default Response");
		}
		
		int ix;
		for (ix=0; ix<=5; ix++){
			switch (ix) {
			case 0:System.out.println("i is 0");
			case 1:System.out.println("i is 1");
			case 2:System.out.println("i is 2");
			case 3:System.out.println("i is 3");
			case 4:System.out.println("i is 4");
			}
			
		}
		// Simple While Statement - condition is tested at the beginning
		int a = 1;
		while (a<2){
			System.out.println("a is less than 2");
			a++;
		}
		// Do While Statement - condition is tested at the end
		int b = 1;
		do {
			System.out.println("b is less than 2");
			b++;
		} while (b<2);
		
	}
	

	
	
	
	
	

	
	

}
