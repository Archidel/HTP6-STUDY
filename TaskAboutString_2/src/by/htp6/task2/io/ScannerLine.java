package by.htp6.task2.io;

import java.util.Scanner;

public class ScannerLine {
	public static String ScannerText(){
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		System.out.print(">");
		String line = scn.nextLine();
		return line;
	}
}
