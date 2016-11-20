package by.htp6.task2.logic;

public class Logic {
	
	public void solutionNumber(String firstNum, String secondNum){
		char [] fNumChar = firstNum.toCharArray();
		char [] sNumChar = secondNum.toCharArray(); 
		
		if(fNumChar.length < sNumChar.length){
			sNumChar = SecondMore(fNumChar, sNumChar);
		}else{
			fNumChar = firstMore(fNumChar, sNumChar);
		}
		
		System.out.println("-------------------");
		for(char ch: fNumChar){
			System.out.print(ch + " ");
		}
		
		for(char ch: sNumChar){
			System.out.print(ch + " ");
		}
		System.out.println("-------------------");
		
		
		sum(sNumChar, fNumChar);
		
		
		
		
	}

	private void sum(char[] sNumChar, char[] fNumChar) {
		int tempInteger = 0;
		char [] tempChar = new char[sNumChar.length];
		
		int sum = 0;
		for(int i = 0; i < sNumChar.length; i++){
			sum = (Character.getNumericValue(fNumChar[i]) + (Character.getNumericValue(sNumChar[i])));
			tempChar[i] = (char) sum;
		}
		System.out.println("______________________");
		for(int i = 0; i < tempChar.length; i++){
			System.out.print(tempChar[i] + " | ");
		}
		
		
		
		
		
		
		
		
	}

	private char []  firstMore(char[] fNumChar, char[] sNumChar) {
		int difference = fNumChar.length - sNumChar.length;
		char tempChar [] = new char[fNumChar.length];
		
		for(int k = 0; k < difference; k++){
			tempChar[k] = '0';
		}
		
		for(int i = 0, j = (difference); i < sNumChar.length; i++, j++){
			tempChar[j] = sNumChar[i];
			
		}
		
		for(int k = 0; k < tempChar.length; k++){
			System.out.print(tempChar[k] + " | ");
		}
		
		return tempChar;
		
		
	}
	
	private char []  SecondMore(char[] fNumChar, char[] sNumChar) {
		int difference = sNumChar.length - fNumChar.length;
		char tempChar [] = new char[sNumChar.length];
		
		for(int k = 0; k < difference; k++){
			tempChar[k] = '0';
		}
		
		for(int i = 0, j = (difference); i < fNumChar.length; i++, j++){
			tempChar[j] = fNumChar[i];
			
		}
		
		for(int k = 0; k < tempChar.length; k++){
			System.out.print(tempChar[k] + " | ");
		}

		return tempChar;
	}

}
