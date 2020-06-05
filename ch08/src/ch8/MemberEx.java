package ch8;

public class MemberEx {
	public static void main(String[] args) {

		Member member1 = new Member("seng");
		Member member2 = new Member("seng");
		
		System.out.println(member1.equals(member2));  // true
		
		System.out.println(member1.toString());  // seng
		System.out.println(member2.toString());  // seng
	}
}
