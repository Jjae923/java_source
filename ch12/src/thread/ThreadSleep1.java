package thread;

public class ThreadSleep1 extends Thread {

	@Override
	public void run() {
		for(int i=0;i<300;i++) {
			System.out.printf("-");
		}
		System.out.println("<< ThreadSleep1 종료 >>");
	}
}
