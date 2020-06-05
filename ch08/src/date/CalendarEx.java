package date;

import java.util.Calendar;

public class CalendarEx {
	public static void main(String[] args) {
		Calendar claendar = Calendar.getInstance();
		
		System.out.println("이 해의 연도 : "+claendar.get(claendar.YEAR));
		System.out.println("월(0~11, 0:1월) : "+claendar.get(claendar.MONTH));
		System.out.println("이 해의 몇 째 주 : "+claendar.get(claendar.WEEK_OF_YEAR));
		System.out.println("시간(0~11) : "+claendar.get(claendar.HOUR));
		System.out.println("분(0~59) : "+claendar.get(claendar.MINUTE));
		System.out.println("초(0~59) : "+claendar.get(claendar.SECOND));
	}
}
