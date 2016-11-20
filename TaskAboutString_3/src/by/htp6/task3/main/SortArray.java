package by.htp6.task3.main;

public class SortArray {
	
	public String [] SortedArray(String [] array){	//пузырёчек :D
		
		for(int i = array.length-1; i > 0 ; i--){
			for(int j = 0 ; j < i ; j++){
				String[] firstWords = array[j].split(" ");
				String[] secondWords = array[j + 1].split(" ");
				if(firstWords[0].charAt(0) > secondWords[0].charAt(0)){
					String temp = array[j];
					array[j] = array[j + 1];
					array[j+1] = temp;
				}
			}
		}
		
		return array;	
	}
}
