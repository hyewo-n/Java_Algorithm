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
//  ���� ������ ���� 20�������� �̰� 1,000��, 10,000���� �Ǹ� ��������� �ʹ� ��ȿ����

public class _13_���_Ž��_��������Ʈ_ArrayList {

	static int n, m, answer = 0;
	static ArrayList<ArrayList<Integer>> graph;
	static int ch[];
	public static void DFS(int v) {
		if(v==n)
			answer++;
		else {
			for(int nv : graph.get(v)) {
				if(ch[nv] ==0) {
					ch[nv]=1;
					DFS(nv);
					ch[nv]=0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i =0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n+1];
		for(int i =0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			// a�� ArrayList�� ����(���� ���� ��ȣ)�� b(�� �� �ִ� ����) �߰�
			graph.get(a).add(b);
		}  
		ch[1] = 1;  // ��� ��� 1�� üũ
		DFS(1);
		System.out.println(answer);

	}

}
