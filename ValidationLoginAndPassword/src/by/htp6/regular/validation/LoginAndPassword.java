package by.htp6.regular.validation;

import java.util.regex.Pattern;

import by.htp6.regular.constant.RegularConstant;

public class LoginAndPassword {
	
	public boolean validation(String login, String password){
		if(loginIsValid(login) || passwordIsValid(password)){
			return true;
		}else{
			return false;
		}	
	}
	
	private boolean loginIsValid(String login){
		boolean isValid = Pattern.matches(RegularConstant.LOGIN_REG, login);
		return isValid;
	}
	
	private boolean passwordIsValid(String password){
		boolean isValid = Pattern.matches(RegularConstant.PASSWORD_REG, password);
		return isValid;
	}
}
