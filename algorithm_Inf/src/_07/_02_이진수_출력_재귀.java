package _07;
import java.util.*;

/*
 * 	10���� N�� �ԷµǸ� 2������ ��ȯ�Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ��� (��, ����Լ� �̿�)
 * 	- �Է¿��� : 11
 * 	- ��¿��� : 1011
 */

public class _02_������_���_��� {

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
