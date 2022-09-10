package _06;

import java.util.*;

public class _04_Least_Recently_Used {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int s = sc.nextInt();
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		} // �Է� �Ϸ�

		int cache[] = new int[s];
		
		for (int x : arr) { // �۾����� cache�� �ִ��� ������ Ȯ��
			
			int pos = -1; // �ε��� ��ȣ. ��ġ
			
			for (int i = 0; i < s; i++) {
				if (x == cache[i]) // ���� ���� �ִ�
					pos = i; // hit ���� �ε��� ��ȣ ����
			}
			
			if (pos == -1) { // ���� ���� ���� ��Ȳ. miss�� ��Ȳ
				for (int j = s - 1; j >= 1; j--) {
					cache[j] = cache[j - 1];
				}
			} // ���� ���� ���� �� ��� ��
			
			else { // ���� ���� ���� ���� ó�� �ִ� ���
				for (int j = pos; j >= 1; j--) {
					cache[j] = cache[j - 1];
				}
			} // else�� ��
			cache[0] = x;
		}
		for (int x : cache) {
			System.out.print(x + " ");
		}
	}
}