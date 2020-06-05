package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date); // Date : 현재 시스템 날짜 가져오기
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(date));
		// HH : 24시 기준 / SSS(1초/1000분)
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS"); // M : 월 / m : 분
		System.out.println(sdf.format(date));
		// hh : 12시 기준 / a(am/pm)
		sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		System.out.println(sdf.format(date));
		// D : 년의 몇 번째 일
		sdf = new SimpleDateFormat("오늘은 올 해의 D번째 날입니다.");
		System.out.println(sdf.format(date));
		// d : 월의 몇 번째 일
		sdf = new SimpleDateFormat("오늘은 올 해의 d째 날입니다.");
		System.out.println(sdf.format(date));
		// w : 년의 몇 번째 주
		sdf = new SimpleDateFormat("오늘은 올 해의 w번째 날입니다.");
		System.out.println(sdf.format(date));
		// W : 월의 몇 번째 주
		sdf = new SimpleDateFormat("오늘은 올 해의 W째 날입니다.");
		System.out.println(sdf.format(date));
		// f : 월의 몇 번째 요일 / E : 요일
		sdf = new SimpleDateFormat("오늘은 이 달의 F째 날입니다.");
		System.out.println(sdf.format(date));
		
	}
}
