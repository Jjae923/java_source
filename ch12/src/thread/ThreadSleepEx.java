package thread;

public class ThreadSleepEx {
	public static void main(String[] args) {
	
	ThreadSleep1 t1 = new ThreadSleep1();
	ThreadSleep2 t2 = new ThreadSleep2();
	
	t1.start();
	t2.start();
	
	try {
		Thread.sleep(2000);	// sleep을 쓰는 객체가 영향을 받음
	} catch(InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("<< main Thread 종료 >>");
	
	}
}
 