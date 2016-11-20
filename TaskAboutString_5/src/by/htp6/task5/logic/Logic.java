package by.htp6.task5.logic;

import by.htp6.task5.io.PrintAnswer;

public class Logic {
	
	public void logic(String line){
		boolean generalResult = generaVerif(line);
		PrintAnswer.statusVer(generalResult);
	}
	
	private boolean generaVerif(String line){
		boolean result = false;
		if(verificationIndif(line) && (verificationChar(line.toCharArray()))){
			result = true;
		}else{
			result = false;
		}
		
		return result;
	}
	
	private boolean verificationIndif(String line){
		String [] identifiers = {
				"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", 
				"const", "continue", "default", "do", "double", "else", "enum", "final", "finally", 
				"float", "for", "if", "do", "goto", "else", "implements", "import", "instanceof", 
				"int", "interface", "long", "native", "new", "package", "private", "protected", "public", 
				"return", "short", "static", "strictfp", "super", "switch", "synchronized", "this", "throw", 
				"throws", "transient", "try", "void", "volatile", "while" 
		};
		boolean result = false;
		
		for(int i = 0; i < identifiers.length; i++){
			if(identifiers[i].equals(line)){
				result = false;
				break;
			}else{
				result = true;
			}
		}
		return result;
	}
	
	private boolean verificationChar(char [] array){
		boolean result = false;
		for(int i = 0; i < array.length; i++){
			if(Character.isLetterOrDigit(array[i])){
				if(Character.getNumericValue(array[i]) != -1){
					result = true;
				}else{
					result = false;
					break;
				}
			}else{
				if(array[i] == '_'){	
					result = true;
				}else{
					result = false;
					break;
				}
			}
		}
		
		
		
		
		
		
		
		
		/*		boolean varif = false;
		for(int i = 0; i < array.length; i++){
			if(Character.isLetterOrDigit(array[i])){
				System.out.println("isLetterOrDigit = "  + true);
			}else{
				System.out.println("isLetterOrDigit = "  + false);
			}
			
			if(Character.isDigit(array[i])){
				System.out.println("isDigit = "  + true);
			}else{
				System.out.println("isDigit = "  + false);
			}
			
			System.out.println(Character.getNumericValue(array[i]));
			
			if(Character.isDefined(array[i])){
				System.out.println("isDefined = "  + true);
			}else{
				System.out.println("isDefined = "  + false);
			}
			
		//	System.out.println(Character.isIdentifierIgnorable(str));
		}*/
		
		
		
		return result;
	}
}
