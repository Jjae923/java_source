package test;

public class MemberEx {
	public static void main(String[] args) {
		Member member = new Member("홍길동", "hong");
		
		
		if (member.login("hong", "1345")) {
			System.out.println("로그인 되었습니다.");
			member.logout();
		}else {
			System.out.println("아이디나 비밀번호를 확인해 주세요.");
		}
	}
	
}
