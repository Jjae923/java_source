package buffer;

import java.util.StringTokenizer; // 아무 것도 안줬을땐 기준이 띄어쓰기
/* String : split() => regex 기준
 * StringTokenizer : 간단 (구분자를 하나의 문자만 사용 가능)
 */

public class StringTokenEx4 {
	public static void main(String[] args) {
		String str = "1,김천재,100,100,100|2,박수재,95,80,90|3,이자바,80,90,90";
		StringTokenizer token = new StringTokenizer(str,",|"); //두개 넣어도 따로 잘라줌 
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
	}
}
