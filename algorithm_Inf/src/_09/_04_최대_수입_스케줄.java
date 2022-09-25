package _09;
import java.util.*;

class Lecture implements Comparable<Lecture> {
	public int money;
	public int time;
	Lecture(int money, int time) {
		this.money = money;
		this.time = time;
	}
	@Override
	public int compareTo(Lecture ob) {
		// �������� ����
		return ob.time - this.time;
	}
}

public class _04_�ִ�_����_������ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<Lecture> arr = new ArrayList<>();
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<n; i++) {
			int m = sc.nextInt();
			int d = sc.nextInt();
			arr.add(new Lecture(m, d));
						
			// ��¥ �߿� ���� ū ��
			if(d > max)
				max = d;
		}
			int answer = 0;
			
			// ū �� �켱������ �ϴ� ť�� ��
			PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
			
			Collections.sort(arr);
			
			int j =0;
			for(int k = max; k>=1; k--) {
				for( ; j<n; j++) {
					// ť�� ����
					if(arr.get(j).time < k)
						break;
					pQ.offer(arr.get(j).money);
				}
				if(!pQ.isEmpty())
					answer += pQ.poll();
			}
			System.out.println(answer);
	}
}