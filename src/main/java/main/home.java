package main;

import fresher.Fresher;

import java.util.Scanner;

public class home {

	public static void main(String[] args) {
		System.out.println("--Quan ly Fresher--");
		Fresher fresher = new Fresher();
		createFresher();

	}
	public static void createFresher() {
		System.out.println("Enter fresher name: ");
		Scanner scanner = new Scanner(System.in);
		String username = scanner.nextLine();
		System.out.println("Your username is " + username);
		scanner.close();
	}
}
