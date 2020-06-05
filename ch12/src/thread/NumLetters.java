package thread;

public class NumLetters extends Thread {

	@Override
	public void run() {
		for(int i=1;i<=30;i++) {
			System.out.print(i+"  ");
		}
	}
}
 