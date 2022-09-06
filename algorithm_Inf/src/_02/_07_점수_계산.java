package _02;
import java.util.*;

public class _07_점수_계산 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int answer = 0;
		int count = 0;
		
		for(int i=0; i<n; i++) {
			if(arr[i]==1) {
				count++;
				answer += count;
				//if(arr[i] == arr[i+1])
				//	count++;
			} else {
				count = 0;
			}
		}
		
		System.out.println(answer);
		
	}
}