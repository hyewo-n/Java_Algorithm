package _06;
import java.util.*;

public class _05_중복_확인 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}  // 입력 완료
		
		String answer = "U";
		
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {   // 항상 j의 시작 범위 설정 주의하자
				if(arr[i] == arr[j])
					answer = "D";
			}
		}
		System.out.println(answer);
	}

}
