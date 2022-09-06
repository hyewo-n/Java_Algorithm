package _02;
import java.util.*;

public class _05_소수_에라토스테네스_체 {

	public static void main(String[] args) {
	
		int answer = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int ch[] = new int[n+1];
		for(int i=2; i<=n; i++) {
			if(ch[i]==0) {
				answer++;
				                 //i의 배수대로 증가해야 함
				for(int j=i; j<=n; j=j+i)
					ch[j]=1;
			}
		}
		System.out.println(answer);
	
		

	}

}
