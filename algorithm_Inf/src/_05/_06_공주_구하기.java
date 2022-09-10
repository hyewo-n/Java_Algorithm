package _05;
import java.util.*;

public class _06_����_���ϱ� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int answer=0;
		Queue<Integer> Q = new LinkedList<>();
		
		// Queue�� ���� ��ȣ �־���
		for(int i=1; i<=n; i++) {
			Q.offer(i);
		}
		
		while(!Q.isEmpty()) {
			// k-1��° �������� poll()�ؼ� �� ���� �ٽ� �־���
			for(int i=1; i<k; i++)
				Q.offer(Q.poll());
			// k��° ���� �׳� out
			Q.poll();
			// Queue�� ���� ���� �ϳ���� ���� answer�� �־���
			if(Q.size()==1)
				answer=Q.poll();
		}
		System.out.println(answer);
	}
}

/*
 *	Queue�� �Լ�
 *	1. offer()
 *	2. poll()
 *		������ �� ����
 *	3. peek()
 *	4. size()
 *	5. contains()
 */
