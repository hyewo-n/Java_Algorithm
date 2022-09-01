package _01;

import java.util.Scanner;

// 아스키 코드를 이용해서도 풀이 가능

public class _02_대소문자_변환 {

	public static void main(String[] args) {
		
		String answer ="";
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		             // String을 기반으로 문자 배열 생성
		for(char x : str.toCharArray()) {
			if(Character.isLowerCase(x))
				answer += Character.toUpperCase(x);
			else
				answer += Character.toLowerCase(x);
			
		}
		
		System.out.println(answer);
		
	}

}
