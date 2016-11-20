package by.htp6.future.thread;

public class secondThread implements Runnable{
	private int x;
	private double result;
	
	public secondThread(int x) {
		this.x  = x;
	}

	@Override
	public void run() {
		double temp = Math.pow(3, x);
		setResult(temp);
	}
	
	public double getResult() {
		return result;
	}

	private void setResult(double result) {
		this.result = result;
	}
}
