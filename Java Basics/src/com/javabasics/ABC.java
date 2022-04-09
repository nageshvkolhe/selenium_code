package com.javabasics;

public class ABC {
	public ABC(int i){
		System.out.println("Value : " +i);
	}
	public ABC(int j, double k) {
		System.out.println("Value1: " +j+ "  Value2: " +k );
	}

	public static void main(String args[]) {
		ABC obj = new ABC(15);
		ABC obj1 = new ABC(10, 20);
	}
}
