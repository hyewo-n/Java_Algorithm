package _06;
import java.util.*;

public class _06_장난꾸러기 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}  // 입력 완료
		
		ArrayList<Integer> answer = new ArrayList<>();
		
		// arr 값 복제 후 오름차순 정렬
		int tmp[] = arr.clone();
		Arrays.sort(tmp);
		
		// 배열 2개 비교하여 다른 값의 i번호 저장
		for(int i=0; i<n; i++) {
			if(arr[i] != tmp[i])
				answer.add(i+1);
		}
		
		for(int x : answer)
			System.out.print(x + " ");
		
/*
		for(int i=0; i<n-1; i++) {
			if(arr[i] > arr[i+1]) 
				answer[0] = i+1;
			if (arr[i-1] > arr[i]) 
				answer[1] = i+1;	
		}
*/
	}
}
