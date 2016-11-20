package by.htp6.finder.findAccountName;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.htp6.finder.constant.RegularConstant;
import by.htp6.finder.loadFile.LoadFile;

public class FindAccountName {
	
	public void finder(){
		ArrayList<String> list = new ArrayList<>(); // массив из account_name
		String LongLine = LoadFile.loader();
		
		Pattern pattern = Pattern.compile(RegularConstant.LOGIN_REG);
		Matcher matcher = pattern.matcher(LongLine);

		while(matcher.find()){
			System.out.println(matcher.group(0));
			list.add(matcher.group(1));
		}
		calculateAccountName(list);		
	}
	
	private void calculateAccountName(ArrayList<String> list){
		int maxCount = 0;
		String maxString = null;
		
		for(int i = 0; i < list.size(); i++){
			maxCount = 0;		
			for(int j = 0; j < list.size(); j++){
				if(i != j){
					if(list.get(i).equals(list.get(j))){
						maxString = list.get(i);
					}
				}
			}
		}
		
		for(String line: list){
			if(line.equals(maxString)){
				maxCount++;
			}
		}
		
		System.out.println("MaxString = " + maxString);
		System.out.println("MaxCount = " + maxCount);
	}
	
}
