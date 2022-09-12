package _07;
import java.util.*;

/*
 *	방향 그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 프로그램을 작성하세요.
 *	아래 그래프에서 1번 정점에서 5번 정점으로 가는 가지 수는 총 6가지 입니다.
 *	1 2 3 4 5 / 1 2 5 / 1 3 4 2 5 / 1 3 4 5 / 1 4 2 5 / 1 4 5
 *	첫째 줄에는 정점의 수 N(1<=N<=20)와 간선의 수 M이 주어진다
 *	그 다음부터 M줄에 걸쳐 연결정보가 주어진다
 *	- 입력예제 : 5 / 9 / 1 2 / 1 3 / 1 4 / 2 1 / 2 3 / 2 5 / 3 4 / 4 2 / 4 5
 *	- 출력예제 : 6
 */
//  지금 정점의 수는 20개이지만 이게 1,000개, 10,000개가 되면 인접행렬은 너무 비효율적

public class _13_경로_탐색_인접리스트_ArrayList {

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
			// a번 ArrayList에 접근(기준 정점 번호)에 b(갈 수 있는 정점) 추가
			graph.get(a).add(b);
		}  
		ch[1] = 1;  // 출발 노드 1번 체크
		DFS(1);
		System.out.println(answer);

	}

}
