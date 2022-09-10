package _05;
import java.util.*;

public class _03_ũ����_�����̱�_īī�� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int board[][] = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		int m = sc.nextInt();
		int moves[] = new int[m];
		for(int i=0; i<m; i++) {
			moves[i] = sc.nextInt();
		}  // �Է� �Ϸ�
		
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(int pos : moves) {
			// i�� board�� ���� ���̸�ŭ �� �� �ֱ� ������ board.length   // ���� ���� : board[0].length
			for(int i=0; i<board.length; i++) {
				// 0�� �ƴϸ�(������ ������) ����
				if(board[i][pos-1] != 0) {
					int tmp = board[i][pos-1];
					board[i][pos-1] = 0;
					if(!stack.isEmpty() && tmp==stack.peek()) {
						answer += 2;
						stack.pop();
					}else {
						stack.push(tmp);
					}
					break;
					// ������ �ϳ��� ������ ���;� �ϹǷ� break������ ������ ������
				}
			}
		}
		System.out.println(answer);
	}
}