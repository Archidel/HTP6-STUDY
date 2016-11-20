package by.htp6.finder.loadFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LoadFile {

	public static String loader(){
		
		BufferedReader reader = null;
		String LongString = "";
		String line = null;
		
		try {
			reader = new BufferedReader(new FileReader("src/Email_file.txt"));
			while ((line = reader.readLine()) != null) {
				LongString += line + " ";
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			closeReader(reader);
		}
        
		return LongString;
	}
	
	
	private static void closeReader(BufferedReader reader){
		if(reader != null){
			try {
				reader.close();
			} catch (IOException e) {}
		}
		
	}
}
