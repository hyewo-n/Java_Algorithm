package _10;
import java.util.*;

public class _06_최대점수_구하기_냅색알고리즘 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int dy[] = new int[n+1];
		for(int i=0; i<n; i++) {
			int ps = sc.nextInt();
			int pt = sc.nextInt();
			for(int j=m; j>=pt; j--) {
				dy[j] = Math.max(dy[j], dy[j-pt]+ps);
			}
		}
		System.out.println(dy[m]);

	}

}
