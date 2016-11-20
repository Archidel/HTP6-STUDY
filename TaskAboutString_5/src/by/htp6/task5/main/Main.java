package by.htp6.task5.main;

import by.htp6.task5.io.ScannerLine;
import by.htp6.task5.logic.Logic;

public class Main {

	public static void main(String [] args){
		String line = ScannerLine.ScannerText();
		Logic log = new Logic();
		log.logic(line);
	}
}
