package com.bptn.course._03_flow_control._01_if_statement;

import java.util.Scanner;

public class NegNumbers {

	public static void main(String[] args) {
		
		System.out.println("Enter any number, positive or negative");
		
		try (Scanner scanner = new Scanner(System.in)) {

			// store the number in a variable
			int num = scanner.nextInt();

			// check if variable is negative using a conditional statement
			// condition for the statement above should check if number is less than 0
			String result;
			if (num < 0) {
				result = num + " is negative";
			} else if (num == 0) {
				result = num + " is neutral";
			} else {
				result = num + " is positive";
			}

			// return the result
			System.out.println(result);
		}

	}

}
