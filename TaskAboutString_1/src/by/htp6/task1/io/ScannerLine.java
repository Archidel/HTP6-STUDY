package by.htp6.task1.io;

import java.util.Scanner;

public class ScannerLine {
	public static String scnText(){
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		System.out.print(">");
		return scn.nextLine();
	}
}
