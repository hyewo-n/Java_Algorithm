package _07;
import java.util.*;

/*
 * 	�ڿ��� N�� �ԷµǸ� N!�� ���ϴ� ���α׷��� �ۼ��ϼ���.
 *  ���� ��� 5! = 5 * 4 * 3 * 2 * 1 =120 �Դϴ�
 * 	- �Է¿��� : 5
 * 	- ��¿��� : 120
 */

public class _03_���丮�� {

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
