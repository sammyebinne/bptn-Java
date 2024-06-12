package com.bptn.course._03_flow_control._02_ascii_values;

import java.util.Scanner;

public class PrintNextAscii {

	public static void main(String[] args) {
		System.out.println("Enter any single character and I will tell you the ASCII number of its next character!");

		try (Scanner scanner = new Scanner(System.in)) {

			String input = scanner.next();
			char symbol = input.charAt(0);
			
			symbol = (char) (symbol + 1);

			int asciiCode = symbol;
			

			System.out.println("The ASCII value of " + symbol + " is: " + asciiCode);

		}

	}

}
