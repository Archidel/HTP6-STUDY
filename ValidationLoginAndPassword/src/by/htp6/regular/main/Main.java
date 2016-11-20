package by.htp6.regular.main;

import by.htp6.regular.scanner.ScannerLine;
import by.htp6.regular.validation.LoginAndPassword;

public class Main {

	public static void main(String[] args) {
		
		LoginAndPassword lap = new LoginAndPassword();
		boolean result = false;
		
		while(true){
			System.out.println("Введите логин");
			String login = ScannerLine.scnLine();
			
			System.out.println("Введите пароль");
			String password = ScannerLine.scnLine();
		
			result = lap.validation(login, password);
			System.out.println("result = " + result);
			
		}
		
	}

}
