package by.htp6.task1.main;

import by.htp6.task1.io.Print;

public class Algorithm {
	
	public void algorithm(String word, char [][] array){	
	
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length-1; j++){	
				if(word.charAt(0) == array[i][j]){	//находим первый символ который совпал
					
					if(j <= array.length - 1){	// а вдруг след. символ для проверки за границей массива
						if(word.charAt(1) == array[i][j + 1]){	//находим второе совпадение со вторым символом
							if(deepCheck(array, i, j, 'h', word.toCharArray())){	//Проверяем координаты слова более тщательней
								Print.printAnswer(array, i, j, 'h', word.toCharArray().length); //вывод ответа
							}else{
								break;
							}
						}
					}
					
					if( i <= array[i].length-1){
						if(word.charAt(1) == array[i+1][j]){
							if(deepCheck(array, i, j, 'v', word.toCharArray())){
								Print.printAnswer(array, i, j, 'v', word.toCharArray().length);
							}else{
								break;
							}
						}	
					}
				
				}
				
			}
		}
	}
	
	private boolean deepCheck(char[][] array, int i, int j, char direction, char[] wordChar){ 
		int lenghtWordChar = wordChar.length;		
		boolean findWord = false;
		
		if('h' == direction){
			if((j + lenghtWordChar) <= array.length){
				if(array[i][j + lenghtWordChar-1] == wordChar[lenghtWordChar - 1]){	//сравниваем последий символ заданного слова и ячейки массива где условно должен находиться последний символ
					findWord = true;												
				}
			}
		}
	
		if('v' == direction){
			if((i + lenghtWordChar) <= array.length){
				if(array[i + lenghtWordChar-1][j] == wordChar[lenghtWordChar - 1]){ 
					findWord = true;
				}	
			}
		}
	
		return findWord;
	}

	
}