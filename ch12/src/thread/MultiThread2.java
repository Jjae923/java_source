package thread;

public class MultiThread2 {
	
	static long startTime;
	
	public static void main(String[] args) {
		
		InputThread it = new InputThread();
		it.start();
		
		for(int i=10;i>0;i--) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
