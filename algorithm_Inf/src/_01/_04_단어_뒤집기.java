package _01;

import java.util.*;

public class _04_�ܾ�_������ {

	public static void main(String[] args) {
		
		ArrayList<String> answer = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str[] = new String[n];
		for(int i = 0; i < n; i++) {
			str[i] = sc.next();
		}
		
		for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}

		for(String m : answer) {
			System.out.println(m);
		}
		
	}

}
/*
	String���� ��ü�� �����ϸ� �� ���� ������ �� ����.
	�׷��� ���ο� ��ü�� �����ؼ� ����� ���� �ٽ� �����ؾ� ��
	  -> ��ü�� ��� �����Ǵ� ����!
	StringBuilder�� replace, delete ��� ó���� ������ ��ü�� ��� ����
	�׷��� ��ü�� ���� �� ������ �ʾƵ� �ż� �޸� ���� ����.
*/