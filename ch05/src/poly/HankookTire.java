package poly;

public class HankookTire extends Tire {

	public HankookTire(int maxRotation, String location) {
		super(maxRotation, location);
	}
	
	@Override
	public boolean roll() {
		int accmulatedRotation = getAccumulatedRotation();
		setAccumulatedRotation(++accmulatedRotation);
		if(getAccumulatedRotation() < getMaxRotation()){
			System.out.println(getLocation() + "HankookTire 수명 : "+(getMaxRotation()-getAccumulatedRotation())+" 회");
			return true;
		}else {
			System.out.println("*** "+getLocation()+" Tire 펑크 ***");
			return false;
		}
	}


}
