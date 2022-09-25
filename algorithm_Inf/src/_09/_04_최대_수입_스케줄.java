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
		// 내림차순 정렬
		return ob.time - this.time;
	}
}

public class _04_최대_수입_스케줄 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<Lecture> arr = new ArrayList<>();
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<n; i++) {
			int m = sc.nextInt();
			int d = sc.nextInt();
			arr.add(new Lecture(m, d));
						
			// 날짜 중에 가장 큰 값
			if(d > max)
				max = d;
		}
			int answer = 0;
			
			// 큰 값 우선순위로 하는 큐가 됨
			PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
			
			Collections.sort(arr);
			
			int j =0;
			for(int k = max; k>=1; k--) {
				for( ; j<n; j++) {
					// 큐에 넣음
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