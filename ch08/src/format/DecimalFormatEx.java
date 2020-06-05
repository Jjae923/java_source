package format;

import java.text.DecimalFormat; 	// 엑셀 사용자 정의와 개념 동일

public class DecimalFormatEx {
	public static void main(String[] args) {
		double num = 1234567.89;
		
		DecimalFormat df = new DecimalFormat("0");  // 정수형태로 나타내줘
		System.out.println(df.format(num));			// 1234568
		
		df = new DecimalFormat("0.0");				// 소수점 첫번째 자리까지 나타내줘
		System.out.println(df.format(num));			// 1234567.9
		
		df = new DecimalFormat("0000000000.00000"); // 부족한 자릿수를 0으로 채워서 나타내줘
		System.out.println(df.format(num));			// 0001234567.89000
		
		df = new DecimalFormat("#");				// 정수형태로 나타내줘 0=#
		System.out.println(df.format(num));			// 1234568
		
		df = new DecimalFormat("#.#");				// 소수점 첫번째 자리까지 나타내줘
		System.out.println(df.format(num));			// 1234567.9
		
		df = new DecimalFormat("##########.#####"); // 모자른 자릿수 채우지않고 #있는만큼 그대로 나타내줘
		System.out.println(df.format(num));			// 1234567.89
		
		df = new DecimalFormat("#.0");				// 소수점 첫번째 자리까지 나타내줘
		System.out.println(df.format(num));			// 1234567.9
		
		df = new DecimalFormat("#.# %");			// 100을 곱해서 %로 나타해줘
		System.out.println(df.format(num));			// 123456789 %

		df = new DecimalFormat("#,###");			// ,넣어서 나타내줘
		System.out.println(df.format(num));			// 1,234,568
	}
}
