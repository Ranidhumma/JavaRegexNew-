package com.java;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexUserReg {

	/* First name starts with Cap and has minimum 3 characters */
	public static void FirstName() {
		System.out.println("Enter First Name");
		Scanner scanner = new Scanner(System.in);
		String fN = scanner.nextLine();

		if (Pattern.matches("[A-Z]{1}[a-z]{2,}", fN) == true)
			System.out.println("Valid Input passed");
		else
			System.out.println("Invalid input passed");

		scanner.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to user registartion");
		FirstName();
	}
}
