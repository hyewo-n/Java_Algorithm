package _03;
import java.util.*;

public class _05_연속된_자연수의_합 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n/2+1];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		int answer=0;
		int sum=0;
		int lt=0;
		for(int rt=0; rt<n/2+1; rt++) {
			sum += arr[rt];
			if(sum == n)
				answer++;
			while(sum>=n) {
				sum -= arr[lt++];
				if(sum == n)
					answer++;				
			}
		}
		System.out.println(answer);
	}

}
