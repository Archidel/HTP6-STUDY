package by.htp6.task1.main;

import by.htp6.task1.io.ScannerLine;
import by.htp6.task1.io.Print;

public class Main {
	
	public static void main(String [] args){
		char [][] array = {
				{'P', 	'e',	'r', 	'h',	'a',	'p',	's',	'g',	'o'},
				{'w',	'v',	'e',	'r',	'y', 	's',	'u',	'r',	'e'},
				{'a',	'a',	'g',	'r',	'e',	'e',	'n',	'o',	't'},
				{'y',	'N',	'i',	'm',	'b',	'g',	'a',	'm',	'e'},
				{'a',	'o',	'd',	'o',	'i',	'p',	'a',	's',	's'},
				{'f',	'q',	'e',	's',	't',	'p',	'a',	'i',	'n'},
				{'r',	'u',	'a',	't',	'r',	'i',	'g',	'h',	't'},
				{'a',	'i',	'l',	'o',	'o',	'k',	'i',	'n',	'g'},
				{'i',	't',	'f',	'o',	'r',	'w',	'a',	'r',	'd'},
				{'d',	'e',	't',	'h',	'i',	'n',	'k',	's',	'o'},
		};
		
		System.out.println("Массив:");
		Print.printArray(array);
		
		while(true){
			System.out.println();
			System.out.println("Введите слово");
			String word = ScannerLine.scnText();
			
			Algorithm alg = new Algorithm();
			alg.algorithm(word, array);
			
		}
		
	}
}
