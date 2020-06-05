package Class;

public class AccumulatorEx_34 {
	public static void main(String[] args) {
		Accumulator_33 acc1 = new Accumulator_33();
		acc1.accumulate(10);	//amount에 10넘긴다
		
		Accumulator_33 acc2 = new Accumulator_33();
		acc2.accumulate(200);
		
		System.out.printf("acc1 total = %d, grandTotal = %d\n", acc1.total, Accumulator_33.grandTotal);	
																		  //Accumulator_33.grandTotal 클래스가 미리 올라왔기 때문에 클래스로 써줌
		System.out.printf("acc2 total = %d, grandTotal = %d", acc2.total, Accumulator_33.grandTotal);
	}
}
