package by.htp6.task4.main;

public class RefracString {
	
	public String refractLine (String line){
		line = line.trim();
		line = line.replaceAll("  ", "");
		line = line.replaceAll(" ", "*");
		return line;
	}
}
