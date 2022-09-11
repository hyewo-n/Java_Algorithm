package _07;
import java.util.*;

/*
 * 	1) 피보나치 수열을 출력한다.
 * 	       피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
 * 	2) 입력은 피보나치 수열의 총 항의 수이다.
 *     만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
 * 	- 입력예제 : 10
 * 	- 출력예제 : 1 1 2 3 5 8 13 21 34 55
 */

public class _04_피보나치_재귀_메모이제이션 {

	// 이미 계산 된 값을 또 계산하는 비효율성이 있으므로 중간에 계산된 값들을 저장해준다.
	static int fibo[];
	
	public static int DFS(int n) {
		 if(n==1)        // 첫 번째 항
			 return fibo[n] = 1;
		 else if(n==2)   // 두 번째 항
			 return fibo[n] = 1;
		 else
			 return fibo[n] = DFS(n-2) + DFS(n-1);
			 //return DFS(n-2) + DFS(n-1);
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		fibo = new int[n+1];
		//DFS(n);
		for(int i=1; i<=n; i++) {
			System.out.print(fibo[i] + " ");
		}
		
		// 이렇게 도는 경우 숫자가 커지게 되면 효율성이 떨어짐
/*		for(int i=1; i<=n; i++) {
			System.out.print(DFS(i) + " ");
		}
*/		
		// System.out.println(DFS(n));
	}

}
