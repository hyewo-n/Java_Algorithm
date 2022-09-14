package _08;
import java.util.*;

public class _04_중복순열_구하기 {

	static int[] pm;
	static int n, m;
	public static void DFS(int L) {
		if(L==m) {
			for(int x : pm) {
				System.out.print(x + " ");
			}
			System.out.println();
		}else {
			for(int i=1; i<=n; i++) {
				pm[L]=i;
				DFS(L+1);
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		pm = new int[m];
		DFS(0);

	}

}
