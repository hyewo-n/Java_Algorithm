package _08;
import java.util.*;

// �տ� ������ ���
public class _02_�ٵ���_����_DFS {
	
	static int answer = Integer.MIN_VALUE;
	static int c, n;
	
	public static void DFS(int L, int sum, int arr[]) {
		if(sum > c) {
			return;
		}
		if(L==n){
			answer = Math.max(answer, sum);
		}else {
			DFS(L+1, sum+arr[L], arr);
			DFS(L+1, sum, arr);
			
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		c = sc.nextInt();
		n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		DFS(0, 0, arr);
		System.out.println(answer);
	}

}
