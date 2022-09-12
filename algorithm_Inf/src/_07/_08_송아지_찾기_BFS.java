package _07;
import java.util.*;

public class _08_�۾���_ã��_BFS {

	static int answer = 0;
	static int dis[] = {1, -1, 5};
	static int ch[];
	static Queue<Integer> Q = new LinkedList<>();
	public static int BFS(int s, int e) {
		ch = new int[10001];   // ��ǥ�� 10,000�����̹Ƿ� ������ �̷��� ����
		ch[s] = 1;   // �������
		Q.offer(s);
		int L =0;    // ������ ó������ 0
		while(!Q.isEmpty()) {
			int len = Q.size();   // ������ ����
			for(int i=0; i<len; i++) {   // �ڽ� ��� ����� ��
				int x = Q.poll();
				
				// �۾��� ��ǥ�� �������� ���� �� ����
				if(x==e)
					return L;
				
				for(int j=0; j<3; j++) {
					int nx = x + dis[j];  // �ڽĳ�� nx
					if(nx>=1 && nx<=10000 && ch[nx] == 0) {  // ���� ��Ű�� �湮��������?
						ch[nx]=1;  // �湮�ߴٰ� check
						Q.offer(nx);  // �׸��� ���� �־���
					}
				}
			}  // �ڽ� ����� ��
			L++;   // ���� �ϳ� ����
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