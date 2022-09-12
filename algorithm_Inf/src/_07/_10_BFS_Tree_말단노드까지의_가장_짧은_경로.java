package _07;
import java.util.*;

/*
class Node{
	int data;
	Node lt, rt;
	public Node(int val) {
		data = val;
		lt=rt=null;
	}
} */

public class _10_BFS_Tree_말단노드까지의_가장_짧은_경로 {

	Node root;
	public static int BFS(Node root) {
		Queue<Node> Q = new LinkedList<>(); 
		Q.offer(root);
		int L = 0;
		while(!Q.isEmpty()) {
			int len = Q.size();
			for(int i=0; i<len; i++) {
				 Node cur = Q.poll();
				 if(cur.lt==null && cur.rt==null)
					 return L;
				 if(cur.lt != null)  // 자식이 있는 것
					 Q.offer(cur.lt);
				 if(cur.rt != null)  // 자식이 있는 것
					 Q.offer(cur.rt);
			}
			L++;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		
		_10_BFS_Tree_말단노드까지의_가장_짧은_경로 tree = new _10_BFS_Tree_말단노드까지의_가장_짧은_경로();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		System.out.println(tree.BFS(tree.root));

	}

}
