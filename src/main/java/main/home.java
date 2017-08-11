package main;

import java.util.Scanner;
import employee.*;

public class home {

	public static void main(String[] args) {
		System.out.println("--Quan Ly Nhan Vien--");
		System.out.println("[-Nhap 1-] => Nhap Nhan Vien");
		System.out.println("[-Nhap 2-] => Danh Sach Nhan Vien");
		System.out.println("[-Nhap 3-] => Xoa Nhan Vien");
		Scanner scanner = new Scanner(System.in);

		int menuSelect = Integer.parseInt(scanner.nextLine());
		switch (menuSelect) {
		case 1:
			System.out.println(menuSelect);
			break;
		case 2:
			System.out.println(menuSelect);
			break;
		case 3:
			System.out.println(menuSelect);
			break;

		default:
			break;
		}
		scanner.close();
	}
	public static void createEmployee() {
//		Employee em = new OfficeEmployee("duc","01698712430",360000.00);
//		System.out.println("Enter fresher name: ");
//		Scanner scanner = new Scanner(System.in);
//		String username = scanner.nextLine();
//		System.out.println("Your username is " + username);
//		scanner.close();
	}
}
