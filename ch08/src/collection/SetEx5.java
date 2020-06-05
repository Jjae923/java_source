package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx5 {
	public static void main(String[] args) {
		Set<MemberVO> set = new HashSet<MemberVO>();
		
		// MemberVO 객체를 생성한 후 Set에 담기
		// 단, id와 pwd가 같은 경우 담지 않도록 설정
		set.add(new MemberVO("seng", "ha12312", "하성운"));
		set.add(new MemberVO("gooreum", "ha12312", "하구름"));
		set.add(new MemberVO("seng", "ha12312", "하성운"));
		set.add(new MemberVO("hee", "yeye", "정재희"));
		
		System.out.println(set);
	}
}
