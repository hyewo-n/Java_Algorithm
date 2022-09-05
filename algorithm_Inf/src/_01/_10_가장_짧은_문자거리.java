package _01;
import java.util.*;

public class _10_가장_짧은_문자거리 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);
		
		int[] answer = new int[str.length()];
		
		// 문자열의 길이가 100을 넘지 않는다고 했으니 그보다 큰 숫자로 설정
		int p = 1000;
		
		// 첫 번째 for문. 앞에서부터
		for(int i=0; i<str.length(); i++) {
			// 입력한 문자와 같으면 p=0으로 바꿔줌
			if(str.charAt(i)==c) {
				p=0;
				answer[i]=p;
			}
			// 입력한 문자와 같지 않으면 1씩 증가
			else {
				p++;
				answer[i]=p;
			}
		}
		// 실행결과 
		// 1001 0 1 2 3 0 1 2 3 4 0 
		
		p=1000;
		
		// 두 번째 for문 (뒤에서부터)
		for(int i=str.length()-1; i>=0; i--) {
			if(str.charAt(i)==c) {
				p=0;
			}
			else {
				p++;
				answer[i]=Math.min(answer[i], p);
				// 기존 값보다 작은 경우에만 값을 바꿈.
			}
		}
		
		for(int j=0; j<answer.length; j++) {
			System.out.print(answer[j] + " ");			
		}	
	}
}
