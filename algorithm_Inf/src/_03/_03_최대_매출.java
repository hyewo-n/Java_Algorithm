package _03;
import java.util.*;

public class _03_최대_매출 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		} // 입력 완료
		
		int answer=0;
		int max=0;
		
		for(int i=0; i<n-k+1; i++) {
			int sum=0;
			for(int j=i; j<i+k; j++) {
				sum += arr[j];
			}
			if(sum > max) {
				max = sum;
				answer = max;
			}
		}
		System.out.println(answer);
	}

}
