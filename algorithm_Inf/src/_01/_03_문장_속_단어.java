package _01;

import java.util.Scanner;

public class _03_����_��_�ܾ� {

	public static void main(String[] args) {
		
		String answer ="";
		// �ִ����� ��� ������ �ؾ� �ϱ� ������ ó���� �ƿ� ���� ������! 
		// ���� ���� ������ �ʱ�ȭ
		int max = Integer.MIN_VALUE;
		
		Scanner sc = new Scanner(System.in);
		
		// �ܾ �ƴ϶� �� ������ �Է¹޾ƾ� �ϱ� ������ next()�� �ƴ� nextLine() ���
		String str = sc.nextLine();
		
		// �Էµ� ������ ������ �������� �߶� �迭�� ����
		String[] s = str.split(" ");
		for(String x : s) {
			// ���� ���� �񱳸�! �� �״�� ���� ���̸� �޾ƿͼ� ����
			int len = x.length();
			// len>=max�� �Ұ���. ���̰� ���ٸ� �տ� ���ڸ� ����ϱ�� �߱� ������
			if(len>max) {
				max = len;
				answer = x;
			}
		}
		System.out.println(answer);
	}
}
