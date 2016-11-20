package by.htp6.future.main;

import by.htp6.future.scanner.ScannerLine;
import by.htp6.future.thread.firstThread;
import by.htp6.future.thread.secondThread;

public class Main {
	public static void main(String [] args) throws InterruptedException{
		
		int x = ScannerLine.scnInt();
		
		firstThread first = new firstThread(x);
		secondThread second = new secondThread(x);
		
		Thread th1 = new Thread(first);
		Thread th2 = new Thread(second);
		
		th1.start();
		th2.start();
		
		th1.join();
		th2.join();
		
		double result = second.getResult() / first.getResult();
		
		System.out.println("result = " + result);		
	}
}
