package _02;
import java.util.*;

public class _12_멘토링 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();  // 학생 수
		int M = sc.nextInt();  // 수학 테스트 횟수
		int arr[][] = new int[M][N];
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				arr[i][j] =0;
			}	
		} // 입력 완료
	
		for(int i=0; i<N-1; i++) {
			for(int j=0; j<M; j++) {
				if(arr[j][i] > arr[j][i+1]) {
					
				}
			}
		}
		
		//System.out.println();

	}

}
