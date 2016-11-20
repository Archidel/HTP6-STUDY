package by.htp6.future.scanner;

import java.util.Scanner;

public class ScannerLine {
	public static int scnInt(){
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		System.out.println("Введите число x");
		System.out.print(">");
		int number = scn.nextInt();
		return number;
	}
}
