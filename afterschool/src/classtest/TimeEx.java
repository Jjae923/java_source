package classtest;

public class TimeEx {
	public static void main(String[] args) {
		
		Time time1 = new Time(23,58,25);
		
		Time time2 = new Time(25,58,25);
		
		System.out.println(time1.getHour()+"시"+time1.getMinute()+"분"+time1.getSecond()+"초");
		System.out.println(time2.getHour()+"시"+time2.getMinute()+"분"+time2.getSecond()+"초");

	}

}
