package _01;

import java.util.Scanner;

// �ƽ�Ű �ڵ带 �̿��ؼ��� Ǯ�� ����

public class _02_��ҹ���_��ȯ {

	public static void main(String[] args) {
		
		String answer ="";
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		             // String�� ������� ���� �迭 ����
		for(char x : str.toCharArray()) {
			if(Character.isLowerCase(x))
				answer += Character.toUpperCase(x);
			else
				answer += Character.toLowerCase(x);
			
		}
		
		System.out.println(answer);
		
	}

}
