package _07;
import java.util.*;

public class _08_송아지_찾기_BFS {

	static int answer = 0;
	static int dis[] = {1, -1, 5};
	static int ch[];
	static Queue<Integer> Q = new LinkedList<>();
	public static int BFS(int s, int e) {
		ch = new int[10001];   // 좌표가 10,000까지이므로 범위는 이렇게 설정
		ch[s] = 1;   // 출발지점
		Q.offer(s);
		int L =0;    // 레벨값 처음에는 0
		while(!Q.isEmpty()) {
			int len = Q.size();   // 원소의 갯수
			for(int i=0; i<len; i++) {   // 자식 노드 만드는 것
				int x = Q.poll();
				
				// 송아지 좌표와 같아지면 레벨 값 리턴
				if(x==e)
					return L;
				
				for(int j=0; j<3; j++) {
					int nx = x + dis[j];  // 자식노드 nx
					if(nx>=1 && nx<=10000 && ch[nx] == 0) {  // 범위 지키고 방문안했으면?
						ch[nx]=1;  // 방문했다고 check
						Q.offer(nx);  // 그리고 값을 넣어줌
					}
				}
			}  // 자식 만들기 끝
			L++;   // 레벨 하나 증가
		}
		return 0;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int e = sc.nextInt();
		
		System.out.println(BFS(s, e));

	}
}