package by.htp6.future.thread;

public class firstThread implements Runnable{
	private int x;
	
	private double result;
	
	public firstThread(int x) {
		this.x  = x;
	}

	@Override
	public void run() {
		double temp = Math.pow(x, 2);
		setResult(temp);
	}
	
	public double getResult() {
		return result;
	}

	private void setResult(double result) {
		this.result = result;
	}
	
}
