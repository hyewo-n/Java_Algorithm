package _01;

import java.util.Scanner;

public class _03_문장_속_단어 {

	public static void main(String[] args) {
		
		String answer ="";
		// 최댓값으로 계속 갱신을 해야 하기 때문에 처음엔 아예 작은 값으로! 
		// 가장 작은 값으로 초기화
		int max = Integer.MIN_VALUE;
		
		Scanner sc = new Scanner(System.in);
		
		// 단어가 아니라 한 문장을 입력받아야 하기 때문에 next()가 아닌 nextLine() 사용
		String str = sc.nextLine();
		
		// 입력된 문장을 공백을 기준으로 잘라서 배열에 저장
		String[] s = str.split(" ");
		for(String x : s) {
			// 문자 길이 비교를! 말 그대로 문자 길이를 받아와서 진행
			int len = x.length();
			// len>=max는 불가능. 길이가 같다면 앞에 문자를 출력하기로 했기 떄문에
			if(len>max) {
				max = len;
				answer = x;
			}
		}
		System.out.println(answer);
	}
}
