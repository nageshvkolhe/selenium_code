package com.javabasics;

public class StaticWord {
	public static void main(String args[]) {
		ABCD.show();
//		ABCD obj = new ABCD();   //USE STATIC WORD ORELSE CREATE AN OBJECT
//		obj.show();
	}
}

 	class  ABCD {
		public static void show(){
			System.out.println("Hello");
		}
	}

