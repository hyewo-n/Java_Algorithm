package _05;
import java.util.*;

public class _02_��ȣ_����_���� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		String answer ="";
		Stack<Character> stack = new Stack<>();

		for(char x : str.toCharArray()) {
			if(x==')') {
				// pop()�� ���� �����⵵ ������ ���ÿ� ���� ���� return ����
				// '('�� �ƴϸ� ��� ����
				while(stack.pop() != '(');
			}else {   // '('�� ���ĺ��� ������ stack�� ����
				stack.push(x);
			}
		}
		
		for(int i=0; i<stack.size(); i++)
			answer += stack.get(i);
		
		System.out.println(answer);
	}
}