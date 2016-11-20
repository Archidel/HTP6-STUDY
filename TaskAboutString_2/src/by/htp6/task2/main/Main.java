package by.htp6.task2.main;

import by.htp6.task2.io.ScannerLine;
import by.htp6.task2.logic.Logic;

public class Main {
	
	public static void main(String [] args){
		Logic log = new Logic();
		
		System.out.println("enter first number");
		String firstLine = ScannerLine.ScannerText();
		
		System.out.println("enter second number");
		String secondLine = ScannerLine.ScannerText();

		log.solutionNumber(firstLine, secondLine);
		
	}

}
