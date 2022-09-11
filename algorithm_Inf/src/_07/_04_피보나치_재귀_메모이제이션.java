package _07;
import java.util.*;

/*
 * 	1) �Ǻ���ġ ������ ����Ѵ�.
 * 	       �Ǻ���ġ �����̶� ���� 2���� ���� ���Ͽ� ���� ���ڰ� �Ǵ� �����̴�.
 * 	2) �Է��� �Ǻ���ġ ������ �� ���� ���̴�.
 *     ���� 7�� �ԷµǸ� 1 1 2 3 5 8 13�� ����ϸ� �ȴ�.
 * 	- �Է¿��� : 10
 * 	- ��¿��� : 1 1 2 3 5 8 13 21 34 55
 */

public class _04_�Ǻ���ġ_���_�޸������̼� {

	// �̹� ��� �� ���� �� ����ϴ� ��ȿ������ �����Ƿ� �߰��� ���� ������ �������ش�.
	static int fibo[];
	
	public static int DFS(int n) {
		 if(n==1)        // ù ��° ��
			 return fibo[n] = 1;
		 else if(n==2)   // �� ��° ��
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
		
		// �̷��� ���� ��� ���ڰ� Ŀ���� �Ǹ� ȿ������ ������
/*		for(int i=1; i<=n; i++) {
			System.out.print(DFS(i) + " ");
		}
*/		
		// System.out.println(DFS(n));
	}

}
