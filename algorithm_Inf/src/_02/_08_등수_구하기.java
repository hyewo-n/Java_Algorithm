package _02;
import java.util.*;

public class _08_���_���ϱ� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int answer[] = new int[n];
		// int count = 1;
		for(int i=0; i<n; i++) {
			// ���� ���� ��. �Ź� �ʱ�ȭ ������� �ϱ� ������
			int count = 1;
			for(int j=0; j<n; j++) {
				if(arr[j] > arr[i]) {
					count++;
				}
				answer[i] = count;
			}
		}
		for(int x : answer)
			System.out.print(x + " ");
	}
}