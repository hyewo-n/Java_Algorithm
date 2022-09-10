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
		} // 입력 완료

		int cache[] = new int[s];
		
		for (int x : arr) { // 작업값이 cache에 있는지 없는지 확인
			
			int pos = -1; // 인덱스 번호. 위치
			
			for (int i = 0; i < s; i++) {
				if (x == cache[i]) // 같은 값이 있다
					pos = i; // hit 지점 인덱스 번호 저장
			}
			
			if (pos == -1) { // 같은 값이 없는 상황. miss난 상황
				for (int j = s - 1; j >= 1; j--) {
					cache[j] = cache[j - 1];
				}
			} // 같은 값이 없을 때 계산 끝
			
			else { // 값은 값이 없고 값을 처음 넣는 경우
				for (int j = pos; j >= 1; j--) {
					cache[j] = cache[j - 1];
				}
			} // else문 끝
			cache[0] = x;
		}
		for (int x : cache) {
			System.out.print(x + " ");
		}
	}
}