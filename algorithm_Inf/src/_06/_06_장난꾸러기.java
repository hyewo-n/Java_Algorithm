package _06;
import java.util.*;

public class _06_�峭�ٷ��� {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}  // �Է� �Ϸ�
		
		ArrayList<Integer> answer = new ArrayList<>();
		
		// arr �� ���� �� �������� ����
		int tmp[] = arr.clone();
		Arrays.sort(tmp);
		
		// �迭 2�� ���Ͽ� �ٸ� ���� i��ȣ ����
		for(int i=0; i<n; i++) {
			if(arr[i] != tmp[i])
				answer.add(i+1);
		}
		
		for(int x : answer)
			System.out.print(x + " ");
		
/*
		for(int i=0; i<n-1; i++) {
			if(arr[i] > arr[i+1]) 
				answer[0] = i+1;
			if (arr[i-1] > arr[i]) 
				answer[1] = i+1;	
		}
*/
	}
}
