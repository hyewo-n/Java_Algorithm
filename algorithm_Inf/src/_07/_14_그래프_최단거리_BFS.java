package _07;
import java.util.*;

/*
 * 	그래프에서 1번 정점에서 각 정점으로 가는 최소 이동 간선 수를 출력하세요
 * 	첫째 줄에는 정점의 수 N(1<=N<=20)와 간선의 수 M이 주어진다
 *	그 다음부터 M줄에 걸쳐 연결정보가 주어진다
 *	- 입력예제 : 6 9 / 1 3 / 1 4 / 2 1 / 2 5 / 3 4 / 4 5 / 4 6 / 6 2 / 6 5
 *	- 출력예제 : 2 : 3 / 3 : 1 / 4 : 1 / 5 : 2 / 6 : 2
 */

public class _14_그래프_최단거리_BFS {

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
		// 인접리스트 생성
		for(int i =0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			// a번 ArrayList에 접근(기준 정점 번호)에 b(갈 수 있는 정점) 추가
			graph.get(a).add(b);
		}  
		//ch[1] = 1;  // 출발 노드 1번 체크
		BFS(1);
		for(int i=2; i<=n; i++) {
			System.out.println(i + " : " + dis[i]);
		}
	}

}
