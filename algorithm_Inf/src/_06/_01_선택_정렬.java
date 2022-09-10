package _06;
import java.util.*;

public class _01_선택_정렬 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			int idx=i; // for문에서의 맨 앞의 값
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[idx]) {   // 작은 값을 찾으면
					idx = j;              // 작은 값을 가진 인덱스 번호를 idx에 저장
				}
				// arr[i]와 arr[idx]의 값 교환
				int tmp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = tmp;
			}			
		}
		for(int x : arr) {
			System.out.print(x + " ");
		}		
	}
}