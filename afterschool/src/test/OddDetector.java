package test;

public abstract class OddDetector {
	
	private int n;
	
	public OddDetector(int n) {
		super();
		this.n = n;
	}

	protected int getN() {
		return n;
	}
	
	public abstract boolean isOdd();
	
}
