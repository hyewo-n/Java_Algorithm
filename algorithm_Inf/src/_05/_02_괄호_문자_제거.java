package _05;
import java.util.*;

public class _02_괄호_문자_제거 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		String answer ="";
		Stack<Character> stack = new Stack<>();

		for(char x : str.toCharArray()) {
			if(x==')') {
				// pop()은 값을 꺼내기도 하지만 동시에 꺼낸 값을 return 해줌
				// '('가 아니면 계속 실행
				while(stack.pop() != '(');
			}else {   // '('와 알파벳을 만나면 stack에 저장
				stack.push(x);
			}
		}
		
		for(int i=0; i<stack.size(); i++)
			answer += stack.get(i);
		
		System.out.println(answer);
	}
}