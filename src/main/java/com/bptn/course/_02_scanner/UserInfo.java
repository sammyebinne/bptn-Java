package com.bptn.course._02_scanner;

import java.util.Scanner;

public class UserInfo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name, favorite city, age and salary");
		
		String name = scanner.nextLine();
		String favCity = scanner.nextLine();
		int age = scanner.nextInt();
		double salary = scanner.nextDouble();
		
		scanner.close();
		
		
		System.out.println(name);
		System.out.println(favCity);
		System.out.println(age);
		System.out.println(salary);
		
	}

}
