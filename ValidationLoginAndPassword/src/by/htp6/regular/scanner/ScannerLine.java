package by.htp6.regular.scanner;

import java.util.Scanner;

public class ScannerLine {
	public static String scnLine(){
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		System.out.print(">");
		String line = scn.nextLine();
		return line;
	}
}
