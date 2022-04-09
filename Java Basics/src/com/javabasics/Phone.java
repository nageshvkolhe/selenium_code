package com.javabasics;

public class Phone {
	public static void show(String n1) {
		System.out.println(n1);
	}
	
	public static void show1(String n2) {
		System.out.println(n2);
	}
	
	public int add (int a, int b) {
		int c = a+b;
		System.out.println(c);
		return c;
	}
	
	public int add (int a, int b, int e) {
		int f = a+b+e;
		System.out.println(f);
		return f;
	}
	
	public static void main(String args[]) {
		Phone obj = new Phone();
	 obj.add(10,20);
	obj.add(10,20,30);
//	obj.show();
	}
}
//Method Overloading : Same class, Same method, Different parameters
//Method Overriding : Different class, Same method, Same Parameters
