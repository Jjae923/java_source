package modifire;

public class DataEx {
	public static void main(String[] args) {
		Data_6 data = new Data_6();

		data.x = 10;
		System.out.println("main() : x = " + data.x);
		// change 따로 공간이 있다 - x는 서로 다른 값이다
		// x = 10 값을 change에 던져줬다
//		change(data.x);
		change(data);
		System.out.println("main() : x = " + data.x);
	}

//	static void change(int x) {
//		x = 20;
//		System.out.println("change() : x = " + x);
//	}

//	static void change(Data_6 d) {
//		d.x = 20;
//		System.out.println("change() : x = " + d);
//	}

	static Data_6 change(Data_6 d) {
		d.x = 20;
		System.out.println("change() : x = " + d);
		return d;
	}
}
