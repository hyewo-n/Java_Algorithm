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

public class _12_경로_탐색_인접행렬_DFS {
	static int n, m, answer = 0;
	static int graph[][];
	static int ch[];
	public static void DFS(int v) {
		if(v==n) // 도착 정점에 도착하면 answer로 세어줌
			answer++;
		else {
			for(int i=1; i<=n; i++) {
				// 현재 정점 v에서 정점 i로 갈 수 있고 이미 방문하지 않은 곳(0)이면
				if(graph[v][i] == 1 && ch[i]==0) {
					ch[i] = 1;  // 방문했다고 체크해주고
					DFS(i);
					ch[i] = 0;  // Back을 때는 방문체크를 0으로 다시 풀어줌
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		graph = new int[n+1][n+1];  // 정점 번호는 1번부터 시작하기 때문에 n+1개
		ch = new int[n+1];
		for(int i =0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a][b] = 1;
		}  // 입력완료
		ch[1] = 1;  // 출발 노드 1번 체크
		DFS(1);
		System.out.println(answer);

	}

}
