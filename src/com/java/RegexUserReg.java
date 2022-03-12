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

	/* enter a valid email abc.xyz@bl.co.in */
	public static void Email() {
		System.out.println("Enter Email id");
		String email = scanner.nextLine();
		if (Pattern.matches("^[a-z]+([.][a-z]+)*@bl+[.]co([.]in)*", email) == true)
			System.out.println("Valid Input passed");
		else
			System.out.println("Invalid input passed");
	}

	/*
	 * entering Mobile Number format, country code follow by space and taking 10
	 * digit number
	 */
	public static void PhoneNumber() {
		System.out.println("Enter Mobile Number");
		String mNumber = scanner.nextLine();
		if (Pattern.matches("^[1-9]{2}\s{1}[1-9]{1}[0-9]{9}$", mNumber) == true)
			System.out.println("Valid Input passed");
		else
			System.out.println("Invalid input passed");
	}

	/* Should have at least 1 numeric number */
	public static void Password() {
		System.out.println("Enter Password");
		String pass = scanner.nextLine();
		if (Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{8}$", pass) == true)
			System.out.println("Valid Input passed");
		else
			System.out.println("Invalid input passed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to user registartion");
		Password();
	}
}
