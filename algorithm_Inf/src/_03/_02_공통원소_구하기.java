package _03;
import java.util.*;

public class _02_공통원소_구하기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int b[] = new int[m];
		for(int i=0; i<m; i++) {
			b[i] = sc.nextInt();
		}
		// 입력 완료

		// 배열 정렬
		Arrays.sort(a);
		Arrays.sort(b);
		
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		int p1=0, p2=0;
		while(p1<n && p2<m) {
			if(a[p1] == b[p2]) {
				answer.add(a[p1++]);
				p2++;
			} else if(a[p1]<b[p2])
				p1++;
			else
				p2++;
		}
		
		for(int x : answer)
			System.out.print(x + " ");
		
	}

}
