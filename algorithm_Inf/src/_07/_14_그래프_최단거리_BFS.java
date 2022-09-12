package _07;
import java.util.*;

/*
 * 	�׷������� 1�� �������� �� �������� ���� �ּ� �̵� ���� ���� ����ϼ���
 * 	ù° �ٿ��� ������ �� N(1<=N<=20)�� ������ �� M�� �־�����
 *	�� �������� M�ٿ� ���� ���������� �־�����
 *	- �Է¿��� : 6 9 / 1 3 / 1 4 / 2 1 / 2 5 / 3 4 / 4 5 / 4 6 / 6 2 / 6 5
 *	- ��¿��� : 2 : 3 / 3 : 1 / 4 : 1 / 5 : 2 / 6 : 2
 */

public class _14_�׷���_�ִܰŸ�_BFS {

	static int n, m;
	static ArrayList<ArrayList<Integer>> graph;
	static int ch[];
	static int dis[];
	
	public static void BFS(int v) {
		Queue<Integer> queue = new LinkedList<>();
		ch[v]=1;
		dis[v]=0;
		queue.offer(v);
		while(!queue.isEmpty()) {
			int cv = queue.poll();
			for(int nv : graph.get(cv)) { 
				if(ch[nv] == 0) {
					ch[nv]=1;
					queue.offer(nv);
					dis[nv] = dis[cv] + 1;
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
		dis = new int[n+1];
		// ��������Ʈ ����
		for(int i =0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			// a�� ArrayList�� ����(���� ���� ��ȣ)�� b(�� �� �ִ� ����) �߰�
			graph.get(a).add(b);
		}  
		//ch[1] = 1;  // ��� ��� 1�� üũ
		BFS(1);
		for(int i=2; i<=n; i++) {
			System.out.println(i + " : " + dis[i]);
		}
	}

}
