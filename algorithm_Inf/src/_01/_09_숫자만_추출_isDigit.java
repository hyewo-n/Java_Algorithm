package _01;
import java.util.*;

// ���� ����
public class _09_���ڸ�_����_isDigit {

	public static void main(String[] args) {
		
		String answer = "";
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(char x : str.toCharArray()) {
			// x�� ���ڸ�(isDigit) answer�� �߰�
			if(Character.isDigit(x))
				answer += x;
		}
		
		// String���� �ϸ� �� �տ� 0�� �����ϱ� int�� ����ȯ
		int s = Integer.parseInt(answer);
		
		System.out.println(s);
		
	}
}
