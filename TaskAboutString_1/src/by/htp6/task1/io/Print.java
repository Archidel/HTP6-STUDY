package by.htp6.task1.io;

public class Print {
	
	public static void printArray(char[][] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	public static void printAnswer(char[][] array, int i, int j, char direction, int lenghtWord) {

		System.out.println("Слово найдено!");
		
		System.out.println("Начало слова: i = " + i +" j = " + j);
		
		if('h' == direction){
			for(int x = 0; x < lenghtWord; x++, j++){
				System.out.print(" |" + array[i][j] + "|");
			}	
		}
		
		if('v' == direction){
			for(int x = 0; x < lenghtWord; x++, i++){
				System.out.print(" |" + array[i][j] + "|");
			}
		}
	}
	
	
}
