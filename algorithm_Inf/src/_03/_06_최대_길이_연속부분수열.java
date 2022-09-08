package _03;
import java.util.*;

public class _06_최대_길이_연속부분수열 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		} // 입력 완료
		
		// 똑같이 투포인트 알고리즘 사용
		// 앞에서 rt가 가면서 0을 1로 바꾸고 가면
		// 뒤에서 lt가 따라가면서 그 1을 다시 0으로 바꿔줌
	
		int answer=0; 
		//cnt는 rt가 0을 1로 바꾼 횟수
		int cnt=0; 
		int lt =0;
		for(int rt=0; rt<n; rt++) {
			// rt가 0을 만나면 cnt 증가
			if(arr[rt]==0)
				cnt++;
			while(cnt>k) {  // 변경 가능한 최댓값보다 cnt가 커지면
				if(arr[lt]==0)  // lt가 따라가서 다시 0으로 바꾸고
					cnt--;     // cnt 값 감소시켜줌
				lt++;
			}
			
			// 배열 길이 계산
			answer = Math.max(answer,  rt-lt+1);
		}
		System.out.println(answer);
		
	}

}
