package classtest;

public class BadBank extends Bank {
	
	@Override
	public double getinterestRate() {
		return 0.1;
	}
}
