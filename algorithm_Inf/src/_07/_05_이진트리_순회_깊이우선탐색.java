package _07;
import java.util.*;

/*
 * (���̿켱Ž��)
 *  ����Ʈ�� ��ȸ
 *        1
 *    2       3
 *  4   5   6   7
 *  
 *   ������ȸ ��� : 1 2 4 5 3 6 7
 *   ������ȸ ��� : 4 2 5 1 6 3 7
 *   ������ȸ ��� : 4 5 2 6 7 3 1
 */

class Node{
	int data;
	Node lt, rt;
	public Node(int val) {
		data = val;
		lt=rt=null;
	}
}

public class _05_����Ʈ��_��ȸ_���̿켱Ž�� {

	Node root;
	public static void DFS(Node root) {
		if(root==null)
			return;
		else {
			System.out.print(root.data + " ");    // ������ȸ
			DFS(root.lt);
			System.out.print(root.data + " ");    // ������ȸ
			DFS(root.rt);
			System.out.print(root.data + " ");    // ������ȸ
		}
	}
	
	public static void main(String[] args) {

		_05_����Ʈ��_��ȸ_���̿켱Ž�� tree = new _05_����Ʈ��_��ȸ_���̿켱Ž��();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.DFS(tree.root);
	}        

}
