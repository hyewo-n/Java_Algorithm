package _09;
import java.util.*;

class Time implements Comparable<Time> {
	public int s, e;
	Time(int s, int e){
		this.s = s;
		this.e = e;
	}
	@Override
	public int compareTo(Time o) {
		if(this.e == o.e)
			return this.s - o.s;
		else
			return this.e - o.e;
	}
}

public class _02_회의실_배정 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		ArrayList<Time> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			arr.add(new Time(s, e));
		}
		
		int cnt = 0;
		Collections.sort(arr);
		int endTime = 0;
		for(Time ob : arr) {
			if(ob.s >= endTime) {
				cnt++;
				endTime = ob.e;
			}
		}
		System.out.println(cnt);
	}
}