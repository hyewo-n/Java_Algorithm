package _05;
import java.util.*;

public class _05_쇠막대기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int answer=0;
		Stack<Character> stack= new Stack<>();
		
		// toCharArray로 접근하면 바로 앞의 값을 확인하기 어려우므로 인덱스로 접근
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='(')
				stack.push('(');
			else {
				stack.pop();
				if(str.charAt(i-1)=='(')      // 레이저인 경우에
					answer += stack.size();   // 막대 수 더해줌
				else                          // 막대기의 끝인 경우 
 					answer++;                 // 끝난 막대기의 조각 하나를 더해줌
			}
		}
		System.out.println(answer);
	}
}