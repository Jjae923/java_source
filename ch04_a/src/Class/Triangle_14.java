package Class;

public class Triangle_14 {
		
//		필드
//		밑변
//		높이
		
//		기능 - 메소드 getArea()
//		면적구하기 : 리턴타입 : double / 밑변 * 높이 / 2
//		구현기능 : 클래스의 필드를 이용하여 면적구하기
		
		//필드
		int baseLine;
		int height;
		
		Triangle_14(int baseLine, int height) {
			this.baseLine = baseLine;
			this.height = height;
		}
		
		double getArea(int baseLine, int hight) {
			return (baseLine*height) / 2;
		}

}
