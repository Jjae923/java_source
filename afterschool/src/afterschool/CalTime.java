package afterschool;

public class CalTime {
	public static void main(String[] args) {
		// 지구에서 가장 가까운 별까지의 거리 계산하기
		
		// 프록시마 센타우리별
		// 지구로부터 40*10의 12승 km 떨어져있음
		// 40000000000000
		
		// 빛의 속도(초당 300000)로 갔을 때 걸리는 시간은 얼마인가?
		
		long distance = 40*1000000000000L;
		long time = 300000/(60*60*24);
				
		System.out.println((distance/time)*Math.PI);
		
		// 풀이
		// long(8byte) < double(8byte)
		double light_speed = 30e4d; // 300000=30e4d; 0이 4개 더 온다
		double distance2 = 40e12d;
		
		// 거리 / 초 => 몇초가 걸리지?
		double secs = distance2 / light_speed;
		
		double light_year = secs / (60*60*24*365.0);
		System.out.println("걸리는 년도는 "+light_year+" 광년입니다.");
		
		
	}

}
