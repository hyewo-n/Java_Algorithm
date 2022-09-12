package _07;
import java.util.*;

/*
 *	���� �׷����� �־����� 1�� �������� N�� �������� ���� ��� ����� ���� ���� ����ϴ� ���α׷��� �ۼ��ϼ���.
 *	�Ʒ� �׷������� 1�� �������� 5�� �������� ���� ���� ���� �� 6���� �Դϴ�.
 *	1 2 3 4 5 / 1 2 5 / 1 3 4 2 5 / 1 3 4 5 / 1 4 2 5 / 1 4 5
 *	ù° �ٿ��� ������ �� N(1<=N<=20)�� ������ �� M�� �־�����
 *	�� �������� M�ٿ� ���� ���������� �־�����
 *	- �Է¿��� : 5 / 9 / 1 2 / 1 3 / 1 4 / 2 1 / 2 3 / 2 5 / 3 4 / 4 2 / 4 5
 *	- ��¿��� : 6
 */

public class _12_���_Ž��_�������_DFS {
	static int n, m, answer = 0;
	static int graph[][];
	static int ch[];
	public static void DFS(int v) {
		if(v==n) // ���� ������ �����ϸ� answer�� ������
			answer++;
		else {
			for(int i=1; i<=n; i++) {
				// ���� ���� v���� ���� i�� �� �� �ְ� �̹� �湮���� ���� ��(0)�̸�
				if(graph[v][i] == 1 && ch[i]==0) {
					ch[i] = 1;  // �湮�ߴٰ� üũ���ְ�
					DFS(i);
					ch[i] = 0;  // Back�� ���� �湮üũ�� 0���� �ٽ� Ǯ����
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		graph = new int[n+1][n+1];  // ���� ��ȣ�� 1������ �����ϱ� ������ n+1��
		ch = new int[n+1];
		for(int i =0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a][b] = 1;
		}  // �Է¿Ϸ�
		ch[1] = 1;  // ��� ��� 1�� üũ
		DFS(1);
		System.out.println(answer);

	}

}
