package _02;

import java.util.*;

public class _11_�ӽù���_���ϱ� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		} // �Է¹ޱ� �Ϸ�

		int answer = 0;
//		int max=Integer.MIN_VALUE;
		int max = 0;

		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < 5; k++) { // �г��� 5�� ����
					if (arr[i][k] == arr[j][k]) {
						count++;
						break;
						// if(i==j)
						// count--;
					}
				}
			}
			if (count > max) {
				max = count;
				answer = i + 1;
			}
		}
		System.out.println(answer);
	}
}