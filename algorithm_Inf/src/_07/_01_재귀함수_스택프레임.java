package _07;
import java.util.*;

/*
 * 	�ڿ��� N�� �ԷµǸ� ����Լ��� �̿��Ͽ� 1���� N���� ����ϴ� ���α׷��� �ۼ��Ͽ���
 * 	- �Է¿��� : 3
 * 	- ��¿��� : 1 2 3
 */

// ����Լ���?
//  : �ڱ� �ڽ��� ȣ���ϴ� �Լ�
//  : �ݺ����� ���¶�� ���� ��

public class _01_����Լ�_���������� {
	
	// DFS �Լ� �ȿ��� DFS �Լ��� ȣ���ϴ� ���̱� ������ �ڱ� �ڽ��� ȣ���ϰ� �Ǵ� ��
	public static void DFS(int n) {
		if(n==0)
			return;   // �Լ� ����
		else {
			// ���� �ۼ��ϸ� ������������ ���� 3 2 1
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
 *	����Լ��� stack frame �ڷᱸ���� ���
 */
