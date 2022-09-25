package _10;
import java.util.*;

public class _01_계단오르기 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] dy = new int [n+1];
		dy[1] = 1;
		dy[2] = 2;
		for(int i = 3; i<=n; i++) {
			dy[i] = dy[i-2] + dy[i-1];
		}
		System.out.println(dy[n]);
	}
}