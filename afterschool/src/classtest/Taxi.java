package classtest;

public class Taxi extends Transport {

	public Taxi(Passenger passenger, int money, int number, String startLocation, String endLocation) {
		super(passenger, money, number, startLocation, endLocation);
	}
	
	public void showTaxiInfo() {
		System.out.println("택시번호 : "+getNumber());
	}
}
