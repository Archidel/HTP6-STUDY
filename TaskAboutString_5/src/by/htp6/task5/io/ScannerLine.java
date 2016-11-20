package by.htp6.task5.io;

import java.util.Scanner;

public class ScannerLine {
	public static String ScannerText(){
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		System.out.println("Введите слово");
		System.out.print(">");
		String line = scn.nextLine();
		return line;
	}
}
