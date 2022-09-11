package _07;
import java.util.*;

/*
 * 	10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성하세요 (단, 재귀함수 이용)
 * 	- 입력예제 : 11
 * 	- 출력예제 : 1011
 */

public class _02_이진수_출력_재귀 {

	public static void DFS(int n) {
		
		if(n==0)
			return;
		else {
			DFS(n/2);
			System.out.print(n%2);
		}
		//int s = DFS(n)%2;
		//DFS(n) = DFS(n)/2;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		DFS(n);
	}

}
