package com.pro;

import java.util.Scanner;

public class Casting {

	public static void run() {
		System.out.println("Enter value for b");
		Scanner scan = new Scanner(System.in);
		int b = scan.nextInt(); 
	

		if(b > 10){  
			System.out.println("greater than Ten");
		}else{  
			System.out.println("less than 10");
		}  
	}
	
	public static void main(String args[]) {
		run();
		// Widening or Upcasting
		//low data type to Large data type 
		//		int myInt = 12;
		//		double myDouble = myInt;
		//		System.out.println(myInt);
		//		System.out.println(myDouble);
		//		}

		// Narrowing or Downcasting
		//Large data type to low data type
		//		double myDouble	=50.14;
		//		int myInt = (int) myDouble;
		//		System.out.println(myDouble);
		//		System.out.println(myInt);




		//access modifiers
		//PUBLIC > PRIVATE  > DEFAULT > PROTECTED

	}
}
