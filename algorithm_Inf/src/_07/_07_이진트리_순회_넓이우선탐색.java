package _07;
import java.util.*;

/*
 * (넓이우선탐색)
 *  이진트리 순회
 *       1          -- level 0
 *    2       3     -- level 1
 *  4   5   6   7   -- level 2
 *  
 *   레벨 탐색 순회 순회 출력 : 1 2 3 4 5 6 7
 *  
 *	중요!
 *  레벨이 그 노드까지 몇번만에 가냐를 나타내 주는 것!
 */

/*
class Node{
	int data;
	Node lt, rt;
	public Node(int val) {
		data = val;
		lt=rt=null;
	}
} */

public class _07_이진트리_순회_넓이우선탐색 {

	Node root;
	public static void BFS(Node root) {
		Queue<Node> Q = new LinkedList<>();
		Q.offer(root);
		int L = 0;  // root level = 0
		while(Q.isEmpty()) {    // 비어있지 않으면
			int len= Q.size();
			System.out.println(L + " : ");
			for(int i=0; i<len; i++) {
				Node cur = Q.poll();  // 꺼내놓고 출력
				System.out.print(cur.data + " ");
				
				if(cur.lt != null)    // 왼쪽 자식 입력
					Q.offer(cur.lt);
				if(cur.rt != null)    // 오른쪽 자식 입력
					Q.offer(cur.rt);
			}
			L++;  // 레벨을 1 증가
 			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		_07_이진트리_순회_넓이우선탐색 tree = new _07_이진트리_순회_넓이우선탐색();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.BFS(tree.root);

	}

}
