package _05;
import java.util.*;

public class _05_�踷��� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int answer=0;
		Stack<Character> stack= new Stack<>();
		
		// toCharArray�� �����ϸ� �ٷ� ���� ���� Ȯ���ϱ� �����Ƿ� �ε����� ����
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='(')
				stack.push('(');
			else {
				stack.pop();
				if(str.charAt(i-1)=='(')      // �������� ��쿡
					answer += stack.size();   // ���� �� ������
				else                          // ������� ���� ��� 
 					answer++;                 // ���� ������� ���� �ϳ��� ������
			}
		}
		System.out.println(answer);
	}
}