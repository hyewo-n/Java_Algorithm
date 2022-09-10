package _05;
import java.util.*;

public class _04_����_�����_postfix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x))    // ���ڸ�
				stack.push(x-48);       // stack�� push(�����̹Ƿ� ���ڷ� �ٲ㼭)
			else {   // ���ڰ� �ƴϸ� �� 2�� ����
				int rt = stack.pop();
				int lt = stack.pop();
				if(x == '+')
					stack.push(lt+rt);   // ��� �� �ٽ� stack�� ����
				else if(x == '-')
					stack.push(lt-rt);
				else if(x == '*')
					stack.push(lt*rt);
				else if(x == '/')
					stack.push(lt/rt);
			}
		}
		// ����� ������ stack�� ���� �ϳ��� �������� ��
		answer = stack.get(0);
		System.out.println(answer);
	}
}
