package _06;
import java.util.*;

public class _09_뮤직비디오_결정_알고리즘 {

	public static int count(int[] arr, int capacity) {
		
		// DVD 장수
		int cnt = 1;
		// DVD에 담아내는 곡들의 합
		int sum = 0;
		
		for(int x : arr) {
			// 첫번째 장에다가 곡을 담는다
			if((sum + x) > capacity) {    // 가능한 합을 넘어가면
				cnt++;                    // 한 장 추가
				sum = x;                  // 현재 녹음중인 DVD에 몇 분 녹음이 되었나
			} else
				sum += x;
		}
		return cnt;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int answer=0;
		
		// arr의 최댓값을 구해줌  //max()나 min() 사용할 때 getAsInt() 같이 사용해야 함
		int lt = Arrays.stream(arr).max().getAsInt();  
		int rt = Arrays.stream(arr).sum();  
		
		// 이분검색
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			if(count(arr, mid)<=m) {
				answer = mid;
				rt = mid-1;
			} else 
				lt=mid+1;
		}
		System.out.println(answer);
	}

}

/*
 * lt와 rt 사이에 답이 있다고 확신할 때만 결정 알고리즘 사용
 */ 