package _01;
import java.util.*;

public class _11_���ڿ�_���� {
 
	public static void main(String[] args) {

		String answer = "";
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str = str + " ";
		
		int cnt = 1;
		
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				cnt ++;
			} else {
				answer = answer + str.charAt(i);
				if(cnt>1)
					answer += Integer.toString(cnt);
				cnt = 1;
			}
		}
		
		System.out.println(answer);
		
	}
}

/*
 *	���ڿ� s���� i�� i+1�� ���� ��
 *	(�� ���� ���ڿ��� ���ؾ� �ϱ� ������ s�� " " ���ڿ� �ϳ� �߰�����.)
 *
 *	���� ������? cnt �� 1 ����
 *	���� �ٸ���?
 *		1. answer�� s(i) �� ����
 *		2. answer�� cnt �� ����
 *		       ��, cnt�� ���� 1�� ��쿡�� �������� ����
 *		3. cnt �� 1�� �ʱ�ȭ
 */