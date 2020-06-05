package poly;

public class KumhoTire extends Tire {

	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
	}
	
	@Override
	public boolean roll() {
		int accmulatedRotation = getAccumulatedRotation();
		setAccumulatedRotation(++accmulatedRotation);
		if(getAccumulatedRotation() < getMaxRotation()){
			System.out.println(getLocation() + "KumhoTire 수명 : "+(getMaxRotation()-getAccumulatedRotation())+" 회");
			return true;
		}else {
			System.out.println("*** "+getLocation()+" Tire 펑크 ***");
			return false;
		}
	}


}
