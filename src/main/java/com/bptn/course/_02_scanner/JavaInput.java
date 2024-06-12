package com.bptn.course._02_scanner;

import java.util.Scanner;

public class JavaInput {

	public static void main(String[] args) {
		
		Scanner instance = new Scanner(System.in);
		
		System.out.println("Enter your username below");
		String userName = instance.nextLine();
		instance.close();
		
		
		System.out.println("Your username is " + userName);
	}

}
