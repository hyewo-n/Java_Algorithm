package _06;
import java.util.*;

public class _08_이분검색 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}  // 입력완료

		int answer = 0;
		// 이분검색은 무조건 정렬이 되어있어야 함
		Arrays.sort(arr);
		
		int lt = 0;
		int rt = n-1;
		
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			if(arr[mid]==m) {
				answer = mid+1;
				break;
			}
			if(arr[mid] > m)
				rt = mid - 1;
			else
				lt = mid + 1;
		}
		System.out.println(answer);	
	}
}