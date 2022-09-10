package _06;
import java.util.*;

public class _09_��������_����_�˰��� {

	public static int count(int[] arr, int capacity) {
		
		// DVD ���
		int cnt = 1;
		// DVD�� ��Ƴ��� ����� ��
		int sum = 0;
		
		for(int x : arr) {
			// ù��° �忡�ٰ� ���� ��´�
			if((sum + x) > capacity) {    // ������ ���� �Ѿ��
				cnt++;                    // �� �� �߰�
				sum = x;                  // ���� �������� DVD�� �� �� ������ �Ǿ���
			} else
				sum += x;
		}
		return cnt;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int answer=0;
		
		// arr�� �ִ��� ������  //max()�� min() ����� �� getAsInt() ���� ����ؾ� ��
		int lt = Arrays.stream(arr).max().getAsInt();  
		int rt = Arrays.stream(arr).sum();  
		
		// �̺а˻�
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			if(count(arr, mid)<=m) {
				answer = mid;
				rt = mid-1;
			} else 
				lt=mid+1;
		}
		System.out.println(answer);
	}

}

/*
 * lt�� rt ���̿� ���� �ִٰ� Ȯ���� ���� ���� �˰��� ���
 */ 