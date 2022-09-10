package _05;
import java.util.*;

public class _01_올바른_괄호 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		
		for(char x : str.toCharArray()) {
			// '(' 만나면 stack에 저장
			if(x=='(')
				stack.push(x);
			// 아니면 (')') 만나면 stack에서 꺼냄.
			// 그러면 짝꿍인 '('가 나오게 될 것
			else {
				// 근데 꺼내려고 하니 이미 비어있다면? 결과는 NO
				if(stack.isEmpty())
					answer = "NO";
				else
					stack.pop();
			}
		}
		// '('가 더 많은 경우
		if(!stack.isEmpty())
			answer = "NO";			
		System.out.println(answer);
	}
}