package by.htp6.task3.main;

import by.htp6.task3.io.Print;

public class Main {
	
	public static void main(String [] args){
		String [] array = {
				"You have come very fast.", 
				"My car wont start.", 
				"I read the letter. Stood up. Sat down. Pondered for a minute. Then reread the letter again.", 
				"It becomes dark very fast here.", "It seems that you have made a rude mistake.", 
				"Everything should be made as simple as possible but not simple",
				"Well done is better than well said",
				"I will always choose a lazy person to do a difficult job because he will find an easy way to do it",
				"No matter how hard the past, you can always begin again",
		};
		
		System.out.println("Исходный массив");
		Print.printArray(array);
		
		System.out.println("-----------------------------------------------------");
		
		SortArray sa = new SortArray();
		Print.printArray(sa.SortedArray(array));
	}
	
}
