package com.java;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexUserReg {
	static Scanner scanner = new Scanner(System.in);

	/* First name starts with Cap and has minimum 3 characters */
	public static void FirstName() {
		System.out.println("Enter First Name");
		String fN = scanner.nextLine();
		if (Pattern.matches("[A-Z]{1}[a-z]{2,}", fN) == true)
			System.out.println("Valid Input passed");
		else
			System.out.println("Invalid input passed");
	}

	/* Last name starts with Cap and has minimum 3 characters */
	public static void LastName() {
		System.out.println("Enter Last Name");
		String lN = scanner.nextLine();
		if (Pattern.matches("[a-z]{2,}[A-Z]{1}", lN) == true)
			System.out.println("Valid Input passed");
		else
			System.out.println("Invalid input passed ");

	}

	/* User need to enter a valid email abc.xyz@bl.co.in */
	public static void Email() {
		System.out.println("Enter Email id");
		String email = scanner.nextLine();
		if (Pattern.matches("^[a-z]+([.][a-z]+)*@bl+[.]co([.]in)*", email) == true)
			System.out.println("Valid Input passed");
		else
			System.out.println("Invalid input passed");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to user registartion");
		// FirstName();
		// LastName();
		Email();
	}
}
