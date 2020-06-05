package test;

public class PrinterEx {
	public static void main(String[] args) {
		Printer printer = new Printer();

		// 오버로딩
		printer.println(10);
		printer.println("홍길동");
		printer.println(15.6);
		printer.println(true);
	}
}
