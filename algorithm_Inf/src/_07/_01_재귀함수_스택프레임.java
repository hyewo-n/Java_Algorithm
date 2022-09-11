package _07;
import java.util.*;

/*
 * 	자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지 출력하는 프로그램을 작성하여라
 * 	- 입력예제 : 3
 * 	- 출력예제 : 1 2 3
 */

// 재귀함수란?
//  : 자기 자신을 호출하는 함수
//  : 반복문의 형태라고 봐도 됨

public class _01_재귀함수_스택프레임 {
	
	// DFS 함수 안에서 DFS 함수를 호출하는 것이기 때문에 자기 자신을 호출하게 되는 것
	public static void DFS(int n) {
		if(n==0)
			return;   // 함수 종료
		else {
			// 여기 작성하면 내림차순으로 나옴 3 2 1
			// System.out.print(n + " ");
			DFS(n-1);
			System.out.print(n + " ");
		}
	}

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		DFS(n);

	}
}

/*
 *	재귀함수는 stack frame 자료구조를 사용
 */
