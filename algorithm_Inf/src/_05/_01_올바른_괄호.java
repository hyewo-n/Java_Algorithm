package _05;
import java.util.*;

public class _01_�ùٸ�_��ȣ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		
		for(char x : str.toCharArray()) {
			// '(' ������ stack�� ����
			if(x=='(')
				stack.push(x);
			// �ƴϸ� (')') ������ stack���� ����.
			// �׷��� ¦���� '('�� ������ �� ��
			else {
				// �ٵ� �������� �ϴ� �̹� ����ִٸ�? ����� NO
				if(stack.isEmpty())
					answer = "NO";
				else
					stack.pop();
			}
		}
		// '('�� �� ���� ���
		if(!stack.isEmpty())
			answer = "NO";			
		System.out.println(answer);
	}
}