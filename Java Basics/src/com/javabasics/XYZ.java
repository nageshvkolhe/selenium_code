package com.javabasics;

import java.util.Scanner;

public class XYZ {
	
	public XYZ(int i, int j) {
		int c = i + j;
		System.out.println(i);
		System.out.println(j);
		System.out.println(c);
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		XYZ obj = new XYZ( n1, n2);
		
	}
}


//