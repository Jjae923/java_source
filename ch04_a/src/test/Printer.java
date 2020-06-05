package test;

public class Printer {
	// println 오버로딩 - 하나의 클래스에 무겁게 올라가 있는 것
	void println(int num) {
		System.out.println(num);
	}

	void println(String name) {
		System.out.println(name);
	}

	void println(double num) {
		System.out.println(num);
	}

	void println(boolean flag) {
		System.out.println(flag);
	}

}
