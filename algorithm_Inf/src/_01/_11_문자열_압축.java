package _01;
import java.util.*;

public class _11_문자열_압축 {
 
	public static void main(String[] args) {

		String answer = "";
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str = str + " ";
		
		int cnt = 1;
		
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				cnt ++;
			} else {
				answer = answer + str.charAt(i);
				if(cnt>1)
					answer += Integer.toString(cnt);
				cnt = 1;
			}
		}
		
		System.out.println(answer);
		
	}
}

/*
 *	문자열 s에서 i와 i+1의 값을 비교
 *	(맨 끝의 문자열도 비교해야 하기 때문에 s에 " " 빈문자열 하나 추가해줌.)
 *
 *	값이 같으면? cnt 값 1 증가
 *	값이 다르면?
 *		1. answer에 s(i) 값 저장
 *		2. answer에 cnt 값 저장
 *		       단, cnt의 값이 1인 경우에는 저장하지 않음
 *		3. cnt 값 1로 초기화
 */