package _03;
import java.util.*;

public class _04_연속_부분수열 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		int m =sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		int answer=0;
		int sum=0;
		int lt=0;
		for(int rt=0; rt<n; rt++) {  // 증가하고
			sum += arr[rt];          // 더하고
			if(sum==m)               // 확인
				answer++;
			while(sum>=m) {
				sum -= arr[lt++];    // 빼고 더한 후
				if(sum==m)           // 확인
					answer++;
			}
		}
		System.out.println(answer);

	}

}
