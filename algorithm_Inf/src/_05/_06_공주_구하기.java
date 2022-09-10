package _05;
import java.util.*;

public class _06_공주_구하기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int answer=0;
		Queue<Integer> Q = new LinkedList<>();
		
		// Queue에 왕자 번호 넣어줌
		for(int i=1; i<=n; i++) {
			Q.offer(i);
		}
		
		while(!Q.isEmpty()) {
			// k-1번째 수까지는 poll()해서 그 값을 다시 넣어줌
			for(int i=1; i<k; i++)
				Q.offer(Q.poll());
			// k번째 수는 그냥 out
			Q.poll();
			// Queue에 남은 값이 하나라면 빼서 answer에 넣어줌
			if(Q.size()==1)
				answer=Q.poll();
		}
		System.out.println(answer);
	}
}

/*
 *	Queue의 함수
 *	1. offer()
 *	2. poll()
 *		꺼내고 값 리턴
 *	3. peek()
 *	4. size()
 *	5. contains()
 */
