package buffer;

import java.util.StringTokenizer; // 아무 것도 안줬을땐 기준이 띄어쓰기
/* String : split() => regex 기준
 * StringTokenizer : 간단 (구분자를 하나의 문자만 사용 가능)
 */

public class StringTokenEx5 {
	public static void main(String[] args) {
		String str = "x=100*(200+300)/2";
		StringTokenizer token = new StringTokenizer(str,"+*/=()", true); // true : 구분자도 돌려줌 
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
	}
}
