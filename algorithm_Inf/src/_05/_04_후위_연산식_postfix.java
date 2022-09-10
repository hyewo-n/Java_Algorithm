package _05;
import java.util.*;

public class _04_후위_연산식_postfix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x))    // 숫자면
				stack.push(x-48);       // stack에 push(문자이므로 숫자로 바꿔서)
			else {   // 숫자가 아니면 값 2개 꺼냄
				int rt = stack.pop();
				int lt = stack.pop();
				if(x == '+')
					stack.push(lt+rt);   // 계산 값 다시 stack에 저장
				else if(x == '-')
					stack.push(lt-rt);
				else if(x == '*')
					stack.push(lt*rt);
				else if(x == '/')
					stack.push(lt/rt);
			}
		}
		// 계산이 끝나면 stack에 값은 하나만 남아있을 것
		answer = stack.get(0);
		System.out.println(answer);
	}
}
