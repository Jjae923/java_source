package Array;

import java.util.Scanner;

public class ArrayTest13 {
	public static void main(String[] args) {
		String words[] = {"television", "computer", "mouse", "phone"};
		
		Scanner sc = new Scanner(System.in);
								//System.in → 키보드 입력 받음
		
		//자르는 방법"phone → [0]=p, [1]=h, [2]=o, ...
		//toCharArray(); 쓰면 char array(배열)로 만들어줄게
//		char[] question = words[0].toCharArray();
		//만들어줘봐
		
//		for (char ch : question) {
//			System.out.println(ch + " ");
//		}
	
		//=================================================
		for (int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray();	//words[i]번째.문자열을 문자배열로 바꿔주고 = question배열변수에 넣어준다("mouse" -> 'm','o','u',...)
			for (int j = 0; j < question.length; j++) {
				int pos = (int)(Math.random()*question.length);	
						// 0~4 random으로 돌림() question.length 퀘스션의 글자길이(mouse = 5개)
				char temp = question[j];		//question[j]번째 문자를 temp 넣고
				question[j] = question[pos];	//question 배열에 [pos] 번째 문자를 question 배열 [j]번째에 넣고
				question[pos] = temp;			//temp에 있는 문자를 question 배열에 [pos] 번째에 넣는다
			}
			System.out.printf("Q%d > %s 의 정답을 입력하세요\n", new String(question));
			
			//사용자의 정답 받아들이기
			String answer = sc.nextLine();	//sc.nextLine() 사용자로 부터 문자열 입력받아서 = String answer에 넣는다
											//sc.nextInt() 사용자로 부터 숫자를 입력받는다
			//정답과 비교 후 맞았는지 틀렸는지 출력해주기
			if (answer.equals(words[i])) {	//answer 문자열이 words배열에 [i]번째 문자열과 같은지(equals : 문자열 같은지 확인) 확인
				System.out.println("맞았음");
			} else {
				System.out.println("틀렸음");
			}
			
		}
	}
}
