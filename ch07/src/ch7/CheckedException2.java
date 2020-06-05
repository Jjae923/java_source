package ch7;

public class CheckedException2 {
	public static void main(String[] args) {
		
		// 컴파일 단계에서 Exception 여부 확인 가능
		try {
			Class.forName(""); // --> DB연동 시 자주 발생
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("클래스 명을 확인해주세요.");
		}
		
	}

}
