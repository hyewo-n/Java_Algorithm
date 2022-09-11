package _07;
import java.util.*;

/*
 * 	자연수 N이 입력되면 N!를 구하는 프로그램을 작성하세요.
 *  예를 들어 5! = 5 * 4 * 3 * 2 * 1 =120 입니다
 * 	- 입력예제 : 5
 * 	- 출력예제 : 120
 */

public class _03_팩토리얼 {

	public static int DFS(int n) {
		if(n==1)
			return 1;
		else {
			return n*DFS(n-1);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(DFS(n));
	}

}
