package _02;
import java.util.*;

public class _05_�Ҽ�_�����佺�׳׽�_ü {

	public static void main(String[] args) {
	
		int answer = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int ch[] = new int[n+1];
		for(int i=2; i<=n; i++) {
			if(ch[i]==0) {
				answer++;
				                 //i�� ������ �����ؾ� ��
				for(int j=i; j<=n; j=j+i)
					ch[j]=1;
			}
		}
		System.out.println(answer);
	
		

	}

}
