package _03;
import java.util.*;

public class _04_����_�κм��� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		int m =sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		int answer=0;
		int sum=0;
		int lt=0;
		for(int rt=0; rt<n; rt++) {  // �����ϰ�
			sum += arr[rt];          // ���ϰ�
			if(sum==m)               // Ȯ��
				answer++;
			while(sum>=m) {
				sum -= arr[lt++];    // ���� ���� ��
				if(sum==m)           // Ȯ��
					answer++;
			}
		}
		System.out.println(answer);

	}

}
