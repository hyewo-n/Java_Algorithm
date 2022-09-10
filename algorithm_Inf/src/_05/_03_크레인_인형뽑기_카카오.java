package _05;
import java.util.*;

public class _03_크레인_인형뽑기_카카오 {

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
		}  // 입력 완료
		
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(int pos : moves) {
			// i는 board의 행의 길이만큼 돌 수 있기 때문에 board.length   // 열의 길이 : board[0].length
			for(int i=0; i<board.length; i++) {
				// 0이 아니면(인형을 만나면) 꺼냄
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
					// 인형을 하나만 꺼내고 나와야 하므로 break문으로 동작을 멈춰줌
				}
			}
		}
		System.out.println(answer);
	}
}