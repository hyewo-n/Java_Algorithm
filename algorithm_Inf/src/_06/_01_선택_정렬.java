package _06;
import java.util.*;

public class _01_����_���� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			int idx=i; // for�������� �� ���� ��
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[idx]) {   // ���� ���� ã����
					idx = j;              // ���� ���� ���� �ε��� ��ȣ�� idx�� ����
				}
				// arr[i]�� arr[idx]�� �� ��ȯ
				int tmp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = tmp;
			}			
		}
		for(int x : arr) {
			System.out.print(x + " ");
		}		
	}
}