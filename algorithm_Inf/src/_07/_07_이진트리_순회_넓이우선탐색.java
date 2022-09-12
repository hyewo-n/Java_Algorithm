package _07;
import java.util.*;

/*
 * (���̿켱Ž��)
 *  ����Ʈ�� ��ȸ
 *       1          -- level 0
 *    2       3     -- level 1
 *  4   5   6   7   -- level 2
 *  
 *   ���� Ž�� ��ȸ ��ȸ ��� : 1 2 3 4 5 6 7
 *  
 *	�߿�!
 *  ������ �� ������ ������� ���ĸ� ��Ÿ�� �ִ� ��!
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

public class _07_����Ʈ��_��ȸ_���̿켱Ž�� {

	Node root;
	public static void BFS(Node root) {
		Queue<Node> Q = new LinkedList<>();
		Q.offer(root);
		int L = 0;  // root level = 0
		while(Q.isEmpty()) {    // ������� ������
			int len= Q.size();
			System.out.println(L + " : ");
			for(int i=0; i<len; i++) {
				Node cur = Q.poll();  // �������� ���
				System.out.print(cur.data + " ");
				
				if(cur.lt != null)    // ���� �ڽ� �Է�
					Q.offer(cur.lt);
				if(cur.rt != null)    // ������ �ڽ� �Է�
					Q.offer(cur.rt);
			}
			L++;  // ������ 1 ����
 			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		_07_����Ʈ��_��ȸ_���̿켱Ž�� tree = new _07_����Ʈ��_��ȸ_���̿켱Ž��();
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
