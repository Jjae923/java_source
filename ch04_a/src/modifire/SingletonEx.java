package modifire;

public class SingletonEx {
	public static void main(String[] args) {
//		Singleton_3 singleton = new Singleton_3();	
								//private로 했기 때문에 사용 할 수 없다
		
		//static Singleton_3 getInstance() {} 해줬기 때문에 
		Singleton_3 singleton = Singleton_3.getInstance();
		Singleton_3 singleton2 = Singleton_3.getInstance();
		System.out.println(singleton==singleton2);
		//CarEx는 다른 값으로 나오지만 Singleton_3는 같은 값이라고 나온다
	}
}
