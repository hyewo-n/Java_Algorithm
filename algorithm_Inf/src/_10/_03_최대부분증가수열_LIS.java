package _10;
import java.util.*;

public class _03_최대부분증가수열_LIS {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int answer = 0;
		int dy[] = new int[arr.length];
		dy[0] = 1;
		for(int i=1; i<arr.length; i++) {
			int max=0;
			for(int j=i-1; j>=0; j--) {
				if(arr[j] < arr[i] && dy[j]>max)
					max = dy[j];
			}
			dy[i] = max+1;
			answer = Math.max(answer,  dy[i]);
		}
		System.out.println(answer);
	}
}