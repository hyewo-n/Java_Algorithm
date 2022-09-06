package _02;
import java.util.*;

public class _08_등수_구하기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int answer[] = new int[n];
		// int count = 1;
		for(int i=0; i<n; i++) {
			// 여기 들어가야 함. 매번 초기화 시켜줘야 하기 때문에
			int count = 1;
			for(int j=0; j<n; j++) {
				if(arr[j] > arr[i]) {
					count++;
				}
				answer[i] = count;
			}
		}
		for(int x : answer)
			System.out.print(x + " ");
	}
}