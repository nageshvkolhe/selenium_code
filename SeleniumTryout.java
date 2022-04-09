package com.facebook;

import java.util.Scanner;

public class SeleniumTryout {

	public static void main(String[] args) {
		System.out.println("Select a Browser : \n1. Chrome " +"\n2. Opera" +"\n3. Edge" );
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		
		switch (choice) {
		case 1:
			Store.chrome();
			break;
		case 2:
			Store.opera();
			break;
		case 3:
			Store.edge();
		}
		
		Store.takeScreenshot();
	}
}



