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

public class _09_DFS_Tree_말단노드까지의_가장_짧은_경로 {

	Node root;
	public static int DFS(int L, Node root) {   // 여기 root는 노드를 가르키는 것이지 진짜 root로 고정된 것이 아님
		if(root.lt==null && root.rt==null){
			return L;
		}else{
			return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
		}
	}
	
	public static void main(String[] args) {
		
		_09_DFS_Tree_말단노드까지의_가장_짧은_경로 tree = new _09_DFS_Tree_말단노드까지의_가장_짧은_경로();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		System.out.println(tree.DFS(0, tree.root));
		


	}

}
