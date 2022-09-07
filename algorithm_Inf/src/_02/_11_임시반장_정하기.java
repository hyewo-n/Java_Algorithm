package _02;

import java.util.*;

public class _11_임시반장_정하기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		} // 입력받기 완료

		int answer = 0;
//		int max=Integer.MIN_VALUE;
		int max = 0;

		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < 5; k++) { // 학년은 5로 고정
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