package ch4;

public class Computer {
	
	int sum(int[] values) {   // 배열로 호출
		int sum=0;
		for(int i=0;i<values.length;i++) {
			sum+=values[i];
		}
		return sum;
	}

}
