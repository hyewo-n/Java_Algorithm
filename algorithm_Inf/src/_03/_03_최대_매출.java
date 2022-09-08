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
		int sum=0;
		
		// 일단 처음 sum의 값은 직접 계산해서 저장
		for(int i=0; i<k; i++) {
			sum += arr[i];
			answer = sum; //answer 초기화
		}
		
		for(int i=k; i<n; i++)
		{
			// 한 칸씩 밀면서 갈 것이기 때문에
			// 맨 앞의 배열 빼고 맨 뒤의 매열을 하나 더해줌
			sum = sum + arr[i] - arr[i-k];
			answer = Math.max(answer, sum);
		}
		System.out.println(answer);
	}
}