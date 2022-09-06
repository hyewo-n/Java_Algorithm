package _02;
import java.util.*;

public class _09_격자판_최대합 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		} //입력받기 완료
		
		int answer = Integer.MIN_VALUE;
		//  행의 합, 열의 합
		int sum1, sum2;
		
		// 행과 열의 합을 구함
		for(int i=0; i<n; i++) {
			sum1=sum2=0;
			for(int j=0; j<n; j++) {
				sum1 += arr[i][j];
				sum2 += arr[j][i];
			}
			// 하나의 열, 행이 끝나고 answer에 저장하는 것.
			// 기존 값과 비교해서 더 큰 값이 answer에 저장됨
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);	
		}
		
		// 대각선의 합을 구하기 전에 sum1, sum2의 값을 다시 초기화
		sum1=sum2=0;
		
		// 대각선의 합을 구함
		for(int i=0; i<n; i++) {
			sum1 += arr[i][i];
			sum2 += arr[i][n-i-1];
			
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);	
		}
		
		System.out.println(answer);
		
	}
}