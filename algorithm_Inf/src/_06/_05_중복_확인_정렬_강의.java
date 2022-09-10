package _06;
import java.util.*;

public class _05_중복_확인_정렬_강의 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}  // 입력 완료
		
		String answer = "U";
		
		// 오름차순 정렬 후 붙어있는 값들끼리 비교하여 같으면 D 반환
		Arrays.sort(arr);
		for(int i=0; i<n-1; i++) {
			if(arr[i] == arr[i+1])
				answer = "D";
		}
		System.out.println(answer);
	}

}
