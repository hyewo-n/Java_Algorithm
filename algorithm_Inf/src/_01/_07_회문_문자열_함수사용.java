package _01;
import java.util.*;

public class _07_ȸ��_���ڿ�_�Լ���� {

	public static void main(String[] args) {

		String answer = "NO";
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		// �Է¹��� ���� ����� ����
		String tmp = new StringBuilder(str).reverse().toString();
		
		// �׳� equals�� ��ҹ��ڸ� ������.
		if(str.equalsIgnoreCase(tmp)) 
			answer = "YES";
		
		System.out.println(answer);
	}
}