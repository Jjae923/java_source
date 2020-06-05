package Class;

public class Accumulator_33 {
	int total = 0;
	static int grandTotal = 0;	//static 다른 공간에 고정
	void accumulate(int amount) {
		total += amount;
		grandTotal += amount;
	}
}
