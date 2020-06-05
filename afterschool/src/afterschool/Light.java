package afterschool;

public class Light {
	public static void main(String[] args) {
		// 빛이 1년동안 가는 거리를 구하는 프로그램
		// 1초에 300,000 갈 때
		long x = 300000; // 메소드 안의 변수는 메소드가 끝나면 사라지기때문에 로컬변수라고 부른다
				
		long result = x*60*60*24*365;
		
		System.out.println(result);
		
		// 하루는 몇초? 24*60*60 * 365
		long distance = 300000*365L*24*60*60; // L을 붙이지않으면 int로 따라가기 때문에 마이너스 뜸! / L붙이면 long타입으로 따라감
		
		System.out.println("1년 동안 가는 거리 : "+distance);
		
			
		
	}

}
