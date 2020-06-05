package ch8;

public class StudentEx {
	public static void main(String[] args) {
		
		Student student1 = new Student("1234","홍길동","01012345678","서울","1학년");
		Student student2 = new Student("5678","성춘향","01098765432","경기","2학년");

		System.out.println(student1);  // Student [id=1234, name=홍길동, addr=01012345678, tel=서울, info=1학년]
		System.out.println(student2);  // Student [id=5678, name=성춘향, addr=01098765432, tel=경기, info=2학년]
	}
}
